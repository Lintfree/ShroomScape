package net.lintfree.shroomscape.block

import net.lintfree.shroomscape.ShroomScape
import net.lintfree.shroomscape.item.ModItems
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.*
import net.minecraft.world.level.block.Blocks.BROWN_MUSHROOM_BLOCK
import net.minecraft.world.level.block.Blocks.RED_MUSHROOM_BLOCK
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.block.state.properties.BlockSetType.BAMBOO
import net.minecraft.world.level.block.state.properties.BlockSetType.IRON
import net.minecraft.world.level.block.state.properties.WoodType
import net.neoforged.neoforge.registries.DeferredBlock
import net.neoforged.neoforge.registries.DeferredRegister
import java.util.function.Supplier

object ModBlocks {
	val BLOCK_REGISTRY: DeferredRegister.Blocks = DeferredRegister.createBlocks(ShroomScape.ID)

	val RED_SHROOM_STAIRS = registerBlock("red_shroom_stairs") { ->
		StairBlock(RED_MUSHROOM_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops())
	}

	val BROWN_SHROOM_STAIRS = registerBlock("brown_shroom_stairs") { ->
		StairBlock(BROWN_MUSHROOM_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops())
	}

	val SHROOM_STEM_STAIRS = registerBlock("shroom_stem_stairs") { ->
		StairBlock(Blocks.MUSHROOM_STEM.defaultBlockState(), BlockBehaviour.Properties.of()
			.strength(2.0f)
			.requiresCorrectToolForDrops())
	}

	val RED_SHROOM_SLAB: DeferredBlock<SlabBlock> = registerBlock("red_shroom_slab") {
		SlabBlock(BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops())
	}

	val BROWN_SHROOM_SLAB: DeferredBlock<SlabBlock> = registerBlock("brown_shroom_slab") {
        SlabBlock(BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops())
    }

	val SHROOM_STEM_SLAB: DeferredBlock<SlabBlock> = registerBlock("shroom_stem_slab") {
		SlabBlock(BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops())
	}

	val RED_SHROOM_PRESSURE_PLATE: DeferredBlock<PressurePlateBlock> = registerBlock("red_shroom_pressure_plate") {
		PressurePlateBlock(IRON,   BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops())
	}

	val BROWN_SHROOM_PRESSURE_PLATE: DeferredBlock<PressurePlateBlock> = registerBlock("brown_shroom_pressure_plate") {
        PressurePlateBlock(IRON,  BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops())
    }

	val SHROOM_STEM_PRESSURE_PLATE: DeferredBlock<PressurePlateBlock> = registerBlock("shroom_stem_pressure_plate") {
		PressurePlateBlock(IRON,  BlockBehaviour.Properties.of()
			.strength(2.0f)
			.requiresCorrectToolForDrops())
	}

	val RED_SHROOM_BUTTON: DeferredBlock<ButtonBlock> = registerBlock("red_shroom_button") {
		ButtonBlock(
            IRON, 20, BlockBehaviour.Properties.of()
            .strength(2.0f)
            .noCollission())
	}

	val BROWN_SHROOM_BUTTON: DeferredBlock<ButtonBlock> = registerBlock("brown_shroom_button") {
		ButtonBlock(
            IRON, 20, BlockBehaviour.Properties.of()
            .strength(2.0f)
            .noCollission())
	}

	val SHROOM_STEM_BUTTON: DeferredBlock<ButtonBlock> = registerBlock("shroom_stem_button") {
		ButtonBlock(
			IRON, 20, BlockBehaviour.Properties.of()
			.strength(2.0f)
			.noCollission())
	}

	val RED_SHROOM_FENCE: DeferredBlock<FenceBlock> = registerBlock("red_shroom_fence") {
		FenceBlock(BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops())
	}

	val BROWN_SHROOM_FENCE: DeferredBlock<FenceBlock> = registerBlock("brown_shroom_fence") {
		FenceBlock(BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops())
	}

	val SHROOM_STEM_FENCE: DeferredBlock<FenceBlock> = registerBlock("shroom_stem_fence") {
		FenceBlock(BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops())
	}

	val RED_SHROOM_FENCE_GATE: DeferredBlock<FenceGateBlock> = registerBlock("red_shroom_fence_gate") {
		FenceGateBlock(WoodType.BAMBOO,
			BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops())
	}

	val BROWN_SHROOM_FENCE_GATE: DeferredBlock<FenceGateBlock> = registerBlock("brown_shroom_fence_gate") {
		FenceGateBlock(WoodType.BAMBOO,
			BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops())
	}

	val SHROOM_STEM_FENCE_GATE: DeferredBlock<FenceGateBlock> = registerBlock("shroom_stem_fence_gate") {
		FenceGateBlock(WoodType.BAMBOO,
			BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops())
	}

	val RED_SHROOM_WALL: DeferredBlock<WallBlock> = registerBlock("red_shroom_wall") {
		WallBlock(BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops())
	}


	val BROWN_SHROOM_WALL: DeferredBlock<WallBlock> = registerBlock("brown_shroom_wall") {
		WallBlock(BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops())
	}

	val SHROOM_STEM_WALL: DeferredBlock<WallBlock> = registerBlock("shroom_stem_wall") {
		WallBlock(BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops())
	}

	val  RED_SHROOM_DOOR: DeferredBlock<DoorBlock> = registerBlock("red_shroom_door") {
		DoorBlock(BAMBOO,BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops()
			.noOcclusion())
	}

	val  BROWN_SHROOM_DOOR: DeferredBlock<DoorBlock> = registerBlock("brown_shroom_door") {
		DoorBlock(BAMBOO,BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops()
			.noOcclusion())
	}

	val  SHROOM_STEM_DOOR: DeferredBlock<DoorBlock> = registerBlock("shroom_stem_door") {
		DoorBlock(BAMBOO,BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops()
			.noOcclusion())
	}

	val RED_SHROOM_TRAPDOOR: DeferredBlock<TrapDoorBlock> = registerBlock("red_shroom_trapdoor") {
		TrapDoorBlock(BAMBOO, BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops()
			.noOcclusion())
	}

	val BROWN_SHROOM_TRAPDOOR: DeferredBlock<TrapDoorBlock> = registerBlock("brown_shroom_trapdoor") {
		TrapDoorBlock(BAMBOO, BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops()
			.noOcclusion())
	}

	val SHROOM_STEM_TRAPDOOR: DeferredBlock<TrapDoorBlock> = registerBlock("shroom_stem_trapdoor") {
		TrapDoorBlock(BAMBOO, BlockBehaviour.Properties.of()
			.strength(2.0F)
			.requiresCorrectToolForDrops()
			.noOcclusion())
	}

	private fun <T : Block?> registerBlock(blockName: String, blockSupplier: Supplier<T>): DeferredBlock<T> {
		val registeredBlock: DeferredBlock<T> = BLOCK_REGISTRY.register(blockName, blockSupplier)
		registerBlockItem(blockName, registeredBlock)
		return registeredBlock
	}

	private fun <T: Block?>registerBlockItem(blockName: String, block: DeferredBlock<T>) {
		ModItems.ITEM_REGISTRY.register(blockName) { -> BlockItem(block.get(), Item.Properties()) }
	}
}
