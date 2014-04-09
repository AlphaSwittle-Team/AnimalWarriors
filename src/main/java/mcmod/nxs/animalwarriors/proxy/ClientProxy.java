package mcmod.nxs.animalwarriors.proxy;

import mcmod.nxs.animalwarriors.entity.passive.ChickenWarrior;
import mcmod.nxs.animalwarriors.entity.passive.CowWarrior;
import mcmod.nxs.animalwarriors.entity.passive.HorseWarrior;
import mcmod.nxs.animalwarriors.entity.passive.MooshroomWarrior;
import mcmod.nxs.animalwarriors.entity.passive.OcelotWarrior;
import mcmod.nxs.animalwarriors.entity.passive.PigWarrior;
import mcmod.nxs.animalwarriors.entity.passive.SheepWarrior;
import mcmod.nxs.animalwarriors.entity.passive.SquidWarrior;
import mcmod.nxs.animalwarriors.entity.passive.WolfWarrior;
import mcmod.nxs.animalwarriors.render.RenderChickenWarrior;
import mcmod.nxs.animalwarriors.render.RenderCowWarrior;
import mcmod.nxs.animalwarriors.render.RenderHorseWarrior;
import mcmod.nxs.animalwarriors.render.RenderMooshroomWarrior;
import mcmod.nxs.animalwarriors.render.RenderOcelotWarrior;
import mcmod.nxs.animalwarriors.render.RenderPigWarrior;
import mcmod.nxs.animalwarriors.render.RenderSheepWarrior;
import mcmod.nxs.animalwarriors.render.RenderSquidWarrior;
import mcmod.nxs.animalwarriors.render.RenderWolfWarrior;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public void registerEntityRender()
	{
		RenderingRegistry.registerEntityRenderingHandler(ChickenWarrior.class, new RenderChickenWarrior());
		RenderingRegistry.registerEntityRenderingHandler(CowWarrior.class, new RenderCowWarrior());
		RenderingRegistry.registerEntityRenderingHandler(HorseWarrior.class, new RenderHorseWarrior());
		RenderingRegistry.registerEntityRenderingHandler(PigWarrior.class, new RenderPigWarrior());
		RenderingRegistry.registerEntityRenderingHandler(SheepWarrior.class, new RenderSheepWarrior());
		RenderingRegistry.registerEntityRenderingHandler(SquidWarrior.class, new RenderSquidWarrior());
		RenderingRegistry.registerEntityRenderingHandler(WolfWarrior.class, new RenderWolfWarrior());
		RenderingRegistry.registerEntityRenderingHandler(MooshroomWarrior.class, new RenderMooshroomWarrior());
		RenderingRegistry.registerEntityRenderingHandler(OcelotWarrior.class, new RenderOcelotWarrior());

	}
}
