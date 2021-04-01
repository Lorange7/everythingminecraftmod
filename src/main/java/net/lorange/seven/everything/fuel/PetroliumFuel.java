
package net.lorange.seven.everything.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.lorange.seven.everything.item.PetroliumspiritItem;
import net.lorange.seven.everything.EverythingModElements;

@EverythingModElements.ModElement.Tag
public class PetroliumFuel extends EverythingModElements.ModElement {
	public PetroliumFuel(EverythingModElements instance) {
		super(instance, 3);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(PetroliumspiritItem.block, (int) (1)).getItem())
			event.setBurnTime(12800);
	}
}
