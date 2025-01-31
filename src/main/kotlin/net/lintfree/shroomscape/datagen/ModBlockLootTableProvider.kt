package net.lintfree.shroomscape.datagen

import net.lintfree.shroomscape.block.ModBlocks
import net.minecraft.core.HolderLookup
import net.minecraft.data.loot.BlockLootSubProvider
import net.minecraft.world.flag.FeatureFlags
import net.minecraft.world.level.block.Block

class ModBlockLootTableProvider(registries: HolderLookup.Provider) : BlockLootSubProvider(
	emptySet(), FeatureFlags.REGISTRY.allFlags(), registries) {

	override fun generate() {
		dropSelf(ModBlocks.RED_SHROOM_STAIRS.get())
		dropSelf(ModBlocks.BROWN_SHROOM_STAIRS.get())
		dropSelf(ModBlocks.SHROOM_STEM_STAIRS.get())

		add(ModBlocks.RED_SHROOM_SLAB.get()) { block: Block? -> createSlabItemTable(ModBlocks.RED_SHROOM_SLAB.get()) }
		add(ModBlocks.BROWN_SHROOM_SLAB.get()) { block: Block? -> createSlabItemTable(ModBlocks.BROWN_SHROOM_SLAB.get()) }
		add(ModBlocks.SHROOM_STEM_SLAB.get()) { block: Block? -> createSlabItemTable(ModBlocks.SHROOM_STEM_SLAB.get()) }

		dropSelf(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get())
		dropSelf(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get())
		dropSelf(ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get())

		dropSelf(ModBlocks.RED_SHROOM_BUTTON.get())
		dropSelf(ModBlocks.BROWN_SHROOM_BUTTON.get())
		dropSelf(ModBlocks.SHROOM_STEM_BUTTON.get())

		dropSelf(ModBlocks.RED_SHROOM_FENCE.get())
		dropSelf(ModBlocks.BROWN_SHROOM_FENCE.get())
		dropSelf(ModBlocks.SHROOM_STEM_FENCE.get())

		dropSelf(ModBlocks.RED_SHROOM_FENCE_GATE.get())
		dropSelf(ModBlocks.BROWN_SHROOM_FENCE_GATE.get())
		dropSelf(ModBlocks.SHROOM_STEM_FENCE_GATE.get())

		dropSelf(ModBlocks.RED_SHROOM_WALL.get())
		dropSelf(ModBlocks.BROWN_SHROOM_WALL.get())
		dropSelf(ModBlocks.SHROOM_STEM_WALL.get())

		add(ModBlocks.RED_SHROOM_DOOR.get()) { block: Block? -> createDoorTable(ModBlocks.RED_SHROOM_DOOR.get()) }
		add(ModBlocks.BROWN_SHROOM_DOOR.get()) { block: Block? -> createDoorTable(ModBlocks.BROWN_SHROOM_DOOR.get()) }
		add(ModBlocks.SHROOM_STEM_DOOR.get()) { block: Block? -> createDoorTable(ModBlocks.SHROOM_STEM_DOOR.get()) }

		dropSelf(ModBlocks.RED_SHROOM_TRAPDOOR.get())
		dropSelf(ModBlocks.BROWN_SHROOM_TRAPDOOR.get())
		dropSelf(ModBlocks.SHROOM_STEM_TRAPDOOR.get())
	}

	override fun getKnownBlocks(): Iterable<Block> {
		return ModBlocks.BLOCK_REGISTRY.entries.map { it.value() }.asIterable()
	}
}