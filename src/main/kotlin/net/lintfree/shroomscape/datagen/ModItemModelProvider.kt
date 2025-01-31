package net.lintfree.shroomscape.datagen

import net.lintfree.shroomscape.ShroomScape.ID
import net.lintfree.shroomscape.block.ModBlocks
import net.minecraft.data.PackOutput
import net.minecraft.resources.ResourceLocation
import net.neoforged.neoforge.client.model.generators.ItemModelProvider
import net.neoforged.neoforge.common.data.ExistingFileHelper
import net.neoforged.neoforge.registries.DeferredBlock


class ModItemModelProvider (output: PackOutput, existingFileHelper: ExistingFileHelper) : ItemModelProvider(output, ID, existingFileHelper) {

	override fun registerModels() {
		buttonItem(ModBlocks.RED_SHROOM_BUTTON, ResourceLocation.fromNamespaceAndPath("minecraft", "block/red_mushroom_block"))
		buttonItem(ModBlocks.BROWN_SHROOM_BUTTON, ResourceLocation.fromNamespaceAndPath("minecraft", "block/brown_mushroom_block"))
		buttonItem(ModBlocks.SHROOM_STEM_BUTTON, ResourceLocation.fromNamespaceAndPath("minecraft", "block/mushroom_stem"))

		fenceItem(ModBlocks.RED_SHROOM_FENCE, ResourceLocation.fromNamespaceAndPath("minecraft", "block/red_mushroom_block"))
		fenceItem(ModBlocks.BROWN_SHROOM_FENCE, ResourceLocation.fromNamespaceAndPath("minecraft", "block/brown_mushroom_block"))
		fenceItem(ModBlocks.SHROOM_STEM_FENCE, ResourceLocation.fromNamespaceAndPath("minecraft", "block/mushroom_stem"))

		wallItem(ModBlocks.RED_SHROOM_WALL, ResourceLocation.fromNamespaceAndPath("minecraft", "block/red_mushroom_block"))
		wallItem(ModBlocks.BROWN_SHROOM_WALL, ResourceLocation.fromNamespaceAndPath("minecraft", "block/brown_mushroom_block"))
		wallItem(ModBlocks.SHROOM_STEM_WALL, ResourceLocation.fromNamespaceAndPath("minecraft", "block/mushroom_stem"))

		basicItem(ModBlocks.RED_SHROOM_DOOR.asItem())
		basicItem(ModBlocks.BROWN_SHROOM_DOOR.asItem())
		basicItem(ModBlocks.SHROOM_STEM_DOOR.asItem())
	}

	private fun buttonItem(block: DeferredBlock<*>, baseBlock: ResourceLocation) {
		withExistingParent(block.id.path, mcLoc("block/button_inventory"))
			.texture("texture", baseBlock)

	}

	private fun fenceItem(block: DeferredBlock<*>, baseBlock: ResourceLocation) {
		withExistingParent(block.id.path, mcLoc("block/fence_inventory"))
			.texture("texture", baseBlock)
	}

	private fun wallItem(block: DeferredBlock<*>, baseBlock: ResourceLocation) {
		withExistingParent(block.id.path, mcLoc("block/wall_inventory"))
			.texture("wall", baseBlock)
	}
}





