package mcmod.nxs.animalwarriors.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class HoeHelper extends ItemHoe {
	public HoeHelper(ToolMaterial p_i45356_1_)
	{
		super(p_i45356_1_);
	}

	public ItemHoe setNameAndTab(String name, CreativeTabs tab)
	{
		this.setTextureName(ResourcePathHelper.getResourcesPath() + name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(tab);
		return this;
	}
}