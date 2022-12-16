package einstein.cutandcolored.data;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.util.Util;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BlockLootTableGenerator extends BlockLootSubProvider {
	
	private final List<Block> nonSlabBlocks = new ArrayList<>(CutAndColored.allBlocks.stream()
			.filter((block) -> !Util.getBlockRegistryName(block).getPath().contains("_slab"))
			.filter((block) -> !Util.getBlockRegistryName(block).getPath().contains("glass"))
			.collect(Collectors.toList()));
	
	private final List<Block> slabBlocks = new ArrayList<>(CutAndColored.allBlocks.stream()
			.filter((block) -> Util.getBlockRegistryName(block).getPath().contains("_slab"))
			.filter((block) -> !Util.getBlockRegistryName(block).getPath().contains("glass"))
			.collect(Collectors.toList()));
	
	private final List<Block> silkTouchBlocks = new ArrayList<>(CutAndColored.allBlocks.stream()
			.filter((block) -> Util.getBlockRegistryName(block).getPath().contains("glass") || Util.getBlockRegistryName(block).getPath().contains("window"))
			.filter((block) -> !Util.getBlockRegistryName(block).getPath().contains("_slab"))
			.filter((block) -> !ModBlocks.GLASSCUTTER.get().equals(block))
			.filter((block) -> !ModBlocks.HORIZONTAL_SOUL_GLASS_PANE.get().equals(block))
			.filter((block) -> !ModBlocks.TINTED_GLASS_PANE.get().equals(block))
			.filter((block) -> !ModBlocks.TINTED_GLASS_STAIRS.get().equals(block))
			.filter((block) -> !ModBlocks.TINTED_GLASS_SLAB.get().equals(block))
			.filter((block) -> !ModBlocks.TINTED_GLASS_WINDOW.get().equals(block))
			.filter((block) -> !ModBlocks.TINTED_GLASS_WINDOW_PANE.get().equals(block))
			.collect(Collectors.toList()));
	
	private final List<Block> glassSlabBlocks = new ArrayList<>(CutAndColored.allBlocks.stream()
			.filter((block) -> Util.getBlockRegistryName(block).getPath().contains("glass"))
			.filter((block) -> Util.getBlockRegistryName(block).getPath().contains("_slab"))
			.collect(Collectors.toList()));

	protected BlockLootTableGenerator() {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags());
	}

	@Override
	protected void generate() {
		for (Block nonSlabBlock : nonSlabBlocks) {
			dropSelf(nonSlabBlock);
		}
		for (Block slabBlock : slabBlocks) {
			add(slabBlock, this::createSlabItemTable);
		}
		for (Block silkTouchBlock : silkTouchBlocks) {
			dropWhenSilkTouch(silkTouchBlock);
		}
		for (Block glassSlabBlock : glassSlabBlocks) {
			add(glassSlabBlock, this::createSilkTouchSlabTable);
		}
		dropSelf(ModBlocks.GLASSCUTTER.get());
		dropSelf(ModBlocks.TINTED_GLASS_PANE.get());
		dropSelf(ModBlocks.TINTED_GLASS_STAIRS.get());
		dropSelf(ModBlocks.TINTED_GLASS_WINDOW.get());
		dropSelf(ModBlocks.TINTED_GLASS_WINDOW_PANE.get());
		add(ModBlocks.TINTED_GLASS_SLAB.get(), this::createSlabItemTable);
	}
	
	@Nonnull
	@Override
	protected Iterable<Block> getKnownBlocks() {
		List<Block> list = new ArrayList<>(CutAndColored.allBlocks);
		list.remove(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE.get());
		return list;
	}
	
	protected LootTable.Builder createSilkTouchSlabTable(Block slab) {
		return LootTable.lootTable()
				.withPool(LootPool.lootPool().when(HAS_SILK_TOUCH).setRolls(ConstantValue.exactly(1))
				.add(applyExplosionDecay(slab, LootItem.lootTableItem(slab)
				.apply(SetItemCountFunction.setCount(ConstantValue.exactly(2))
				.when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(slab).setProperties(StatePropertiesPredicate.Builder
				.properties().hasProperty(SlabBlock.TYPE, SlabType.DOUBLE)))))));
	}
}
