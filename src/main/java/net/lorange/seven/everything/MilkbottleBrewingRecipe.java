
package net.lorange.seven.everything;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.lorange.seven.everything.item.BottleofmilkItem;

@EverythingModElements.ModElement.Tag
public class MilkbottleBrewingRecipe extends EverythingModElements.ModElement {
	public MilkbottleBrewingRecipe(EverythingModElements instance) {
		super(instance, 17);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.GLASS_BOTTLE, (int) (1))),
				Ingredient.fromStacks(new ItemStack(Items.MILK_BUCKET, (int) (1))), new ItemStack(BottleofmilkItem.block, (int) (1)));
	}
}
