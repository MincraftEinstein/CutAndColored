package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.FlamboyantDyeColors;
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
	
	private List<Block> cubeBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block.getRegistryName().getPath().contains("planks") || block.getRegistryName().getPath().contains("bricks"))
			.filter((block) -> !(block instanceof SlabBlock))
			.filter((block) -> !(block instanceof StairBlock))
			.collect(Collectors.toList()));
	
	private List<Block> slabBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block instanceof SlabBlock)
			.filter((block) -> !block.getRegistryName().getPath().contains("pane"))
			.collect(Collectors.toList()));
	
	private List<Block> stairBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block instanceof StairBlock)
			.collect(Collectors.toList()));
	
	private List<Block> wallBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block instanceof WallBlock)
			.filter((block) -> block.getRegistryName().getPath().contains("wall"))
			.collect(Collectors.toList()));

	private List<Block> lampBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block instanceof RedstoneLampBlock)
			.collect(Collectors.toList()));
	
	private List<Block> coloredStairs = new ArrayList<Block>();
	private List<Block> fColoredStairs = new ArrayList<Block>();
	
	private List<Block> coloredSlabs = new ArrayList<Block>();
	private List<Block> fColoredSlabs = new ArrayList<Block>();
	
	private List<Block> coloredWalls = new ArrayList<Block>();
	private List<Block> fColoredWalls = new ArrayList<Block>();
	
	private List<Block> coloredLamps = new ArrayList<Block>();
	private List<Block> fColoredLamps = new ArrayList<Block>();
	
	public BlockAssetsGenerator(DataGenerator generator, ExistingFileHelper existingFile) {
		super(generator, CutAndColored.MODID, existingFile);
	}
	
	@Override
	protected void registerStatesAndModels() {
		// Flamboyant dye
		for (int i = 0; i < FlamboyantDyeColors.values().length; i++) {
			int i1 = stairBlocks.size() - 1;
			while (i1 >= 0) {
				if (stairBlocks.get(i1).getRegistryName().getPath().contains(FlamboyantDyeColors.byId(i).getName())) {
					fColoredStairs.add(stairBlocks.get(i1));
					stairBlocks.remove(i1);
				}
				i1--;
			}
			int i2 = slabBlocks.size() - 1;
			while (i2 >= 0) {
				if (slabBlocks.get(i2).getRegistryName().getPath().contains(FlamboyantDyeColors.byId(i).getName())) {
					fColoredSlabs.add(slabBlocks.get(i2));
					slabBlocks.remove(i2);
				}
				i2--;
			}
			int i3 = wallBlocks.size() - 1;
			while (i3 >= 0) {
				if (wallBlocks.get(i3).getRegistryName().getPath().contains(FlamboyantDyeColors.byId(i).getName())) {
					fColoredWalls.add(wallBlocks.get(i3));
					wallBlocks.remove(i3);
				}
				i3--;
			}
			int i4 = lampBlocks.size() - 1;
			while (i4 >= 0) {
				if (lampBlocks.get(i4).getRegistryName().getPath().contains(FlamboyantDyeColors.byId(i).getName())) {
					fColoredLamps.add(lampBlocks.get(i4));
					lampBlocks.remove(i4);
				}
				i4--;
			}
		}
		// Vanilla dye
		for (int i = 0; i < DyeColor.values().length; i++) {
			int i1 = stairBlocks.size() - 1;
			while (i1 >= 0) {
				if (stairBlocks.get(i1).getRegistryName().getPath().contains(DyeColor.byId(i).getName()) && !stairBlocks.get(i1).getRegistryName().getPath().contains("blackstone")) {
					coloredStairs.add(stairBlocks.get(i1));
					stairBlocks.remove(i1);
				}
				i1--;
			}
			int i2 = slabBlocks.size() - 1;
			while (i2 >= 0) {
				if (slabBlocks.get(i2).getRegistryName().getPath().contains(DyeColor.byId(i).getName()) && !slabBlocks.get(i2).getRegistryName().getPath().contains("blackstone")) {
					coloredSlabs.add(slabBlocks.get(i2));
					slabBlocks.remove(i2);
				}
				i2--;
			}
			int i3 = wallBlocks.size() - 1;
			while (i3 >= 0) {
				if (wallBlocks.get(i3).getRegistryName().getPath().contains(DyeColor.byId(i).getName()) && !wallBlocks.get(i3).getRegistryName().getPath().contains("blackstone")) {
					coloredWalls.add(wallBlocks.get(i3));
					wallBlocks.remove(i3);
				}
				i3--;
			}
			int i4 = lampBlocks.size() - 1;
			while (i4 >= 0) {
				if (lampBlocks.get(i4).getRegistryName().getPath().contains(DyeColor.byId(i).getName())) {
					coloredLamps.add(lampBlocks.get(i4));
					lampBlocks.remove(i4);
				}
				i4--;
			}
		}
		
		CutAndColored.LOGGER.debug(coloredSlabs.size() + " colored slabs");
		CutAndColored.LOGGER.debug(coloredStairs.size() + " colored stairs");
		CutAndColored.LOGGER.debug(coloredWalls.size() + " colored walls");
		CutAndColored.LOGGER.debug(fColoredSlabs.size() + " f colored slabs");
		CutAndColored.LOGGER.debug(fColoredStairs.size() + " f colored stairs");
		CutAndColored.LOGGER.debug(fColoredWalls.size() + " f colored walls");
		CutAndColored.LOGGER.debug(cubeBlocks.size() + " cube blocks");
		
		for (int i = 0; i < cubeBlocks.size(); i++) {
			Block block = cubeBlocks.get(i);
			String name = block.getRegistryName().getPath();
			simpleBlock(block);
			simpleBlockItem(block, models().getExistingFile(blockRL(name)));
		}
		
		wallBlock((WallBlock) ModBlocks.SOUL_SANDSTONE_WALL, blockRL("soul_sandstone_side"));
		wallBlocks.remove(wallBlocks.indexOf(ModBlocks.SOUL_SANDSTONE_WALL));
		wallBlock((WallBlock) ModBlocks.PURPUR_WALL, blockMCRL("purpur_block"));
		wallBlocks.remove(wallBlocks.indexOf(ModBlocks.PURPUR_WALL));
		
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
		
		simpleBlock(ModBlocks.SOUL_SANDSTONE, new ConfiguredModel(models().cubeBottomTop("soul_sandstone", blockRL("soul_sandstone_side"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"))));
		simpleBlock(ModBlocks.CHISELED_SOUL_SANDSTONE, new ConfiguredModel(models().cubeBottomTop("chiseled_soul_sandstone", blockRL("chiseled_soul_sandstone"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"))));
		simpleBlock(ModBlocks.CUT_SOUL_SANDSTONE, new ConfiguredModel(models().cubeBottomTop("cut_soul_sandstone", blockRL("cut_soul_sandstone"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"))));
		simpleBlock(ModBlocks.SMOOTH_SOUL_SANDSTONE, models().cubeAll("smooth_soul_sandstone", blockRL("soul_sandstone_top")));
		simpleBlock(ModBlocks.SOUL_GLASS);
		simpleBlock(ModBlocks.POLISHED_END_STONE);
		simpleBlock(ModBlocks.POLISHED_STONE);
		
		stairsBlock((StairBlock) ModBlocks.TERRACOTTA_STAIRS, blockMCRL("terracotta"));
		stairsBlock((StairBlock) ModBlocks.GRANITE_BRICK_STAIRS, blockRL("granite_bricks"));
		stairsBlock((StairBlock) ModBlocks.DIORITE_BRICK_STAIRS, blockRL("diorite_bricks"));
		stairsBlock((StairBlock) ModBlocks.ANDESITE_BRICK_STAIRS, blockRL("andesite_bricks"));
		stairsBlock((StairBlock) ModBlocks.SOUL_SANDSTONE_STAIRS, blockRL("soul_sandstone_side"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"));
		stairsBlock((StairBlock) ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS, blockRL("soul_sandstone_top"));
		stairsBlock((StairBlock) ModBlocks.CRACKED_STONE_BRICK_STAIRS, blockMCRL("cracked_stone_bricks"));
		stairsBlock((StairBlock) ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, blockMCRL("cracked_polished_blackstone_bricks"));
		stairsBlock((StairBlock) ModBlocks.CRACKED_NETHER_BRICK_STAIRS, blockMCRL("cracked_nether_bricks"));
		stairsBlock((StairBlock) ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, blockMCRL("cracked_deepslate_bricks"));
		stairsBlock((StairBlock) ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, blockMCRL("cracked_deepslate_tiles"));
		stairsBlock((StairBlock) ModBlocks.QUARTZ_BRICK_STAIRS, blockMCRL("quartz_bricks"));
		stairsBlock((StairBlock) ModBlocks.CALCITE_STAIRS, blockMCRL("calcite"));
		stairsBlock((StairBlock) ModBlocks.TUFF_STAIRS, blockMCRL("tuff"));
		
		slabBlock((SlabBlock) ModBlocks.TERRACOTTA_SLAB, blockMCRL("terracotta"), blockMCRL("terracotta"));
		slabBlock((SlabBlock) ModBlocks.GRANITE_BRICK_SLAB, blockRL("granite_bricks"), blockRL("granite_bricks"));
		slabBlock((SlabBlock) ModBlocks.DIORITE_BRICK_SLAB, blockRL("diorite_bricks"), blockRL("diorite_bricks"));
		slabBlock((SlabBlock) ModBlocks.ANDESITE_BRICK_SLAB, blockRL("andesite_bricks"), blockRL("andesite_bricks"));
		slabBlock((SlabBlock) ModBlocks.SOUL_SANDSTONE_SLAB, blockRL("soul_sandstone"), blockRL("soul_sandstone_side"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"));
		slabBlock((SlabBlock) ModBlocks.CUT_SOUL_SANDSTONE_SLAB, blockRL("cut_soul_sandstone"), blockRL("cut_soul_sandstone"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"));
		slabBlock((SlabBlock) ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, blockRL("smooth_soul_sandstone"), blockRL("soul_sandstone_top"));
		slabBlock((SlabBlock) ModBlocks.CRACKED_STONE_BRICK_SLAB, blockMCRL("cracked_stone_bricks"), blockMCRL("cracked_stone_bricks"));
		slabBlock((SlabBlock) ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, blockMCRL("cracked_polished_blackstone_bricks"), blockMCRL("cracked_polished_blackstone_bricks"));
		slabBlock((SlabBlock) ModBlocks.CRACKED_NETHER_BRICK_SLAB, blockMCRL("cracked_nether_bricks"), blockMCRL("cracked_nether_bricks"));
		slabBlock((SlabBlock) ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, blockMCRL("cracked_deepslate_bricks"), blockMCRL("cracked_deepslate_bricks"));
		slabBlock((SlabBlock) ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, blockMCRL("cracked_deepslate_tiles"), blockMCRL("cracked_deepslate_tiles"));
		slabBlock((SlabBlock) ModBlocks.QUARTZ_BRICK_SLAB, blockMCRL("quartz_bricks"), blockMCRL("quartz_bricks"));
		slabBlock((SlabBlock) ModBlocks.CALCITE_SLAB, blockMCRL("calcite"), blockMCRL("calcite"));
		slabBlock((SlabBlock) ModBlocks.TUFF_SLAB, blockMCRL("tuff"), blockMCRL("tuff"));
		
		borderedStairBlock((StairBlock) ModBlocks.SMOOTH_STONE_STAIRS, blockMCRL("smooth_stone"));
		borderedStairBlock((StairBlock) ModBlocks.GLASS_STAIRS, blockMCRL("glass"));
		borderedStairBlock((StairBlock) ModBlocks.SOUL_GLASS_STAIRS, blockRL("soul_glass"));
		borderedStairBlock((StairBlock) ModBlocks.TINTED_GLASS_STAIRS, blockMCRL("tinted_glass"));
		
		borderedSlabBlock((SlabBlock) ModBlocks.GLASS_SLAB, blockMCRL("glass"), blockMCRL("glass"));
		borderedSlabBlock((SlabBlock) ModBlocks.SOUL_GLASS_SLAB, blockRL("soul_glass"), blockRL("soul_glass"));
		borderedSlabBlock((SlabBlock) ModBlocks.TINTED_GLASS_SLAB, blockMCRL("tinted_glass"), blockMCRL("tinted_glass"));
		
		paneBlock((IronBarsBlock) ModBlocks.SOUL_GLASS_PANE, blockRL("soul_glass"), blockRL("soul_glass_pane_top"));
		paneBlock((IronBarsBlock) ModBlocks.TINTED_GLASS_PANE, blockMCRL("tinted_glass"), blockRL("tinted_glass_pane_top"));
		
		logBlock((RotatedPillarBlock) ModBlocks.PRISMARINE_BRICK_PILLAR);
		logBlock((RotatedPillarBlock) ModBlocks.POLISHED_BLACKSTONE_PILLAR);
		logBlock((RotatedPillarBlock) ModBlocks.END_STONE_BRICK_PILLAR);
		
		fenceGateBlock((FenceGateBlock) ModBlocks.NETHER_BRICK_FENCE_GATE, blockMCRL("nether_bricks"));
		fenceGateBlock((FenceGateBlock) ModBlocks.IRON_FENCE_GATE, blockRL("iron_fence_gate"));
		
		vanillaDyedObjects();
		flamboyantDyedObjects();
	}
	
	private void vanillaDyedObjects() {
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
	}
	
	// Game can't find textures
	private void flamboyantDyedObjects() {
//		// Slabs
//		for (int i = 0; i < fColoredSlabs.size(); i++) {
//			SlabBlock block = (SlabBlock) fColoredSlabs.get(i);
//			String name = block.getRegistryName().getPath();
//			String fileName = name.replaceAll("_slab", "");
//			if (name.contains("glass")) {
//				borderedSlabBlock(block, blockFRL(fileName), blockFRL(fileName));
//			}
//			else if (name.contains("wool") || name.contains("concrete") || name.contains("terracotta")) {
//				slabBlock(block, blockFRL(fileName), blockFRL(fileName));
//			}
//			else if (name.contains("stained_plank") || name.contains("stained_brick")) {
//				slabBlock(block, blockRL(fileName + "s"), blockRL(fileName + "s"));
//			}
//			simpleBlockItem(block, models().getExistingFile(blockRL(name)));
//		}
//		// Stairs
//		for (int i = 0; i < fColoredStairs.size(); i++) {
//			StairBlock block = (StairBlock) fColoredStairs.get(i);
//			String name = block.getRegistryName().getPath();
//			String fileName = name.replaceAll("_stairs", "");
//			if (name.contains("glass")) {
//				borderedStairBlock(block, blockFRL(fileName));
//			}
//			else if (name.contains("wool") || name.contains("concrete") || name.contains("terracotta")) {
//				StairBlock(block, blockFRL(fileName));
//			}
//			else if (name.contains("stained_plank") || name.contains("stained_brick")) {
//				StairBlock(block, blockRL(fileName + "s"));
//			}
//			simpleBlockItem(block, models().getExistingFile(blockRL(name)));
//		}
//		// Walls
//		for (int i = 0; i < fColoredWalls.size(); i++) {
//			WallBlock block = (WallBlock) fColoredWalls.get(i);
//			String name = block.getRegistryName().getPath();
//			String fileName = name.replaceAll("_wall", "");
//			if (name.contains("stained_brick")) {
//				wallBlock(block, blockRL(fileName + "s"));
//			}
//			simpleBlockItem(block, models().getExistingFile(blockRL(name + "_inventory")));
//		}
//		// Redstone Lamps
//		for (int i = 0; i < fColoredLamps.size(); i++) {
//			ColoredRedstoneLamp block = (ColoredRedstoneLamp) fColoredLamps.get(i);
//			String name = block.getRegistryName().getPath();
//			getVariantBuilder(block)
//			.partialState().with(ColoredRedstoneLamp.LIT, false).addModels(new ConfiguredModel(cubeAll(block)))
//			.partialState().with(ColoredRedstoneLamp.LIT, true).addModels(new ConfiguredModel(models()
//					.withExistingParent(name + "_on", "cube_all").texture("all", blockRL(name + "_on"))));
//			simpleBlockItem(block, models().getExistingFile(blockRL(name)));
//		}
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
	
	@SuppressWarnings("unused")
	private ResourceLocation blockFRL(String string) {
		return new ResourceLocation(CutAndColored.FMODID, "block/" + string);
	}
	
	@Override
	public String getName() {
		return "CutAndColored block assets";
	}
}
