
package net.lorange.seven.everything.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.lorange.seven.everything.itemgroup.NanoroboticsItemGroup;
import net.lorange.seven.everything.EverythingModElements;

import java.util.List;
import java.util.Collections;

@EverythingModElements.ModElement.Tag
public class NanoroboticwormholegeneratorblockBlock extends EverythingModElements.ModElement {
	@ObjectHolder("everything:nanoroboticwormholegeneratorblock")
	public static final Block block = null;
	public NanoroboticwormholegeneratorblockBlock(EverythingModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(NanoroboticsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("nanoroboticwormholegeneratorblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
