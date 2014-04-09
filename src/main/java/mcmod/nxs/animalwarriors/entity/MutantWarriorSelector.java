package mcmod.nxs.animalwarriors.entity;

import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;

public class MutantWarriorSelector implements IEntitySelector {

	@Override
	public boolean isEntityApplicable(Entity entity)
	{
		if (entity instanceof IMutantIdentifier || entity instanceof EntityPlayer || entity instanceof EntityAnimal || entity instanceof IAnimalIdentifier)
		{
			return false;
		} else
			return true;
	}

}
