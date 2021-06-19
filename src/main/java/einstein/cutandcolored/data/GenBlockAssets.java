package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.FlamboyantDyeColors;
import net.minecraft.block.Block;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GenBlockAssets extends BlockStateProvider {

	private List<Block> cubeBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block.getRegistryName().getPath().contains("planks") || block.getRegistryName().getPath().contains("bricks"))
			.filter((block) -> !(block instanceof SlabBlock))
			.filter((block) -> !(block instanceof StairsBlock))
			.collect(Collectors.toList()));
	
	private List<Block> slabBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block instanceof SlabBlock)
			.filter((block) -> !block.getRegistryName().getPath().contains("pane"))
			.collect(Collectors.toList()));
	
	private List<Block> stairBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block instanceof StairsBlock)
			.collect(Collectors.toList()));
	
	private List<Block> wallBlocks = new ArrayList<Block>(ModBlocks.allBlocks.stream()
			.filter((block) -> block instanceof WallBlock)
			.filter((block) -> block.getRegistryName().getPath().contains("wall"))
			.collect(Collectors.toList()));
	
	private List<Block> coloredStairs = new ArrayList<Block>();
	private List<Block> fColoredStairs = new ArrayList<Block>();
	
	private List<Block> coloredSlabs = new ArrayList<Block>();
	private List<Block> fColoredSlabs = new ArrayList<Block>();
	
	private List<Block> coloredWalls = new ArrayList<Block>();
	private List<Block> fColoredWalls = new ArrayList<Block>();
	
	public GenBlockAssets(DataGenerator generator, ExistingFileHelper existingFile) {
		super(generator, CutAndColored.MODID, existingFile);
	}
	
	@Override
	protected void registerStatesAndModels() {
		// Flamboyant dye
		for (int i = 0; i < FlamboyantDyeColors.values().length; i++) {
			int i1 = stairBlocks.size() - 1;
			while (i1 >= 0) {
				if (stairBlocks.get(i1).getRegistryName().getPath().contains(FlamboyantDyeColors.byId(i).getTranslationKey())) {
					fColoredStairs.add(stairBlocks.get(i1));
					stairBlocks.remove(i1);
				}
				i1--;
			}
			int i2 = slabBlocks.size() - 1;
			while (i2 >= 0) {
				if (slabBlocks.get(i2).getRegistryName().getPath().contains(FlamboyantDyeColors.byId(i).getTranslationKey())) {
					fColoredSlabs.add(slabBlocks.get(i2));
					slabBlocks.remove(i2);
				}
				i2--;
			}
			int i3 = wallBlocks.size() - 1;
			while (i3 >= 0) {
				if (wallBlocks.get(i3).getRegistryName().getPath().contains(FlamboyantDyeColors.byId(i).getTranslationKey())) {
					fColoredWalls.add(wallBlocks.get(i3));
					wallBlocks.remove(i3);
				}
				i3--;
			}
		}
		// Vanilla dye
		for (int i = 0; i < DyeColor.values().length; i++) {
			int i1 = stairBlocks.size() - 1;
			while (i1 >= 0) {
				if (stairBlocks.get(i1).getRegistryName().getPath().contains(DyeColor.byId(i).getTranslationKey()) && !stairBlocks.get(i1).getRegistryName().getPath().contains("blackstone")) {
					coloredStairs.add(stairBlocks.get(i1));
					stairBlocks.remove(i1);
				}
				i1--;
			}
			int i2 = slabBlocks.size() - 1;
			while (i2 >= 0) {
				if (slabBlocks.get(i2).getRegistryName().getPath().contains(DyeColor.byId(i).getTranslationKey()) && !slabBlocks.get(i2).getRegistryName().getPath().contains("blackstone")) {
					coloredSlabs.add(slabBlocks.get(i2));
					slabBlocks.remove(i2);
				}
				i2--;
			}
			int i3 = wallBlocks.size() - 1;
			while (i3 >= 0) {
				if (wallBlocks.get(i3).getRegistryName().getPath().contains(DyeColor.byId(i).getTranslationKey()) && !wallBlocks.get(i3).getRegistryName().getPath().contains("blackstone")) {
					coloredWalls.add(wallBlocks.get(i3));
					wallBlocks.remove(i3);
				}
				i3--;
			}
		}
		
		CutAndColored.LOGGER.debug(coloredSlabs.size() + " colored slabs");
		CutAndColored.LOGGER.debug(coloredStairs.size() + " colored stairs");
		CutAndColored.LOGGER.debug(coloredWalls.size() + " colored walls");
		CutAndColored.LOGGER.debug(fColoredSlabs.size() + " f colored slabs");
		CutAndColored.LOGGER.debug(fColoredStairs.size() + " f colored stairs");
		CutAndColored.LOGGER.debug(fColoredWalls.size() + " f colored walls");
		CutAndColored.LOGGER.debug(cubeBlocks.size() + " cube blocks");
		vanillaDyedObjects();
		flamboyantDyedObjects();

		simpleBlock(ModBlocks.SOUL_GLASS);
		paneBlock((PaneBlock) ModBlocks.SOUL_GLASS_PANE, blockRL("soul_glass"), blockRL("soul_glass_pane_top"));
		fenceGateBlock((FenceGateBlock) ModBlocks.NETHER_BRICK_FENCE_GATE, blockMCRL("nether_bricks"));
		fenceGateBlock((FenceGateBlock) ModBlocks.IRON_FENCE_GATE, blockRL("iron_fence_gate"));
		
		for (int i = 0; i < slabBlocks.size(); i++) {
			SlabBlock block = (SlabBlock) slabBlocks.get(i);
			String name = block.getRegistryName().getPath();
			String fileName = name.replaceAll("_slab", "");			
			if (slabBlocks.get(i) == ModBlocks.GLASS_SLAB) {
				getVariantBuilder(block)
				.partialState().with(SlabBlock.TYPE, SlabType.BOTTOM).addModels(new ConfiguredModel(models().withExistingParent(name, blockRL("bordered_slab"))
						.texture("side", blockMCRL(fileName))
						.texture("top", blockMCRL(fileName))
						.texture("bottom", blockMCRL(fileName))))
	            .partialState().with(SlabBlock.TYPE, SlabType.TOP).addModels(new ConfiguredModel(models().withExistingParent(name + "_top", blockRL("bordered_slab_top"))
	            		.texture("side", blockMCRL(fileName))
	            		.texture("top", blockMCRL(fileName))
	            		.texture("bottom", blockMCRL(fileName))))
	            .partialState().with(SlabBlock.TYPE, SlabType.DOUBLE).addModels(new ConfiguredModel(models().getExistingFile(blockMCRL(fileName))));
			}
			else if (slabBlocks.get(i) == ModBlocks.SOUL_GLASS_SLAB) {
				getVariantBuilder(block)
				.partialState().with(SlabBlock.TYPE, SlabType.BOTTOM).addModels(new ConfiguredModel(models().withExistingParent(name, blockRL("bordered_slab"))
						.texture("side", blockRL(fileName))
						.texture("top", blockRL(fileName))
						.texture("bottom", blockRL(fileName))))
	            .partialState().with(SlabBlock.TYPE, SlabType.TOP).addModels(new ConfiguredModel(models().withExistingParent(name + "_top", blockRL("bordered_slab_top"))
	            		.texture("side", blockRL(fileName))
	            		.texture("top", blockRL(fileName))
	            		.texture("bottom", blockRL(fileName))))
	            .partialState().with(SlabBlock.TYPE, SlabType.DOUBLE).addModels(new ConfiguredModel(models().getExistingFile(blockRL(fileName))));
			}
			else {
				try {
					if (block.getRegistryName().getPath().contains("brick")) {
						slabBlock(block, blockRL(fileName + "s"), blockRL(fileName + "s"));
					}
					else {
						slabBlock(block, blockRL(fileName), blockRL(fileName));
					}
				}
				catch (IllegalArgumentException e) {
					if (block.getRegistryName().getPath().contains("brick")) {
						slabBlock(block, blockMCRL(fileName + "s"), blockMCRL(fileName + "s"));
					}
					else {
						slabBlock(block, blockMCRL(fileName), blockMCRL(fileName));
					}
				}
			}
		}
		for (int i = 0; i < cubeBlocks.size(); i++) {
			Block block = cubeBlocks.get(i);
			simpleBlock(block);
			simpleBlockItem(block, cubeAll(block));
		}
	}
	
	private void vanillaDyedObjects() {
		// Slabs
		for (int i = 0; i < coloredSlabs.size(); i++) {
			SlabBlock block = (SlabBlock) coloredSlabs.get(i);
			String name = block.getRegistryName().getPath();
			String fileName = name.replaceAll("_slab", "");
			if (name.contains("glass")) {
				getVariantBuilder(block)
				.partialState().with(SlabBlock.TYPE, SlabType.BOTTOM).addModels(new ConfiguredModel(models().withExistingParent(name, blockRL("bordered_slab"))
						.texture("side", blockMCRL(fileName))
						.texture("top", blockMCRL(fileName))
						.texture("bottom", blockMCRL(fileName))))
	            .partialState().with(SlabBlock.TYPE, SlabType.TOP).addModels(new ConfiguredModel(models().withExistingParent(name + "_top", blockRL("bordered_slab_top"))
	            		.texture("side", blockMCRL(fileName))
	            		.texture("top", blockMCRL(fileName))
	            		.texture("bottom", blockMCRL(fileName))))
	            .partialState().with(SlabBlock.TYPE, SlabType.DOUBLE).addModels(new ConfiguredModel(models().getExistingFile(blockMCRL(fileName))));
			}
			else if (name.contains("wool") || name.contains("concrete") || name.contains("terracotta")) {
				slabBlock(block, blockMCRL(fileName), blockMCRL(fileName));
			}
			else if (name.contains("stained_plank") || name.contains("stained_brick")) {
				slabBlock(block, blockRL(fileName + "s"), blockRL(fileName + "s"));
			}
		}
		// Stairs
		for (int i = 0; i < coloredStairs.size(); i++) {
			StairsBlock block = (StairsBlock) coloredStairs.get(i);
			String name = block.getRegistryName().getPath();
			String fileName = name.replaceAll("_stairs", "");
			if (name.contains("glass")) {
				stairsBlock(block,
						models().withExistingParent(name, blockRL("bordered_stairs"))
							.texture("side", blockMCRL(fileName))
							.texture("top", blockMCRL(fileName))
							.texture("bottom", blockMCRL(fileName)),
						models().withExistingParent(name + "_inner", blockRL("bordered_inner_stairs"))
							.texture("side", blockMCRL(fileName))
							.texture("top", blockMCRL(fileName))
							.texture("bottom", blockMCRL(fileName)),
						models().withExistingParent(name + "_outer", blockRL("bordered_outer_stairs"))
							.texture("side", blockMCRL(fileName))
							.texture("top", blockMCRL(fileName))
							.texture("bottom", blockMCRL(fileName)));
			}
			else if (name.contains("wool") || name.contains("concrete") || name.contains("terracotta")) {
				stairsBlock(block, blockMCRL(fileName));
			}
			else if (name.contains("stained_plank") || name.contains("stained_brick")) {
				stairsBlock(block, blockRL(fileName + "s"));
			}
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
	}

	// Game can't find textures
	private void flamboyantDyedObjects() {
		// Slabs
		
		// Stairs
//		for (int i = 0; i < fColoredStairs.size(); i++) {
//			StairsBlock block = (StairsBlock) fColoredStairs.get(i);
//			String name = block.getRegistryName().getPath();
//			String image = name.replaceAll("_stairs", "");
//			if (name.contains("glass")) {
//				
//			}
//			else if (name.contains("wool")) {
//				stairsBlock(block, blockFRL(image));
//			}
//			else if (name.contains("concrete")) {
//				stairsBlock(block, blockFRL(image));
//			}
//			else if (name.contains("terracotta")) {
//				stairsBlock(block, blockFRL(image));
//			}
//			else if (name.contains("stained_plank")) {
//				stairsBlock(block, blockRL(image + "s"));
//			}
//			else if (name.contains("stained_brick")) {
//				stairsBlock(block, blockRL(image + "s"));
//			}
//		}
		// Walls
	}
	
	private ResourceLocation blockRL(String string) {
		return new ResourceLocation(CutAndColored.MODID, "block/" + string);
	}
	
	private ResourceLocation blockMCRL(String string) {
		return new ResourceLocation(CutAndColored.MCMODID, "block/" + string);
	}
	
	private ResourceLocation blockFRL(String string) {
		return new ResourceLocation(CutAndColored.FMODID, "block/" + string);
	}
	
	@Override
	public String getName() {
		return "CutAndColored block assets";
	}
}
