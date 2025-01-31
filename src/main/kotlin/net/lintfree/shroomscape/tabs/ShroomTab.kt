package net.lintfree.shroomscape.tabs

import net.lintfree.shroomscape.ShroomScape
import net.lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_BUTTON
import net.lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_DOOR
import net.lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_FENCE
import net.lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_FENCE_GATE
import net.lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_PRESSURE_PLATE
import net.lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_SLAB
import net.lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_STAIRS
import net.lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_TRAPDOOR
import net.lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_WALL
import net.lintfree.shroomscape.block.ModBlocks.RED_SHROOM_BUTTON
import net.lintfree.shroomscape.block.ModBlocks.RED_SHROOM_DOOR
import net.lintfree.shroomscape.block.ModBlocks.RED_SHROOM_FENCE
import net.lintfree.shroomscape.block.ModBlocks.RED_SHROOM_FENCE_GATE
import net.lintfree.shroomscape.block.ModBlocks.RED_SHROOM_PRESSURE_PLATE
import net.lintfree.shroomscape.block.ModBlocks.RED_SHROOM_SLAB
import net.lintfree.shroomscape.block.ModBlocks.RED_SHROOM_STAIRS
import net.lintfree.shroomscape.block.ModBlocks.RED_SHROOM_TRAPDOOR
import net.lintfree.shroomscape.block.ModBlocks.RED_SHROOM_WALL
import net.lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_BUTTON
import net.lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_DOOR
import net.lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_FENCE
import net.lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_FENCE_GATE
import net.lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_PRESSURE_PLATE
import net.lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_SLAB
import net.lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_STAIRS
import net.lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_TRAPDOOR
import net.lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_WALL
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.CreativeModeTabs
import net.minecraft.world.item.ItemStack
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent
import net.neoforged.neoforge.registries.DeferredHolder
import net.neoforged.neoforge.registries.DeferredRegister

object ShroomTab {
	val CREATIVE_MODE_TABS: DeferredRegister<CreativeModeTab> = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShroomScape.ID)

val SHROOM_TAB: DeferredHolder <CreativeModeTab, CreativeModeTab> = CREATIVE_MODE_TABS.register("shroom_tab") { ->
		CreativeModeTab.builder().withTabsBefore(CreativeModeTabs.COMBAT)
			.title (Component.translatable("itemGroup.shroom_craft"))
			.withTabsBefore(CreativeModeTabs.COMBAT)
			.icon { ItemStack(RED_SHROOM_STAIRS.get().asItem()) }
			.displayItems { itemDisplayParameters, output ->
				output.accept(RED_SHROOM_STAIRS)
				output.accept(BROWN_SHROOM_STAIRS)
				output.accept(SHROOM_STEM_STAIRS)
				output.accept(RED_SHROOM_SLAB)
				output.accept(BROWN_SHROOM_SLAB)
				output.accept(SHROOM_STEM_SLAB)
				output.accept(RED_SHROOM_PRESSURE_PLATE)
				output.accept(BROWN_SHROOM_PRESSURE_PLATE)
				output.accept(SHROOM_STEM_PRESSURE_PLATE)
				output.accept(RED_SHROOM_BUTTON)
				output.accept(BROWN_SHROOM_BUTTON)
				output.accept(SHROOM_STEM_BUTTON)
				output.accept(RED_SHROOM_FENCE)
				output.accept(BROWN_SHROOM_FENCE)
				output.accept(SHROOM_STEM_FENCE)
				output.accept(RED_SHROOM_FENCE_GATE)
				output.accept(BROWN_SHROOM_FENCE_GATE)
				output.accept(SHROOM_STEM_FENCE_GATE)
				output.accept(RED_SHROOM_WALL)
				output.accept(BROWN_SHROOM_WALL)
				output.accept(SHROOM_STEM_WALL)
				output.accept(RED_SHROOM_DOOR)
				output.accept(BROWN_SHROOM_DOOR)
				output.accept(SHROOM_STEM_DOOR)
				output.accept(RED_SHROOM_TRAPDOOR)
				output.accept(BROWN_SHROOM_TRAPDOOR)
				output.accept(SHROOM_STEM_TRAPDOOR)
			}
			.build()
		}

	 fun addCreative(event: BuildCreativeModeTabContentsEvent) {
		if (event.tabKey == CreativeModeTabs.BUILDING_BLOCKS) {
			event.accept(SHROOM_STEM_STAIRS)
			event.accept(RED_SHROOM_STAIRS)
			event.accept(BROWN_SHROOM_STAIRS)
			event.accept(SHROOM_STEM_SLAB)
			event.accept(RED_SHROOM_SLAB)
			event.accept(BROWN_SHROOM_SLAB)
			event.accept(SHROOM_STEM_PRESSURE_PLATE)
			event.accept(RED_SHROOM_PRESSURE_PLATE)
			event.accept(BROWN_SHROOM_PRESSURE_PLATE)
			event.accept(SHROOM_STEM_BUTTON)
			event.accept(RED_SHROOM_BUTTON)
			event.accept(BROWN_SHROOM_BUTTON)
			event.accept(SHROOM_STEM_FENCE)
			event.accept(RED_SHROOM_FENCE)
			event.accept(BROWN_SHROOM_FENCE)
			event.accept(SHROOM_STEM_FENCE_GATE)
			event.accept(RED_SHROOM_FENCE_GATE)
			event.accept(BROWN_SHROOM_FENCE_GATE)
			event.accept(SHROOM_STEM_WALL)
			event.accept(RED_SHROOM_WALL)
			event.accept(BROWN_SHROOM_WALL)
			event.accept(SHROOM_STEM_DOOR)
			event.accept(RED_SHROOM_DOOR)
			event.accept(BROWN_SHROOM_DOOR)
			event.accept(SHROOM_STEM_TRAPDOOR)
			event.accept(RED_SHROOM_TRAPDOOR)
			event.accept(BROWN_SHROOM_TRAPDOOR)
		}
		//if (event.tabKey == CreativeModeTabs.INGREDIENTS) {
		//event.accept(ModItems.EXAMPLE_ITEM)	}
	}
}