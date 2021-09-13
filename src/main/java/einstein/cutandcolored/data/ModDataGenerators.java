package einstein.cutandcolored.data;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModDataGenerators {

	@SubscribeEvent
	public static void DataGenerator(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
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
		
		public ModLootTableProvder(DataGenerator dataGeneratorIn) {
			super(dataGeneratorIn);
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
