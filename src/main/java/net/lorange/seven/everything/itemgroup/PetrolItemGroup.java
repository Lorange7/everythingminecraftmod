
package net.lorange.seven.everything.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.lorange.seven.everything.item.FuelcanisterItem;
import net.lorange.seven.everything.EverythingModElements;

@EverythingModElements.ModElement.Tag
public class PetrolItemGroup extends EverythingModElements.ModElement {
	public PetrolItemGroup(EverythingModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabpetrol") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(FuelcanisterItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
