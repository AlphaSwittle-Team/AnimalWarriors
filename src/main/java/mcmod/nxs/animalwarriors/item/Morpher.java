package mcmod.nxs.animalwarriors.item;

import java.util.List;

import mcmod.nxs.animalwarriors.entity.passive.ChickenWarrior;
import mcmod.nxs.animalwarriors.entity.passive.CowWarrior;
import mcmod.nxs.animalwarriors.entity.passive.HorseWarrior;
import mcmod.nxs.animalwarriors.entity.passive.MooshroomWarrior;
import mcmod.nxs.animalwarriors.entity.passive.OcelotWarrior;
import mcmod.nxs.animalwarriors.entity.passive.PigWarrior;
import mcmod.nxs.animalwarriors.entity.passive.SheepWarrior;
import mcmod.nxs.animalwarriors.entity.passive.SquidWarrior;
import mcmod.nxs.animalwarriors.entity.passive.WolfWarrior;
import mcmod.nxs.animalwarriors.lib.ItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class Morpher extends ItemHelper {

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		if (player.isSneaking())
		{
			if (!stack.hasTagCompound())
			{
				stack.setTagCompound(new NBTTagCompound());
			}
			byte mode = stack.getTagCompound().getByte("mode");
			mode++;
			if (mode == 2)
			{
				mode = 0;
			}
			stack.getTagCompound().setByte("mode", mode);
			if (!world.isRemote)
			{
				player.addChatMessage(new ChatComponentTranslation(mode == 0 ? "warriorizer.mode.message.0" : "warriorizer.mode.message.1"));
			}
		} else
		{
			super.onItemRightClick(stack, world, player);
		}
		return stack;
	}

	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
	{
		if (!stack.hasTagCompound())
		{
			stack.setTagCompound(new NBTTagCompound());
		}
		if (stack.getTagCompound().getByte("mode") == 0)
		{
			if (entity instanceof EntityChicken && !player.worldObj.isRemote)
			{
				ChickenWarrior warrior = new ChickenWarrior(player.worldObj);
				warrior.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(warrior);
				entity.setDead();
				return true;
			} else if (entity instanceof EntityHorse && !player.worldObj.isRemote)
			{
				HorseWarrior warrior = new HorseWarrior(player.worldObj);
				warrior.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(warrior);
				entity.setDead();
				return true;
			} else if (entity instanceof EntityPig && !player.worldObj.isRemote)
			{
				PigWarrior warrior = new PigWarrior(player.worldObj);
				warrior.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(warrior);
				entity.setDead();
				return true;
			} else if (entity instanceof EntitySheep && !player.worldObj.isRemote)
			{
				SheepWarrior warrior = new SheepWarrior(player.worldObj);
				warrior.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(warrior);
				entity.setDead();
				return true;
			} else if (entity instanceof EntitySquid && !player.worldObj.isRemote)
			{
				SquidWarrior warrior = new SquidWarrior(player.worldObj);
				warrior.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(warrior);
				entity.setDead();
				return true;
			} else if (entity instanceof EntityWolf && !player.worldObj.isRemote)
			{
				WolfWarrior warrior = new WolfWarrior(player.worldObj);
				warrior.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(warrior);
				entity.setDead();
				return true;
			} else if (entity instanceof EntityMooshroom && !player.worldObj.isRemote)
			{
				MooshroomWarrior warrior = new MooshroomWarrior(player.worldObj);
				warrior.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(warrior);
				entity.setDead();
				return true;
			} else if (entity instanceof EntityCow && !player.worldObj.isRemote)
			{
				CowWarrior warrior = new CowWarrior(player.worldObj);
				warrior.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(warrior);
				entity.setDead();
				return true;
			} else if (entity instanceof EntityOcelot && !player.worldObj.isRemote)
			{
				OcelotWarrior warrior = new OcelotWarrior(player.worldObj);
				warrior.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(warrior);
				entity.setDead();
				return true;
			}
		} else if (stack.getTagCompound().getByte("mode") == 1)
		{
			if (!player.worldObj.isRemote)
			{
				if (((EntityLivingBase) entity).getEquipmentInSlot(0) != null)
				{
					EntityItem item = new EntityItem(entity.worldObj, entity.posX, entity.posY, entity.posZ, ((EntityLivingBase) entity).getEquipmentInSlot(0));
					player.worldObj.spawnEntityInWorld(item);
				}
				if (((EntityLivingBase) entity).getEquipmentInSlot(1) != null)
				{
					EntityItem item = new EntityItem(entity.worldObj, entity.posX, entity.posY, entity.posZ, ((EntityLivingBase) entity).getEquipmentInSlot(1));
					player.worldObj.spawnEntityInWorld(item);
				}
				if (((EntityLivingBase) entity).getEquipmentInSlot(2) != null)
				{
					EntityItem item = new EntityItem(entity.worldObj, entity.posX, entity.posY, entity.posZ, ((EntityLivingBase) entity).getEquipmentInSlot(2));
					player.worldObj.spawnEntityInWorld(item);
				}
				if (((EntityLivingBase) entity).getEquipmentInSlot(3) != null)
				{
					EntityItem item = new EntityItem(entity.worldObj, entity.posX, entity.posY, entity.posZ, ((EntityLivingBase) entity).getEquipmentInSlot(3));
					player.worldObj.spawnEntityInWorld(item);
				}
				if (((EntityLivingBase) entity).getEquipmentInSlot(4) != null)
				{
					EntityItem item = new EntityItem(entity.worldObj, entity.posX, entity.posY, entity.posZ, ((EntityLivingBase) entity).getEquipmentInSlot(4));
					player.worldObj.spawnEntityInWorld(item);
				}
			}
			if (entity instanceof ChickenWarrior && !player.worldObj.isRemote)
			{
				EntityChicken animal = new EntityChicken(player.worldObj);
				animal.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(animal);
				entity.setDead();
				return true;
			} else if (entity instanceof HorseWarrior && !player.worldObj.isRemote)
			{
				EntityHorse animal = new EntityHorse(player.worldObj);
				animal.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(animal);
				entity.setDead();
				return true;
			} else if (entity instanceof PigWarrior && !player.worldObj.isRemote)
			{
				EntityPig animal = new EntityPig(player.worldObj);
				animal.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(animal);
				entity.setDead();
				return true;
			} else if (entity instanceof SheepWarrior && !player.worldObj.isRemote)
			{
				EntitySheep animal = new EntitySheep(player.worldObj);
				animal.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(animal);
				entity.setDead();
				return true;
			} else if (entity instanceof SquidWarrior && !player.worldObj.isRemote)
			{
				EntitySquid animal = new EntitySquid(player.worldObj);
				animal.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(animal);
				entity.setDead();
				return true;
			} else if (entity instanceof WolfWarrior && !player.worldObj.isRemote)
			{
				EntityWolf animal = new EntityWolf(player.worldObj);
				animal.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(animal);
				entity.setDead();
				return true;
			} else if (entity instanceof MooshroomWarrior && !player.worldObj.isRemote)
			{
				EntityMooshroom animal = new EntityMooshroom(player.worldObj);
				animal.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(animal);
				entity.setDead();
				return true;
			} else if (entity instanceof CowWarrior && !player.worldObj.isRemote)
			{
				EntityCow animal = new EntityCow(player.worldObj);
				animal.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(animal);
				entity.setDead();
				return true;
			} else if (entity instanceof OcelotWarrior && !player.worldObj.isRemote)
			{
				EntityOcelot animal = new EntityOcelot(player.worldObj);
				animal.setPosition(entity.posX, entity.posY, entity.posZ);
				player.worldObj.spawnEntityInWorld(animal);
				entity.setDead();
				return true;
			}
		}
		return false;
	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
		if (!par1ItemStack.hasTagCompound())
		{
			par1ItemStack.setTagCompound(new NBTTagCompound());
		}
		if (par1ItemStack.getTagCompound().getByte("mode") == 0)
		{
			par3List.add("Hit an animal to change it into a warrior.");
			par3List.add("SHIFT + Right click to change the mode.");
		} else if (par1ItemStack.getTagCompound().getByte("mode") == 1)
		{
			par3List.add("Hit an warrior to change it into an animal.");
			par3List.add("SHIFT + Right click to change the mode.");
		}
	}
}
