package mcmod.nxs.animalwarriors.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class AxeHelper extends ItemAxe {
	public AxeHelper(ToolMaterial p_i45356_1_)
	{
		super(p_i45356_1_);
	}

	public ItemAxe setNameAndTab(String name, CreativeTabs tab)
	{
		this.setTextureName(ResourcePathHelper.getResourcesPath() + name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(tab);
		return this;
	}
}
