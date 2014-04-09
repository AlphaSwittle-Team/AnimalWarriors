package mcmod.nxs.animalwarriors.render;

import mcmod.nxs.animalwarriors.entity.passive.PigWarrior;
import mcmod.nxs.animalwarriors.entity.passive.WolfWarrior;
import mcmod.nxs.animalwarriors.lib.ResourcePathHelper;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderWolfWarrior extends RenderBiped {
	private static final ResourceLocation cowWarriorTextures = new ResourceLocation(ResourcePathHelper.getResourcesPath() + "textures/entity/wolfWarrior.png");

	public RenderWolfWarrior()
	{
		super(new ModelBiped(), 0.5F);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called
	 * unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(WolfWarrior warrior)
	{
		return cowWarriorTextures;
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called
	 * unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return this.getEntityTexture((WolfWarrior) par1Entity);
	}
}