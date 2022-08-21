package einstein.cutandcolored.data;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.util.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BlockAssetsGenerator extends BlockStateProvider {
	
	private final List<Block> cubeBlocks = new ArrayList<>(CutAndColored.allBlocks.stream()
			.filter((block) -> Util.getBlockRegistryName(block).getPath().contains("planks")
					|| Util.getBlockRegistryName(block).getPath().contains("bricks"))
			.filter((block) -> !(block instanceof SlabBlock))
			.filter((block) -> !(block instanceof StairBlock))
			.collect(Collectors.toList()));
	
	private final List<Block> slabBlocks = new ArrayList<>(CutAndColored.allBlocks.stream()
			.filter((block) -> block instanceof SlabBlock)
			.filter((block) -> !Util.getBlockRegistryName(block).getPath().contains("pane"))
			.collect(Collectors.toList()));
	
	private final List<Block> stairBlocks = new ArrayList<>(CutAndColored.allBlocks.stream()
			.filter((block) -> block instanceof StairBlock)
			.collect(Collectors.toList()));
	
	private final List<Block> wallBlocks = new ArrayList<>(CutAndColored.allBlocks.stream()
			.filter((block) -> block instanceof WallBlock)
			.filter((block) -> Util.getBlockRegistryName(block).getPath().contains("wall"))
			.collect(Collectors.toList()));

	private final List<Block> lampBlocks = new ArrayList<>(CutAndColored.allBlocks.stream()
			.filter((block) -> block instanceof RedstoneLampBlock)
			.collect(Collectors.toList()));
	
	private final List<Block> windowBlocks = new ArrayList<>(CutAndColored.allBlocks.stream()
//			.filter((block) -> Util.getBlockRegistryName(block).getPath().contains("pane"))
			.filter((block) -> Util.getBlockRegistryName(block).getPath().contains("window"))
			.collect(Collectors.toList()));
	
	private final List<Block> coloredStairs = new ArrayList<>();
	
	private final List<Block> coloredSlabs = new ArrayList<>();
	
	private final List<Block> coloredWalls = new ArrayList<>();
	
	private final List<Block> coloredLamps = new ArrayList<>();

	private final List<Block> coloredWindows = new ArrayList<>();

	private final List<Block> coloredWindowPanes = new ArrayList<>();

    public static final ResourceLocation CUTOUT = new ResourceLocation("minecraft:cutout");
	public static final ResourceLocation CUTOUT_MIPPED = new ResourceLocation("minecraft:cutout_mipped");
    public static final ResourceLocation TRANSLUCENT = new ResourceLocation("minecraft:translucent");
	
	public BlockAssetsGenerator(DataGenerator generator, ExistingFileHelper existingFile) {
		super(generator, CutAndColored.MODID, existingFile);
	}
	
	@Override
	protected void registerStatesAndModels() {
		for (Block block : cubeBlocks) {
			String name = Util.getBlockRegistryName(block).getPath();
			simpleBlock(block);
			simpleBlockItem(block, models().getExistingFile(blockRL(name)));
		}
		
		for (int i = 0; i < CutAndColored.BOARD_TYPES.length; i++) {
			String type = CutAndColored.BOARD_TYPES[i];
			String block = type + "_boards";
			simpleBlock(getBlock(block));
			stairsBlock((StairBlock) getBlock(type + "_board_stairs"), blockRL(block));
			slabBlock((SlabBlock) getBlock(type + "_board_slab"), blockRL(block), blockRL(block));
		}
		
		simpleBlock(ModBlocks.SOUL_SANDSTONE.get(), new ConfiguredModel(models().cubeBottomTop("soul_sandstone", blockRL("soul_sandstone_side"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"))));
		simpleBlock(ModBlocks.CHISELED_SOUL_SANDSTONE.get(), new ConfiguredModel(models().cubeBottomTop("chiseled_soul_sandstone", blockRL("chiseled_soul_sandstone"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"))));
		simpleBlock(ModBlocks.CUT_SOUL_SANDSTONE.get(), new ConfiguredModel(models().cubeBottomTop("cut_soul_sandstone", blockRL("cut_soul_sandstone"), blockRL("soul_sandstone_bottom"), blockRL("soul_sandstone_top"))));
		simpleBlock(ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), models().cubeAll("smooth_soul_sandstone", blockRL("soul_sandstone_top")));
		simpleBlock(ModBlocks.POLISHED_END_STONE.get());
		simpleBlock(ModBlocks.POLISHED_STONE.get());
		simpleBlockWithRenderType(ModBlocks.SOUL_GLASS.get(), CUTOUT);
		simpleBlockWithRenderType(ModBlocks.GLASS_WINDOW.get(), CUTOUT);
		simpleBlockWithRenderType(ModBlocks.SOUL_GLASS_WINDOW.get(), CUTOUT);
		simpleBlockWithRenderType(ModBlocks.TINTED_GLASS_WINDOW.get(), TRANSLUCENT);
		
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
		stairsBlock((StairBlock) ModBlocks.OBSIDIAN_BRICK_STAIRS.get(), blockRL("obsidian_bricks"));
		
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
		slabBlock((SlabBlock) ModBlocks.OBSIDIAN_BRICK_SLAB.get(), blockRL("obsidian_bricks"), blockRL("obsidian_bricks"));
		
		borderedStairBlock((StairBlock) ModBlocks.SMOOTH_STONE_STAIRS.get(), blockMCRL("smooth_stone"));
		borderedStairBlockWithRenderType((StairBlock) ModBlocks.GLASS_STAIRS.get(), blockMCRL("glass"), CUTOUT);
		borderedStairBlockWithRenderType((StairBlock) ModBlocks.SOUL_GLASS_STAIRS.get(), blockRL("soul_glass"), CUTOUT);
		borderedStairBlockWithRenderType((StairBlock) ModBlocks.TINTED_GLASS_STAIRS.get(), blockMCRL("tinted_glass"), TRANSLUCENT);
		
		borderedSlabBlockWithRenderType((SlabBlock) ModBlocks.GLASS_SLAB.get(), blockMCRL("glass"), blockMCRL("glass"), CUTOUT);
		borderedSlabBlockWithRenderType((SlabBlock) ModBlocks.SOUL_GLASS_SLAB.get(), blockRL("soul_glass"), blockRL("soul_glass"), CUTOUT);
		borderedSlabBlockWithRenderType((SlabBlock) ModBlocks.TINTED_GLASS_SLAB.get(), blockMCRL("tinted_glass"), blockMCRL("tinted_glass"), TRANSLUCENT);
		
		wallBlock((WallBlock) ModBlocks.SOUL_SANDSTONE_WALL.get(), blockRL("soul_sandstone_side"));
		wallBlocks.remove(ModBlocks.SOUL_SANDSTONE_WALL.get());
		wallBlock((WallBlock) ModBlocks.PURPUR_WALL.get(), blockMCRL("purpur_block"));
		wallBlocks.remove(ModBlocks.PURPUR_WALL.get());
		
		paneBlockWithRenderType((IronBarsBlock) ModBlocks.SOUL_GLASS_PANE.get(), blockRL("soul_glass"), blockRL("soul_glass_pane_top"), CUTOUT_MIPPED);
		paneBlockWithRenderType((IronBarsBlock) ModBlocks.TINTED_GLASS_PANE.get(), blockMCRL("tinted_glass"), blockRL("tinted_glass_pane_top"), TRANSLUCENT);
		
		paneBlockWithRenderType((IronBarsBlock) ModBlocks.GLASS_WINDOW_PANE.get(), blockRL("glass_window"), blockMCRL("glass_pane_top"), CUTOUT_MIPPED);
		paneBlockWithRenderType((IronBarsBlock) ModBlocks.SOUL_GLASS_WINDOW_PANE.get(), blockRL("soul_glass_window"), blockRL("soul_glass_pane_top"), CUTOUT_MIPPED);
		paneBlockWithRenderType((IronBarsBlock) ModBlocks.TINTED_GLASS_WINDOW_PANE.get(), blockRL("tinted_glass_window"), blockRL("tinted_glass_pane_top"), TRANSLUCENT);
		
		logBlock((RotatedPillarBlock) ModBlocks.PRISMARINE_BRICK_PILLAR.get());
		logBlock((RotatedPillarBlock) ModBlocks.POLISHED_BLACKSTONE_PILLAR.get());
		logBlock((RotatedPillarBlock) ModBlocks.END_STONE_BRICK_PILLAR.get());
		logBlock((RotatedPillarBlock) ModBlocks.OBSIDIAN_BRICK_PILLAR.get());
		
		fenceGateBlock((FenceGateBlock) ModBlocks.NETHER_BRICK_FENCE_GATE.get(), blockMCRL("nether_bricks"));
		fenceGateBlock((FenceGateBlock) ModBlocks.IRON_FENCE_GATE.get(), blockRL("iron_fence_gate"));
		
		vanillaDyedObjects();

		for (Block wallBlock : wallBlocks) {
			WallBlock block = (WallBlock) wallBlock;
			String name = Util.getBlockRegistryName(block).getPath();
			String fileName = name.replaceAll("_wall", "");
			try {
				if (name.contains("brick")) {
					wallBlock(block, blockRL(fileName + "s"));
				}
				else {
					wallBlock(block, blockRL(fileName));
				}
			}
			catch (IllegalArgumentException e) {
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
			int i5 = windowBlocks.size() - 1;
			while (i5 >= 0) {
				Block block = windowBlocks.get(i5);
				if (isVanillaColored(block, i) && !(block instanceof IronBarsBlock)) {
					coloredWindows.add(block);
					windowBlocks.remove(i5);
				}
				i5--;
			}
			int i6 = windowBlocks.size() - 1;
			while (i6 >= 0) {
				Block block = windowBlocks.get(i6);
				if (isVanillaColored(block, i) && block instanceof IronBarsBlock) {
					coloredWindowPanes.add(block);
					windowBlocks.remove(i6);
				}
				i6--;
			}
		}
		
		// Slabs
		for (Block coloredSlab : coloredSlabs) {
			SlabBlock block = (SlabBlock) coloredSlab;
			String name = Util.getBlockRegistryName(block).getPath();
			String fileName = name.replaceAll("_slab", "");
			if (name.contains("glass")) {
				borderedSlabBlockWithRenderType(block, blockMCRL(fileName), blockMCRL(fileName), TRANSLUCENT);
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
		for (Block coloredStair : coloredStairs) {
			StairBlock block = (StairBlock) coloredStair;
			String name = Util.getBlockRegistryName(block).getPath();
			String fileName = name.replaceAll("_stairs", "");
			if (name.contains("glass")) {
				borderedStairBlockWithRenderType(block, blockMCRL(fileName), TRANSLUCENT);
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
		for (Block coloredWall : coloredWalls) {
			WallBlock block = (WallBlock) coloredWall;
			String name = Util.getBlockRegistryName(block).getPath();
			String fileName = name.replaceAll("_wall", "");
			if (name.contains("stained_brick")) {
				wallBlock(block, blockRL(fileName + "s"));
			}
		}

		// Redstone Lamps
		for (Block coloredLamp : coloredLamps) {
			RedstoneLampBlock block = (RedstoneLampBlock) coloredLamp;
			String name = Util.getBlockRegistryName(block).getPath();
			getVariantBuilder(block)
					.partialState().with(RedstoneLampBlock.LIT, false).addModels(new ConfiguredModel(cubeAll(block)))
					.partialState().with(RedstoneLampBlock.LIT, true).addModels(new ConfiguredModel(models()
							.withExistingParent(name + "_on", "cube_all").texture("all", blockRL(name + "_on"))));
			simpleBlockItem(block, models().getExistingFile(blockRL(name)));
		}

		// Windows
		for (Block block : coloredWindows) {
			simpleBlockWithRenderType(block, TRANSLUCENT);
		}

		// Window Panes
		for (Block coloredWindowPane : coloredWindowPanes) {
			IronBarsBlock block = (IronBarsBlock) coloredWindowPane;
			String name = Util.getBlockRegistryName(block).getPath();
			paneBlockWithRenderType(block, blockRL(name.replace("_pane", "")), blockMCRL(name.replace("_window", "") + "_top"), TRANSLUCENT);
		}
	}
	
	private boolean isVanillaColored(Block block, int colorIndex) {
		String name = Util.getBlockRegistryName(block).getPath();
		return name.contains(DyeColor.byId(colorIndex).getName()) && !name.contains("blackstone");
	}
	
	private void borderedStairBlock(StairBlock block, ResourceLocation imageName) {
		String name = Util.getBlockRegistryName(block).getPath();
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
		String name = Util.getBlockRegistryName(block).getPath();
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

    private void borderedStairBlockWithRenderType(StairBlock block, ResourceLocation imageName, ResourceLocation renderType) {
        String name = Util.getBlockRegistryName(block).getPath();
        stairsBlock(block,
                models().withExistingParent(name, blockRL("bordered_stairs"))
                        .texture("side", imageName)
                        .texture("top", imageName)
                        .texture("bottom", imageName).renderType(renderType),
                models().withExistingParent(name + "_inner", blockRL("bordered_inner_stairs"))
                        .texture("side", imageName)
                        .texture("top", imageName)
                        .texture("bottom", imageName).renderType(renderType),
                models().withExistingParent(name + "_outer", blockRL("bordered_outer_stairs"))
                        .texture("side", imageName)
                        .texture("top", imageName)
                        .texture("bottom", imageName).renderType(renderType));
    }

    private void borderedSlabBlockWithRenderType(SlabBlock block, ResourceLocation doubleSlab, ResourceLocation imageName, ResourceLocation renderType) {
        String name = Util.getBlockRegistryName(block).getPath();
        getVariantBuilder(block)
                .partialState().with(SlabBlock.TYPE, SlabType.BOTTOM).addModels(new ConfiguredModel(models().withExistingParent(name, blockRL("bordered_slab"))
                        .texture("side", imageName)
                        .texture("top", imageName)
                        .texture("bottom", imageName).renderType(renderType)))
                .partialState().with(SlabBlock.TYPE, SlabType.TOP).addModels(new ConfiguredModel(models().withExistingParent(name + "_top", blockRL("bordered_slab_top"))
                        .texture("side", imageName)
                        .texture("top", imageName)
                        .texture("bottom", imageName).renderType(renderType)))
                .partialState().with(SlabBlock.TYPE, SlabType.DOUBLE).addModels(new ConfiguredModel(models().withExistingParent(name + "_double", doubleSlab).renderType(renderType)));
    }

    private void simpleBlockWithRenderType(Block block, ResourceLocation renderType) {
        String name = Util.getBlockRegistryName(block).getPath();
        simpleBlock(block, models().cubeAll(name, new ResourceLocation(CutAndColored.MODID, "block/" + name)).renderType(renderType));
    }

	public static Block getBlock(String registryName) {
		Block block = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(CutAndColored.MODID, registryName));
		if (block != null && block != Blocks.AIR) {
			return block;
		}
		else {
			throw new NullPointerException("Could not find block with registry name: " + registryName);
		}
	}
	
	private static ResourceLocation blockRL(String string) {
		return new ResourceLocation(CutAndColored.MODID, "block/" + string);
	}
	
	private static ResourceLocation blockMCRL(String string) {
		return new ResourceLocation(CutAndColored.MCMODID, "block/" + string);
	}
	
	@Override
	public String getName() {
		return "CutAndColored block assets";
	}
}
