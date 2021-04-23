
package net.lorange.seven.everything.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.lorange.seven.everything.item.DeserteagleItem;
import net.lorange.seven.everything.EverythingModElements;

@EverythingModElements.ModElement.Tag
public class WeaponsItemGroup extends EverythingModElements.ModElement {
	public WeaponsItemGroup(EverythingModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabweapons") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DeserteagleItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
