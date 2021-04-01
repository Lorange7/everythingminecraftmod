
package net.lorange.seven.everything.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.lorange.seven.everything.itemgroup.PetrolItemGroup;
import net.lorange.seven.everything.EverythingModElements;

import java.util.List;

@EverythingModElements.ModElement.Tag
public class FuelcanisterItem extends EverythingModElements.ModElement {
	@ObjectHolder("everything:fuelcanister")
	public static final Item block = null;
	public FuelcanisterItem(EverythingModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(PetrolItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("fuelcanister");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0.5F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("an empty fuel can"));
			list.add(new StringTextComponent("can be filled up with petrol"));
		}
	}
}
