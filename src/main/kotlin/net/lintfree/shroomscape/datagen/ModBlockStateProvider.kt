package net.lintfree.shroomscape.datagen

import net.lintfree.shroomscape.ShroomScape.ID
import net.lintfree.shroomscape.block.ModBlocks
import net.lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_SLAB
import net.lintfree.shroomscape.block.ModBlocks.RED_SHROOM_SLAB
import net.minecraft.data.PackOutput
import net.minecraft.world.level.block.Blocks.*
import net.neoforged.neoforge.client.model.generators.BlockStateProvider
import net.neoforged.neoforge.client.model.generators.ModelFile.UncheckedModelFile
import net.neoforged.neoforge.common.data.ExistingFileHelper
import net.neoforged.neoforge.registries.DeferredBlock

class ModBlockStateProvider (output: PackOutput, existingFileHelper: ExistingFileHelper) : BlockStateProvider(output, ID, existingFileHelper){


	override fun registerStatesAndModels() {
		stairsBlock(ModBlocks.RED_SHROOM_STAIRS.get(), blockTexture(RED_MUSHROOM_BLOCK))
		stairsBlock(ModBlocks.BROWN_SHROOM_STAIRS.get(), blockTexture(BROWN_MUSHROOM_BLOCK))
		stairsBlock(ModBlocks.SHROOM_STEM_STAIRS.get(), blockTexture(MUSHROOM_STEM))
		blockItem(ModBlocks.RED_SHROOM_STAIRS)
		blockItem(ModBlocks.BROWN_SHROOM_STAIRS)
		blockItem(ModBlocks.SHROOM_STEM_STAIRS)

		slabBlock(RED_SHROOM_SLAB.get(), blockTexture(RED_MUSHROOM_BLOCK), blockTexture(RED_MUSHROOM_BLOCK))
		slabBlock(BROWN_SHROOM_SLAB.get(), blockTexture(BROWN_MUSHROOM_BLOCK), blockTexture(BROWN_MUSHROOM_BLOCK))
		slabBlock(ModBlocks.SHROOM_STEM_SLAB.get(), blockTexture(MUSHROOM_STEM), blockTexture(MUSHROOM_STEM))
		blockItem(RED_SHROOM_SLAB)
		blockItem(BROWN_SHROOM_SLAB)
		blockItem(ModBlocks.SHROOM_STEM_SLAB)

		pressurePlateBlock(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get(), blockTexture(RED_MUSHROOM_BLOCK))
		pressurePlateBlock(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get(), blockTexture(BROWN_MUSHROOM_BLOCK))
		pressurePlateBlock(ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get(), blockTexture(MUSHROOM_STEM))
		blockItem(ModBlocks.RED_SHROOM_PRESSURE_PLATE)
		blockItem(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE)
		blockItem(ModBlocks.SHROOM_STEM_PRESSURE_PLATE)

		buttonBlock(ModBlocks.RED_SHROOM_BUTTON.get(), blockTexture(RED_MUSHROOM_BLOCK))
		buttonBlock(ModBlocks.BROWN_SHROOM_BUTTON.get(), blockTexture(BROWN_MUSHROOM_BLOCK))
		buttonBlock(ModBlocks.SHROOM_STEM_BUTTON.get(), blockTexture(MUSHROOM_STEM))

		fenceBlock(ModBlocks.RED_SHROOM_FENCE.get(), blockTexture(RED_MUSHROOM_BLOCK))
		fenceBlock(ModBlocks.BROWN_SHROOM_FENCE.get(), blockTexture(BROWN_MUSHROOM_BLOCK))
		fenceBlock(ModBlocks.SHROOM_STEM_FENCE.get(), blockTexture(MUSHROOM_STEM))

		fenceGateBlock(ModBlocks.RED_SHROOM_FENCE_GATE.get(), blockTexture(RED_MUSHROOM_BLOCK))
		fenceGateBlock(ModBlocks.BROWN_SHROOM_FENCE_GATE.get(), blockTexture(BROWN_MUSHROOM_BLOCK))
		fenceGateBlock(ModBlocks.SHROOM_STEM_FENCE_GATE.get(), blockTexture(MUSHROOM_STEM))
		blockItem(ModBlocks.RED_SHROOM_FENCE_GATE)
		blockItem(ModBlocks.BROWN_SHROOM_FENCE_GATE)
		blockItem(ModBlocks.SHROOM_STEM_FENCE_GATE)

		wallBlock(ModBlocks.RED_SHROOM_WALL.get(), blockTexture(RED_MUSHROOM_BLOCK))
		wallBlock(ModBlocks.BROWN_SHROOM_WALL.get(), blockTexture(BROWN_MUSHROOM_BLOCK))
		wallBlock(ModBlocks.SHROOM_STEM_WALL.get(), blockTexture(MUSHROOM_STEM))

		doorBlockWithRenderType( ModBlocks.RED_SHROOM_DOOR.get(), modLoc("block/red_shroom_door_bottom"), modLoc( "block/red_shroom_door_top"), "cutout")
		doorBlockWithRenderType( ModBlocks.BROWN_SHROOM_DOOR.get(), modLoc("block/brown_shroom_door_bottom"), modLoc( "block/brown_shroom_door_top"), "cutout")
		doorBlockWithRenderType( ModBlocks.SHROOM_STEM_DOOR.get(), modLoc("block/shroom_stem_door_bottom"), modLoc( "block/shroom_stem_door_top"), "cutout")

		trapdoorBlockWithRenderType(ModBlocks.RED_SHROOM_TRAPDOOR.get(), modLoc("block/red_shroom_trapdoor"), true, "cutout")
		trapdoorBlockWithRenderType(ModBlocks.BROWN_SHROOM_TRAPDOOR.get(), modLoc("block/brown_shroom_trapdoor"), true, "cutout")
		trapdoorBlockWithRenderType(ModBlocks.SHROOM_STEM_TRAPDOOR.get(), modLoc("block/shroom_stem_trapdoor"), true, "cutout")
		blockItem(ModBlocks.RED_SHROOM_TRAPDOOR, "_bottom")
		blockItem(ModBlocks.BROWN_SHROOM_TRAPDOOR, "_bottom")
		blockItem(ModBlocks.SHROOM_STEM_TRAPDOOR, "_bottom")
	}

		fun blockWithItem(deferredBlock: DeferredBlock<*>) {
			simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()))
		}

		fun blockItem(deferredBlock: DeferredBlock<*>) {
			simpleBlockItem(deferredBlock.get(), UncheckedModelFile("shroom_craft:block/" + deferredBlock.id.path))
		}

		fun blockItem(deferredBlock: DeferredBlock<*>, appendix: String) {
			simpleBlockItem(
				deferredBlock.get(),
				UncheckedModelFile("shroom_craft:block/" + deferredBlock.id.path + appendix)
				//appendix is used for additional info used in the models like the trapdoor
			)
		}
}