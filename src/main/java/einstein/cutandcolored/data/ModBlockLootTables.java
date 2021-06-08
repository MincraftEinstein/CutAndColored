package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Nonnull;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.ConstantRange;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.loot.conditions.BlockStateProperty;
import net.minecraft.loot.functions.SetCount;
import net.minecraft.state.properties.SlabType;

public class ModBlockLootTables extends BlockLootTables {
	
	private List<Block> nonSlabBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> !block.getRegistryName().getPath().contains("_slab"))
			.filter((block) -> !block.getRegistryName().getPath().contains("glass"))
			.collect(Collectors.toList()));
	
	private List<Block> slabBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block.getRegistryName().getPath().contains("_slab"))
			.filter((block) -> !block.getRegistryName().getPath().contains("glass"))
			.collect(Collectors.toList()));
	
	private List<Block> silkTouchBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block.getRegistryName().getPath().contains("glass"))
			.filter((block) -> !block.getRegistryName().getPath().contains("_slab"))
			.filter((block) -> !block.getRegistryName().getPath().contains("glasscutter"))
			.collect(Collectors.toList()));
	
	private List<Block> glassSlabBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block.getRegistryName().getPath().contains("glass"))
			.filter((block) -> block.getRegistryName().getPath().contains("_slab"))
			.collect(Collectors.toList()));
	
	@Override
	protected void registerLootTable(Block blockIn, Builder table) {
		super.registerLootTable(blockIn, table);
	}
	
	// May need to change the loot table for horizontal soul glass panes, because it is a slab that only drops one item,
	// but only if the Horizontal Glass Panes mod does it
	
	@Override
	protected void addTables() {
//		checkForDuplicates();
		CutAndColored.LOGGER.debug(ModBlocks.allBlocks.size() + " mod blocks found");
		CutAndColored.LOGGER.debug(nonSlabBlocks.size() + " non slab blocks found");
		CutAndColored.LOGGER.debug(slabBlocks.size() + " slab blocks found");
		CutAndColored.LOGGER.debug(silkTouchBlocks.size() + " silk touch blocks found");
		CutAndColored.LOGGER.debug(glassSlabBlocks.size() + " glass slabs found");
		for (int i = 0; i < nonSlabBlocks.size(); i++) {
			registerDropSelfLootTable(nonSlabBlocks.get(i).getBlock());
		}
		for (int i = 0; i < slabBlocks.size(); i++) {
			registerLootTable(slabBlocks.get(i).getBlock(), BlockLootTables::droppingSlab);
		}
		for (int i = 0; i < silkTouchBlocks.size(); i++) {
			registerSilkTouch(silkTouchBlocks.get(i).getBlock());
		}
		for (int i = 0; i < glassSlabBlocks.size(); i++) {
			registerLootTable(glassSlabBlocks.get(i), ModBlockLootTables::droppingSilkTouchSlab);
		}
		registerDropSelfLootTable(ModBlocks.GLASSCUTTER);
	}
	
	@Nonnull
	@Override
	protected Iterable<Block> getKnownBlocks() {
		return ModBlocks.allBlocks;
	}
	
	protected static LootTable.Builder droppingSilkTouchSlab(Block slab) {
		return LootTable.builder()
				.addLootPool(LootPool.builder().acceptCondition(SILK_TOUCH).rolls(ConstantRange.of(1))
				.addEntry(withExplosionDecay(slab, ItemLootEntry.builder(slab)
				.acceptFunction(SetCount.builder(ConstantRange.of(2))
				.acceptCondition(BlockStateProperty.builder(slab).fromProperties(StatePropertiesPredicate.Builder
				.newBuilder().withProp(SlabBlock.TYPE, SlabType.DOUBLE)))))));
	}
	
//	private void checkForDuplicates() {
//		for (int i = 0; i < nonSlabBlocks.size(); i++) {
//			Block block = nonSlabBlocks.get(i);
//			if (slabBlocks.contains(block)) {
//				CutAndColored.LOGGER.debug(block.getRegistryName() + " was a duplicate. Lists: nonSlabBlocks and slabBlocks");
//			}
//			if (silkTouchBlocks.contains(block)) {
//				CutAndColored.LOGGER.debug(block.getRegistryName() + " was a duplicate. Lists: nonSlabBlocks and silkTouchBlocks");
//			}
//			if (glassSlabBlocks.contains(block)) {
//				CutAndColored.LOGGER.debug(block.getRegistryName() + " was a duplicate. Lists: nonSlabBlocks and glassSlabBlocks");
//			}
//		}
//		for (int i = 0; i < slabBlocks.size(); i++) {
//			Block block = slabBlocks.get(i);
//			if (nonSlabBlocks.contains(block)) {
//				CutAndColored.LOGGER.debug(block.getRegistryName() + " was a duplicate. Lists: slabBlocks and nonSlabBlocks");
//			}
//			if (silkTouchBlocks.contains(block)) {
//				CutAndColored.LOGGER.debug(block.getRegistryName() + " was a duplicate. Lists: slabBlocks and silkTouchBlocks");
//			}
//			if (glassSlabBlocks.contains(block)) {
//				CutAndColored.LOGGER.debug(block.getRegistryName() + " was a duplicate. Lists: slabBlocks and glassSlabBlocks");
//			}
//		}
//		for (int i = 0; i < silkTouchBlocks.size(); i++) {
//			Block block = silkTouchBlocks.get(i);
//			if (nonSlabBlocks.contains(block)) {
//				CutAndColored.LOGGER.debug(block.getRegistryName() + " was a duplicate. Lists: silkTouchBlocks and nonSlabBlocks");
//			}
//			if (slabBlocks.contains(block)) {
//				CutAndColored.LOGGER.debug(block.getRegistryName() + " was a duplicate. Lists: silkTouchBlocks and slabBlocks");
//			}
//			if (glassSlabBlocks.contains(block)) {
//				CutAndColored.LOGGER.debug(block.getRegistryName() + " was a duplicate. Lists: silkTouchBlocks and glassSlabBlocks");
//			}
//		}
//		for (int i = 0; i < glassSlabBlocks.size(); i++) {
//			Block block = glassSlabBlocks.get(i);
//			if (nonSlabBlocks.contains(block)) {
//				CutAndColored.LOGGER.debug(block.getRegistryName() + " was a duplicate. Lists: glassSlabBlocks and nonSlabBlocks");
//			}
//			if (slabBlocks.contains(block)) {
//				CutAndColored.LOGGER.debug(block.getRegistryName() + " was a duplicate. Lists: glassSlabBlocks and slabBlocks");
//			}
//			if (silkTouchBlocks.contains(block)) {
//				CutAndColored.LOGGER.debug(block.getRegistryName() + " was a duplicate. Lists: glassSlabBlocks and silkTouchBlocks");
//			}
//		}
//	}
}
