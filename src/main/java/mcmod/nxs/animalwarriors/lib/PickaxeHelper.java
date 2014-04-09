package mcmod.nxs.animalwarriors.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class PickaxeHelper extends ItemPickaxe {
	public PickaxeHelper(ToolMaterial p_i45356_1_)
	{
		super(p_i45356_1_);
	}

	public ItemPickaxe setNameAndTab(String name, CreativeTabs tab)
	{
		this.setTextureName(ResourcePathHelper.getResourcesPath() + name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(tab);
		return this;
	}
}
