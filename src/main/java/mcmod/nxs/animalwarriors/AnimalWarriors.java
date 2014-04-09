package mcmod.nxs.animalwarriors;

import mcmod.nxs.animalwarriors.core.EntityHandler;
import mcmod.nxs.animalwarriors.core.ItemHandler;
import mcmod.nxs.animalwarriors.lib.ResourcePathHelper;
import mcmod.nxs.animalwarriors.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AnimalWarriors.MODID, name = AnimalWarriors.NAME, version = AnimalWarriors.VERSION)
public class AnimalWarriors {
	public static final String MODID = "animalwarriors";
	public static final String NAME = "Animal Warriors";
	public static final String VERSION = "V1.0A";
	public static final String TEXTURES_PATH = "animalwarriors:";
	public static final String CLIENT_PROXY_PATH = "mcmod.nxs.animalwarriors.proxy.ClientProxy";
	public static final String COMMON_PROXY_PATH = "mcmod.nxs.animalwarriors.proxy.CommonProxy";
	@SidedProxy(clientSide = AnimalWarriors.CLIENT_PROXY_PATH, serverSide = AnimalWarriors.COMMON_PROXY_PATH)
	public static CommonProxy proxy;
	@Instance(AnimalWarriors.MODID)
	public static AnimalWarriors instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ResourcePathHelper.setTexturesPath(TEXTURES_PATH);
		proxy.registerEntityRender();
		proxy.registerItemRender();
		ItemHandler.instance.load();
		EntityHandler.addEntities();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
