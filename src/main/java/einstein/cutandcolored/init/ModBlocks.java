package einstein.cutandcolored.init;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.block.ColoredRedstoneLamp;
import einstein.cutandcolored.block.GlassSlabBlock;
import einstein.cutandcolored.block.GlassStairsBlock;
import einstein.cutandcolored.block.GlasscutterBlock;
import einstein.cutandcolored.block.HorizontalSoulGlassPane;
import einstein.cutandcolored.block.IronFenceGateBlock;
import einstein.cutandcolored.block.SawmillBlock;
import einstein.cutandcolored.block.StainedGlassSlabBlock;
import einstein.cutandcolored.block.StainedGlassStairsBlock;
import einstein.cutandcolored.block.WeaverBlock;
import einstein.einsteins_library.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModBlocks
{
    /***********************CUTTERS*************************/
    public static final Block GLASSCUTTER = RegistryHandler.registerBlock(CutAndColored.MODID, "glasscutter", new GlasscutterBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F)), CutAndColored.MOD_TAB);
    public static final Block WEAVER = RegistryHandler.registerBlock(CutAndColored.MODID, "weaver", new WeaverBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1.3F)), CutAndColored.MOD_TAB);
    public static final Block SAWMILL = RegistryHandler.registerBlock(CutAndColored.MODID, "sawmill", new SawmillBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1.3F)), CutAndColored.MOD_TAB);
    
    /************************GLASS***************************/
    // FULL BLOCKS
    public static final Block SOUL_GLASS = RegistryHandler.registerBlock(CutAndColored.MODID, "soul_glass", new GlassBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.4F).sound(SoundType.GLASS).notSolid()), CutAndColored.MOD_TAB);
    
    // PANES
    public static final Block SOUL_GLASS_PANE = RegistryHandler.registerBlock(CutAndColored.MODID, "soul_glass_pane", new PaneBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.4F).sound(SoundType.GLASS).notSolid()), CutAndColored.MOD_TAB);
    public static final Block HORIZONTAL_SOUL_GLASS_PANE = RegistryHandler.registerModCompatBlock(CutAndColored.MODID, "horizontalpanes", "horizontal_soul_glass_pane", new HorizontalSoulGlassPane(Block.Properties.create(Material.GLASS).notSolid().hardnessAndResistance(0.3F, 0.3F).sound(SoundType.GLASS)), CutAndColored.MOD_TAB);
    
    // STAIRS
    public static final Block GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "glass_stairs", new GlassStairsBlock(Blocks.GLASS::getDefaultState, Block.Properties.from(Blocks.GLASS)), CutAndColored.MOD_TAB);
    public static final Block SOUL_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "soul_glass_stairs", new GlassStairsBlock(ModBlocks.SOUL_GLASS::getDefaultState, Block.Properties.from(ModBlocks.SOUL_GLASS)), CutAndColored.MOD_TAB);
    public static final Block WHITE_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "white_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.WHITE_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.ORANGE_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.MAGENTA_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.LIGHT_BLUE_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.YELLOW_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block LIME_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.LIME, Blocks.LIME_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.LIME_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block PINK_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.PINK, Blocks.PINK_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.PINK_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block GRAY_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.GRAY_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.LIGHT_GRAY_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block CYAN_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.CYAN_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.PURPLE_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block BLUE_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.BLUE_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block BROWN_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.BROWN_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block GREEN_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "green_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.GREEN_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block RED_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "red_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.RED, Blocks.RED_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.RED_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block BLACK_STAINED_GLASS_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "black_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.BLACK_STAINED_GLASS)), CutAndColored.MOD_TAB);
    
    // SLABS
    public static final Block GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "glass_slab", new GlassSlabBlock(Blocks.GLASS::getDefaultState, Block.Properties.from(Blocks.GLASS)), CutAndColored.MOD_TAB);
    public static final Block SOUL_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "soul_glass_slab", new GlassSlabBlock(ModBlocks.SOUL_GLASS::getDefaultState, Block.Properties.from(ModBlocks.SOUL_GLASS)), CutAndColored.MOD_TAB);
    public static final Block WHITE_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "white_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.WHITE_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.ORANGE_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.MAGENTA_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.LIGHT_BLUE_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.YELLOW_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block LIME_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.LIME, Blocks.LIME_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.LIME_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block PINK_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.PINK, Blocks.PINK_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.PINK_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block GRAY_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.GRAY_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.LIGHT_GRAY_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block CYAN_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.CYAN_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.PURPLE_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block BLUE_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.BLUE_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block BROWN_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.BROWN_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block GREEN_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "green_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.GREEN_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block RED_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "red_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.RED, Blocks.RED_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.RED_STAINED_GLASS)), CutAndColored.MOD_TAB);
    public static final Block BLACK_STAINED_GLASS_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "black_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.BLACK_STAINED_GLASS)), CutAndColored.MOD_TAB);
    
    /*************************WOOL**************************/
    // STAIRS
    public static final Block WHITE_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "white_wool_stairs", new StairsBlock(Blocks.WHITE_WOOL::getDefaultState, Block.Properties.from(Blocks.WHITE_WOOL)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_wool_stairs", new StairsBlock(Blocks.ORANGE_WOOL::getDefaultState, Block.Properties.from(Blocks.ORANGE_WOOL)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_wool_stairs", new StairsBlock(Blocks.MAGENTA_WOOL::getDefaultState, Block.Properties.from(Blocks.MAGENTA_WOOL)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_wool_stairs", new StairsBlock(Blocks.LIGHT_BLUE_WOOL::getDefaultState, Block.Properties.from(Blocks.LIGHT_BLUE_WOOL)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_wool_stairs", new StairsBlock(Blocks.YELLOW_WOOL::getDefaultState, Block.Properties.from(Blocks.YELLOW_WOOL)), CutAndColored.MOD_TAB);
    public static final Block LIME_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_wool_stairs", new StairsBlock(Blocks.LIME_WOOL::getDefaultState, Block.Properties.from(Blocks.LIME_WOOL)), CutAndColored.MOD_TAB);
    public static final Block PINK_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_wool_stairs", new StairsBlock(Blocks.PINK_WOOL::getDefaultState, Block.Properties.from(Blocks.PINK_WOOL)), CutAndColored.MOD_TAB);
    public static final Block GRAY_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_wool_stairs", new StairsBlock(Blocks.GRAY_WOOL::getDefaultState, Block.Properties.from(Blocks.GRAY_WOOL)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_wool_stairs", new StairsBlock(Blocks.LIGHT_GRAY_WOOL::getDefaultState, Block.Properties.from(Blocks.LIGHT_GRAY_WOOL)), CutAndColored.MOD_TAB);
    public static final Block CYAN_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_wool_stairs", new StairsBlock(Blocks.CYAN_WOOL::getDefaultState, Block.Properties.from(Blocks.CYAN_WOOL)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_wool_stairs", new StairsBlock(Blocks.PURPLE_WOOL::getDefaultState, Block.Properties.from(Blocks.PURPLE_WOOL)), CutAndColored.MOD_TAB);
    public static final Block BLUE_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_wool_stairs", new StairsBlock(Blocks.BLUE_WOOL::getDefaultState, Block.Properties.from(Blocks.BLUE_WOOL)), CutAndColored.MOD_TAB);
    public static final Block BROWN_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_wool_stairs", new StairsBlock(Blocks.BROWN_WOOL::getDefaultState, Block.Properties.from(Blocks.BROWN_WOOL)), CutAndColored.MOD_TAB);
    public static final Block GREEN_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "green_wool_stairs", new StairsBlock(Blocks.GREEN_WOOL::getDefaultState, Block.Properties.from(Blocks.GREEN_WOOL)), CutAndColored.MOD_TAB);
    public static final Block RED_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "red_wool_stairs", new StairsBlock(Blocks.RED_WOOL::getDefaultState, Block.Properties.from(Blocks.RED_WOOL)), CutAndColored.MOD_TAB);
    public static final Block BLACK_WOOL_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "black_wool_stairs", new StairsBlock(Blocks.BLACK_WOOL::getDefaultState, Block.Properties.from(Blocks.BLACK_WOOL)), CutAndColored.MOD_TAB);
    
    // SLABS
    public static final Block WHITE_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "white_wool_slab", new SlabBlock(Block.Properties.from(Blocks.WHITE_WOOL)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_wool_slab", new SlabBlock(Block.Properties.from(Blocks.ORANGE_WOOL)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_wool_slab", new SlabBlock(Block.Properties.from(Blocks.MAGENTA_WOOL)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_wool_slab", new SlabBlock(Block.Properties.from(Blocks.LIGHT_BLUE_WOOL)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_wool_slab", new SlabBlock(Block.Properties.from(Blocks.YELLOW_WOOL)), CutAndColored.MOD_TAB);
    public static final Block LIME_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_wool_slab", new SlabBlock(Block.Properties.from(Blocks.LIME_WOOL)), CutAndColored.MOD_TAB);
    public static final Block PINK_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_wool_slab", new SlabBlock(Block.Properties.from(Blocks.PINK_WOOL)), CutAndColored.MOD_TAB);
    public static final Block GRAY_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_wool_slab", new SlabBlock(Block.Properties.from(Blocks.GRAY_WOOL)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_wool_slab", new SlabBlock(Block.Properties.from(Blocks.LIGHT_GRAY_WOOL)), CutAndColored.MOD_TAB);
    public static final Block CYAN_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_wool_slab", new SlabBlock(Block.Properties.from(Blocks.CYAN_WOOL)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_wool_slab", new SlabBlock(Block.Properties.from(Blocks.PURPLE_WOOL)), CutAndColored.MOD_TAB);
    public static final Block BLUE_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_wool_slab", new SlabBlock(Block.Properties.from(Blocks.BLUE_WOOL)), CutAndColored.MOD_TAB);
    public static final Block BROWN_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_wool_slab", new SlabBlock(Block.Properties.from(Blocks.BROWN_WOOL)), CutAndColored.MOD_TAB);
    public static final Block GREEN_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "green_wool_slab", new SlabBlock(Block.Properties.from(Blocks.GREEN_WOOL)), CutAndColored.MOD_TAB);
    public static final Block RED_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "red_wool_slab", new SlabBlock(Block.Properties.from(Blocks.RED_WOOL)), CutAndColored.MOD_TAB);
    public static final Block BLACK_WOOL_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "black_wool_slab", new SlabBlock(Block.Properties.from(Blocks.BLACK_WOOL)), CutAndColored.MOD_TAB);
    
    /*******************STAINED_PLANKS**********************/
    // FULL BLOCKS
    public static final Block WHITE_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "white_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.SNOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.MAGENTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block LIME_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block PINK_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.PINK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block GRAY_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block CYAN_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.CYAN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.PURPLE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block BLUE_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block BROWN_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block GREEN_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "green_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.GREEN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block RED_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "red_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.RED).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    public static final Block BLACK_STAINED_PLANKS = RegistryHandler.registerBlock(CutAndColored.MODID, "black_stained_planks", new Block(Block.Properties.create(Material.WOOD, MaterialColor.BLACK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), CutAndColored.MOD_TAB);
    
    // STAIRS
    public static final Block WHITE_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "white_stained_plank_stairs", new StairsBlock(ModBlocks.WHITE_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.WHITE_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_stained_plank_stairs", new StairsBlock(ModBlocks.ORANGE_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.ORANGE_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_stained_plank_stairs", new StairsBlock(ModBlocks.MAGENTA_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.MAGENTA_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_stained_plank_stairs", new StairsBlock(ModBlocks.LIGHT_BLUE_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.LIGHT_BLUE_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_stained_plank_stairs", new StairsBlock(ModBlocks.YELLOW_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.YELLOW_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block LIME_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_stained_plank_stairs", new StairsBlock(ModBlocks.LIME_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.LIME_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block PINK_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_stained_plank_stairs", new StairsBlock(ModBlocks.PINK_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.PINK_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block GRAY_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_stained_plank_stairs", new StairsBlock(ModBlocks.GRAY_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.GRAY_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_stained_plank_stairs", new StairsBlock(ModBlocks.LIGHT_GRAY_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.LIGHT_GRAY_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block CYAN_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_stained_plank_stairs", new StairsBlock(ModBlocks.CYAN_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.CYAN_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_stained_plank_stairs", new StairsBlock(ModBlocks.PURPLE_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.PURPLE_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block BLUE_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_stained_plank_stairs", new StairsBlock(ModBlocks.BLUE_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.BLUE_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block BROWN_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_stained_plank_stairs", new StairsBlock(ModBlocks.BROWN_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.BROWN_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block GREEN_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "green_stained_plank_stairs", new StairsBlock(ModBlocks.GREEN_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.GREEN_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block RED_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "red_stained_plank_stairs", new StairsBlock(ModBlocks.RED_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.RED_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block BLACK_STAINED_PLANK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "black_stained_plank_stairs", new StairsBlock(ModBlocks.BLACK_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.BLACK_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    
    // SLABS
    public static final Block WHITE_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "white_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.WHITE_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.ORANGE_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.MAGENTA_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_BLUE_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.YELLOW_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block LIME_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.LIME_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block PINK_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.PINK_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block GRAY_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.GRAY_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_GRAY_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block CYAN_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.CYAN_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.PURPLE_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block BLUE_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.BLUE_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block BROWN_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.BROWN_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block GREEN_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "green_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.GREEN_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block RED_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "red_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.RED_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    public static final Block BLACK_STAINED_PLANK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "black_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.BLACK_STAINED_PLANKS)), CutAndColored.MOD_TAB);
    
    /*********************TERRACOTTA************************/
    // STAIRS
    public static final Block TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "terracotta_stairs", new StairsBlock(Blocks.TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block WHITE_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "white_terracotta_stairs", new StairsBlock(Blocks.WHITE_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.WHITE_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_terracotta_stairs", new StairsBlock(Blocks.ORANGE_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.ORANGE_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_terracotta_stairs", new StairsBlock(Blocks.MAGENTA_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.MAGENTA_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_terracotta_stairs", new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.LIGHT_BLUE_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_terracotta_stairs", new StairsBlock(Blocks.YELLOW_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.YELLOW_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block LIME_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_terracotta_stairs", new StairsBlock(Blocks.LIME_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.LIME_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block PINK_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_terracotta_stairs", new StairsBlock(Blocks.PINK_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.PINK_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block GRAY_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_terracotta_stairs", new StairsBlock(Blocks.GRAY_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.GRAY_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_terracotta_stairs", new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.LIGHT_GRAY_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block CYAN_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_terracotta_stairs", new StairsBlock(Blocks.CYAN_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.CYAN_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_terracotta_stairs", new StairsBlock(Blocks.PURPLE_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.PURPLE_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block BLUE_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_terracotta_stairs", new StairsBlock(Blocks.BLUE_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.BLUE_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block BROWN_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_terracotta_stairs", new StairsBlock(Blocks.BROWN_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.BROWN_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block GREEN_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "green_terracotta_stairs", new StairsBlock(Blocks.GREEN_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.GREEN_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block RED_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "red_terracotta_stairs", new StairsBlock(Blocks.RED_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.RED_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block BLACK_TERRACOTTA_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "black_terracotta_stairs", new StairsBlock(Blocks.BLACK_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.BLACK_TERRACOTTA)), CutAndColored.MOD_TAB);
    
    // SLABS
    public static final Block TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block WHITE_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "white_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.WHITE_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.ORANGE_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.MAGENTA_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.LIGHT_BLUE_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.YELLOW_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block LIME_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.LIME_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block PINK_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.PINK_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block GRAY_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.GRAY_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.LIGHT_GRAY_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block CYAN_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.CYAN_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.PURPLE_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block BLUE_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.BLUE_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block BROWN_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.BROWN_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block GREEN_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "green_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.GREEN_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block RED_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "red_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.RED_TERRACOTTA)), CutAndColored.MOD_TAB);
    public static final Block BLACK_TERRACOTTA_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "black_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.BLACK_TERRACOTTA)), CutAndColored.MOD_TAB);
    
    /**********************CONCRETE*************************/
    // STAIRS
    public static final Block WHITE_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "white_concrete_stairs", new StairsBlock(Blocks.WHITE_CONCRETE::getDefaultState, Block.Properties.from(Blocks.WHITE_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_concrete_stairs", new StairsBlock(Blocks.ORANGE_CONCRETE::getDefaultState, Block.Properties.from(Blocks.ORANGE_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_concrete_stairs", new StairsBlock(Blocks.MAGENTA_CONCRETE::getDefaultState, Block.Properties.from(Blocks.MAGENTA_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_concrete_stairs", new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE::getDefaultState, Block.Properties.from(Blocks.LIGHT_BLUE_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_concrete_stairs", new StairsBlock(Blocks.YELLOW_CONCRETE::getDefaultState, Block.Properties.from(Blocks.YELLOW_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block LIME_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_concrete_stairs", new StairsBlock(Blocks.LIME_CONCRETE::getDefaultState, Block.Properties.from(Blocks.LIME_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block PINK_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_concrete_stairs", new StairsBlock(Blocks.PINK_CONCRETE::getDefaultState, Block.Properties.from(Blocks.PINK_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block GRAY_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_concrete_stairs", new StairsBlock(Blocks.GRAY_CONCRETE::getDefaultState, Block.Properties.from(Blocks.GRAY_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_concrete_stairs", new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE::getDefaultState, Block.Properties.from(Blocks.LIGHT_GRAY_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block CYAN_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_concrete_stairs", new StairsBlock(Blocks.CYAN_CONCRETE::getDefaultState, Block.Properties.from(Blocks.CYAN_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_concrete_stairs", new StairsBlock(Blocks.PURPLE_CONCRETE::getDefaultState, Block.Properties.from(Blocks.PURPLE_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block BLUE_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_concrete_stairs", new StairsBlock(Blocks.BLUE_CONCRETE::getDefaultState, Block.Properties.from(Blocks.BLUE_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block BROWN_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_concrete_stairs", new StairsBlock(Blocks.BROWN_CONCRETE::getDefaultState, Block.Properties.from(Blocks.BROWN_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block GREEN_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "green_concrete_stairs", new StairsBlock(Blocks.GREEN_CONCRETE::getDefaultState, Block.Properties.from(Blocks.GREEN_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block RED_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "red_concrete_stairs", new StairsBlock(Blocks.RED_CONCRETE::getDefaultState, Block.Properties.from(Blocks.RED_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block BLACK_CONCRETE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "black_concrete_stairs", new StairsBlock(Blocks.BLACK_CONCRETE::getDefaultState, Block.Properties.from(Blocks.BLACK_CONCRETE)), CutAndColored.MOD_TAB);
    
	// SLABS
    public static final Block WHITE_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "white_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.WHITE_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.ORANGE_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.MAGENTA_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.LIGHT_BLUE_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.YELLOW_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block LIME_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.LIME_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block PINK_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.PINK_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block GRAY_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.GRAY_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.LIGHT_GRAY_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block CYAN_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.CYAN_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.PURPLE_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block BLUE_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.BLUE_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block BROWN_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.BROWN_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block GREEN_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "green_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.GREEN_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block RED_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "red_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.RED_CONCRETE)), CutAndColored.MOD_TAB);
    public static final Block BLACK_CONCRETE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "black_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.BLACK_CONCRETE)), CutAndColored.MOD_TAB);
    
    /*******************STAINED_BRICKS**********************/
    // FULL BLOCKS
    public static final Block WHITE_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "white_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.SNOW).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block LIME_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIME).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block PINK_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.PINK).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block GRAY_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.GRAY).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block CYAN_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.CYAN).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block BLUE_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block BROWN_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block GREEN_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "green_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block RED_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "red_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block BLACK_STAINED_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "black_stained_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    
    // STAIRS
    public static final Block WHITE_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "white_stained_brick_stairs", new StairsBlock(ModBlocks.WHITE_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.WHITE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_stained_brick_stairs", new StairsBlock(ModBlocks.ORANGE_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.ORANGE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_stained_brick_stairs", new StairsBlock(ModBlocks.MAGENTA_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.MAGENTA_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_stained_brick_stairs", new StairsBlock(ModBlocks.LIGHT_BLUE_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.LIGHT_BLUE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_stained_brick_stairs", new StairsBlock(ModBlocks.YELLOW_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.YELLOW_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block LIME_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_stained_brick_stairs", new StairsBlock(ModBlocks.LIME_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.LIME_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block PINK_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_stained_brick_stairs", new StairsBlock(ModBlocks.PINK_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.PINK_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block GRAY_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_stained_brick_stairs", new StairsBlock(ModBlocks.GRAY_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.GRAY_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_stained_brick_stairs", new StairsBlock(ModBlocks.LIGHT_GRAY_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.LIGHT_GRAY_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block CYAN_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_stained_brick_stairs", new StairsBlock(ModBlocks.CYAN_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.CYAN_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_stained_brick_stairs", new StairsBlock(ModBlocks.PURPLE_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.PURPLE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block BLUE_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_stained_brick_stairs", new StairsBlock(ModBlocks.BLUE_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.BLUE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block BROWN_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_stained_brick_stairs", new StairsBlock(ModBlocks.BROWN_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.BROWN_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block GREEN_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "green_stained_brick_stairs", new StairsBlock(ModBlocks.GREEN_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.GREEN_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block RED_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "red_stained_brick_stairs", new StairsBlock(ModBlocks.RED_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.RED_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block BLACK_STAINED_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "black_stained_brick_stairs", new StairsBlock(ModBlocks.BLACK_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.BLACK_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    
    // SLABS
    public static final Block WHITE_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "white_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.WHITE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.ORANGE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.MAGENTA_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_BLUE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.YELLOW_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block LIME_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.LIME_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block PINK_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.PINK_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block GRAY_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.GRAY_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_GRAY_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block CYAN_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.CYAN_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.PURPLE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block BLUE_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.BLUE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block BROWN_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.BROWN_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block GREEN_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "green_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.GREEN_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block RED_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "red_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.RED_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block BLACK_STAINED_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "black_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.BLACK_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    
    // WALLS
    public static final Block WHITE_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "white_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.WHITE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.ORANGE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.MAGENTA_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.LIGHT_BLUE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.YELLOW_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block LIME_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.LIME_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block PINK_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.PINK_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block GRAY_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.GRAY_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.LIGHT_GRAY_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block CYAN_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.CYAN_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.PURPLE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block BLUE_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.BLUE_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block BROWN_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.BROWN_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block GREEN_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "green_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.GREEN_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block RED_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "red_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.RED_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block BLACK_STAINED_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "black_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.BLACK_STAINED_BRICKS)), CutAndColored.MOD_TAB);
    
    /************************LAMPS**************************/
    public static final Block WHITE_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "white_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block ORANGE_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "orange_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block MAGENTA_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "magenta_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_BLUE_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "light_blue_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block YELLOW_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "yellow_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block LIME_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "lime_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block PINK_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "pink_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block GRAY_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "gray_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block LIGHT_GRAY_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "light_gray_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block CYAN_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "cyan_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block PURPLE_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "purple_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block BLUE_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "blue_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block BROWN_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "brown_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block GREEN_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "green_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block RED_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "red_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    public static final Block BLACK_REDSTONE_LAMP = RegistryHandler.registerBlock(CutAndColored.MODID, "black_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)), CutAndColored.MOD_TAB);
    
    /******************GRANITE_BRICKS***********************/
    // FULL BLOCKS
    public static final Block GRANITE_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "granite_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)), CutAndColored.MOD_TAB);

    // STAIRS
    public static final Block GRANITE_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "granite_brick_stairs", new StairsBlock(ModBlocks.GRANITE_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.GRANITE_BRICKS)), CutAndColored.MOD_TAB);
    
    // SLABS
    public static final Block GRANITE_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "granite_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.GRANITE_BRICKS)), CutAndColored.MOD_TAB);
    
    // WALLS
    public static final Block GRANITE_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "granite_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.GRANITE_BRICKS)), CutAndColored.MOD_TAB);
    
    /******************DIORITE_BRICKS***********************/
    // FULL BLOCKS
    public static final Block DIORITE_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "diorite_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(1.5F, 6.0F)), CutAndColored.MOD_TAB);

    // STAIRS
    public static final Block DIORITE_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "diorite_brick_stairs", new StairsBlock(ModBlocks.DIORITE_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.DIORITE_BRICKS)), CutAndColored.MOD_TAB);

    // SLABS
    public static final Block DIORITE_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "diorite_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.DIORITE_BRICKS)), CutAndColored.MOD_TAB);

    // WALLS
    public static final Block DIORITE_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "diorite_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.DIORITE_BRICKS)), CutAndColored.MOD_TAB);
    
    /******************ANDESITE_BRICKS**********************/
    // FULL BLOCKS
    public static final Block ANDESITE_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "andesite_bricks", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)), CutAndColored.MOD_TAB);
    
    // STAIRS
    public static final Block ANDESITE_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "andesite_brick_stairs", new StairsBlock(ModBlocks.ANDESITE_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.ANDESITE_BRICKS)), CutAndColored.MOD_TAB);
    
    // SLABS
    public static final Block ANDESITE_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "andesite_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.ANDESITE_BRICKS)), CutAndColored.MOD_TAB);
    
    // WALLS
    public static final Block ANDESITE_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "andesite_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.ANDESITE_BRICKS)), CutAndColored.MOD_TAB);

    /*******************SOUL_SANDSTONE**********************/
    // FULL BLOCKS
    public static final Block SOUL_SANDSTONE = RegistryHandler.registerBlock(CutAndColored.MODID, "soul_sandstone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(0.8F)), CutAndColored.MOD_TAB);
    public static final Block CHISELED_SOUL_SANDSTONE = RegistryHandler.registerBlock(CutAndColored.MODID, "chiseled_soul_sandstone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(0.8F)), CutAndColored.MOD_TAB);
    public static final Block CUT_SOUL_SANDSTONE = RegistryHandler.registerBlock(CutAndColored.MODID, "cut_soul_sandstone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(0.8F)), CutAndColored.MOD_TAB);
    public static final Block SMOOTH_SOUL_SANDSTONE = RegistryHandler.registerBlock(CutAndColored.MODID, "smooth_soul_sandstone", new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(0.8F)), CutAndColored.MOD_TAB);
    
    // STAIRS
    public static final Block SOUL_SANDSTONE_STAIR = RegistryHandler.registerBlock(CutAndColored.MODID, "soul_sandstone_stairs", new StairsBlock(ModBlocks.SOUL_SANDSTONE::getDefaultState, Block.Properties.from(ModBlocks.SOUL_SANDSTONE)), CutAndColored.MOD_TAB);
    public static final Block SMOOTH_SOUL_SANDSTONE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "smooth_soul_sandstone_stairs", new StairsBlock(ModBlocks.SMOOTH_SOUL_SANDSTONE::getDefaultState, Block.Properties.from(ModBlocks.SMOOTH_SOUL_SANDSTONE)), CutAndColored.MOD_TAB);
    
    // SLABS
    public static final Block SOUL_SANDSTONE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "soul_sandstone_slab", new SlabBlock(Block.Properties.from(ModBlocks.SOUL_SANDSTONE)), CutAndColored.MOD_TAB);
    public static final Block CUT_SOUL_SANDSTONE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "cut_soul_sandstone_slab", new SlabBlock(Block.Properties.from(ModBlocks.CUT_SOUL_SANDSTONE)), CutAndColored.MOD_TAB);
    public static final Block SMOOTH_SOUL_SANDSTONE_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "smooth_soul_sandstone_slab", new SlabBlock(Block.Properties.from(ModBlocks.SMOOTH_SOUL_SANDSTONE)), CutAndColored.MOD_TAB);
    
    // WALLS
    public static final Block SOUL_SANDSTONE_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "soul_sandstone_wall", new WallBlock(Block.Properties.from(ModBlocks.SOUL_SANDSTONE)), CutAndColored.MOD_TAB);
    
    /**********************MISC_BLOCKS**********************/
    // FULL BLOCKS
    public static final Block CHISELED_PRISMARINE_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "chiseled_prismarine_bricks", new Block(Block.Properties.from(Blocks.PRISMARINE_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block PRISMARINE_BRICK_PILLAR = RegistryHandler.registerBlock(CutAndColored.MODID, "prismarine_brick_pillar", new RotatedPillarBlock(Block.Properties.from(Blocks.PRISMARINE_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block POLISHED_BLACKSTONE_PILLAR = RegistryHandler.registerBlock(CutAndColored.MODID, "polished_blackstone_pillar", new RotatedPillarBlock(Block.Properties.from(Blocks.POLISHED_BLACKSTONE)), CutAndColored.MOD_TAB);
    public static final Block END_STONE_BRICK_PILLAR = RegistryHandler.registerBlock(CutAndColored.MODID, "end_stone_brick_pillar", new RotatedPillarBlock(Block.Properties.from(Blocks.END_STONE_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block POLISHED_END_STONE = RegistryHandler.registerBlock(CutAndColored.MODID, "polished_end_stone", new Block(Block.Properties.from(Blocks.END_STONE_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block CHISELED_END_STONE_BRICKS = RegistryHandler.registerBlock(CutAndColored.MODID, "chiseled_end_stone_bricks", new Block(Block.Properties.from(Blocks.END_STONE_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block POLISHED_STONE = RegistryHandler.registerBlock(CutAndColored.MODID, "polished_stone", new Block(Block.Properties.from(Blocks.STONE)), CutAndColored.MOD_TAB);
    
    // STAIRS
    public static final Block SMOOTH_STONE_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "smooth_stone_stairs", new StairsBlock(Blocks.SMOOTH_STONE::getDefaultState, Block.Properties.from(Blocks.SMOOTH_STONE)), CutAndColored.MOD_TAB);
    public static final Block CRACKED_STONE_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "cracked_stone_brick_stairs", new StairsBlock(Blocks.CRACKED_STONE_BRICKS::getDefaultState, Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "cracked_polished_blackstone_brick_stairs", new StairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS::getDefaultState, Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block CRACKED_NETHER_BRICK_STAIRS = RegistryHandler.registerBlock(CutAndColored.MODID, "cracked_nether_brick_stairs", new StairsBlock(Blocks.CRACKED_NETHER_BRICKS::getDefaultState, Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), CutAndColored.MOD_TAB);
    
    // SLABS
    public static final Block CRACKED_STONE_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "cracked_stone_brick_slab", new SlabBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "cracked_polished_blackstone_brick_slab", new SlabBlock(Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block CRACKED_NETHER_BRICK_SLAB = RegistryHandler.registerBlock(CutAndColored.MODID, "cracked_nether_brick_slab", new SlabBlock(Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), CutAndColored.MOD_TAB);
    
    // WALLS
    public static final Block PURPUR_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "purpur_wall", new WallBlock(Block.Properties.from(Blocks.PURPUR_BLOCK)), CutAndColored.MOD_TAB);
    public static final Block PRISMARINE_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "prismarine_brick_wall", new WallBlock(Block.Properties.from(Blocks.PRISMARINE_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block DARK_PRISMARINE_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "dark_prismarine_wall", new WallBlock(Block.Properties.from(Blocks.DARK_PRISMARINE)), CutAndColored.MOD_TAB);
    public static final Block CRACKED_STONE_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "cracked_stone_brick_wall", new WallBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "cracked_polished_blackstone_brick_wall", new WallBlock(Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block CRACKED_NETHER_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "cracked_nether_brick_wall", new WallBlock(Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)), CutAndColored.MOD_TAB);
    public static final Block SMOOTH_STONE_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "smooth_stone_wall", new WallBlock(Block.Properties.from(Blocks.SMOOTH_STONE)), CutAndColored.MOD_TAB);
    public static final Block QUARTZ_BRICK_WALL = RegistryHandler.registerBlock(CutAndColored.MODID, "quartz_brick_wall", new WallBlock(Block.Properties.from(Blocks.QUARTZ_BRICKS)), CutAndColored.MOD_TAB);
    
    // MISC MODELS
    public static final Block NETHER_BRICK_FENCE_GATE = RegistryHandler.registerBlock(CutAndColored.MODID, "nether_brick_fence_gate", new FenceGateBlock(Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).hardnessAndResistance(2.0F, 6.0F)), CutAndColored.MOD_TAB);
    public static final Block IRON_FENCE_GATE = RegistryHandler.registerBlock(CutAndColored.MODID, "iron_fence_gate", new IronFenceGateBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL)), CutAndColored.MOD_TAB);
    
}
