package mcmod.nxs.animalwarriors.core;

import mcmod.nxs.animalwarriors.entity.passive.ChickenWarrior;
import mcmod.nxs.animalwarriors.entity.passive.CowWarrior;
import mcmod.nxs.animalwarriors.entity.passive.HorseWarrior;
import mcmod.nxs.animalwarriors.entity.passive.MooshroomWarrior;
import mcmod.nxs.animalwarriors.entity.passive.OcelotWarrior;
import mcmod.nxs.animalwarriors.entity.passive.PigWarrior;
import mcmod.nxs.animalwarriors.entity.passive.SheepWarrior;
import mcmod.nxs.animalwarriors.entity.passive.SquidWarrior;
import mcmod.nxs.animalwarriors.entity.passive.WolfWarrior;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHandler {

	public static void addEntities()
	{
		EntityRegistry.registerGlobalEntityID(ChickenWarrior.class, "ChickenWarrior", EntityRegistry.findGlobalUniqueEntityId(), 200, 200);
		EntityRegistry.registerGlobalEntityID(CowWarrior.class, "CowWarrior", EntityRegistry.findGlobalUniqueEntityId(), 200, 200);
		EntityRegistry.registerGlobalEntityID(HorseWarrior.class, "HorseWarrior", EntityRegistry.findGlobalUniqueEntityId(), 200, 200);
		EntityRegistry.registerGlobalEntityID(PigWarrior.class, "PigWarrior", EntityRegistry.findGlobalUniqueEntityId(), 200, 200);
		EntityRegistry.registerGlobalEntityID(SheepWarrior.class, "SheepWarrior", EntityRegistry.findGlobalUniqueEntityId(), 200, 200);
		EntityRegistry.registerGlobalEntityID(SquidWarrior.class, "SquidWarrior", EntityRegistry.findGlobalUniqueEntityId(), 200, 200);
		EntityRegistry.registerGlobalEntityID(MooshroomWarrior.class, "MooshroomWarrior", EntityRegistry.findGlobalUniqueEntityId(), 200, 200);
		EntityRegistry.registerGlobalEntityID(WolfWarrior.class, "WolfWarrior", EntityRegistry.findGlobalUniqueEntityId(), 200, 200);
		EntityRegistry.registerGlobalEntityID(OcelotWarrior.class, "OcelotWarrior", EntityRegistry.findGlobalUniqueEntityId(), 200, 200);
	}
}
