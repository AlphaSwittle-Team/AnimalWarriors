package mcmod.nxs.animalwarriors.entity.passive;

import mcmod.nxs.animalwarriors.entity.AnimalWarriorSelector;
import mcmod.nxs.animalwarriors.entity.IAnimalIdentifier;
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class CowWarrior extends EntityMob implements IAnimalIdentifier {
	private static final IEntitySelector attackEntitySelector = new AnimalWarriorSelector();

	public CowWarrior(World par1World)
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

	public void onLivingUpdate()
	{
		super.onLivingUpdate();
	}

	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
	}

	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
	}

	protected boolean interact(EntityPlayer player)
	{
		ItemStack handItem = player.getHeldItem();
		if (handItem != null)
		{
			if (handItem.getItem() instanceof ItemSword)
			{
				this.setCurrentItemOrArmor(0, handItem);
				player.setCurrentItemOrArmor(0, null);
				return true;
			}
			if (handItem.getItem() instanceof ItemArmor)
			{
				switch (((ItemArmor) handItem.getItem()).armorType) {
				case 0:
					this.setCurrentItemOrArmor(4, handItem);
					player.setCurrentItemOrArmor(0, null);
					break;
				case 1:
					this.setCurrentItemOrArmor(3, handItem);
					player.setCurrentItemOrArmor(0, null);
					break;
				case 2:
					this.setCurrentItemOrArmor(2, handItem);
					player.setCurrentItemOrArmor(0, null);
					break;
				case 3:
					this.setCurrentItemOrArmor(1, handItem);
					player.setCurrentItemOrArmor(0, null);
					break;
				}
				return true;
			}
		}
		return false;
	}
}