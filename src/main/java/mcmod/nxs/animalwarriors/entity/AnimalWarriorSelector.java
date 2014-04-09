package mcmod.nxs.animalwarriors.entity;

import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;

public class AnimalWarriorSelector implements IEntitySelector {

	public boolean isEntityApplicable(Entity entity)
	{
		if (entity instanceof IAnimalIdentifier || entity instanceof EntityPlayer || entity instanceof EntityAnimal)
		{
			return false;
		} else
			return true;
	}
}
