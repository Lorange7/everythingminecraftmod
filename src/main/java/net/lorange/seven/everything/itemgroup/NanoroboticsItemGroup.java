
package net.lorange.seven.everything.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.lorange.seven.everything.block.NanoroboticwormholegeneratorblockBlock;
import net.lorange.seven.everything.EverythingModElements;

@EverythingModElements.ModElement.Tag
public class NanoroboticsItemGroup extends EverythingModElements.ModElement {
	public NanoroboticsItemGroup(EverythingModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnanorobotics") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(NanoroboticwormholegeneratorblockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
