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
import einstein.cutandcolored.init.ModBlocks;
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

	public static final List<Block> allBlocks = new ArrayList<Block>();
	public static final List<Block> allMCBlocks = new ArrayList<Block>(ForgeRegistries.BLOCKS.getValues().stream()
			.filter((block) -> CutAndColored.MCMODID.equals(Objects.requireNonNull(block.getRegistryName()).getNamespace()))
			.collect(Collectors.toList()));
	
	@SubscribeEvent
	public static void DataGenerator(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ModBlocks.BLOCKS.getEntries().forEach((block) -> allBlocks.add(block.get()));
		generator.addProvider(new CraftingRecipesGenerator(generator));
		generator.addProvider(new SmeltingRecipeGenerator(generator));
		generator.addProvider(new StonecuttingRecipesGenerator(generator));
		generator.addProvider(new GlasscuttingRecipesGenerator(generator));
		generator.addProvider(new SawmillingRecipesGenerator(generator));
		generator.addProvider(new WeavingRecipesGenerator(generator));
		generator.addProvider(new ModLootTableProvder(generator));
		generator.addProvider(new BlockAssetsGenerator(generator, event.getExistingFileHelper()));
		generator.addProvider(new ItemAssetsGenerator(generator, event.getExistingFileHelper()));
		BlockTagsProvider blockTags = new BlockTagsGenerator(generator, event.getExistingFileHelper()); // Used for both item and block tags
		generator.addProvider(blockTags);
		generator.addProvider(new ItemTagsGenerator(generator, blockTags, event.getExistingFileHelper()));
	}
	
	public static class ModLootTableProvder extends LootTableProvider {

		private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> loot_tables = ImmutableList.of(Pair.of(BlockLootTableGenerator::new, LootContextParamSets.BLOCK));
		
		public ModLootTableProvder(DataGenerator dataGenerator) {
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
