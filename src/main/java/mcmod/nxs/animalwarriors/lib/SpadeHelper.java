package mcmod.nxs.animalwarriors.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class SpadeHelper extends ItemSpade {
	public SpadeHelper(ToolMaterial p_i45356_1_)
	{
		super(p_i45356_1_);
	}

	public ItemSpade setNameAndTab(String name, CreativeTabs tab)
	{
		this.setTextureName(ResourcePathHelper.getResourcesPath() + name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(tab);
		return this;
	}
}
