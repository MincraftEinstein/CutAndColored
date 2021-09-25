package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagsGenerator extends ItemTagsProvider {
	
	private List<Item> coloredItems = new ArrayList<Item>();
//	private List<Item> fColoredItems = new ArrayList<Item>();
	
	/**********************Mod***********************/
	public static final Tag.Named<Item> VANILLA_STAINED_BRICKS = ItemTags.bind(CutAndColored.MODID + ":vanilla_stained_bricks");
	public static final Tag.Named<Item> VANILLA_STAINED_PLANKS = ItemTags.bind(CutAndColored.MODID + ":vanilla_stained_planks");
	public static final Tag.Named<Item> VANILLA_REDSTONE_LAMPS = ItemTags.bind(CutAndColored.MODID + ":vanilla_redstone_lamps");
	
	public static final Tag.Named<Item> VANILLA_CONCRETE_SLABS = ItemTags.bind(CutAndColored.MODID + ":vanilla_concrete_slabs");
	public static final Tag.Named<Item> VANILLA_STAINED_BRICK_SLABS = ItemTags.bind(CutAndColored.MODID + ":vanilla_stained_brick_slabs");
	public static final Tag.Named<Item> VANILLA_STAINED_GLASS_SLABS = ItemTags.bind(CutAndColored.MODID + ":vanilla_stained_glass_slabs");
	public static final Tag.Named<Item> VANILLA_STAINED_PLANK_SLABS = ItemTags.bind(CutAndColored.MODID + ":vanilla_plank_slabs");
	public static final Tag.Named<Item> VANILLA_TERRACOTTA_SLABS = ItemTags.bind(CutAndColored.MODID + ":vanilla_terracotta_slabs");
	public static final Tag.Named<Item> VANILLA_WOOL_SLABS = ItemTags.bind(CutAndColored.MODID + ":vanilla_wool_slabs");
	
	public static final Tag.Named<Item> VANILLA_CONCRETE_STAIRS = ItemTags.bind(CutAndColored.MODID + ":vanilla_concrete_stairs");
	public static final Tag.Named<Item> VANILLA_STAINED_BRICK_STAIRS = ItemTags.bind(CutAndColored.MODID + ":vanilla_stained_brick_stairs");
	public static final Tag.Named<Item> VANILLA_STAINED_GLASS_STAIRS = ItemTags.bind(CutAndColored.MODID + ":vanilla_stained_glass_stairs");
	public static final Tag.Named<Item> VANILLA_STAINED_PLANK_STAIRS = ItemTags.bind(CutAndColored.MODID + ":vanilla_plank_stairs");
	public static final Tag.Named<Item> VANILLA_TERRACOTTA_STAIRS = ItemTags.bind(CutAndColored.MODID + ":vanilla_terracotta_stairs");
	public static final Tag.Named<Item> VANILLA_WOOL_STAIRS = ItemTags.bind(CutAndColored.MODID + ":vanilla_wool_stairs");
	
	public static final Tag.Named<Item> VANILLA_STAINED_BRICK_WALLS = ItemTags.bind(CutAndColored.MODID + ":vanilla_stained_brick_walls");
	
	/**********************Flamboyant***********************/
//	public static final Tag.Named<Item> FLAMBOYANT_REDSTONE_LAMPS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_redstone_lamps");
//	public static final Tag.Named<Item> FLAMBOYANT_STAINED_BRICKS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_stained_bricks");
//	public static final Tag.Named<Item> FLAMBOYANT_STAINED_PLANKS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_stained_planks");
	
//	public static final Tag.Named<Item> FLAMBOYANT_CONCRETE_SLABS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_concrete_slabs");
//	public static final Tag.Named<Item> FLAMBOYANT_STAINED_BRICK_SLABS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_stained_brick_slabs");
//	public static final Tag.Named<Item> FLAMBOYANT_STAINED_GLASS_SLABS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_stained_glass_slabs");
//	public static final Tag.Named<Item> FLAMBOYANT_STAINED_PLANK_SLABS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_plank_slabs");
//	public static final Tag.Named<Item> FLAMBOYANT_TERRACOTTA_SLABS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_terracotta_slabs");
//	public static final Tag.Named<Item> FLAMBOYANT_WOOL_SLABS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_wool_slabs");
	
//	public static final Tag.Named<Item> FLAMBOYANT_CONCRETE_STAIRS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_concrete_stairs");
//	public static final Tag.Named<Item> FLAMBOYANT_STAINED_BRICK_STAIRS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_stained_brick_stairs");
//	public static final Tag.Named<Item> FLAMBOYANT_STAINED_GLASS_STAIRS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_stained_glass_stairs");
//	public static final Tag.Named<Item> FLAMBOYANT_STAINED_PLANK_STAIRS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_plank_stairs");
//	public static final Tag.Named<Item> FLAMBOYANT_TERRACOTTA_STAIRS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_terracotta_stairs");
//	public static final Tag.Named<Item> FLAMBOYANT_WOOL_STAIRS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_wool_stairs");
	
//	public static final Tag.Named<Item> FLAMBOYANT_STAINED_BRICK_WALLS = ItemTags.bind(CutAndColored.MODID + ":flamboyant_stained_brick_walls");
	
	/**********************Forge***********************/
	public static final Tag.Named<Item> CLAY_BRICKS = ItemTags.bind("forge:clay_bricks");
	public static final Tag.Named<Item> REDSTONE_LAMPS = ItemTags.bind("forge:redstone_lamps");
	public static final Tag.Named<Item> CARVED_PUMPKINS = ItemTags.bind("forge:carved_pumpkins");
	public static final Tag.Named<Item> JACK_O_LANTERNS = ItemTags.bind("forge:jack_o_lanterns");
	public static final Tag.Named<Item> STAINED_PLANKS = ItemTags.bind("forge:stained_planks");
	
	public static final Tag.Named<Item> CLAY_BRICK_SLABS = ItemTags.bind("forge:clay_brick_slabs");
	public static final Tag.Named<Item> CONCRETE_SLABS = ItemTags.bind("forge:concrete_slabs");
	public static final Tag.Named<Item> GLASS_SLABS = ItemTags.bind("forge:glass_slabs");
	public static final Tag.Named<Item> STAINED_PLANK_SLABS = ItemTags.bind("forge:stained_plank_slabs");
	public static final Tag.Named<Item> TERRACOTTA_SLABS = ItemTags.bind("forge:terracotta_slabs");
	public static final Tag.Named<Item> WOOL_SLABS = ItemTags.bind("forge:wool_slabs");
	
	public static final Tag.Named<Item> CLAY_BRICK_STAIRS = ItemTags.bind("forge:clay_brick_stairs");
	public static final Tag.Named<Item> CONCRETE_STAIRS = ItemTags.bind("forge:concrete_stairs");
	public static final Tag.Named<Item> GLASS_STAIRS = ItemTags.bind("forge:glass_stairs");
	public static final Tag.Named<Item> STAINED_PLANK_STAIRS = ItemTags.bind("forge:stained_plank_stairs");
	public static final Tag.Named<Item> TERRACOTTA_STAIRS = ItemTags.bind("forge:terracotta_stairs");
	public static final Tag.Named<Item> WOOL_STAIRS = ItemTags.bind("forge:wool_stairs");
	
	public static final Tag.Named<Item> CLAY_BRICK_WALLS = ItemTags.bind("forge:clay_brick_walls");
	
	public static final Tag.Named<Item> NETHER_BRICK_FENCE_GATES = ItemTags.bind("forge:fence_gates/nether_brick");
	
	public static final Tag.Named<Item> SOUL_GLASS_PANES = ItemTags.bind("forge:glass_panes/soul");
	public static final Tag.Named<Item> TINTED_GLASS_PANES = ItemTags.bind("forge:glass_panes/tinted");
	
	public static final Tag.Named<Item> SOUL_GLASS = ItemTags.bind("forge:glass/soul");
	
	public ItemTagsGenerator(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
		super(dataGenerator, blockTagProvider, CutAndColored.MODID, existingFileHelper);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected void addTags() {
//		for (int i = 0; i < FlamboyantDyeColors.values().length; i++) {
//			int i1 = ModBlocks.allBlocks.size() - 1;
//			while (i1 >= 0) {
//				if (ModBlocks.allBlocks.get(i1).getRegistryName().getPath().contains(FlamboyantDyeColors.byId(i).getName())) {
//					fColoredItems.add(ModBlocks.allBlocks.get(i1).asItem());
//				}
//				i1--;
//			}
//		}
		for (int i = 0; i < DyeColor.values().length; i++) {
			int i1 = ModBlocks.allBlocks.size() - 1;
			while (i1 >= 0) {
				if (ModBlocks.allBlocks.get(i1).getRegistryName().getPath().contains(DyeColor.byId(i).getName())) {
					coloredItems.add(ModBlocks.allBlocks.get(i1).asItem());
				}
				i1--;
			}
		}
		
		vanillaDyedTags();
//		flaboyantDyedTags();
		
		/**********************Minecraft***********************/
		tag(ItemTags.PLANKS).addTag(STAINED_PLANKS);
		tag(ItemTags.SLABS).addTags(CONCRETE_SLABS, GLASS_SLABS, TERRACOTTA_SLABS, WOOL_SLABS)// .addOptionalTag(FLAMBOYANT_STAINED_PLANK_SLABS.getName())
				.add(ModBlocks.CRACKED_STONE_BRICK_SLAB.asItem(),
						ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.asItem(),
						ModBlocks.CRACKED_NETHER_BRICK_SLAB.asItem(), ModBlocks.SOUL_SANDSTONE_SLAB.asItem(),
						ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.asItem(), ModBlocks.CUT_SOUL_SANDSTONE_SLAB.asItem(),
						ModBlocks.GRANITE_BRICK_SLAB.asItem(), ModBlocks.DIORITE_BRICK_SLAB.asItem(),
						ModBlocks.ANDESITE_BRICK_SLAB.asItem(), ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.asItem(),
						ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.asItem(), ModBlocks.QUARTZ_BRICK_SLAB.asItem(),
						ModBlocks.CALCITE_SLAB.asItem(), ModBlocks.TUFF_SLAB.asItem(), ModBlocks.RAW_IRON_SLAB.asItem(),
						ModBlocks.RAW_GOLD_SLAB.asItem(), ModBlocks.RAW_COPPER_SLAB.asItem());
		tag(ItemTags.STAIRS).addTags(CONCRETE_STAIRS, GLASS_STAIRS, TERRACOTTA_STAIRS, WOOL_STAIRS)// .addOptionalTag(FLAMBOYANT_STAINED_PLANK_STAIRS.getName())
				.add(ModBlocks.SMOOTH_STONE_STAIRS.asItem(), ModBlocks.CRACKED_STONE_BRICK_STAIRS.asItem(),
						ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.asItem(),
						ModBlocks.CRACKED_NETHER_BRICK_STAIRS.asItem(), ModBlocks.SOUL_SANDSTONE_STAIRS.asItem(),
						ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.asItem(), ModBlocks.GRANITE_BRICK_STAIRS.asItem(),
						ModBlocks.DIORITE_BRICK_STAIRS.asItem(), ModBlocks.ANDESITE_BRICK_STAIRS.asItem(),
						ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.asItem(),
						ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.asItem(), ModBlocks.QUARTZ_BRICK_STAIRS.asItem(),
						ModBlocks.CALCITE_STAIRS.asItem(), ModBlocks.TUFF_STAIRS.asItem(),
						ModBlocks.RAW_IRON_STAIRS.asItem(), ModBlocks.RAW_GOLD_STAIRS.asItem(),
						ModBlocks.RAW_COPPER_STAIRS.asItem());
		tag(ItemTags.WALLS).addTag(CLAY_BRICK_WALLS).add(ModBlocks.SOUL_SANDSTONE_WALL.asItem(),
				ModBlocks.GRANITE_BRICK_WALL.asItem(), ModBlocks.DIORITE_BRICK_WALL.asItem(),
				ModBlocks.ANDESITE_BRICK_WALL.asItem(), ModBlocks.PURPUR_WALL.asItem(),
				ModBlocks.PRISMARINE_BRICK_WALL.asItem(), ModBlocks.DARK_PRISMARINE_WALL.asItem(),
				ModBlocks.CRACKED_STONE_BRICK_WALL.asItem(), ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.asItem(),
				ModBlocks.CRACKED_NETHER_BRICK_WALL.asItem(), ModBlocks.SMOOTH_STONE_WALL.asItem(),
				ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.asItem(), ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.asItem(),
				ModBlocks.QUARTZ_BRICK_WALL.asItem(), ModBlocks.CALCITE_WALL.asItem(), ModBlocks.TUFF_WALL.asItem());
		tag(ItemTags.WOODEN_SLABS).addTag(STAINED_PLANK_SLABS);
		tag(ItemTags.WOODEN_STAIRS).addTag(STAINED_PLANK_STAIRS);
		
		/**********************Forge***********************/
		tag(CLAY_BRICK_SLABS).add(Items.BRICK_SLAB).addTag(VANILLA_STAINED_BRICK_SLABS);//.addOptionalTag(FLAMBOYANT_STAINED_BRICK_SLABS.getName());
		tag(CLAY_BRICK_STAIRS).add(Items.BRICK_STAIRS).addTag(VANILLA_STAINED_BRICK_STAIRS);//.addOptionalTag(FLAMBOYANT_STAINED_BRICK_STAIRS.getName());
		tag(CLAY_BRICK_WALLS).add(Items.BRICK_WALL).addTag(VANILLA_STAINED_BRICK_WALLS);//.addOptionalTag(FLAMBOYANT_STAINED_BRICK_WALLS.getName());
		tag(CLAY_BRICKS).add(Items.BRICKS).addTag(VANILLA_STAINED_BRICKS);//.addOptionalTag(FLAMBOYANT_STAINED_BRICKS.getName());
		tag(CONCRETE_SLABS).addTag(VANILLA_CONCRETE_SLABS);//.addOptionalTag(FLAMBOYANT_CONCRETE_SLABS.getName());
		tag(CONCRETE_STAIRS).addTag(VANILLA_CONCRETE_STAIRS);//.addOptionalTag(FLAMBOYANT_CONCRETE_STAIRS.getName());
		tag(GLASS_SLABS).add(ModBlocks.GLASS_SLAB.asItem()).add(ModBlocks.SOUL_GLASS_SLAB.asItem()).add(ModBlocks.TINTED_GLASS_SLAB.asItem()).addTag(VANILLA_STAINED_GLASS_SLABS);//.addOptionalTag(FLAMBOYANT_STAINED_GLASS_SLABS.getName());
		tag(GLASS_STAIRS).add(ModBlocks.GLASS_STAIRS.asItem()).add(ModBlocks.SOUL_GLASS_STAIRS.asItem()).add(ModBlocks.TINTED_GLASS_STAIRS.asItem()).addTag(VANILLA_STAINED_GLASS_STAIRS);//.addOptionalTag(FLAMBOYANT_STAINED_GLASS_STAIRS.getName());
		tag(REDSTONE_LAMPS).add(Items.REDSTONE_LAMP).addTag(VANILLA_REDSTONE_LAMPS);//.addOptionalTag(FLAMBOYANT_REDSTONE_LAMPS.getName());
		tag(CARVED_PUMPKINS).add(Items.CARVED_PUMPKIN);
		tag(JACK_O_LANTERNS).add(Items.JACK_O_LANTERN);
		tag(TERRACOTTA_SLABS).addTag(VANILLA_TERRACOTTA_SLABS);//.addOptionalTag(FLAMBOYANT_TERRACOTTA_SLABS.getName());
		tag(TERRACOTTA_STAIRS).addTag(VANILLA_TERRACOTTA_STAIRS);//.addOptionalTag(FLAMBOYANT_TERRACOTTA_STAIRS.getName());
		tag(WOOL_SLABS).addTag(VANILLA_WOOL_SLABS);//.addOptionalTag(FLAMBOYANT_WOOL_SLABS.getName());
		tag(WOOL_STAIRS).addTag(VANILLA_WOOL_STAIRS);//.addOptionalTag(FLAMBOYANT_WOOL_STAIRS.getName());
		tag(STAINED_PLANK_SLABS).addTag(VANILLA_STAINED_PLANK_SLABS);//.addOptionalTag(FLAMBOYANT_STAINED_PLANK_SLABS.getName());
		tag(STAINED_PLANK_STAIRS).addTag(VANILLA_STAINED_PLANK_STAIRS);//.addOptionalTag(FLAMBOYANT_STAINED_PLANK_STAIRS.getName());
		tag(STAINED_PLANKS).addTag(VANILLA_STAINED_PLANKS);//.addOptionalTag(FLAMBOYANT_STAINED_PLANKS.getName());
		tag(NETHER_BRICK_FENCE_GATES).add(ModBlocks.NETHER_BRICK_FENCE_GATE.asItem());
		tag(SOUL_GLASS).add(ModBlocks.SOUL_GLASS.asItem());
		tag(SOUL_GLASS_PANES).add(ModBlocks.SOUL_GLASS_PANE.asItem());
		tag(TINTED_GLASS_PANES).add(ModBlocks.TINTED_GLASS_PANE.asItem());
		
		tag(Tags.Items.GLASS_PANES).add(ModBlocks.SOUL_GLASS_PANE.asItem()).add(ModBlocks.TINTED_GLASS_PANE.asItem());
		tag(Tags.Items.SANDSTONE).add(ModBlocks.SOUL_SANDSTONE.asItem(), ModBlocks.CUT_SOUL_SANDSTONE.asItem(), ModBlocks.CHISELED_SOUL_SANDSTONE.asItem(), ModBlocks.SMOOTH_SOUL_SANDSTONE.asItem());
		tag(Tags.Items.GLASS_COLORLESS).add(ModBlocks.SOUL_GLASS.asItem());
		tag(Tags.Items.GLASS_PANES_COLORLESS).add(ModBlocks.SOUL_GLASS_PANE.asItem());
		
//		for (int i = 0; i < 23; i++) {
//			tag(CARVED_PUMPKINS).addOptional(new ResourceLocation("omgourd", "carved_pumpkin_" + (i + 1)));
//		}
//		for (int i = 0; i < 23; i++) {
//			tag(JACK_O_LANTERNS).addOptional(new ResourceLocation("omgourd", "jack_o_lantern_" + (i + 1)));
//		}
	}
	
	private void vanillaDyedTags() {
		for (int i = 0; i < coloredItems.size(); i++) {
			Item item = coloredItems.get(i);
			String name = item.getRegistryName().getPath();
			if (name.contains("concrete")) {
				if (name.contains("slab")) {
					tag(VANILLA_CONCRETE_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_CONCRETE_STAIRS).add(item);
				}
			}
			else if (name.contains("redstone_lamp")) {
				tag(VANILLA_REDSTONE_LAMPS).add(item);
			}
			else if (name.contains("stained_brick")) {
				if (name.contains("slab")) {
					tag(VANILLA_STAINED_BRICK_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_STAINED_BRICK_STAIRS).add(item);
				}
				else if (name.contains("wall")) {
					tag(VANILLA_STAINED_BRICK_WALLS).add(item);
				}
				else if (name.contains("bricks")) {
					tag(VANILLA_STAINED_BRICKS).add(item);
				}
			}
			else if (name.contains("stained_glass")) {
				if (name.contains("slab")) {
					tag(VANILLA_STAINED_GLASS_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_STAINED_GLASS_STAIRS).add(item);
				}
			}
			else if (name.contains("stained_plank")) {
				if (name.contains("slab")) {
					tag(VANILLA_STAINED_PLANK_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_STAINED_PLANK_STAIRS).add(item);
				}
				else if (name.contains("planks")) {
					tag(VANILLA_STAINED_PLANKS).add(item);
				}
			}
			else if (name.contains("terracotta")) {
				if (name.contains("slab")) {
					tag(VANILLA_TERRACOTTA_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_TERRACOTTA_STAIRS).add(item);
				}
			}
			else if (name.contains("wool")) {
				if (name.contains("slab")) {
					tag(VANILLA_WOOL_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					tag(VANILLA_WOOL_STAIRS).add(item);
				}
			}
		}
	}
	
//	private void flaboyantDyedTags() {
//		for (int i = 0; i < fColoredItems.size(); i++) {
//			Item item = fColoredItems.get(i);
//			String name = item.getRegistryName().getPath();
//			if (name.contains("concrete")) {
//				if (name.contains("slab")) {
//					tag(FLAMBOYANT_CONCRETE_SLABS).addOptional(item.getRegistryName());
//				}
//				else if (name.contains("stairs")) {
//					tag(FLAMBOYANT_CONCRETE_STAIRS).addOptional(item.getRegistryName());
//				}
//			}
//			else if (name.contains("redstone_lamp")) {
//				tag(FLAMBOYANT_REDSTONE_LAMPS).addOptional(item.getRegistryName());
//			}
//			else if (name.contains("stained_brick")) {
//				if (name.contains("slab")) {
//					tag(FLAMBOYANT_STAINED_BRICK_SLABS).addOptional(item.getRegistryName());
//				}
//				else if (name.contains("stairs")) {
//					tag(FLAMBOYANT_STAINED_BRICK_STAIRS).addOptional(item.getRegistryName());
//				}
//				else if (name.contains("wall")) {
//					tag(FLAMBOYANT_STAINED_BRICK_WALLS).addOptional(item.getRegistryName());
//				}
//				else if (name.contains("bricks")) {
//					tag(FLAMBOYANT_STAINED_BRICKS).addOptional(item.getRegistryName());
//				}
//			}
//			else if (name.contains("stained_glass")) {
//				if (name.contains("slab")) {
//					tag(FLAMBOYANT_STAINED_GLASS_SLABS).addOptional(item.getRegistryName());
//				}
//				else if (name.contains("stairs")) {
//					tag(FLAMBOYANT_STAINED_GLASS_STAIRS).addOptional(item.getRegistryName());
//				}
//			}
//			else if (name.contains("stained_plank")) {
//				if (name.contains("slab")) {
//					tag(FLAMBOYANT_STAINED_PLANK_SLABS).addOptional(item.getRegistryName());
//				}
//				else if (name.contains("stairs")) {
//					tag(FLAMBOYANT_STAINED_PLANK_STAIRS).addOptional(item.getRegistryName());
//				}
//				else if (name.contains("planks")) {
//					tag(FLAMBOYANT_STAINED_PLANKS).addOptional(item.getRegistryName());
//				}
//			}
//			else if (name.contains("terracotta")) {
//				if (name.contains("slab")) {
//					tag(FLAMBOYANT_TERRACOTTA_SLABS).addOptional(item.getRegistryName());
//				}
//				else if (name.contains("stairs")) {
//					tag(FLAMBOYANT_TERRACOTTA_STAIRS).addOptional(item.getRegistryName());
//				}
//			}
//			else if (name.contains("wool")) {
//				if (name.contains("slab")) {
//					tag(FLAMBOYANT_WOOL_SLABS).addOptional(item.getRegistryName());
//				}
//				else if (name.contains("stairs")) {
//					tag(FLAMBOYANT_WOOL_STAIRS).addOptional(item.getRegistryName());
//				}
//			}
//		}
//	}
	
	@Override
	public String getName() {
		return "CutAndColored item tags";
	}
}
