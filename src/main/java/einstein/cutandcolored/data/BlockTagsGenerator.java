package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.FlamboyantDyeColors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag.INamedTag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagsGenerator extends BlockTagsProvider {
	
	private List<Block> coloredBlocks = new ArrayList<Block>();
	private List<Block> fColoredBlocks = new ArrayList<Block>();
	
	/**********************Mod***********************/
	public static final INamedTag<Block> VANILLA_STAINED_BRICKS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_bricks");
	public static final INamedTag<Block> VANILLA_STAINED_PLANKS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_planks");
	public static final INamedTag<Block> VANILLA_REDSTONE_LAMPS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_redstone_lamps");
	
	public static final INamedTag<Block> VANILLA_CONCRETE_SLABS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_concrete_slabs");
	public static final INamedTag<Block> VANILLA_STAINED_BRICK_SLABS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_brick_slabs");
	public static final INamedTag<Block> VANILLA_STAINED_GLASS_SLABS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_glass_slabs");
	public static final INamedTag<Block> VANILLA_STAINED_PLANK_SLABS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_plank_slabs");
	public static final INamedTag<Block> VANILLA_TERRACOTTA_SLABS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_terracotta_slabs");
	public static final INamedTag<Block> VANILLA_WOOL_SLABS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_wool_slabs");
	
	public static final INamedTag<Block> VANILLA_CONCRETE_STAIRS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_concrete_stairs");
	public static final INamedTag<Block> VANILLA_STAINED_BRICK_STAIRS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_brick_stairs");
	public static final INamedTag<Block> VANILLA_STAINED_GLASS_STAIRS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_glass_stairs");
	public static final INamedTag<Block> VANILLA_STAINED_PLANK_STAIRS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_plank_stairs");
	public static final INamedTag<Block> VANILLA_TERRACOTTA_STAIRS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_terracotta_stairs");
	public static final INamedTag<Block> VANILLA_WOOL_STAIRS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_wool_stairs");
	
	public static final INamedTag<Block> VANILLA_STAINED_BRICK_WALLS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_brick_walls");
	
	/**********************Flamboyant***********************/
	public static final INamedTag<Block> FLAMBOYANT_REDSTONE_LAMPS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_redstone_lamps");
	public static final INamedTag<Block> FLAMBOYANT_STAINED_BRICKS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_bricks");
	public static final INamedTag<Block> FLAMBOYANT_STAINED_PLANKS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_planks");
	
	public static final INamedTag<Block> FLAMBOYANT_CONCRETE_SLABS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_concrete_slabs");
	public static final INamedTag<Block> FLAMBOYANT_STAINED_BRICK_SLABS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_brick_slabs");
	public static final INamedTag<Block> FLAMBOYANT_STAINED_GLASS_SLABS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_glass_slabs");
	public static final INamedTag<Block> FLAMBOYANT_STAINED_PLANK_SLABS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_plank_slabs");
	public static final INamedTag<Block> FLAMBOYANT_TERRACOTTA_SLABS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_terracotta_slabs");
	public static final INamedTag<Block> FLAMBOYANT_WOOL_SLABS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_wool_slabs");
	
	public static final INamedTag<Block> FLAMBOYANT_CONCRETE_STAIRS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_concrete_stairs");
	public static final INamedTag<Block> FLAMBOYANT_STAINED_BRICK_STAIRS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_brick_stairs");
	public static final INamedTag<Block> FLAMBOYANT_STAINED_GLASS_STAIRS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_glass_stairs");
	public static final INamedTag<Block> FLAMBOYANT_STAINED_PLANK_STAIRS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_plank_stairs");
	public static final INamedTag<Block> FLAMBOYANT_TERRACOTTA_STAIRS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_terracotta_stairs");
	public static final INamedTag<Block> FLAMBOYANT_WOOL_STAIRS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_wool_stairs");
	
	public static final INamedTag<Block> FLAMBOYANT_STAINED_BRICK_WALLS = BlockTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_brick_walls");
	
	/**********************Forge***********************/
	public static final INamedTag<Block> CLAY_BRICKS = BlockTags.makeWrapperTag("forge:clay_bricks");
	public static final INamedTag<Block> REDSTONE_LAMPS = BlockTags.makeWrapperTag("forge:redstone_lamps");
	public static final INamedTag<Block> CARVED_PUMPKINS = BlockTags.makeWrapperTag("forge:carved_pumpkins");
	public static final INamedTag<Block> JACK_O_LANTERNS = BlockTags.makeWrapperTag("forge:jack_o_lanterns");
	public static final INamedTag<Block> STAINED_PLANKS = BlockTags.makeWrapperTag("forge:stained_planks");
	
	public static final INamedTag<Block> CLAY_BRICK_SLABS = BlockTags.makeWrapperTag("forge:clay_brick_slabs");
	public static final INamedTag<Block> CONCRETE_SLABS = BlockTags.makeWrapperTag("forge:concrete_slabs");
	public static final INamedTag<Block> GLASS_SLABS = BlockTags.makeWrapperTag("forge:glass_slabs");
	public static final INamedTag<Block> STAINED_PLANK_SLABS = BlockTags.makeWrapperTag("forge:stained_plank_slabs");
	public static final INamedTag<Block> TERRACOTTA_SLABS = BlockTags.makeWrapperTag("forge:terracotta_slabs");
	public static final INamedTag<Block> WOOL_SLABS = BlockTags.makeWrapperTag("forge:wool_slabs");
	
	public static final INamedTag<Block> CLAY_BRICK_STAIRS = BlockTags.makeWrapperTag("forge:clay_brick_stairs");
	public static final INamedTag<Block> CONCRETE_STAIRS = BlockTags.makeWrapperTag("forge:concrete_stairs");
	public static final INamedTag<Block> GLASS_STAIRS = BlockTags.makeWrapperTag("forge:glass_stairs");
	public static final INamedTag<Block> STAINED_PLANK_STAIRS = BlockTags.makeWrapperTag("forge:stained_plank_stairs");
	public static final INamedTag<Block> TERRACOTTA_STAIRS = BlockTags.makeWrapperTag("forge:terracotta_stairs");
	public static final INamedTag<Block> WOOL_STAIRS = BlockTags.makeWrapperTag("forge:wool_stairs");
	
	public static final INamedTag<Block> CLAY_BRICK_WALLS = BlockTags.makeWrapperTag("forge:clay_brick_walls");
	
	public static final INamedTag<Block> NETHER_BRICK_FENCE_GATES = BlockTags.makeWrapperTag("forge:fence_gates/nether_brick");
	
	public static final INamedTag<Block> SOUL_GLASS_PANES = BlockTags.makeWrapperTag("forge:glass_panes/soul");
	
	public static final INamedTag<Block> SOUL_GLASS = BlockTags.makeWrapperTag("forge:glass/soul");
	
	public BlockTagsGenerator(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
		super(generatorIn, CutAndColored.MODID, existingFileHelper);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected void registerTags() {
		for (int i = 0; i < FlamboyantDyeColors.values().length; i++) {
			int i1 = ModBlocks.allBlocks.size() - 1;
			while (i1 >= 0) {
				if (ModBlocks.allBlocks.get(i1).getRegistryName().getPath().contains(FlamboyantDyeColors.byId(i).getTranslationKey())) {
					fColoredBlocks.add(ModBlocks.allBlocks.get(i1));
				}
				i1--;
			}
		}
		for (int i = 0; i < DyeColor.values().length; i++) {
			int i1 = ModBlocks.allBlocks.size() - 1;
			while (i1 >= 0) {
				if (ModBlocks.allBlocks.get(i1).getRegistryName().getPath().contains(DyeColor.byId(i).getTranslationKey())) {
					coloredBlocks.add(ModBlocks.allBlocks.get(i1));
				}
				i1--;
			}
		}
		
		vanillaDyedTags();
		flaboyantDyedTags();
		
		/**********************Minecraft***********************/
		getOrCreateBuilder(BlockTags.IMPERMEABLE).add(ModBlocks.SOUL_GLASS).addTags(GLASS_SLABS, GLASS_STAIRS);
		getOrCreateBuilder(BlockTags.PLANKS).addTag(STAINED_PLANKS);
		getOrCreateBuilder(BlockTags.SLABS)
				.addTags(CONCRETE_SLABS, GLASS_SLABS, FLAMBOYANT_STAINED_PLANK_SLABS, TERRACOTTA_SLABS, WOOL_SLABS)
				.add(ModBlocks.CRACKED_STONE_BRICK_SLAB, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB,
						ModBlocks.CRACKED_NETHER_BRICK_SLAB, ModBlocks.SOUL_SANDSTONE_SLAB,
						ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, ModBlocks.CUT_SOUL_SANDSTONE_SLAB,
						ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICK_SLAB);
		getOrCreateBuilder(BlockTags.STAIRS)
				.addTags(CONCRETE_STAIRS, GLASS_STAIRS, FLAMBOYANT_STAINED_PLANK_STAIRS, TERRACOTTA_STAIRS, WOOL_STAIRS)
				.add(ModBlocks.SMOOTH_STONE_STAIRS, ModBlocks.CRACKED_STONE_BRICK_STAIRS,
						ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS,
						ModBlocks.SOUL_SANDSTONE_STAIR, ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS,
						ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICK_STAIRS,
						ModBlocks.ANDESITE_BRICK_STAIRS);
		getOrCreateBuilder(BlockTags.WALLS).addTag(CLAY_BRICK_WALLS).add(ModBlocks.SOUL_SANDSTONE_WALL,
				ModBlocks.GRANITE_BRICK_WALL, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.ANDESITE_BRICK_WALL,
				ModBlocks.PURPUR_WALL, ModBlocks.PRISMARINE_BRICK_WALL, ModBlocks.DARK_PRISMARINE_WALL,
				ModBlocks.CRACKED_STONE_BRICK_WALL, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL,
				ModBlocks.CRACKED_NETHER_BRICK_WALL, ModBlocks.SMOOTH_STONE_WALL, ModBlocks.QUARTZ_BRICK_WALL);
		getOrCreateBuilder(BlockTags.WOODEN_SLABS).addTag(STAINED_PLANK_SLABS);
		getOrCreateBuilder(BlockTags.WOODEN_STAIRS).addTag(STAINED_PLANK_STAIRS);
		
		/**********************Forge***********************/
		getOrCreateBuilder(CLAY_BRICK_SLABS).add(Blocks.BRICK_SLAB).addTag(VANILLA_STAINED_BRICK_SLABS).addOptionalTag(FLAMBOYANT_STAINED_BRICK_SLABS.getName());
		getOrCreateBuilder(CLAY_BRICK_STAIRS).add(Blocks.BRICK_STAIRS).addTag(VANILLA_STAINED_BRICK_STAIRS).addOptionalTag(FLAMBOYANT_STAINED_BRICK_STAIRS.getName());
		getOrCreateBuilder(CLAY_BRICK_WALLS).add(Blocks.BRICK_WALL).addTag(VANILLA_STAINED_BRICK_WALLS).addOptionalTag(FLAMBOYANT_STAINED_BRICK_WALLS.getName());
		getOrCreateBuilder(CLAY_BRICKS).add(Blocks.BRICKS).addTag(VANILLA_STAINED_BRICKS).addOptionalTag(FLAMBOYANT_STAINED_BRICKS.getName());
		getOrCreateBuilder(CONCRETE_SLABS).addTag(VANILLA_CONCRETE_SLABS).addOptionalTag(FLAMBOYANT_CONCRETE_SLABS.getName());
		getOrCreateBuilder(CONCRETE_STAIRS).addTag(VANILLA_CONCRETE_STAIRS).addOptionalTag(FLAMBOYANT_CONCRETE_STAIRS.getName());
		getOrCreateBuilder(GLASS_SLABS).addTag(VANILLA_STAINED_GLASS_SLABS).addOptionalTag(FLAMBOYANT_STAINED_GLASS_SLABS.getName());
		getOrCreateBuilder(GLASS_STAIRS).addTag(VANILLA_STAINED_GLASS_STAIRS).addOptionalTag(FLAMBOYANT_STAINED_GLASS_STAIRS.getName());
		getOrCreateBuilder(REDSTONE_LAMPS).add(Blocks.REDSTONE_LAMP).addTag(VANILLA_REDSTONE_LAMPS).addOptionalTag(FLAMBOYANT_REDSTONE_LAMPS.getName());
		getOrCreateBuilder(CARVED_PUMPKINS).add(Blocks.CARVED_PUMPKIN);
		getOrCreateBuilder(JACK_O_LANTERNS).add(Blocks.JACK_O_LANTERN);
		getOrCreateBuilder(TERRACOTTA_SLABS).addTag(VANILLA_TERRACOTTA_SLABS).addOptionalTag(FLAMBOYANT_TERRACOTTA_SLABS.getName());
		getOrCreateBuilder(TERRACOTTA_STAIRS).addTag(VANILLA_TERRACOTTA_STAIRS).addOptionalTag(FLAMBOYANT_TERRACOTTA_STAIRS.getName());
		getOrCreateBuilder(WOOL_SLABS).addTag(VANILLA_WOOL_SLABS).addOptionalTag(FLAMBOYANT_WOOL_SLABS.getName());
		getOrCreateBuilder(WOOL_STAIRS).addTag(VANILLA_WOOL_STAIRS).addOptionalTag(FLAMBOYANT_WOOL_STAIRS.getName());
		getOrCreateBuilder(STAINED_PLANK_SLABS).addTag(VANILLA_STAINED_PLANK_SLABS).addOptionalTag(FLAMBOYANT_STAINED_PLANK_SLABS.getName());
		getOrCreateBuilder(STAINED_PLANK_STAIRS).addTag(VANILLA_STAINED_PLANK_STAIRS).addOptionalTag(FLAMBOYANT_STAINED_PLANK_STAIRS.getName());
		getOrCreateBuilder(STAINED_PLANKS).addTag(VANILLA_STAINED_PLANKS).addOptionalTag(FLAMBOYANT_STAINED_PLANKS.getName());
		getOrCreateBuilder(NETHER_BRICK_FENCE_GATES).add(ModBlocks.NETHER_BRICK_FENCE_GATE);
		getOrCreateBuilder(SOUL_GLASS).add(ModBlocks.SOUL_GLASS);
		getOrCreateBuilder(SOUL_GLASS_PANES).add(ModBlocks.SOUL_GLASS_PANE);
		
		getOrCreateBuilder(Tags.Blocks.GLASS_PANES).add(ModBlocks.SOUL_GLASS_PANE);
		getOrCreateBuilder(Tags.Blocks.SANDSTONE).add(ModBlocks.SOUL_SANDSTONE, ModBlocks.CUT_SOUL_SANDSTONE,
				ModBlocks.CHISELED_SOUL_SANDSTONE, ModBlocks.SMOOTH_SOUL_SANDSTONE);
		getOrCreateBuilder(Tags.Blocks.GLASS_COLORLESS).add(ModBlocks.SOUL_GLASS);
		getOrCreateBuilder(Tags.Blocks.GLASS_PANES_COLORLESS).add(ModBlocks.SOUL_GLASS_PANE);
		
		for (int i = 0; i < 23; i++) {
			getOrCreateBuilder(CARVED_PUMPKINS).addOptional(new ResourceLocation("omgourd", "carved_pumpkin_" + (i + 1)));
		}
		for (int i = 0; i < 23; i++) {
			getOrCreateBuilder(JACK_O_LANTERNS).addOptional(new ResourceLocation("omgourd", "jack_o_lantern_" + (i + 1)));
		}
	}
	
	private void vanillaDyedTags() {
		for (int i = 0; i < coloredBlocks.size(); i++) {
			Block block = coloredBlocks.get(i);
			String name = block.getRegistryName().getPath();
			if (name.contains("concrete")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(VANILLA_CONCRETE_SLABS).add(block);
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(VANILLA_CONCRETE_STAIRS).add(block);
				}
			}
			else if (name.contains("redstone_lamp")) {
				getOrCreateBuilder(VANILLA_REDSTONE_LAMPS).add(block);
			}
			else if (name.contains("stained_brick")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(VANILLA_STAINED_BRICK_SLABS).add(block);
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(VANILLA_STAINED_BRICK_STAIRS).add(block);
				}
				else if (name.contains("wall")) {
					getOrCreateBuilder(VANILLA_STAINED_BRICK_WALLS).add(block);
				}
				else if (name.contains("bricks")) {
					getOrCreateBuilder(VANILLA_STAINED_BRICKS).add(block);
				}
			}
			else if (name.contains("stained_glass")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(VANILLA_STAINED_GLASS_SLABS).add(block);
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(VANILLA_STAINED_GLASS_STAIRS).add(block);
				}
			}
			else if (name.contains("stained_plank")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(VANILLA_STAINED_PLANK_SLABS).add(block);
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(VANILLA_STAINED_PLANK_STAIRS).add(block);
				}
				else if (name.contains("planks")) {
					getOrCreateBuilder(VANILLA_STAINED_PLANKS).add(block);
				}
			}
			else if (name.contains("terracotta")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(VANILLA_TERRACOTTA_SLABS).add(block);
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(VANILLA_TERRACOTTA_STAIRS).add(block);
				}
			}
			else if (name.contains("wool")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(VANILLA_WOOL_SLABS).add(block);
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(VANILLA_WOOL_STAIRS).add(block);
				}
			}
		}
	}
	
	private void flaboyantDyedTags() {
		for (int i = 0; i < fColoredBlocks.size(); i++) {
			Block block = fColoredBlocks.get(i);
			String name = block.getRegistryName().getPath();
			if (name.contains("concrete")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(FLAMBOYANT_CONCRETE_SLABS).addOptional(block.getRegistryName());
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(FLAMBOYANT_CONCRETE_STAIRS).addOptional(block.getRegistryName());
				}
			}
			else if (name.contains("redstone_lamp")) {
				getOrCreateBuilder(FLAMBOYANT_REDSTONE_LAMPS).addOptional(block.getRegistryName());
			}
			else if (name.contains("stained_brick")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_BRICK_SLABS).addOptional(block.getRegistryName());
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_BRICK_STAIRS).addOptional(block.getRegistryName());
				}
				else if (name.contains("wall")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_BRICK_WALLS).addOptional(block.getRegistryName());
				}
				else if (name.contains("bricks")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_BRICKS).addOptional(block.getRegistryName());
				}
			}
			else if (name.contains("stained_glass")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_GLASS_SLABS).addOptional(block.getRegistryName());
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_GLASS_STAIRS).addOptional(block.getRegistryName());
				}
			}
			else if (name.contains("stained_plank")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_PLANK_SLABS).addOptional(block.getRegistryName());
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_PLANK_STAIRS).addOptional(block.getRegistryName());
				}
				else if (name.contains("planks")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_PLANKS).addOptional(block.getRegistryName());
				}
			}
			else if (name.contains("terracotta")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(FLAMBOYANT_TERRACOTTA_SLABS).addOptional(block.getRegistryName());
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(FLAMBOYANT_TERRACOTTA_STAIRS).addOptional(block.getRegistryName());
				}
			}
			else if (name.contains("wool")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(FLAMBOYANT_WOOL_SLABS).addOptional(block.getRegistryName());
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(FLAMBOYANT_WOOL_STAIRS).addOptional(block.getRegistryName());
				}
			}
		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored block tags";
	}
}
