package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.tags.BlockTagsGenerator;
import einstein.cutandcolored.tags.ItemTagsGenerator;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.util.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModDataGenerators {
	
	@SubscribeEvent
	public static void DataGenerator(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ModBlocks.BLOCKS.getEntries().forEach((block) -> CutAndColored.allBlocks.add(block.get()));

		// Server providers
		generator.addProvider(event.includeServer(), new CraftingRecipesGenerator(generator));
		generator.addProvider(event.includeServer(), new SmeltingRecipeGenerator(generator));
		generator.addProvider(event.includeServer(), new StonecuttingRecipesGenerator(generator));
		generator.addProvider(event.includeServer(), new GlasscuttingRecipesGenerator(generator));
		generator.addProvider(event.includeServer(), new SawmillingRecipesGenerator(generator));
		generator.addProvider(event.includeServer(), new WeavingRecipesGenerator(generator));
		generator.addProvider(event.includeServer(), new ModLootTableProvider(generator));
		BlockTagsProvider blockTags = new BlockTagsGenerator(generator, event.getExistingFileHelper()); // Used for both item and block tags
		generator.addProvider(event.includeServer(), blockTags);
		generator.addProvider(event.includeServer(), new ItemTagsGenerator(generator, blockTags, event.getExistingFileHelper()));

		// Client providers
		generator.addProvider(event.includeClient(), new BlockAssetsGenerator(generator, event.getExistingFileHelper()));
		generator.addProvider(event.includeClient(), new ItemModelsGenerator(generator, event.getExistingFileHelper()));
	}
	
	public static class ModLootTableProvider extends LootTableProvider {

		private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> loot_tables = ImmutableList.of(Pair.of(BlockLootTableGenerator::new, LootContextParamSets.BLOCK));
		
		public ModLootTableProvider(DataGenerator dataGenerator) {
			super(dataGenerator);
		}
		
		@Override
		protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
			return loot_tables;
		}
		
		@Override
		protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationContext) {
		}
		
		@Override
		public String getName() {
			return "CutAndColored loot tables";
		}
	}
}
