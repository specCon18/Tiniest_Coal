package com.skdevstudios.yatcm.datagen;

import java.util.function.Consumer;

import com.skdevstudios.yatcm.items.ModItems;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder{

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TINY_COAL.get(), 8)
                .requires(Items.COAL)
                .unlockedBy("has_coal", inventoryTrigger(ItemPredicate.Builder.item().of(Items.COAL).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TINY_CHARCOAL.get(), 8)
                .requires(Items.CHARCOAL)
                .unlockedBy("has_charcoal", inventoryTrigger(ItemPredicate.Builder.item().of(Items.CHARCOAL).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.COAL, 1)
                .requires(ModItems.TINY_COAL.get(), 8)
                .unlockedBy("has_tiny_coal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TINY_COAL.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.CHARCOAL, 1)
                .requires(ModItems.TINY_CHARCOAL.get(), 8)
                .unlockedBy("has_tiny_coal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.TINY_CHARCOAL.get()).build()))
                .save(pWriter);
            
    }
    
}
