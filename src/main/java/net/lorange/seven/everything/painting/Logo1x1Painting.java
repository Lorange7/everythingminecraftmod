
package net.lorange.seven.everything.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.lorange.seven.everything.EverythingModElements;

@EverythingModElements.ModElement.Tag
public class Logo1x1Painting extends EverythingModElements.ModElement {
	public Logo1x1Painting(EverythingModElements instance) {
		super(instance, 14);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(16, 16).setRegistryName("logo_1x_1"));
	}
}
