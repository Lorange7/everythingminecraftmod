package net.lorange.seven.everything.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.lorange.seven.everything.EverythingModElements;
import net.lorange.seven.everything.EverythingMod;

import java.util.Map;

@EverythingModElements.ModElement.Tag
public class BottleofmilkFoodEatenProcedure extends EverythingModElements.ModElement {
	public BottleofmilkFoodEatenProcedure(EverythingModElements instance) {
		super(instance, 16);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EverythingMod.LOGGER.warn("Failed to load dependency entity for procedure BottleofmilkFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).clearActivePotions();
	}
}
