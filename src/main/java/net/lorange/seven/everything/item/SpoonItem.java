
package net.lorange.seven.everything.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.lorange.seven.everything.EverythingModElements;

import java.util.List;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

@EverythingModElements.ModElement.Tag
public class SpoonItem extends EverythingModElements.ModElement {
	@ObjectHolder("everything:spoon")
	public static final Item block = null;
	public SpoonItem(EverythingModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("a spoon"));
			}

			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("spoon"));
	}
	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			super(new Item.Properties().group(ItemGroup.TOOLS).maxDamage(100));
		}

		@Override
		public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
			if (blockstate.getBlock() == Blocks.CAKE.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.OAK_LEAVES.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.SPRUCE_LEAVES.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.BIRCH_LEAVES.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.JUNGLE_LEAVES.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.ACACIA_LEAVES.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_LEAVES.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.MELON.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.DRAGON_EGG.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.PUMPKIN.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.CARVED_PUMPKIN.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.JACK_O_LANTERN.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.HONEYCOMB_BLOCK.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.HONEY_BLOCK.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.BAMBOO.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.BAMBOO_SAPLING.getDefaultState().getBlock())
				return 6f;
			if (blockstate.getBlock() == Blocks.POTTED_BAMBOO.getDefaultState().getBlock())
				return 6f;
			return 1;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
			stack.damageItem(1, entityLiving, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
			stack.damageItem(2, attacker, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 2;
		}

		@Override
		public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
			if (equipmentSlot == EquipmentSlotType.MAINHAND) {
				ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(equipmentSlot));
				builder.put(Attributes.ATTACK_DAMAGE,
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 2f, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ATTACK_SPEED,
						new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -3, AttributeModifier.Operation.ADDITION));
				return builder.build();
			}
			return super.getAttributeModifiers(equipmentSlot);
		}
	}
}
