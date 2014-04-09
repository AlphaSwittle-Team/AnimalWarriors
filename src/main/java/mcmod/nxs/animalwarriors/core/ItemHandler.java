package mcmod.nxs.animalwarriors.core;

import mcmod.nxs.animalwarriors.item.Morpher;
import mcmod.nxs.animalwarriors.lib.Handler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHandler extends Handler {
	public static ItemHandler instance = new ItemHandler();

	public static Item morpher;

	public void load()
	{
		super.load();
		addItems();
		registerItems();
		addCratfings();
	}

	public void addItems()
	{
		morpher = new Morpher().setNameAndTab("morpher", CreativeTabs.tabCombat);
	}

	public void registerItems()
	{
		GameRegistry.registerItem(morpher, "morpher");
	}

	private void addCratfings()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.morpher, 1), new Object[] { Items.chicken, Items.fish, Items.porkchop, Items.beef, Items.leather, Items.dye, Blocks.wool, Items.bone, Items.nether_wart });
	}
}
