package einstein.cutandcolored.init;

import java.util.function.Supplier;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.block.GlassSlabBlock;
import einstein.cutandcolored.block.GlassStairsBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FlamboyantBlocks {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CutAndColored.MODID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CutAndColored.MODID);
	
	/************************GLASS***************************/
    // STAIRS
	public static final RegistryObject<Block> AMBER_STAINED_GLASS_STAIRS = register("amber_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> BEIGE_STAINED_GLASS_STAIRS = register("beige_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> CREAM_STAINED_GLASS_STAIRS = register("cream_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> DARK_GREEN_STAINED_GLASS_STAIRS = register("dark_green_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> FOREST_GREEN_STAINED_GLASS_STAIRS = register("forest_green_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> HOT_PINK_STAINED_GLASS_STAIRS = register("hot_pink_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> INDIGO_STAINED_GLASS_STAIRS = register("indigo_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> MAROON_STAINED_GLASS_STAIRS = register("maroon_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> NAVY_STAINED_GLASS_STAIRS = register("navy_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> OLIVE_STAINED_GLASS_STAIRS = register("olive_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> PALE_GREEN_STAINED_GLASS_STAIRS = register("pale_green_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> PALE_PINK_STAINED_GLASS_STAIRS = register("pale_pink_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> PALE_YELLOW_STAINED_GLASS_STAIRS = register("pale_yellow_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> SKY_BLUE_STAINED_GLASS_STAIRS = register("sky_blue_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> SLATE_GRAY_STAINED_GLASS_STAIRS = register("slate_gray_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> VIOLET_STAINED_GLASS_STAIRS = register("violet_stained_glass_stairs", () -> new GlassStairsBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));

    // SLAB
	public static final RegistryObject<Block> AMBER_STAINED_GLASS_SLAB = register("amber_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> BEIGE_STAINED_GLASS_SLAB = register("beige_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> CREAM_STAINED_GLASS_SLAB = register("cream_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> DARK_GREEN_STAINED_GLASS_SLAB = register("dark_green_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> FOREST_GREEN_STAINED_GLASS_SLAB = register("forest_green_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> HOT_PINK_STAINED_GLASS_SLAB = register("hot_pink_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> INDIGO_STAINED_GLASS_SLAB = register("indigo_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> MAROON_STAINED_GLASS_SLAB = register("maroon_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> NAVY_STAINED_GLASS_SLAB = register("navy_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> OLIVE_STAINED_GLASS_SLAB = register("olive_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> PALE_GREEN_STAINED_GLASS_SLAB = register("pale_green_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> PALE_PINK_STAINED_GLASS_SLAB = register("pale_pink_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> PALE_YELLOW_STAINED_GLASS_SLAB = register("pale_yellow_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> SKY_BLUE_STAINED_GLASS_SLAB = register("sky_blue_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> SLATE_GRAY_STAINED_GLASS_SLAB = register("slate_gray_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	public static final RegistryObject<Block> VIOLET_STAINED_GLASS_SLAB = register("violet_stained_glass_slab", () -> new GlassSlabBlock(Blocks.GLASS, Properties.copy(Blocks.GLASS)));
	
    /*************************WOOL**************************/
    // STAIRS
    public static final RegistryObject<Block> AMBER_WOOL_STAIRS = register("amber_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> BEIGE_WOOL_STAIRS = register("beige_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> CREAM_WOOL_STAIRS = register("cream_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> DARK_GREEN_WOOL_STAIRS = register("dark_green_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> FOREST_GREEN_WOOL_STAIRS = register("forest_green_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> HOT_PINK_WOOL_STAIRS = register("hot_pink_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> INDIGO_WOOL_STAIRS = register("indigo_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> MAROON_WOOL_STAIRS = register("maroon_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> NAVY_WOOL_STAIRS = register("navy_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> OLIVE_WOOL_STAIRS = register("olive_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> PALE_GREEN_WOOL_STAIRS = register("pale_green_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> PALE_PINK_WOOL_STAIRS = register("pale_pink_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> PALE_YELLOW_WOOL_STAIRS = register("pale_yellow_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> SKY_BLUE_WOOL_STAIRS = register("sky_blue_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> SLATE_GRAY_WOOL_STAIRS = register("slate_gray_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> VIOLET_WOOL_STAIRS = register("violet_wool_stairs", () -> new StairBlock(Blocks.WHITE_WOOL::defaultBlockState, Properties.copy(Blocks.WHITE_WOOL)));
    
    // SLABS
    public static final RegistryObject<Block> AMBER_WOOL_SLAB = register("amber_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> BEIGE_WOOL_SLAB = register("beige_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> CREAM_WOOL_SLAB = register("cream_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> DARK_GREEN_WOOL_SLAB = register("dark_green_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> FOREST_GREEN_WOOL_SLAB = register("forest_green_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> HOT_PINK_WOOL_SLAB = register("hot_pink_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> INDIGO_WOOL_SLAB = register("indigo_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> MAROON_WOOL_SLAB = register("maroon_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> NAVY_WOOL_SLAB = register("navy_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> OLIVE_WOOL_SLAB = register("olive_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> PALE_GREEN_WOOL_SLAB = register("pale_green_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> PALE_PINK_WOOL_SLAB = register("pale_pink_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> PALE_YELLOW_WOOL_SLAB = register("pale_yellow_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> SKY_BLUE_WOOL_SLAB = register("sky_blue_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> SLATE_GRAY_WOOL_SLAB = register("slate_gray_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> VIOLET_WOOL_SLAB = register("violet_wool_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_WOOL)));

    /*******************STAINED_PLANKS**********************/
    // FULL BLOCKS
	public static final RegistryObject<Block> AMBER_STAINED_PLANKS = register("amber_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BEIGE_STAINED_PLANKS = register("beige_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CREAM_STAINED_PLANKS = register("cream_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_GREEN_STAINED_PLANKS = register("dark_green_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> FOREST_GREEN_STAINED_PLANKS = register("forest_green_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> HOT_PINK_STAINED_PLANKS = register("hot_pink_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> INDIGO_STAINED_PLANKS = register("indigo_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> MAROON_STAINED_PLANKS = register("maroon_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> NAVY_STAINED_PLANKS = register("navy_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> OLIVE_STAINED_PLANKS = register("olive_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> PALE_GREEN_STAINED_PLANKS = register("pale_green_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> PALE_PINK_STAINED_PLANKS = register("pale_pink_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> PALE_YELLOW_STAINED_PLANKS = register("pale_yellow_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SKY_BLUE_STAINED_PLANKS = register("sky_blue_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SLATE_GRAY_STAINED_PLANKS = register("slate_gray_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> VIOLET_STAINED_PLANKS = register("violet_stained_planks", () -> new Block(Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
	
    // STAIRS
    public static final RegistryObject<Block> AMBER_STAINED_PLANK_STAIRS = register("amber_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.AMBER_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.AMBER_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BEIGE_STAINED_PLANK_STAIRS = register("beige_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.BEIGE_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.BEIGE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> CREAM_STAINED_PLANK_STAIRS = register("cream_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.CREAM_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.CREAM_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> DARK_GREEN_STAINED_PLANK_STAIRS = register("dark_green_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.DARK_GREEN_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.DARK_GREEN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> FOREST_GREEN_STAINED_PLANK_STAIRS = register("forest_green_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.FOREST_GREEN_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.FOREST_GREEN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> HOT_PINK_STAINED_PLANK_STAIRS = register("hot_pink_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.HOT_PINK_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.HOT_PINK_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> INDIGO_STAINED_PLANK_STAIRS = register("indigo_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.INDIGO_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.INDIGO_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> MAROON_STAINED_PLANK_STAIRS = register("maroon_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.MAROON_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.MAROON_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> NAVY_STAINED_PLANK_STAIRS = register("navy_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.NAVY_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.NAVY_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> OLIVE_STAINED_PLANK_STAIRS = register("olive_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.OLIVE_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.OLIVE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PALE_GREEN_STAINED_PLANK_STAIRS = register("pale_green_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.PALE_GREEN_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.PALE_GREEN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PALE_PINK_STAINED_PLANK_STAIRS = register("pale_pink_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.PALE_PINK_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.PALE_PINK_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PALE_YELLOW_STAINED_PLANK_STAIRS = register("pale_yellow_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.PALE_YELLOW_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.PALE_YELLOW_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> SKY_BLUE_STAINED_PLANK_STAIRS = register("sky_blue_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.SKY_BLUE_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.SKY_BLUE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> SLATE_GRAY_STAINED_PLANK_STAIRS = register("slate_gray_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.SLATE_GRAY_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.SLATE_GRAY_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> VIOLET_STAINED_PLANK_STAIRS = register("violet_stained_plank_stairs", () -> new StairBlock(FlamboyantBlocks.VIOLET_STAINED_PLANKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.VIOLET_STAINED_PLANKS.get())));
	
	// SLABS
    public static final RegistryObject<Block> AMBER_STAINED_PLANK_SLAB = register("amber_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.AMBER_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> BEIGE_STAINED_PLANK_SLAB = register("beige_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.BEIGE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> CREAM_STAINED_PLANK_SLAB = register("cream_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.CREAM_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> DARK_GREEN_STAINED_PLANK_SLAB = register("dark_green_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.DARK_GREEN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> FOREST_GREEN_STAINED_PLANK_SLAB = register("forest_green_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.FOREST_GREEN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> HOT_PINK_STAINED_PLANK_SLAB = register("hot_pink_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.HOT_PINK_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> INDIGO_STAINED_PLANK_SLAB = register("indigo_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.INDIGO_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> MAROON_STAINED_PLANK_SLAB = register("maroon_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.MAROON_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> NAVY_STAINED_PLANK_SLAB = register("navy_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.NAVY_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> OLIVE_STAINED_PLANK_SLAB = register("olive_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.OLIVE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PALE_GREEN_STAINED_PLANK_SLAB = register("pale_green_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.PALE_GREEN_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PALE_PINK_STAINED_PLANK_SLAB = register("pale_pink_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.PALE_PINK_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> PALE_YELLOW_STAINED_PLANK_SLAB = register("pale_yellow_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.PALE_YELLOW_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> SKY_BLUE_STAINED_PLANK_SLAB = register("sky_blue_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.SKY_BLUE_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> SLATE_GRAY_STAINED_PLANK_SLAB = register("slate_gray_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.SLATE_GRAY_STAINED_PLANKS.get())));
    public static final RegistryObject<Block> VIOLET_STAINED_PLANK_SLAB = register("violet_stained_plank_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.VIOLET_STAINED_PLANKS.get())));
	
    /*********************TERRACOTTA************************/
    // STAIRS
    public static final RegistryObject<Block> AMBER_TERRACOTTA_STAIRS = register("amber_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> BEIGE_TERRACOTTA_STAIRS = register("beige_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> CREAM_TERRACOTTA_STAIRS = register("cream_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> DARK_GREEN_TERRACOTTA_STAIRS = register("dark_green_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> FOREST_GREEN_TERRACOTTA_STAIRS = register("forest_green_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> HOT_PINK_TERRACOTTA_STAIRS = register("hot_pink_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> INDIGO_TERRACOTTA_STAIRS = register("indigo_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> MAROON_TERRACOTTA_STAIRS = register("maroon_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> NAVY_TERRACOTTA_STAIRS = register("navy_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> OLIVE_TERRACOTTA_STAIRS = register("olive_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> PALE_GREEN_TERRACOTTA_STAIRS = register("pale_green_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> PALE_PINK_TERRACOTTA_STAIRS = register("pale_pink_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> PALE_YELLOW_TERRACOTTA_STAIRS = register("pale_yellow_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> SKY_BLUE_TERRACOTTA_STAIRS = register("sky_blue_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> SLATE_GRAY_TERRACOTTA_STAIRS = register("slate_gray_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> VIOLET_TERRACOTTA_STAIRS = register("violet_terracotta_stairs", () -> new StairBlock(Blocks.TERRACOTTA::defaultBlockState, Properties.copy(Blocks.TERRACOTTA)));
    
    // SLABS
    public static final RegistryObject<Block> AMBER_TERRACOTTA_SLAB = register("amber_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> BEIGE_TERRACOTTA_SLAB = register("beige_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> CREAM_TERRACOTTA_SLAB = register("cream_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> DARK_GREEN_TERRACOTTA_SLAB = register("dark_green_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> FOREST_GREEN_TERRACOTTA_SLAB = register("forest_green_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> HOT_PINK_TERRACOTTA_SLAB = register("hot_pink_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> INDIGO_TERRACOTTA_SLAB = register("indigo_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> MAROON_TERRACOTTA_SLAB = register("maroon_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> NAVY_TERRACOTTA_SLAB = register("navy_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> OLIVE_TERRACOTTA_SLAB = register("olive_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> PALE_GREEN_TERRACOTTA_SLAB = register("pale_green_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> PALE_PINK_TERRACOTTA_SLAB = register("pale_pink_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> PALE_YELLOW_TERRACOTTA_SLAB = register("pale_yellow_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> SKY_BLUE_TERRACOTTA_SLAB = register("sky_blue_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> SLATE_GRAY_TERRACOTTA_SLAB = register("slate_gray_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> VIOLET_TERRACOTTA_SLAB = register("violet_terracotta_slab", () -> new SlabBlock(Properties.copy(Blocks.TERRACOTTA)));
    
    /**********************CONCRETE*************************/
    // STAIRS
    public static final RegistryObject<Block> AMBER_CONCRETE_STAIRS = register("amber_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> BEIGE_CONCRETE_STAIRS = register("beige_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> CREAM_CONCRETE_STAIRS = register("cream_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> DARK_GREEN_CONCRETE_STAIRS = register("dark_green_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> FOREST_GREEN_CONCRETE_STAIRS = register("forest_green_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> HOT_PINK_CONCRETE_STAIRS = register("hot_pink_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> INDIGO_CONCRETE_STAIRS = register("indigo_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> MAROON_CONCRETE_STAIRS = register("maroon_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> NAVY_CONCRETE_STAIRS = register("navy_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> OLIVE_CONCRETE_STAIRS = register("olive_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> PALE_GREEN_CONCRETE_STAIRS = register("pale_green_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> PALE_PINK_CONCRETE_STAIRS = register("pale_pink_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> PALE_YELLOW_CONCRETE_STAIRS = register("pale_yellow_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> SKY_BLUE_CONCRETE_STAIRS = register("sky_blue_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> SLATE_GRAY_CONCRETE_STAIRS = register("slate_gray_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> VIOLET_CONCRETE_STAIRS = register("violet_concrete_stairs", () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, Properties.copy(Blocks.WHITE_CONCRETE)));
    
    // SLABS
    public static final RegistryObject<Block> AMBER_CONCRETE_SLAB = register("amber_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> BEIGE_CONCRETE_SLAB = register("beige_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> CREAM_CONCRETE_SLAB = register("cream_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> DARK_GREEN_CONCRETE_SLAB = register("dark_green_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> FOREST_GREEN_CONCRETE_SLAB = register("forest_green_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> HOT_PINK_CONCRETE_SLAB = register("hot_pink_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> INDIGO_CONCRETE_SLAB = register("indigo_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> MAROON_CONCRETE_SLAB = register("maroon_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> NAVY_CONCRETE_SLAB = register("navy_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> OLIVE_CONCRETE_SLAB = register("olive_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> PALE_GREEN_CONCRETE_SLAB = register("pale_green_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> PALE_PINK_CONCRETE_SLAB = register("pale_pink_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> PALE_YELLOW_CONCRETE_SLAB = register("pale_yellow_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> SKY_BLUE_CONCRETE_SLAB = register("sky_blue_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> SLATE_GRAY_CONCRETE_SLAB = register("slate_gray_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> VIOLET_CONCRETE_SLAB = register("violet_concrete_slab", () -> new SlabBlock(Properties.copy(Blocks.WHITE_CONCRETE)));
    
    /*******************STAINED_BRICKS**********************/
    // FULL BLOCKS
	public static final RegistryObject<Block> AMBER_STAINED_BRICKS = register("amber_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> BEIGE_STAINED_BRICKS = register("beige_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> CREAM_STAINED_BRICKS = register("cream_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> DARK_GREEN_STAINED_BRICKS = register("dark_green_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> FOREST_GREEN_STAINED_BRICKS = register("forest_green_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> HOT_PINK_STAINED_BRICKS = register("hot_pink_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> INDIGO_STAINED_BRICKS = register("indigo_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> MAROON_STAINED_BRICKS = register("maroon_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> NAVY_STAINED_BRICKS = register("navy_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> OLIVE_STAINED_BRICKS = register("olive_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> PALE_GREEN_STAINED_BRICKS = register("pale_green_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> PALE_PINK_STAINED_BRICKS = register("pale_pink_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> PALE_YELLOW_STAINED_BRICKS = register("pale_yellow_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> SKY_BLUE_STAINED_BRICKS = register("sky_blue_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> SLATE_GRAY_STAINED_BRICKS = register("slate_gray_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	public static final RegistryObject<Block> VIOLET_STAINED_BRICKS = register("violet_stained_bricks", () -> new Block(Properties.of(Material.STONE).strength(2.0F, 6.0F)));
	
    // STAIRS
    public static final RegistryObject<Block> AMBER_STAINED_BRICK_STAIRS = register("amber_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.AMBER_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.AMBER_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> BEIGE_STAINED_BRICK_STAIRS = register("beige_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.BEIGE_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.BEIGE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> CREAM_STAINED_BRICK_STAIRS = register("cream_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.CREAM_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.CREAM_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> DARK_GREEN_STAINED_BRICK_STAIRS = register("dark_green_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.DARK_GREEN_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.DARK_GREEN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> FOREST_GREEN_STAINED_BRICK_STAIRS = register("forest_green_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.FOREST_GREEN_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.FOREST_GREEN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> HOT_PINK_STAINED_BRICK_STAIRS = register("hot_pink_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.HOT_PINK_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.HOT_PINK_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> INDIGO_STAINED_BRICK_STAIRS = register("indigo_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.INDIGO_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.INDIGO_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> MAROON_STAINED_BRICK_STAIRS = register("maroon_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.MAROON_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.MAROON_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> NAVY_STAINED_BRICK_STAIRS = register("navy_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.NAVY_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.NAVY_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> OLIVE_STAINED_BRICK_STAIRS = register("olive_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.OLIVE_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.OLIVE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PALE_GREEN_STAINED_BRICK_STAIRS = register("pale_green_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.PALE_GREEN_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.PALE_GREEN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PALE_PINK_STAINED_BRICK_STAIRS = register("pale_pink_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.PALE_PINK_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.PALE_PINK_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PALE_YELLOW_STAINED_BRICK_STAIRS = register("pale_yellow_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.PALE_YELLOW_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.PALE_YELLOW_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> SKY_BLUE_STAINED_BRICK_STAIRS = register("sky_blue_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.SKY_BLUE_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.SKY_BLUE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> SLATE_GRAY_STAINED_BRICK_STAIRS = register("slate_gray_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.SLATE_GRAY_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.SLATE_GRAY_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> VIOLET_STAINED_BRICK_STAIRS = register("violet_stained_brick_stairs", () -> new StairBlock(FlamboyantBlocks.VIOLET_STAINED_BRICKS.get()::defaultBlockState, Properties.copy(FlamboyantBlocks.VIOLET_STAINED_BRICKS.get())));
	
    // SLABS
    public static final RegistryObject<Block> AMBER_STAINED_BRICK_SLAB = register("amber_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.AMBER_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> BEIGE_STAINED_BRICK_SLAB = register("beige_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.BEIGE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> CREAM_STAINED_BRICK_SLAB = register("cream_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.CREAM_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> DARK_GREEN_STAINED_BRICK_SLAB = register("dark_green_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.DARK_GREEN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> FOREST_GREEN_STAINED_BRICK_SLAB = register("forest_green_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.FOREST_GREEN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> HOT_PINK_STAINED_BRICK_SLAB = register("hot_pink_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.HOT_PINK_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> INDIGO_STAINED_BRICK_SLAB = register("indigo_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.INDIGO_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> MAROON_STAINED_BRICK_SLAB = register("maroon_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.MAROON_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> NAVY_STAINED_BRICK_SLAB = register("navy_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.NAVY_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> OLIVE_STAINED_BRICK_SLAB = register("olive_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.OLIVE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PALE_GREEN_STAINED_BRICK_SLAB = register("pale_green_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.PALE_GREEN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PALE_PINK_STAINED_BRICK_SLAB = register("pale_pink_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.PALE_PINK_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PALE_YELLOW_STAINED_BRICK_SLAB = register("pale_yellow_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.PALE_YELLOW_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> SKY_BLUE_STAINED_BRICK_SLAB = register("sky_blue_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.SKY_BLUE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> SLATE_GRAY_STAINED_BRICK_SLAB = register("slate_gray_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.SLATE_GRAY_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> VIOLET_STAINED_BRICK_SLAB = register("violet_stained_brick_slab", () -> new SlabBlock(Properties.copy(FlamboyantBlocks.VIOLET_STAINED_BRICKS.get())));
	
	// WALLS
    public static final RegistryObject<Block> AMBER_STAINED_BRICK_WALL = register("amber_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.AMBER_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> BEIGE_STAINED_BRICK_WALL = register("beige_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.BEIGE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> CREAM_STAINED_BRICK_WALL = register("cream_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.CREAM_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> DARK_GREEN_STAINED_BRICK_WALL = register("dark_green_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.DARK_GREEN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> FOREST_GREEN_STAINED_BRICK_WALL = register("forest_green_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.FOREST_GREEN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> HOT_PINK_STAINED_BRICK_WALL = register("hot_pink_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.HOT_PINK_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> INDIGO_STAINED_BRICK_WALL = register("indigo_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.INDIGO_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> MAROON_STAINED_BRICK_WALL = register("maroon_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.MAROON_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> NAVY_STAINED_BRICK_WALL = register("navy_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.NAVY_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> OLIVE_STAINED_BRICK_WALL = register("olive_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.OLIVE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PALE_GREEN_STAINED_BRICK_WALL = register("pale_green_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.PALE_GREEN_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PALE_PINK_STAINED_BRICK_WALL = register("pale_pink_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.PALE_PINK_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> PALE_YELLOW_STAINED_BRICK_WALL = register("pale_yellow_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.PALE_YELLOW_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> SKY_BLUE_STAINED_BRICK_WALL = register("sky_blue_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.SKY_BLUE_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> SLATE_GRAY_STAINED_BRICK_WALL = register("slate_gray_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.SLATE_GRAY_STAINED_BRICKS.get())));
    public static final RegistryObject<Block> VIOLET_STAINED_BRICK_WALL = register("violet_stained_brick_wall", () -> new WallBlock(Properties.copy(FlamboyantBlocks.VIOLET_STAINED_BRICKS.get())));
    
	/************************LAMPS**************************/
    public static final RegistryObject<Block> AMBER_REDSTONE_LAMP = register("amber_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> BEIGE_REDSTONE_LAMP = register("beige_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> CREAM_REDSTONE_LAMP = register("cream_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> DARK_GREEN_REDSTONE_LAMP = register("dark_green_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> FOREST_GREEN_REDSTONE_LAMP = register("forest_green_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> HOT_PINK_REDSTONE_LAMP = register("hot_pink_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> INDIGO_REDSTONE_LAMP = register("indigo_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> MAROON_REDSTONE_LAMP = register("maroon_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> NAVY_REDSTONE_LAMP = register("navy_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> OLIVE_REDSTONE_LAMP = register("olive_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> PALE_GREEN_REDSTONE_LAMP = register("pale_green_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> PALE_PINK_REDSTONE_LAMP = register("pale_pink_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> PALE_YELLOW_REDSTONE_LAMP = register("pale_yellow_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> SKY_BLUE_REDSTONE_LAMP = register("sky_blue_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> SLATE_GRAY_REDSTONE_LAMP = register("slate_gray_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<Block> VIOLET_REDSTONE_LAMP = register("violet_redstone_lamp", () -> new RedstoneLampBlock(Properties.copy(Blocks.REDSTONE_LAMP)));
    
    public static <T extends Block> RegistryObject<Block> register(final String name, final Supplier<T> block) {
    	RegistryObject<Block> instance = BLOCKS.register(name, block);
    	if (ModList.get().isLoaded(CutAndColored.FMODID)) {
    		ITEMS.register(name, () -> new BlockItem(instance.get(), new Item.Properties().tab(CutAndColored.MOD_TAB)));
    	}
    	return instance;
    }
}
