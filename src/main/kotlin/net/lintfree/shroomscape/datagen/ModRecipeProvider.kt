package net.lintfree.shroomscape.datagen

import net.lintfree.shroomscape.block.ModBlocks
import net.minecraft.core.HolderLookup
import net.minecraft.data.PackOutput
import net.minecraft.data.recipes.RecipeCategory
import net.minecraft.data.recipes.RecipeOutput
import net.minecraft.data.recipes.RecipeProvider
import net.minecraft.world.item.Items.*
import net.minecraft.world.item.crafting.Ingredient
import net.neoforged.neoforge.common.conditions.IConditionBuilder
import java.util.concurrent.CompletableFuture

class ModRecipeProvider (output: PackOutput, registries: CompletableFuture<HolderLookup.Provider>) : RecipeProvider(output, registries),
	IConditionBuilder {


	override fun buildRecipes(recipeOutput: RecipeOutput) {
		stairBuilder(ModBlocks.RED_SHROOM_STAIRS.get(), Ingredient.of(RED_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_red_mushroom_block", has(RED_MUSHROOM_BLOCK)).save(recipeOutput)
		stairBuilder(ModBlocks.BROWN_SHROOM_STAIRS.get(), Ingredient.of(BROWN_MUSHROOM_BLOCK)).group("shroomcraft")
		    .unlockedBy("has_brown_mushroom_block", has(BROWN_MUSHROOM_BLOCK)).save(recipeOutput)
		stairBuilder(ModBlocks.SHROOM_STEM_STAIRS.get(), Ingredient.of(MUSHROOM_STEM)).group("shroomcraft")
		    .unlockedBy("has_mushroom_stem", has(RED_MUSHROOM_BLOCK)).save(recipeOutput)

		slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SHROOM_SLAB.get(), RED_MUSHROOM_BLOCK)
		slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_SHROOM_SLAB.get(), BROWN_MUSHROOM_BLOCK)
		slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHROOM_STEM_SLAB.get(), MUSHROOM_STEM)

		pressurePlate( recipeOutput, ModBlocks.RED_SHROOM_PRESSURE_PLATE.get(), RED_MUSHROOM_BLOCK)
		pressurePlate(recipeOutput, ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get(), BROWN_MUSHROOM_BLOCK)
		pressurePlate(recipeOutput, ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get(), MUSHROOM_STEM)

		buttonBuilder(ModBlocks.RED_SHROOM_BUTTON, Ingredient.of(RED_MUSHROOM_BLOCK)).group("shroomcraft")
		    .unlockedBy("has_red_mushroom_block", has(RED_MUSHROOM_BLOCK)).save(recipeOutput)
		buttonBuilder(ModBlocks.BROWN_SHROOM_BUTTON, Ingredient.of(BROWN_MUSHROOM_BLOCK)).group("shroomcraft")
		    .unlockedBy("has_brown_mushroom_block", has(BROWN_MUSHROOM_BLOCK)).save(recipeOutput)
		buttonBuilder(ModBlocks.SHROOM_STEM_BUTTON, Ingredient.of(MUSHROOM_STEM)).group("shroomcraft")
		    .unlockedBy("has_mushroom_stem", has(MUSHROOM_STEM)).save(recipeOutput)

		fenceBuilder( ModBlocks.RED_SHROOM_FENCE.get(), Ingredient.of(RED_MUSHROOM_BLOCK)).group("shroomcraft")
		    .unlockedBy("has_red_mushroom_block", has(RED_MUSHROOM_BLOCK)).save(recipeOutput)
		fenceBuilder( ModBlocks.BROWN_SHROOM_FENCE.get(), Ingredient.of(BROWN_MUSHROOM_BLOCK)).group("shroomcraft")
		    .unlockedBy("has_brown_mushroom_block", has(BROWN_MUSHROOM_BLOCK)).save(recipeOutput)
		fenceBuilder( ModBlocks.SHROOM_STEM_FENCE.get(), Ingredient.of(MUSHROOM_STEM)).group("shroomcraft")
		    .unlockedBy("has_mushroom_stem", has(MUSHROOM_STEM)).save(recipeOutput)

		fenceGateBuilder( ModBlocks.RED_SHROOM_FENCE_GATE.get(), Ingredient.of(RED_MUSHROOM_BLOCK)).group("shroomcraft")
		    .unlockedBy("has_red_mushroom_block", has(RED_MUSHROOM_BLOCK)).save(recipeOutput)
		fenceGateBuilder( ModBlocks.BROWN_SHROOM_FENCE_GATE.get(), Ingredient.of(BROWN_MUSHROOM_BLOCK)).group("shroomcraft")
		    .unlockedBy("has_brown_mushroom_block", has(BROWN_MUSHROOM_BLOCK)).save(recipeOutput)
		fenceGateBuilder( ModBlocks.SHROOM_STEM_FENCE_GATE.get(), Ingredient.of(MUSHROOM_STEM)).group("shroomcraft")
		    .unlockedBy("has_mushroom_stem", has(MUSHROOM_STEM)).save(recipeOutput)

		doorBuilder(ModBlocks.RED_SHROOM_DOOR.get(), Ingredient.of(RED_MUSHROOM_BLOCK)).group("shroomcraft")
		    .unlockedBy("has_red_mushroom_block", has(RED_MUSHROOM_BLOCK)).save(recipeOutput)
		doorBuilder(ModBlocks.BROWN_SHROOM_DOOR.get(), Ingredient.of(BROWN_MUSHROOM_BLOCK)).group("shroomcraft")
		    .unlockedBy("has_brown_mushroom_block", has(BROWN_MUSHROOM_BLOCK)).save(recipeOutput)
		doorBuilder(ModBlocks.SHROOM_STEM_DOOR.get(), Ingredient.of(MUSHROOM_STEM)).group("shroomcraft")
		    .unlockedBy("has_mushroom_stem", has(MUSHROOM_STEM)).save(recipeOutput)

		wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SHROOM_WALL.get(), RED_MUSHROOM_BLOCK)
		wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_SHROOM_WALL.get(), BROWN_MUSHROOM_BLOCK)
		wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHROOM_STEM_WALL.get(), MUSHROOM_STEM)

		trapdoorBuilder(ModBlocks.RED_SHROOM_TRAPDOOR.get(), Ingredient.of(RED_MUSHROOM_BLOCK)).group("shroomcraft")
		    .unlockedBy("has_red_mushroom_block", has(RED_MUSHROOM_BLOCK)).save(recipeOutput)
		trapdoorBuilder(ModBlocks.BROWN_SHROOM_TRAPDOOR.get(), Ingredient.of(BROWN_MUSHROOM_BLOCK)).group("shroomcraft")
		    .unlockedBy("has_brown_mushroom_block", has(BROWN_MUSHROOM_BLOCK)).save(recipeOutput)
		trapdoorBuilder(ModBlocks.SHROOM_STEM_TRAPDOOR.get(), Ingredient.of(MUSHROOM_STEM)).group("shroomcraft")
		    .unlockedBy("has_mushroom_stem", has(MUSHROOM_STEM)).save(recipeOutput)

	}
}