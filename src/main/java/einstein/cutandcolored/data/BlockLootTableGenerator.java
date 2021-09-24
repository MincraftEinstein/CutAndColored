package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Nonnull;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public class BlockLootTableGenerator extends BlockLoot {
	
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
			.filter((block) -> !ModBlocks.GLASSCUTTER.equals(block))
			.filter((block) -> !ModBlocks.HORIZONTAL_SOUL_GLASS_PANE.equals(block))
			.filter((block) -> !ModBlocks.TINTED_GLASS_PANE.equals(block))
			.filter((block) -> !ModBlocks.TINTED_GLASS_STAIRS.equals(block))
			.filter((block) -> !ModBlocks.TINTED_GLASS_SLAB.equals(block))
			.collect(Collectors.toList()));
	
	private List<Block> glassSlabBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block.getRegistryName().getPath().contains("glass"))
			.filter((block) -> block.getRegistryName().getPath().contains("_slab"))
			.collect(Collectors.toList()));
	
	@Override
	protected void addTables() {
//		checkForDuplicates();
		CutAndColored.LOGGER.debug(ModBlocks.allBlocks.size() + " mod blocks found");
		CutAndColored.LOGGER.debug(nonSlabBlocks.size() + " non slab blocks found");
		CutAndColored.LOGGER.debug(slabBlocks.size() + " slab blocks found");
		CutAndColored.LOGGER.debug(silkTouchBlocks.size() + " silk touch blocks found");
		CutAndColored.LOGGER.debug(glassSlabBlocks.size() + " glass slabs found");
		for (int i = 0; i < nonSlabBlocks.size(); i++) {
			dropSelf(nonSlabBlocks.get(i));
		}
		for (int i = 0; i < slabBlocks.size(); i++) {
			add(slabBlocks.get(i), BlockLoot::createSlabItemTable);
		}
		for (int i = 0; i < silkTouchBlocks.size(); i++) {
			dropWhenSilkTouch(silkTouchBlocks.get(i));
		}
		for (int i = 0; i < glassSlabBlocks.size(); i++) {
			add(glassSlabBlocks.get(i), BlockLootTableGenerator::createSilkTouchSlabTable);
		}
		dropSelf(ModBlocks.GLASSCUTTER);
		dropSelf(ModBlocks.TINTED_GLASS_PANE);
		dropSelf(ModBlocks.TINTED_GLASS_STAIRS);
		add(ModBlocks.TINTED_GLASS_SLAB, BlockLoot::createSlabItemTable);
	}
	
	@Nonnull
	@Override
	protected Iterable<Block> getKnownBlocks() {
		List<Block> list = new ArrayList<Block>(ModBlocks.allBlocks);
		list.remove(list.indexOf(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE));
		return list;
	}
	
	protected static LootTable.Builder createSilkTouchSlabTable(Block slab) {
		return LootTable.lootTable()
				.withPool(LootPool.lootPool().when(HAS_SILK_TOUCH).setRolls(ConstantValue.exactly(1))
				.add(applyExplosionDecay(slab, LootItem.lootTableItem(slab)
				.apply(SetItemCountFunction.setCount(ConstantValue.exactly(2))
				.when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(slab).setProperties(StatePropertiesPredicate.Builder
				.properties().hasProperty(SlabBlock.TYPE, SlabType.DOUBLE)))))));
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
