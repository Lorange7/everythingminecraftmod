
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
public class PetroliumspiritItem extends EverythingModElements.ModElement {
	@ObjectHolder("everything:petroliumspirit")
	public static final Item block = null;
	public PetroliumspiritItem(EverythingModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(PetrolItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("petroliumspirit");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			return new ItemStack(FuelcanisterItem.block, (int) (1));
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
			list.add(new StringTextComponent("petrolium spirit; informaly known as petrol or gasoline"));
		}
	}
}
