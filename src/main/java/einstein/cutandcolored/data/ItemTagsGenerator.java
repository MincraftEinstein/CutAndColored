package einstein.cutandcolored.data;

import java.util.ArrayList;
import java.util.List;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.FlamboyantDyeColors;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ITag.INamedTag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagsGenerator extends ItemTagsProvider {
	
	private List<Item> coloredItems = new ArrayList<Item>();
	private List<Item> fColoredItems = new ArrayList<Item>();
	
	/**********************Mod***********************/
	public static final INamedTag<Item> VANILLA_STAINED_BRICKS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_bricks");
	public static final INamedTag<Item> VANILLA_STAINED_PLANKS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_planks");
	public static final INamedTag<Item> VANILLA_REDSTONE_LAMPS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_redstone_lamps");
	
	public static final INamedTag<Item> VANILLA_CONCRETE_SLABS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_concrete_slabs");
	public static final INamedTag<Item> VANILLA_STAINED_BRICK_SLABS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_brick_slabs");
	public static final INamedTag<Item> VANILLA_STAINED_GLASS_SLABS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_glass_slabs");
	public static final INamedTag<Item> VANILLA_STAINED_PLANK_SLABS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_plank_slabs");
	public static final INamedTag<Item> VANILLA_TERRACOTTA_SLABS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_terracotta_slabs");
	public static final INamedTag<Item> VANILLA_WOOL_SLABS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_wool_slabs");
	
	public static final INamedTag<Item> VANILLA_CONCRETE_STAIRS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_concrete_stairs");
	public static final INamedTag<Item> VANILLA_STAINED_BRICK_STAIRS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_brick_stairs");
	public static final INamedTag<Item> VANILLA_STAINED_GLASS_STAIRS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_glass_stairs");
	public static final INamedTag<Item> VANILLA_STAINED_PLANK_STAIRS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_plank_stairs");
	public static final INamedTag<Item> VANILLA_TERRACOTTA_STAIRS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_terracotta_stairs");
	public static final INamedTag<Item> VANILLA_WOOL_STAIRS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_wool_stairs");
	
	public static final INamedTag<Item> VANILLA_STAINED_BRICK_WALLS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":vanilla_stained_brick_walls");
	
	/**********************Flamboyant***********************/
	public static final INamedTag<Item> FLAMBOYANT_REDSTONE_LAMPS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_redstone_lamps");
	public static final INamedTag<Item> FLAMBOYANT_STAINED_BRICKS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_bricks");
	public static final INamedTag<Item> FLAMBOYANT_STAINED_PLANKS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_planks");
	
	public static final INamedTag<Item> FLAMBOYANT_CONCRETE_SLABS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_concrete_slabs");
	public static final INamedTag<Item> FLAMBOYANT_STAINED_BRICK_SLABS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_brick_slabs");
	public static final INamedTag<Item> FLAMBOYANT_STAINED_GLASS_SLABS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_glass_slabs");
	public static final INamedTag<Item> FLAMBOYANT_STAINED_PLANK_SLABS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_plank_slabs");
	public static final INamedTag<Item> FLAMBOYANT_TERRACOTTA_SLABS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_terracotta_slabs");
	public static final INamedTag<Item> FLAMBOYANT_WOOL_SLABS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_wool_slabs");
	
	public static final INamedTag<Item> FLAMBOYANT_CONCRETE_STAIRS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_concrete_stairs");
	public static final INamedTag<Item> FLAMBOYANT_STAINED_BRICK_STAIRS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_brick_stairs");
	public static final INamedTag<Item> FLAMBOYANT_STAINED_GLASS_STAIRS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_glass_stairs");
	public static final INamedTag<Item> FLAMBOYANT_STAINED_PLANK_STAIRS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_plank_stairs");
	public static final INamedTag<Item> FLAMBOYANT_TERRACOTTA_STAIRS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_terracotta_stairs");
	public static final INamedTag<Item> FLAMBOYANT_WOOL_STAIRS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_wool_stairs");
	
	public static final INamedTag<Item> FLAMBOYANT_STAINED_BRICK_WALLS = ItemTags.makeWrapperTag(CutAndColored.MODID + ":flamboyant_stained_brick_walls");
	
	/**********************Forge***********************/
	public static final INamedTag<Item> CLAY_BRICKS = ItemTags.makeWrapperTag("forge:clay_bricks");
	public static final INamedTag<Item> REDSTONE_LAMPS = ItemTags.makeWrapperTag("forge:redstone_lamps");
	public static final INamedTag<Item> CARVED_PUMPKINS = ItemTags.makeWrapperTag("forge:carved_pumpkins");
	public static final INamedTag<Item> JACK_O_LANTERNS = ItemTags.makeWrapperTag("forge:jack_o_lanterns");
	public static final INamedTag<Item> STAINED_PLANKS = ItemTags.makeWrapperTag("forge:stained_planks");
	
	public static final INamedTag<Item> CLAY_BRICK_SLABS = ItemTags.makeWrapperTag("forge:clay_brick_slabs");
	public static final INamedTag<Item> CONCRETE_SLABS = ItemTags.makeWrapperTag("forge:concrete_slabs");
	public static final INamedTag<Item> GLASS_SLABS = ItemTags.makeWrapperTag("forge:glass_slabs");
	public static final INamedTag<Item> STAINED_PLANK_SLABS = ItemTags.makeWrapperTag("forge:stained_plank_slabs");
	public static final INamedTag<Item> TERRACOTTA_SLABS = ItemTags.makeWrapperTag("forge:terracotta_slabs");
	public static final INamedTag<Item> WOOL_SLABS = ItemTags.makeWrapperTag("forge:wool_slabs");
	
	public static final INamedTag<Item> CLAY_BRICK_STAIRS = ItemTags.makeWrapperTag("forge:clay_brick_stairs");
	public static final INamedTag<Item> CONCRETE_STAIRS = ItemTags.makeWrapperTag("forge:concrete_stairs");
	public static final INamedTag<Item> GLASS_STAIRS = ItemTags.makeWrapperTag("forge:glass_stairs");
	public static final INamedTag<Item> STAINED_PLANK_STAIRS = ItemTags.makeWrapperTag("forge:stained_plank_stairs");
	public static final INamedTag<Item> TERRACOTTA_STAIRS = ItemTags.makeWrapperTag("forge:terracotta_stairs");
	public static final INamedTag<Item> WOOL_STAIRS = ItemTags.makeWrapperTag("forge:wool_stairs");
	
	public static final INamedTag<Item> CLAY_BRICK_WALLS = ItemTags.makeWrapperTag("forge:clay_brick_walls");
	
	public static final INamedTag<Item> NETHER_BRICK_FENCE_GATES = ItemTags.makeWrapperTag("forge:fence_gates/nether_brick");
	
	public static final INamedTag<Item> SOUL_GLASS_PANES = ItemTags.makeWrapperTag("forge:glass_panes/soul");
	
	public static final INamedTag<Item> SOUL_GLASS = ItemTags.makeWrapperTag("forge:glass/soul");
	
	public ItemTagsGenerator(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
		super(dataGenerator, blockTagProvider, CutAndColored.MODID, existingFileHelper);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected void registerTags() {
		for (int i = 0; i < FlamboyantDyeColors.values().length; i++) {
			int i1 = ModBlocks.allBlocks.size() - 1;
			while (i1 >= 0) {
				if (ModBlocks.allBlocks.get(i1).getRegistryName().getPath().contains(FlamboyantDyeColors.byId(i).getTranslationKey())) {
					fColoredItems.add(ModBlocks.allBlocks.get(i1).asItem());
				}
				i1--;
			}
		}
		for (int i = 0; i < DyeColor.values().length; i++) {
			int i1 = ModBlocks.allBlocks.size() - 1;
			while (i1 >= 0) {
				if (ModBlocks.allBlocks.get(i1).getRegistryName().getPath().contains(DyeColor.byId(i).getTranslationKey())) {
					coloredItems.add(ModBlocks.allBlocks.get(i1).asItem());
				}
				i1--;
			}
		}
		
		vanillaDyedTags();
		flaboyantDyedTags();
		
		/**********************Minecraft***********************/
		getOrCreateBuilder(ItemTags.PLANKS).addTag(STAINED_PLANKS);
		getOrCreateBuilder(ItemTags.SLABS)
				.addTags(CONCRETE_SLABS, GLASS_SLABS, FLAMBOYANT_STAINED_PLANK_SLABS, TERRACOTTA_SLABS, WOOL_SLABS)
				.add(ModBlocks.CRACKED_STONE_BRICK_SLAB.asItem(), ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.asItem(),
						ModBlocks.CRACKED_NETHER_BRICK_SLAB.asItem(), ModBlocks.SOUL_SANDSTONE_SLAB.asItem(),
						ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.asItem(), ModBlocks.CUT_SOUL_SANDSTONE_SLAB.asItem(),
						ModBlocks.GRANITE_BRICK_SLAB.asItem(), ModBlocks.DIORITE_BRICK_SLAB.asItem(), ModBlocks.ANDESITE_BRICK_SLAB.asItem());
		getOrCreateBuilder(ItemTags.STAIRS)
				.addTags(CONCRETE_STAIRS, GLASS_STAIRS, FLAMBOYANT_STAINED_PLANK_STAIRS, TERRACOTTA_STAIRS, WOOL_STAIRS)
				.add(ModBlocks.SMOOTH_STONE_STAIRS.asItem(), ModBlocks.CRACKED_STONE_BRICK_STAIRS.asItem(),
						ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.asItem(), ModBlocks.CRACKED_NETHER_BRICK_STAIRS.asItem(),
						ModBlocks.SOUL_SANDSTONE_STAIR.asItem(), ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.asItem(),
						ModBlocks.GRANITE_BRICK_STAIRS.asItem(), ModBlocks.DIORITE_BRICK_STAIRS.asItem(),
						ModBlocks.ANDESITE_BRICK_STAIRS.asItem());
		getOrCreateBuilder(ItemTags.WALLS).addTag(CLAY_BRICK_WALLS).add(ModBlocks.SOUL_SANDSTONE_WALL.asItem(),
				ModBlocks.GRANITE_BRICK_WALL.asItem(), ModBlocks.DIORITE_BRICK_WALL.asItem(), ModBlocks.ANDESITE_BRICK_WALL.asItem(),
				ModBlocks.PURPUR_WALL.asItem(), ModBlocks.PRISMARINE_BRICK_WALL.asItem(), ModBlocks.DARK_PRISMARINE_WALL.asItem(),
				ModBlocks.CRACKED_STONE_BRICK_WALL.asItem(), ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.asItem(),
				ModBlocks.CRACKED_NETHER_BRICK_WALL.asItem(), ModBlocks.SMOOTH_STONE_WALL.asItem(), ModBlocks.QUARTZ_BRICK_WALL.asItem());
		getOrCreateBuilder(ItemTags.WOODEN_SLABS).addTag(STAINED_PLANK_SLABS);
		getOrCreateBuilder(ItemTags.WOODEN_STAIRS).addTag(STAINED_PLANK_STAIRS);
		
		/**********************Forge***********************/
		getOrCreateBuilder(CLAY_BRICK_SLABS).add(Items.BRICK_SLAB).addTag(VANILLA_STAINED_BRICK_SLABS).addOptionalTag(FLAMBOYANT_STAINED_BRICK_SLABS.getName());
		getOrCreateBuilder(CLAY_BRICK_STAIRS).add(Items.BRICK_STAIRS).addTag(VANILLA_STAINED_BRICK_STAIRS).addOptionalTag(FLAMBOYANT_STAINED_BRICK_STAIRS.getName());
		getOrCreateBuilder(CLAY_BRICK_WALLS).add(Items.BRICK_WALL).addTag(VANILLA_STAINED_BRICK_WALLS).addOptionalTag(FLAMBOYANT_STAINED_BRICK_WALLS.getName());
		getOrCreateBuilder(CLAY_BRICKS).add(Items.BRICKS).addTag(VANILLA_STAINED_BRICKS).addOptionalTag(FLAMBOYANT_STAINED_BRICKS.getName());
		getOrCreateBuilder(CONCRETE_SLABS).addTag(VANILLA_CONCRETE_SLABS).addOptionalTag(FLAMBOYANT_CONCRETE_SLABS.getName());
		getOrCreateBuilder(CONCRETE_STAIRS).addTag(VANILLA_CONCRETE_STAIRS).addOptionalTag(FLAMBOYANT_CONCRETE_STAIRS.getName());
		getOrCreateBuilder(GLASS_SLABS).addTag(VANILLA_STAINED_GLASS_SLABS).addOptionalTag(FLAMBOYANT_STAINED_GLASS_SLABS.getName());
		getOrCreateBuilder(GLASS_STAIRS).addTag(VANILLA_STAINED_GLASS_STAIRS).addOptionalTag(FLAMBOYANT_STAINED_GLASS_STAIRS.getName());
		getOrCreateBuilder(REDSTONE_LAMPS).add(Items.REDSTONE_LAMP).addTag(VANILLA_REDSTONE_LAMPS).addOptionalTag(FLAMBOYANT_REDSTONE_LAMPS.getName());
		getOrCreateBuilder(CARVED_PUMPKINS).add(Items.CARVED_PUMPKIN);
		getOrCreateBuilder(JACK_O_LANTERNS).add(Items.JACK_O_LANTERN);
		getOrCreateBuilder(TERRACOTTA_SLABS).addTag(VANILLA_TERRACOTTA_SLABS).addOptionalTag(FLAMBOYANT_TERRACOTTA_SLABS.getName());
		getOrCreateBuilder(TERRACOTTA_STAIRS).addTag(VANILLA_TERRACOTTA_STAIRS).addOptionalTag(FLAMBOYANT_TERRACOTTA_STAIRS.getName());
		getOrCreateBuilder(WOOL_SLABS).addTag(VANILLA_WOOL_SLABS).addOptionalTag(FLAMBOYANT_WOOL_SLABS.getName());
		getOrCreateBuilder(WOOL_STAIRS).addTag(VANILLA_WOOL_STAIRS).addOptionalTag(FLAMBOYANT_WOOL_STAIRS.getName());
		getOrCreateBuilder(STAINED_PLANK_SLABS).addTag(VANILLA_STAINED_PLANK_SLABS).addOptionalTag(FLAMBOYANT_STAINED_PLANK_SLABS.getName());
		getOrCreateBuilder(STAINED_PLANK_STAIRS).addTag(VANILLA_STAINED_PLANK_STAIRS).addOptionalTag(FLAMBOYANT_STAINED_PLANK_STAIRS.getName());
		getOrCreateBuilder(STAINED_PLANKS).addTag(VANILLA_STAINED_PLANKS).addOptionalTag(FLAMBOYANT_STAINED_PLANKS.getName());
		getOrCreateBuilder(NETHER_BRICK_FENCE_GATES).add(ModBlocks.NETHER_BRICK_FENCE_GATE.asItem());
		getOrCreateBuilder(SOUL_GLASS).add(ModBlocks.SOUL_GLASS.asItem());
		getOrCreateBuilder(SOUL_GLASS_PANES).add(ModBlocks.SOUL_GLASS_PANE.asItem());
		
		getOrCreateBuilder(Tags.Items.GLASS_PANES).add(ModBlocks.SOUL_GLASS_PANE.asItem());
		getOrCreateBuilder(Tags.Items.SANDSTONE).add(ModBlocks.SOUL_SANDSTONE.asItem(), ModBlocks.CUT_SOUL_SANDSTONE.asItem(),
				ModBlocks.CHISELED_SOUL_SANDSTONE.asItem(), ModBlocks.SMOOTH_SOUL_SANDSTONE.asItem());
		getOrCreateBuilder(Tags.Items.GLASS_COLORLESS).add(ModBlocks.SOUL_GLASS.asItem());
		getOrCreateBuilder(Tags.Items.GLASS_PANES_COLORLESS).add(ModBlocks.SOUL_GLASS_PANE.asItem());
		
		for (int i = 0; i < 23; i++) {
			getOrCreateBuilder(CARVED_PUMPKINS).addOptional(new ResourceLocation("omgourd", "carved_pumpkin_" + (i + 1)));
		}
		for (int i = 0; i < 23; i++) {
			getOrCreateBuilder(JACK_O_LANTERNS).addOptional(new ResourceLocation("omgourd", "jack_o_lantern_" + (i + 1)));
		}
	}
	
	private void vanillaDyedTags() {
		for (int i = 0; i < coloredItems.size(); i++) {
			Item item = coloredItems.get(i);
			String name = item.getRegistryName().getPath();
			if (name.contains("concrete")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(VANILLA_CONCRETE_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(VANILLA_CONCRETE_STAIRS).add(item);
				}
			}
			else if (name.contains("redstone_lamp")) {
				getOrCreateBuilder(VANILLA_REDSTONE_LAMPS).add(item);
			}
			else if (name.contains("stained_brick")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(VANILLA_STAINED_BRICK_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(VANILLA_STAINED_BRICK_STAIRS).add(item);
				}
				else if (name.contains("wall")) {
					getOrCreateBuilder(VANILLA_STAINED_BRICK_WALLS).add(item);
				}
				else if (name.contains("bricks")) {
					getOrCreateBuilder(VANILLA_STAINED_BRICKS).add(item);
				}
			}
			else if (name.contains("stained_glass")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(VANILLA_STAINED_GLASS_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(VANILLA_STAINED_GLASS_STAIRS).add(item);
				}
			}
			else if (name.contains("stained_plank")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(VANILLA_STAINED_PLANK_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(VANILLA_STAINED_PLANK_STAIRS).add(item);
				}
				else if (name.contains("planks")) {
					getOrCreateBuilder(VANILLA_STAINED_PLANKS).add(item);
				}
			}
			else if (name.contains("terracotta")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(VANILLA_TERRACOTTA_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(VANILLA_TERRACOTTA_STAIRS).add(item);
				}
			}
			else if (name.contains("wool")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(VANILLA_WOOL_SLABS).add(item);
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(VANILLA_WOOL_STAIRS).add(item);
				}
			}
		}
	}
	
	private void flaboyantDyedTags() {
		for (int i = 0; i < fColoredItems.size(); i++) {
			Item item = fColoredItems.get(i);
			String name = item.getRegistryName().getPath();
			if (name.contains("concrete")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(FLAMBOYANT_CONCRETE_SLABS).addOptional(item.getRegistryName());
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(FLAMBOYANT_CONCRETE_STAIRS).addOptional(item.getRegistryName());
				}
			}
			else if (name.contains("redstone_lamp")) {
				getOrCreateBuilder(FLAMBOYANT_REDSTONE_LAMPS).addOptional(item.getRegistryName());
			}
			else if (name.contains("stained_brick")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_BRICK_SLABS).addOptional(item.getRegistryName());
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_BRICK_STAIRS).addOptional(item.getRegistryName());
				}
				else if (name.contains("wall")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_BRICK_WALLS).addOptional(item.getRegistryName());
				}
				else if (name.contains("bricks")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_BRICKS).addOptional(item.getRegistryName());
				}
			}
			else if (name.contains("stained_glass")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_GLASS_SLABS).addOptional(item.getRegistryName());
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_GLASS_STAIRS).addOptional(item.getRegistryName());
				}
			}
			else if (name.contains("stained_plank")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_PLANK_SLABS).addOptional(item.getRegistryName());
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_PLANK_STAIRS).addOptional(item.getRegistryName());
				}
				else if (name.contains("planks")) {
					getOrCreateBuilder(FLAMBOYANT_STAINED_PLANKS).addOptional(item.getRegistryName());
				}
			}
			else if (name.contains("terracotta")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(FLAMBOYANT_TERRACOTTA_SLABS).addOptional(item.getRegistryName());
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(FLAMBOYANT_TERRACOTTA_STAIRS).addOptional(item.getRegistryName());
				}
			}
			else if (name.contains("wool")) {
				if (name.contains("slab")) {
					getOrCreateBuilder(FLAMBOYANT_WOOL_SLABS).addOptional(item.getRegistryName());
				}
				else if (name.contains("stairs")) {
					getOrCreateBuilder(FLAMBOYANT_WOOL_STAIRS).addOptional(item.getRegistryName());
				}
			}
		}
	}
	
	@Override
	public String getName() {
		return "CutAndColored item tags";
	}
}
