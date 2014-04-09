package mcmod.nxs.animalwarriors.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class SwordHelper extends ItemSword {
	public SwordHelper(ToolMaterial p_i45356_1_)
	{
		super(p_i45356_1_);
	}

	public ItemSword setNameAndTab(String name, CreativeTabs tab)
	{
		this.setTextureName(ResourcePathHelper.getResourcesPath() + name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(tab);
		return this;
	}
}