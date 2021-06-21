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
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModDataGenerators {

	@SubscribeEvent
	public static void DataGenerator(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		generator.addProvider(new CraftingRecipesGenerator(generator));
		generator.addProvider(new StonecuttingRecipesGenerator(generator));
		generator.addProvider(new GlasscuttingRecipesGenerator(generator));
		generator.addProvider(new SawmillingRecipesGenerator(generator));
		generator.addProvider(new WeavingRecipesGenerator(generator));
		generator.addProvider(new ModLootTableProvder(generator));
		generator.addProvider(new BlockAssetsGenerator(generator, event.getExistingFileHelper()));
		generator.addProvider(new ItemAssetsGenerator(generator, event.getExistingFileHelper()));
	}
	
	public static class ModLootTableProvder extends LootTableProvider {

		private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> loot_tables = ImmutableList.of(Pair.of(BlockLootTableGenerator::new, LootParameterSets.BLOCK));
		
		public ModLootTableProvder(net.minecraft.data.DataGenerator dataGeneratorIn) {
			super(dataGeneratorIn);
		}
		
		@Override
		protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables() {
			return loot_tables;
		}
		
		@Override
		protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
		}
		
		@Override
		public String getName() {
			return "CutAndColored loot tables";
		}
	}
}
