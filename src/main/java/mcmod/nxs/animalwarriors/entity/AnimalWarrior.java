package mcmod.nxs.animalwarriors.entity;

import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public abstract class AnimalWarrior extends EntityMob implements IAnimalIdentifier {
	private static final IEntitySelector attackEntitySelector = new AnimalWarriorSelector();

	public AnimalWarrior(World par1World)
	{
		super(par1World);
		this.setHealth(this.getMaxHealth());
		this.isImmuneToFire = false;
		this.getNavigator().setCanSwim(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityLivingBase.class, 1D, true));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, false, attackEntitySelector));
		this.experienceValue = 75;
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3D);
	}

	protected void entityInit()
	{
		super.entityInit();
	}

	protected boolean isAIEnabled()
	{
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see mcmod.nxs.animalwarriors.entity.IAnimalAttributes#onLivingUpdate()
	 */
	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * mcmod.nxs.animalwarriors.entity.IAnimalAttributes#readEntityFromNBT(net
	 * .minecraft .nbt.NBTTagCompound)
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * mcmod.nxs.animalwarriors.entity.IAnimalAttributes#writeEntityToNBT(net
	 * .minecraft. nbt.NBTTagCompound)
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
	}

	protected boolean interact(EntityPlayer Player)
	{
		ItemStack handItem = Player.inventory.getCurrentItem();
		if (handItem != null)
		{
			if (Player.getHeldItem().getItem() instanceof ItemSword)
			{
				this.setCurrentItemOrArmor(0, handItem);
				Player.setCurrentItemOrArmor(0, null);
				return true;
			}
		}
		return false;
	}
}