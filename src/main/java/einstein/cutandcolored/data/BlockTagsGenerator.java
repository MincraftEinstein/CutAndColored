package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockTagsGenerator extends BlockTagsProvider {
	
	private List<Block> coloredBlocks = new ArrayList<Block>();
//	private List<Block> fColoredBlocks = new ArrayList<Block>();
	
	/**********************Mod***********************/
	public static final Tag.Named<Block> VANILLA_STAINED_BRICKS = BlockTags.bind(CutAndColored.MODID + ":vanilla_stained_bricks");
	public static final Tag.Named<Block> VANILLA_STAINED_PLANKS = BlockTags.bind(CutAndColored.MODID + ":vanilla_stained_planks");
	public static final Tag.Named<Block> VANILLA_REDSTONE_LAMPS = BlockTags.bind(CutAndColored.MODID + ":vanilla_redstone_lamps");
	public static final Tag.Named<Block> VANILLA_STAINED_GLASS_WINDOWS = BlockTags.bind(CutAndColored.MODID + ":vanilla_stained_glass_windows");
	
	public static final Tag.Named<Block> VANILLA_CONCRETE_SLABS = BlockTags.bind(CutAndColored.MODID + ":vanilla_concrete_slabs");
	public static final Tag.Named<Block> VANILLA_STAINED_BRICK_SLABS = BlockTags.bind(CutAndColored.MODID + ":vanilla_stained_brick_slabs");
	public static final Tag.Named<Block> VANILLA_STAINED_GLASS_SLABS = BlockTags.bind(CutAndColored.MODID + ":vanilla_stained_glass_slabs");
	public static final Tag.Named<Block> VANILLA_STAINED_PLANK_SLABS = BlockTags.bind(CutAndColored.MODID + ":vanilla_plank_slabs");
	public static final Tag.Named<Block> VANILLA_TERRACOTTA_SLABS = BlockTags.bind(CutAndColored.MODID + ":vanilla_terracotta_slabs");
	public static final Tag.Named<Block> VANILLA_WOOL_SLABS = BlockTags.bind(CutAndColored.MODID + ":vanilla_wool_slabs");
	
	public static final Tag.Named<Block> VANILLA_CONCRETE_STAIRS = BlockTags.bind(CutAndColored.MODID + ":vanilla_concrete_stairs");
	public static final Tag.Named<Block> VANILLA_STAINED_BRICK_STAIRS = BlockTags.bind(CutAndColored.MODID + ":vanilla_stained_brick_stairs");
	public static final Tag.Named<Block> VANILLA_STAINED_GLASS_STAIRS = BlockTags.bind(CutAndColored.MODID + ":vanilla_stained_glass_stairs");
	public static final Tag.Named<Block> VANILLA_STAINED_PLANK_STAIRS = BlockTags.bind(CutAndColored.MODID + ":vanilla_plank_stairs");
	public static final Tag.Named<Block> VANILLA_TERRACOTTA_STAIRS = BlockTags.bind(CutAndColored.MODID + ":vanilla_terracotta_stairs");
	public static final Tag.Named<Block> VANILLA_WOOL_STAIRS = BlockTags.bind(CutAndColored.MODID + ":vanilla_wool_stairs");
	
	public static final Tag.Named<Block> VANILLA_STAINED_BRICK_WALLS = BlockTags.bind(CutAndColored.MODID + ":vanilla_stained_brick_walls");
	
	public static final Tag.Named<Block> VANILLA_STAINED_GLASS_WINDOW_PANES = BlockTags.bind(CutAndColored.MODID + ":vanilla_stained_glass_window_panes");
	
	/**********************Flamboyant***********************/
//	public static final Tag.Named<Block> FLAMBOYANT_REDSTONE_LAMPS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_redstone_lamps");
//	public static final Tag.Named<Block> FLAMBOYANT_STAINED_BRICKS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_stained_bricks");
//	public static final Tag.Named<Block> FLAMBOYANT_STAINED_PLANKS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_stained_planks");
	
//	public static final Tag.Named<Block> FLAMBOYANT_CONCRETE_SLABS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_concrete_slabs");
//	public static final Tag.Named<Block> FLAMBOYANT_STAINED_BRICK_SLABS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_stained_brick_slabs");
//	public static final Tag.Named<Block> FLAMBOYANT_STAINED_GLASS_SLABS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_stained_glass_slabs");
//	public static final Tag.Named<Block> FLAMBOYANT_STAINED_PLANK_SLABS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_plank_slabs");
//	public static final Tag.Named<Block> FLAMBOYANT_TERRACOTTA_SLABS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_terracotta_slabs");
//	public static final Tag.Named<Block> FLAMBOYANT_WOOL_SLABS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_wool_slabs");
	
//	public static final Tag.Named<Block> FLAMBOYANT_CONCRETE_STAIRS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_concrete_stairs");
//	public static final Tag.Named<Block> FLAMBOYANT_STAINED_BRICK_STAIRS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_stained_brick_stairs");
//	public static final Tag.Named<Block> FLAMBOYANT_STAINED_GLASS_STAIRS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_stained_glass_stairs");
//	public static final Tag.Named<Block> FLAMBOYANT_STAINED_PLANK_STAIRS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_plank_stairs");
//	public static final Tag.Named<Block> FLAMBOYANT_TERRACOTTA_STAIRS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_terracotta_stairs");
//	public static final Tag.Named<Block> FLAMBOYANT_WOOL_STAIRS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_wool_stairs");
	
//	public static final Tag.Named<Block> FLAMBOYANT_STAINED_BRICK_WALLS = BlockTags.bind(CutAndColored.MODID + ":flamboyant_stained_brick_walls");
	
	/**********************Forge***********************/
	public static final Tag.Named<Block> CLAY_BRICKS = BlockTags.bind("forge:clay_bricks");
	public static final Tag.Named<Block> REDSTONE_LAMPS = BlockTags.bind("forge:redstone_lamps");
	public static final Tag.Named<Block> CARVED_PUMPKINS = BlockTags.bind("forge:carved_pumpkins");
	public static final Tag.Named<Block> JACK_O_LANTERNS = BlockTags.bind("forge:jack_o_lanterns");
	public static final Tag.Named<Block> STAINED_PLANKS = BlockTags.bind("forge:stained_planks");
	public static final Tag.Named<Block> GLASS_WINDOWS = BlockTags.bind("forge:glass_windows");
	public static final Tag.Named<Block> TINTED_GLASS = BlockTags.bind("forge:glass/tinted");
	
	public static final Tag.Named<Block> CLAY_BRICK_SLABS = BlockTags.bind("forge:clay_brick_slabs");
	public static final Tag.Named<Block> CONCRETE_SLABS = BlockTags.bind("forge:concrete_slabs");
	public static final Tag.Named<Block> GLASS_SLABS = BlockTags.bind("forge:glass_slabs");
	public static final Tag.Named<Block> STAINED_PLANK_SLABS = BlockTags.bind("forge:stained_plank_slabs");
	public static final Tag.Named<Block> TERRACOTTA_SLABS = BlockTags.bind("forge:terracotta_slabs");
	public static final Tag.Named<Block> WOOL_SLABS = BlockTags.bind("forge:wool_slabs");
	
	public static final Tag.Named<Block> CLAY_BRICK_STAIRS = BlockTags.bind("forge:clay_brick_stairs");
	public static final Tag.Named<Block> CONCRETE_STAIRS = BlockTags.bind("forge:concrete_stairs");
	public static final Tag.Named<Block> GLASS_STAIRS = BlockTags.bind("forge:glass_stairs");
	public static final Tag.Named<Block> STAINED_PLANK_STAIRS = BlockTags.bind("forge:stained_plank_stairs");
	public static final Tag.Named<Block> TERRACOTTA_STAIRS = BlockTags.bind("forge:terracotta_stairs");
	public static final Tag.Named<Block> WOOL_STAIRS = BlockTags.bind("forge:wool_stairs");
	
	public static final Tag.Named<Block> CLAY_BRICK_WALLS = BlockTags.bind("forge:clay_brick_walls");
	
	public static final Tag.Named<Block> NETHER_BRICK_FENCE_GATES = BlockTags.bind("forge:fence_gates/nether_brick");
	
	public static final Tag.Named<Block> SOUL_GLASS_PANES = BlockTags.bind("forge:glass_panes/soul");
	public static final Tag.Named<Block> TINTED_GLASS_PANES = BlockTags.bind("forge:glass_panes/tinted");
	public static final Tag.Named<Block> GLASS_WINDOW_PANES = BlockTags.bind("forge:glass_window_panes");
	
	public static final Tag.Named<Block> SOUL_GLASS = BlockTags.bind("forge:glass/soul");
	
	public BlockTagsGenerator(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
		super(generatorIn, CutAndColored.MODID, existingFileHelper);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected void addTags() {
		
		vanillaDyedTags();
		flaboyantDyedTags();
		
		/**********************Minecraft***********************/
		tag(BlockTags.IMPERMEABLE).add(ModBlocks.SOUL_GLASS).addTags(GLASS_SLABS, GLASS_STAIRS, GLASS_WINDOWS);
		tag(BlockTags.PLANKS).addTag(STAINED_PLANKS);
		tag(BlockTags.SLABS).addTags(CONCRETE_SLABS, GLASS_SLABS, TERRACOTTA_SLABS, WOOL_SLABS)// .addOptionalTag(FLAMBOYANT_STAINED_PLANK_SLABS.getName())
				.add(ModBlocks.CRACKED_STONE_BRICK_SLAB, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB,
						ModBlocks.CRACKED_NETHER_BRICK_SLAB, ModBlocks.SOUL_SANDSTONE_SLAB,
						ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, ModBlocks.CUT_SOUL_SANDSTONE_SLAB,
						ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICK_SLAB,
						ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB,
						ModBlocks.QUARTZ_BRICK_SLAB, ModBlocks.CALCITE_SLAB, ModBlocks.TUFF_SLAB,
						ModBlocks.RAW_IRON_SLAB, ModBlocks.RAW_GOLD_SLAB, ModBlocks.RAW_COPPER_SLAB);
		tag(BlockTags.STAIRS).addTags(CONCRETE_STAIRS, GLASS_STAIRS, TERRACOTTA_STAIRS, WOOL_STAIRS)// .addOptionalTag(FLAMBOYANT_STAINED_PLANK_STAIRS.getName())
				.add(ModBlocks.SMOOTH_STONE_STAIRS, ModBlocks.CRACKED_STONE_BRICK_STAIRS,
						ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS,
						ModBlocks.SOUL_SANDSTONE_STAIRS, ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS,
						ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICK_STAIRS,
						ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS,
						ModBlocks.QUARTZ_BRICK_STAIRS, ModBlocks.CALCITE_STAIRS, ModBlocks.TUFF_STAIRS,
						ModBlocks.RAW_IRON_STAIRS, ModBlocks.RAW_GOLD_STAIRS, ModBlocks.RAW_COPPER_STAIRS);
		tag(BlockTags.WALLS).addTag(CLAY_BRICK_WALLS).add(ModBlocks.SOUL_SANDSTONE_WALL, ModBlocks.GRANITE_BRICK_WALL,
				ModBlocks.DIORITE_BRICK_WALL, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.PURPUR_WALL,
				ModBlocks.PRISMARINE_BRICK_WALL, ModBlocks.DARK_PRISMARINE_WALL, ModBlocks.CRACKED_STONE_BRICK_WALL,
				ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, ModBlocks.CRACKED_NETHER_BRICK_WALL,
				ModBlocks.SMOOTH_STONE_WALL, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL,
				ModBlocks.CRACKED_DEEPSLATE_TILE_WALL, ModBlocks.QUARTZ_BRICK_WALL, ModBlocks.CALCITE_WALL,
				ModBlocks.TUFF_WALL);
		tag(BlockTags.WOODEN_SLABS).addTag(STAINED_PLANK_SLABS);
		tag(BlockTags.WOODEN_STAIRS).addTag(STAINED_PLANK_STAIRS);
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
				.addTags(CLAY_BRICK_SLABS, CLAY_BRICK_STAIRS, CLAY_BRICKS, CONCRETE_SLABS, CONCRETE_STAIRS, GLASS_SLABS,
						GLASS_STAIRS, REDSTONE_LAMPS, TERRACOTTA_SLABS, TERRACOTTA_STAIRS, NETHER_BRICK_FENCE_GATES,
						SOUL_GLASS, SOUL_GLASS_PANES, TINTED_GLASS_PANES, GLASS_WINDOWS, GLASS_WINDOW_PANES)
				.add(ModBlocks.GLASSCUTTER, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICK_STAIRS,
						ModBlocks.ANDESITE_BRICKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICK_STAIRS,
						ModBlocks.DIORITE_BRICKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICK_STAIRS,
						ModBlocks.GRANITE_BRICKS, ModBlocks.CHISELED_SOUL_SANDSTONE, ModBlocks.CUT_SOUL_SANDSTONE,
						ModBlocks.CUT_SOUL_SANDSTONE_SLAB, ModBlocks.SMOOTH_SOUL_SANDSTONE,
						ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS,
						ModBlocks.SOUL_SANDSTONE, ModBlocks.SOUL_SANDSTONE_SLAB, ModBlocks.SOUL_SANDSTONE_STAIRS,
						ModBlocks.CHISELED_PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_PILLAR,
						ModBlocks.POLISHED_BLACKSTONE_PILLAR, ModBlocks.END_STONE_BRICK_PILLAR,
						ModBlocks.POLISHED_END_STONE, ModBlocks.CHISELED_END_STONE_BRICKS, ModBlocks.POLISHED_STONE,
						ModBlocks.SMOOTH_STONE_STAIRS, ModBlocks.CRACKED_STONE_BRICK_STAIRS,
						ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS,
						ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS,
						ModBlocks.QUARTZ_BRICK_STAIRS, ModBlocks.CALCITE_STAIRS, ModBlocks.TUFF_STAIRS,
						ModBlocks.CRACKED_STONE_BRICK_SLAB, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB,
						ModBlocks.CRACKED_NETHER_BRICK_SLAB, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB,
						ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, ModBlocks.QUARTZ_BRICK_SLAB, ModBlocks.CALCITE_SLAB,
						ModBlocks.TUFF_SLAB, ModBlocks.NETHER_BRICK_FENCE_GATE, ModBlocks.IRON_FENCE_GATE,
						ModBlocks.RAW_IRON_SLAB, ModBlocks.RAW_IRON_STAIRS, ModBlocks.RAW_GOLD_SLAB,
						ModBlocks.RAW_GOLD_STAIRS, ModBlocks.RAW_COPPER_SLAB, ModBlocks.RAW_COPPER_STAIRS,
						ModBlocks.SOUL_GLASS_STAIRS, ModBlocks.SOUL_GLASS_SLAB)
				.addOptional(ModBlocks.HORIZONTAL_SOUL_GLASS_PANE.getRegistryName());
		tag(BlockTags.MINEABLE_WITH_AXE).addTags(STAINED_PLANK_SLABS, STAINED_PLANK_STAIRS, STAINED_PLANKS)
				.add(ModBlocks.WEAVER, ModBlocks.SAWMILL);
		
		/**********************Forge***********************/
		tag(CLAY_BRICK_SLABS).add(Blocks.BRICK_SLAB).addTag(VANILLA_STAINED_BRICK_SLABS);//.addOptionalTag(FLAMBOYANT_STAINED_BRICK_SLABS.getName());
		tag(CLAY_BRICK_STAIRS).add(Blocks.BRICK_STAIRS).addTag(VANILLA_STAINED_BRICK_STAIRS);//.addOptionalTag(FLAMBOYANT_STAINED_BRICK_STAIRS.getName());
		tag(CLAY_BRICK_WALLS).add(Blocks.BRICK_WALL).addTag(VANILLA_STAINED_BRICK_WALLS);//.addOptionalTag(FLAMBOYANT_STAINED_BRICK_WALLS.getName());
		tag(CLAY_BRICKS).add(Blocks.BRICKS).addTag(VANILLA_STAINED_BRICKS);//.addOptionalTag(FLAMBOYANT_STAINED_BRICKS.getName());
		tag(CONCRETE_SLABS).addTag(VANILLA_CONCRETE_SLABS);//.addOptionalTag(FLAMBOYANT_CONCRETE_SLABS.getName());
		tag(CONCRETE_STAIRS).addTag(VANILLA_CONCRETE_STAIRS);//.addOptionalTag(FLAMBOYANT_CONCRETE_STAIRS.getName());
		tag(GLASS_SLABS).add(ModBlocks.GLASS_SLAB).addTag(VANILLA_STAINED_GLASS_SLABS);//.addOptionalTag(FLAMBOYANT_STAINED_GLASS_SLABS.getName());
		tag(GLASS_STAIRS).add(ModBlocks.GLASS_STAIRS).addTag(VANILLA_STAINED_GLASS_STAIRS);//.addOptionalTag(FLAMBOYANT_STAINED_GLASS_STAIRS.getName());
		tag(GLASS_WINDOWS).add(ModBlocks.GLASS_WINDOW).addTag(VANILLA_STAINED_GLASS_WINDOWS);
		tag(GLASS_WINDOW_PANES).add(ModBlocks.GLASS_WINDOW_PANE).addTag(VANILLA_STAINED_GLASS_WINDOW_PANES);
		tag(REDSTONE_LAMPS).add(Blocks.REDSTONE_LAMP).addTag(VANILLA_REDSTONE_LAMPS);//.addOptionalTag(FLAMBOYANT_REDSTONE_LAMPS.getName());
		tag(CARVED_PUMPKINS).add(Blocks.CARVED_PUMPKIN);
		tag(JACK_O_LANTERNS).add(Blocks.JACK_O_LANTERN);
		tag(TERRACOTTA_SLABS).add(ModBlocks.TERRACOTTA_SLAB).addTag(VANILLA_TERRACOTTA_SLABS);//.addOptionalTag(FLAMBOYANT_TERRACOTTA_SLABS.getName());
		tag(TERRACOTTA_STAIRS).add(ModBlocks.TERRACOTTA_STAIRS).addTag(VANILLA_TERRACOTTA_STAIRS);//.addOptionalTag(FLAMBOYANT_TERRACOTTA_STAIRS.getName());
		tag(WOOL_SLABS).addTag(VANILLA_WOOL_SLABS);//.addOptionalTag(FLAMBOYANT_WOOL_SLABS.getName());
		tag(WOOL_STAIRS).addTag(VANILLA_WOOL_STAIRS);//.addOptionalTag(FLAMBOYANT_WOOL_STAIRS.getName());
		tag(STAINED_PLANK_SLABS).addTag(VANILLA_STAINED_PLANK_SLABS);//.addOptionalTag(FLAMBOYANT_STAINED_PLANK_SLABS.getName());
		tag(STAINED_PLANK_STAIRS).addTag(VANILLA_STAINED_PLANK_STAIRS);//.addOptionalTag(FLAMBOYANT_STAINED_PLANK_STAIRS.getName());
		tag(STAINED_PLANKS).addTag(VANILLA_STAINED_PLANKS);//.addOptionalTag(FLAMBOYANT_STAINED_PLANKS.getName());
		tag(NETHER_BRICK_FENCE_GATES).add(ModBlocks.NETHER_BRICK_FENCE_GATE);
		tag(SOUL_GLASS).add(ModBlocks.SOUL_GLASS, ModBlocks.SOUL_GLASS_WINDOW);
		tag(SOUL_GLASS_PANES).add(ModBlocks.SOUL_GLASS_PANE, ModBlocks.SOUL_GLASS_WINDOW_PANE);
		tag(TINTED_GLASS).add(Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_WINDOW);
		tag(TINTED_GLASS_PANES).add(ModBlocks.TINTED_GLASS_PANE, ModBlocks.TINTED_GLASS_WINDOW_PANE);
		
		tag(Tags.Blocks.GLASS_COLORLESS).add(ModBlocks.GLASS_WINDOW);
		tag(Tags.Blocks.GLASS_PANES_COLORLESS).add(ModBlocks.GLASS_WINDOW_PANE);
		tag(Tags.Blocks.STAINED_GLASS).addTag(VANILLA_STAINED_GLASS_WINDOWS);
		tag(Tags.Blocks.STAINED_GLASS_PANES).addTag(VANILLA_STAINED_GLASS_WINDOW_PANES);
		tag(Tags.Blocks.SANDSTONE).add(ModBlocks.SOUL_SANDSTONE, ModBlocks.CUT_SOUL_SANDSTONE,
				ModBlocks.CHISELED_SOUL_SANDSTONE, ModBlocks.SMOOTH_SOUL_SANDSTONE);
		
//		for (int i = 0; i < 23; i++) {
//			tag(CARVED_PUMPKINS).addOptional(new ResourceLocation("omgourd", "carved_pumpkin_" + (i + 1)));
//		}
//		for (int i = 0; i < 23; i++) {
//			tag(JACK_O_LANTERNS).addOptional(new ResourceLocation("omgourd", "jack_o_lantern_" + (i + 1)));
//		}
	}
	
	private void vanillaDyedTags() {
		for (int i = 0; i < DyeColor.values().length; i++) {
			String color = DyeColor.byId(i).getName();
			int i1 = ModBlocks.allBlocks.size() - 1;
			while (i1 >= 0) {
				if (ModBlocks.allBlocks.get(i1).getRegistryName().getPath().contains(color)) {
					coloredBlocks.add(ModBlocks.allBlocks.get(i1));
				}
				i1--;
			}
			tag(BlockTags.bind("forge:glass/" + color)).add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(CutAndColored.MODID, color + "_stained_glass_window")));
			tag(BlockTags.bind("forge:glass_panes/" + color)).add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(CutAndColored.MODID, color + "_stained_glass_window_pane")));
		}
		for (int i = 0; i < coloredBlocks.size(); i++) {
			Block block = coloredBlocks.get(i);
			String name = block.getRegistryName().getPath();
			if (name.contains("concrete")) {
				if (name.contains("slab")) {
					tag(VANILLA_CONCRETE_SLABS).add(block);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_CONCRETE_STAIRS).add(block);
				}
			}
			else if (name.contains("redstone_lamp")) {
				tag(VANILLA_REDSTONE_LAMPS).add(block);
			}
			else if (name.contains("stained_brick")) {
				if (name.contains("slab")) {
					tag(VANILLA_STAINED_BRICK_SLABS).add(block);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_STAINED_BRICK_STAIRS).add(block);
				}
				else if (name.contains("wall")) {
					tag(VANILLA_STAINED_BRICK_WALLS).add(block);
				}
				else if (name.contains("bricks")) {
					tag(VANILLA_STAINED_BRICKS).add(block);
				}
			}
			else if (name.contains("stained_glass")) {
				if (name.contains("slab")) {
					tag(VANILLA_STAINED_GLASS_SLABS).add(block);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_STAINED_GLASS_STAIRS).add(block);
				}
				else if (name.contains("window")) {
					if (name.contains("pane")) {
						tag(VANILLA_STAINED_GLASS_WINDOW_PANES).add(block);
					}
					else {
						tag(VANILLA_STAINED_GLASS_WINDOWS).add(block);
					}
				}
			}
			else if (name.contains("stained_plank")) {
				if (name.contains("slab")) {
					tag(VANILLA_STAINED_PLANK_SLABS).add(block);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_STAINED_PLANK_STAIRS).add(block);
				}
				else if (name.contains("planks")) {
					tag(VANILLA_STAINED_PLANKS).add(block);
				}
			}
			else if (name.contains("terracotta")) {
				if (name.contains("slab")) {
					tag(VANILLA_TERRACOTTA_SLABS).add(block);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_TERRACOTTA_STAIRS).add(block);
				}
			}
			else if (name.contains("wool")) {
				if (name.contains("slab")) {
					tag(VANILLA_WOOL_SLABS).add(block);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_WOOL_STAIRS).add(block);
				}
			}
		}
	}
	
	private void flaboyantDyedTags() {
//		for (int i = 0; i < FlamboyantDyeColors.values().length; i++) {
//		int i1 = ModBlocks.allBlocks.size() - 1;
//		while (i1 >= 0) {
//			if (ModBlocks.allBlocks.get(i1).getRegistryName().getPath().contains(FlamboyantDyeColors.byId(i).getName())) {
//				fColoredBlocks.add(ModBlocks.allBlocks.get(i1));
//			}
//			i1--;
//		}
//	}
//		for (int i = 0; i < fColoredBlocks.size(); i++) {
//			Block block = fColoredBlocks.get(i);
//			String name = block.getRegistryName().getPath();
//			if (name.contains("concrete")) {
//				if (name.contains("slab")) {
//					tag(FLAMBOYANT_CONCRETE_SLABS).addOptional(block.getRegistryName());
//				}
//				else if (name.contains("stairs")) {
//					tag(FLAMBOYANT_CONCRETE_STAIRS).addOptional(block.getRegistryName());
//				}
//			}
//			else if (name.contains("redstone_lamp")) {
//				tag(FLAMBOYANT_REDSTONE_LAMPS).addOptional(block.getRegistryName());
//			}
//			else if (name.contains("stained_brick")) {
//				if (name.contains("slab")) {
//					tag(FLAMBOYANT_STAINED_BRICK_SLABS).addOptional(block.getRegistryName());
//				}
//				else if (name.contains("stairs")) {
//					tag(FLAMBOYANT_STAINED_BRICK_STAIRS).addOptional(block.getRegistryName());
//				}
//				else if (name.contains("wall")) {
//					tag(FLAMBOYANT_STAINED_BRICK_WALLS).addOptional(block.getRegistryName());
//				}
//				else if (name.contains("bricks")) {
//					tag(FLAMBOYANT_STAINED_BRICKS).addOptional(block.getRegistryName());
//				}
//			}
//			else if (name.contains("stained_glass")) {
//				if (name.contains("slab")) {
//					tag(FLAMBOYANT_STAINED_GLASS_SLABS).addOptional(block.getRegistryName());
//				}
//				else if (name.contains("stairs")) {
//					tag(FLAMBOYANT_STAINED_GLASS_STAIRS).addOptional(block.getRegistryName());
//				}
//			}
//			else if (name.contains("stained_plank")) {
//				if (name.contains("slab")) {
//					tag(FLAMBOYANT_STAINED_PLANK_SLABS).addOptional(block.getRegistryName());
//				}
//				else if (name.contains("stairs")) {
//					tag(FLAMBOYANT_STAINED_PLANK_STAIRS).addOptional(block.getRegistryName());
//				}
//				else if (name.contains("planks")) {
//					tag(FLAMBOYANT_STAINED_PLANKS).addOptional(block.getRegistryName());
//				}
//			}
//			else if (name.contains("terracotta")) {
//				if (name.contains("slab")) {
//					tag(FLAMBOYANT_TERRACOTTA_SLABS).addOptional(block.getRegistryName());
//				}
//				else if (name.contains("stairs")) {
//					tag(FLAMBOYANT_TERRACOTTA_STAIRS).addOptional(block.getRegistryName());
//				}
//			}
//			else if (name.contains("wool")) {
//				if (name.contains("slab")) {
//					tag(FLAMBOYANT_WOOL_SLABS).addOptional(block.getRegistryName());
//				}
//				else if (name.contains("stairs")) {
//					tag(FLAMBOYANT_WOOL_STAIRS).addOptional(block.getRegistryName());
//				}
//			}
//		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored block tags";
	}
}
