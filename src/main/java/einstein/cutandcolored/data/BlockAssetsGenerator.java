package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockAssetsGenerator extends BlockStateProvider {
	
	private List<Block> cubeBlocks = new ArrayList<Block>(ModDataGenerators.allBlocks.stream()
			.filter((block) -> block.getRegistryName().getPath().contains("planks")
					|| block.getRegistryName().getPath().contains("bricks")
					|| block.getRegistryName().getPath().contains("window"))
			.filter((block) -> !block.getRegistryName().getPath().contains("pane"))
			.filter((block) -> !(block instanceof SlabBlock))
			.filter((block) -> !(block instanceof StairBlock))
			.collect(Collectors.toList()));
	
	private List<Block> slabBlocks = new ArrayList<Block>(ModDataGenerators.allBlocks.stream()
			.filter((block) -> block instanceof SlabBlock)
			.filter((block) -> !block.getRegistryName().getPath().contains("pane"))
			.collect(Collectors.toList()));
	
	private List<Block> stairBlocks = new ArrayList<Block>(ModDataGenerators.allBlocks.stream()
			.filter((block) -> block instanceof StairBlock)
			.collect(Collectors.toList()));
	
	private List<Block> wallBlocks = new ArrayList<Block>(ModDataGenerators.allBlocks.stream()
			.filter((block) -> block instanceof WallBlock)
			.filter((block) -> block.getRegistryName().getPath().contains("wall"))
			.collect(Collectors.toList()));

	private List<Block> lampBlocks = new ArrayList<Block>(ModDataGenerators.allBlocks.stream()
			.filter((block) -> block instanceof RedstoneLampBlock)
			.collect(Collectors.toList()));
	
	private List<Block> paneBlocks = new ArrayList<Block>(ModDataGenerators.allBlocks.stream()
			.filter((block) -> block.getRegistryName().getPath().contains("pane"))
			.filter((block) -> block.getRegistryName().getPath().contains("window"))
			.collect(Collectors.toList()));
	
	private List<Block> coloredStairs = new ArrayList<Block>();
	
	private List<Block> coloredSlabs = new ArrayList<Block>();
	
	private List<Block> coloredWalls = new ArrayList<Block>();
	
	private List<Block> coloredLamps = new ArrayList<Block>();
	
	private List<Block> coloredWindowPanes = new ArrayList<Block>();
	
	public BlockAssetsGenerator(DataGenerator generator, ExistingFileHelper existingFile) {
		super(generator, CutAndColored.MODID, existingFile);
	}
	
	@Override
	protected void registerStatesAndModels() {
		for (int i = 0; i < cubeBlocks.size(); i++) {
			Block block = cubeBlocks.get(i);
			String name = block.getRegistryName().getPath();
			simpleBlock(block);
			simpleBlockItem(block, models().getExistingFile(blockRL(name)));
		}
		
		simpleBlock(ModBlocks.SOUL_SANDSTONE.get(), new ConfiguredModel(models().cubeBottomTop("soul_sandstone", blockRL("soul_sandstone_side"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"))));
		simpleBlock(ModBlocks.CHISELED_SOUL_SANDSTONE.get(), new ConfiguredModel(models().cubeBottomTop("chiseled_soul_sandstone", blockRL("chiseled_soul_sandstone"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"))));
		simpleBlock(ModBlocks.CUT_SOUL_SANDSTONE.get(), new ConfiguredModel(models().cubeBottomTop("cut_soul_sandstone", blockRL("cut_soul_sandstone"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"))));
		simpleBlock(ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), models().cubeAll("smooth_soul_sandstone", blockRL("soul_sandstone_top")));
		simpleBlock(ModBlocks.SOUL_GLASS.get());
		simpleBlock(ModBlocks.POLISHED_END_STONE.get());
		simpleBlock(ModBlocks.POLISHED_STONE.get());
		simpleBlock(ModBlocks.OAK_BOARDS.get());
		simpleBlock(ModBlocks.SPRUCE_BOARDS.get());
		simpleBlock(ModBlocks.BIRCH_BOARDS.get());
		simpleBlock(ModBlocks.JUNGLE_BOARDS.get());
		simpleBlock(ModBlocks.ACACIA_BOARDS.get());
		simpleBlock(ModBlocks.DARK_OAK_BOARDS.get());
		simpleBlock(ModBlocks.CRIMSON_BOARDS.get());
		simpleBlock(ModBlocks.WARPED_BOARDS.get());
		
		stairsBlock((StairBlock) ModBlocks.TERRACOTTA_STAIRS.get(), blockMCRL("terracotta"));
		stairsBlock((StairBlock) ModBlocks.GRANITE_BRICK_STAIRS.get(), blockRL("granite_bricks"));
		stairsBlock((StairBlock) ModBlocks.DIORITE_BRICK_STAIRS.get(), blockRL("diorite_bricks"));
		stairsBlock((StairBlock) ModBlocks.ANDESITE_BRICK_STAIRS.get(), blockRL("andesite_bricks"));
		stairsBlock((StairBlock) ModBlocks.SOUL_SANDSTONE_STAIRS.get(), blockRL("soul_sandstone_side"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"));
		stairsBlock((StairBlock) ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get(), blockRL("soul_sandstone_top"));
		stairsBlock((StairBlock) ModBlocks.CRACKED_STONE_BRICK_STAIRS.get(), blockMCRL("cracked_stone_bricks"));
		stairsBlock((StairBlock) ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), blockMCRL("cracked_polished_blackstone_bricks"));
		stairsBlock((StairBlock) ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), blockMCRL("cracked_nether_bricks"));
		stairsBlock((StairBlock) ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), blockMCRL("cracked_deepslate_bricks"));
		stairsBlock((StairBlock) ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), blockMCRL("cracked_deepslate_tiles"));
		stairsBlock((StairBlock) ModBlocks.QUARTZ_BRICK_STAIRS.get(), blockMCRL("quartz_bricks"));
		stairsBlock((StairBlock) ModBlocks.CALCITE_STAIRS.get(), blockMCRL("calcite"));
		stairsBlock((StairBlock) ModBlocks.TUFF_STAIRS.get(), blockMCRL("tuff"));
		stairsBlock((StairBlock) ModBlocks.RAW_IRON_STAIRS.get(), blockMCRL("raw_iron_block"));
		stairsBlock((StairBlock) ModBlocks.RAW_GOLD_STAIRS.get(), blockMCRL("raw_gold_block"));
		stairsBlock((StairBlock) ModBlocks.RAW_COPPER_STAIRS.get(), blockMCRL("raw_copper_block"));
		
		slabBlock((SlabBlock) ModBlocks.TERRACOTTA_SLAB.get(), blockMCRL("terracotta"), blockMCRL("terracotta"));
		slabBlock((SlabBlock) ModBlocks.GRANITE_BRICK_SLAB.get(), blockRL("granite_bricks"), blockRL("granite_bricks"));
		slabBlock((SlabBlock) ModBlocks.DIORITE_BRICK_SLAB.get(), blockRL("diorite_bricks"), blockRL("diorite_bricks"));
		slabBlock((SlabBlock) ModBlocks.ANDESITE_BRICK_SLAB.get(), blockRL("andesite_bricks"), blockRL("andesite_bricks"));
		slabBlock((SlabBlock) ModBlocks.SOUL_SANDSTONE_SLAB.get(), blockRL("soul_sandstone"), blockRL("soul_sandstone_side"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"));
		slabBlock((SlabBlock) ModBlocks.CUT_SOUL_SANDSTONE_SLAB.get(), blockRL("cut_soul_sandstone"), blockRL("cut_soul_sandstone"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"));
		slabBlock((SlabBlock) ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get(), blockRL("smooth_soul_sandstone"), blockRL("soul_sandstone_top"));
		slabBlock((SlabBlock) ModBlocks.CRACKED_STONE_BRICK_SLAB.get(), blockMCRL("cracked_stone_bricks"), blockMCRL("cracked_stone_bricks"));
		slabBlock((SlabBlock) ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), blockMCRL("cracked_polished_blackstone_bricks"), blockMCRL("cracked_polished_blackstone_bricks"));
		slabBlock((SlabBlock) ModBlocks.CRACKED_NETHER_BRICK_SLAB.get(), blockMCRL("cracked_nether_bricks"), blockMCRL("cracked_nether_bricks"));
		slabBlock((SlabBlock) ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), blockMCRL("cracked_deepslate_bricks"), blockMCRL("cracked_deepslate_bricks"));
		slabBlock((SlabBlock) ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), blockMCRL("cracked_deepslate_tiles"), blockMCRL("cracked_deepslate_tiles"));
		slabBlock((SlabBlock) ModBlocks.QUARTZ_BRICK_SLAB.get(), blockMCRL("quartz_bricks"), blockMCRL("quartz_bricks"));
		slabBlock((SlabBlock) ModBlocks.CALCITE_SLAB.get(), blockMCRL("calcite"), blockMCRL("calcite"));
		slabBlock((SlabBlock) ModBlocks.TUFF_SLAB.get(), blockMCRL("tuff"), blockMCRL("tuff"));
		slabBlock((SlabBlock) ModBlocks.RAW_IRON_SLAB.get(), blockMCRL("raw_iron_block"), blockMCRL("raw_iron_block"));
		slabBlock((SlabBlock) ModBlocks.RAW_GOLD_SLAB.get(), blockMCRL("raw_gold_block"), blockMCRL("raw_gold_block"));
		slabBlock((SlabBlock) ModBlocks.RAW_COPPER_SLAB.get(), blockMCRL("raw_copper_block"), blockMCRL("raw_copper_block"));
		
		borderedStairBlock((StairBlock) ModBlocks.SMOOTH_STONE_STAIRS.get(), blockMCRL("smooth_stone"));
		borderedStairBlock((StairBlock) ModBlocks.GLASS_STAIRS.get(), blockMCRL("glass"));
		borderedStairBlock((StairBlock) ModBlocks.SOUL_GLASS_STAIRS.get(), blockRL("soul_glass"));
		borderedStairBlock((StairBlock) ModBlocks.TINTED_GLASS_STAIRS.get(), blockMCRL("tinted_glass"));
		
		borderedSlabBlock((SlabBlock) ModBlocks.GLASS_SLAB.get(), blockMCRL("glass"), blockMCRL("glass"));
		borderedSlabBlock((SlabBlock) ModBlocks.SOUL_GLASS_SLAB.get(), blockRL("soul_glass"), blockRL("soul_glass"));
		borderedSlabBlock((SlabBlock) ModBlocks.TINTED_GLASS_SLAB.get(), blockMCRL("tinted_glass"), blockMCRL("tinted_glass"));
		
		wallBlock((WallBlock) ModBlocks.SOUL_SANDSTONE_WALL.get(), blockRL("soul_sandstone_side"));
		wallBlocks.remove(wallBlocks.indexOf(ModBlocks.SOUL_SANDSTONE_WALL.get()));
		wallBlock((WallBlock) ModBlocks.PURPUR_WALL.get(), blockMCRL("purpur_block"));
		wallBlocks.remove(wallBlocks.indexOf(ModBlocks.PURPUR_WALL.get()));
		
		paneBlock((IronBarsBlock) ModBlocks.SOUL_GLASS_PANE.get(), blockRL("soul_glass"), blockRL("soul_glass_pane_top"));
		paneBlock((IronBarsBlock) ModBlocks.TINTED_GLASS_PANE.get(), blockMCRL("tinted_glass"), blockRL("tinted_glass_pane_top"));
		
		paneBlock((IronBarsBlock) ModBlocks.GLASS_WINDOW_PANE.get(), blockRL("glass_window"), blockMCRL("glass_pane_top"));
		paneBlock((IronBarsBlock) ModBlocks.SOUL_GLASS_WINDOW_PANE.get(), blockRL("soul_glass_window"), blockRL("soul_glass_pane_top"));
		paneBlock((IronBarsBlock) ModBlocks.TINTED_GLASS_WINDOW_PANE.get(), blockRL("tinted_glass_window"), blockRL("tinted_glass_pane_top"));
		
		logBlock((RotatedPillarBlock) ModBlocks.PRISMARINE_BRICK_PILLAR.get());
		logBlock((RotatedPillarBlock) ModBlocks.POLISHED_BLACKSTONE_PILLAR.get());
		logBlock((RotatedPillarBlock) ModBlocks.END_STONE_BRICK_PILLAR.get());
		
		fenceGateBlock((FenceGateBlock) ModBlocks.NETHER_BRICK_FENCE_GATE.get(), blockMCRL("nether_bricks"));
		fenceGateBlock((FenceGateBlock) ModBlocks.IRON_FENCE_GATE.get(), blockRL("iron_fence_gate"));
		
		vanillaDyedObjects();
		
		for (int i = 0; i < wallBlocks.size(); i ++) {
			WallBlock block = (WallBlock) wallBlocks.get(i);
			String name = block.getRegistryName().getPath();
			String fileName = name.replaceAll("_wall", "");
			try {
				if (name.contains("brick")) {
					wallBlock(block, blockRL(fileName + "s"));
				}
				else {
					wallBlock(block, blockRL(fileName));
				}
			} catch (IllegalArgumentException e) {
				if (name.contains("brick") || name.contains("tile")) {
					wallBlock(block, blockMCRL(fileName + "s"));
				}
				else {
					wallBlock(block, blockMCRL(fileName));
				}
			}
		}
	}
	
	private void vanillaDyedObjects() {
		for (int i = 0; i < DyeColor.values().length; i++) {
			int i1 = stairBlocks.size() - 1;
			while (i1 >= 0) {
				Block block = stairBlocks.get(i1);
				if (isVanillaColored(block, i)) {
					coloredStairs.add(block);
					stairBlocks.remove(i1);
				}
				i1--;
			}
			int i2 = slabBlocks.size() - 1;
			while (i2 >= 0) {
				Block block = slabBlocks.get(i2);
				if (isVanillaColored(block, i)) {
					coloredSlabs.add(block);
					slabBlocks.remove(i2);
				}
				i2--;
			}
			int i3 = wallBlocks.size() - 1;
			while (i3 >= 0) {
				Block block = wallBlocks.get(i3);
				if (isVanillaColored(block, i)) {
					coloredWalls.add(block);
					wallBlocks.remove(i3);
				}
				i3--;
			}
			int i4 = lampBlocks.size() - 1;
			while (i4 >= 0) {
				Block block = lampBlocks.get(i4);
				if (isVanillaColored(block, i)) {
					coloredLamps.add(block);
					lampBlocks.remove(i4);
				}
				i4--;
			}
			int i5 = paneBlocks.size() - 1;
			while (i5 >= 0) {
				Block block = paneBlocks.get(i5);
				if (isVanillaColored(block, i)) {
					coloredWindowPanes.add(block);
					paneBlocks.remove(i5);
				}
				i5--;
			}
		}
		
		// Slabs
		for (int i = 0; i < coloredSlabs.size(); i++) {
			SlabBlock block = (SlabBlock) coloredSlabs.get(i);
			String name = block.getRegistryName().getPath();
			String fileName = name.replaceAll("_slab", "");
			if (name.contains("glass")) {
				borderedSlabBlock(block, blockMCRL(fileName), blockMCRL(fileName));
			}
			else if (name.contains("wool") || name.contains("concrete") || name.contains("terracotta")) {
				slabBlock(block, blockMCRL(fileName), blockMCRL(fileName));
			}
			else if (name.contains("stained_plank") || name.contains("stained_brick")) {
				slabBlock(block, blockRL(fileName + "s"), blockRL(fileName + "s"));
			}
			simpleBlockItem(block, models().getExistingFile(blockRL(name)));
		}
		// Stairs
		for (int i = 0; i < coloredStairs.size(); i++) {
			StairBlock block = (StairBlock) coloredStairs.get(i);
			String name = block.getRegistryName().getPath();
			String fileName = name.replaceAll("_stairs", "");
			if (name.contains("glass")) {
				borderedStairBlock(block, blockMCRL(fileName));
			}
			else if (name.contains("wool") || name.contains("concrete") || name.contains("terracotta")) {
				stairsBlock(block, blockMCRL(fileName));
			}
			else if (name.contains("stained_plank") || name.contains("stained_brick")) {
				stairsBlock(block, blockRL(fileName + "s"));
			}
			simpleBlockItem(block, models().getExistingFile(blockRL(name)));
		}
		// Walls
		for (int i = 0; i < coloredWalls.size(); i++) {
			WallBlock block = (WallBlock) coloredWalls.get(i);
			String name = block.getRegistryName().getPath();
			String fileName = name.replaceAll("_wall", "");
			if (name.contains("stained_brick")) {
				wallBlock(block, blockRL(fileName + "s"));
			}
		}
		// Redstone Lamps
		for (int i = 0; i < coloredLamps.size(); i++) {
			RedstoneLampBlock block = (RedstoneLampBlock) coloredLamps.get(i);
			String name = block.getRegistryName().getPath();
			getVariantBuilder(block)
			.partialState().with(RedstoneLampBlock.LIT, false).addModels(new ConfiguredModel(cubeAll(block)))
			.partialState().with(RedstoneLampBlock.LIT, true).addModels(new ConfiguredModel(models()
					.withExistingParent(name + "_on", "cube_all").texture("all", blockRL(name + "_on"))));
			simpleBlockItem(block, models().getExistingFile(blockRL(name)));
		}
		// Window Panes
		for (int i = 0; i < coloredWindowPanes.size(); i++) {
			IronBarsBlock block = (IronBarsBlock) coloredWindowPanes.get(i);
			String name = block.getRegistryName().getPath();
			paneBlock(block, blockRL(name.replace("_pane", "")), blockMCRL(name.replace("_window", "") + "_top"));
		}
	}
	
	private boolean isVanillaColored(Block block, int colorIndex) {
		String name = block.getRegistryName().getPath();
		return name.contains(DyeColor.byId(colorIndex).getName()) && !name.contains("blackstone");
	}
	
	private void borderedStairBlock(StairBlock block, ResourceLocation imageName) {
		String name = block.getRegistryName().getPath();
		stairsBlock(block,
				models().withExistingParent(name, blockRL("bordered_stairs"))
					.texture("side", imageName)
					.texture("top", imageName)
					.texture("bottom", imageName),
				models().withExistingParent(name + "_inner", blockRL("bordered_inner_stairs"))
					.texture("side", imageName)
					.texture("top", imageName)
					.texture("bottom", imageName),
				models().withExistingParent(name + "_outer", blockRL("bordered_outer_stairs"))
					.texture("side", imageName)
					.texture("top", imageName)
					.texture("bottom", imageName));
	}
	
	private void borderedSlabBlock(SlabBlock block, ResourceLocation doubleSlab, ResourceLocation imageName) {
		String name = block.getRegistryName().getPath();
		getVariantBuilder(block)
		.partialState().with(SlabBlock.TYPE, SlabType.BOTTOM).addModels(new ConfiguredModel(models().withExistingParent(name, blockRL("bordered_slab"))
				.texture("side", imageName)
				.texture("top", imageName)
				.texture("bottom", imageName)))
        .partialState().with(SlabBlock.TYPE, SlabType.TOP).addModels(new ConfiguredModel(models().withExistingParent(name + "_top", blockRL("bordered_slab_top"))
        		.texture("side", imageName)
        		.texture("top", imageName)
        		.texture("bottom", imageName)))
        .partialState().with(SlabBlock.TYPE, SlabType.DOUBLE).addModels(new ConfiguredModel(models().getExistingFile(doubleSlab)));
	}
	
	private ResourceLocation blockRL(String string) {
		return new ResourceLocation(CutAndColored.MODID, "block/" + string);
	}
	
	private ResourceLocation blockMCRL(String string) {
		return new ResourceLocation(CutAndColored.MCMODID, "block/" + string);
	}
	
	@Override
	public String getName() {
		return "CutAndColored block assets";
	}
}
