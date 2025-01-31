package net.lintfree.shroomscape.datagen

import net.lintfree.shroomscape.ShroomScape.ID
import net.minecraft.core.HolderLookup
import net.minecraft.data.loot.LootTableProvider
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.data.event.GatherDataEvent
import java.util.concurrent.CompletableFuture


@EventBusSubscriber(modid = ID, bus = EventBusSubscriber.Bus.MOD)
object DataGenerators {
@SubscribeEvent
	fun gatherData(event: GatherDataEvent) {
		val generator = event.generator
		val packOutput = generator.packOutput
		val existingFileHelper = event.existingFileHelper
		val lookupProvider: CompletableFuture<HolderLookup.Provider> = event.lookupProvider

		//Loot Tables
		generator.addProvider(
			event.includeServer(),
			LootTableProvider(
				packOutput, emptySet(),
				listOf(LootTableProvider.SubProviderEntry(::ModBlockLootTableProvider, LootContextParamSets.BLOCK)),
				lookupProvider
			)
		)

		//BlockStates and Models
		generator.addProvider(event.includeClient(), ModBlockStateProvider(packOutput, existingFileHelper))
		generator.addProvider(event.includeClient(), ModItemModelProvider(packOutput, existingFileHelper))

		//Recipes
		generator.addProvider(event.includeServer(), ModRecipeProvider(packOutput, lookupProvider))

		//Tags
		val blockTagsProvider = ModBlockTagProvider(packOutput, lookupProvider, existingFileHelper)
		generator.addProvider(event.includeServer(), blockTagsProvider)
	}
}