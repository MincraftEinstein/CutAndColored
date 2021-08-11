package einstein.cutandcolored.init;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber(modid = CutAndColored.MODID, bus = Bus.MOD)
public class ModBlocks
{
    /***********************CUTTERS*************************/
    public static final Block GLASSCUTTER = register("glasscutter", new GlasscutterBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F)));
    public static final Block WEAVER = register("weaver", new WeaverBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1.3F)));
    public static final Block SAWMILL = register("sawmill", new SawmillBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1.3F)));
    
    /************************GLASS***************************/
    // FULL BLOCKS
    public static final Block SOUL_GLASS = register("soul_glass", new GlassBlock(BlockProperties.GLASS));
    
    // PANES
    public static final Block SOUL_GLASS_PANE = register("soul_glass_pane", new PaneBlock(BlockProperties.GLASS));
    public static final Block HORIZONTAL_SOUL_GLASS_PANE = RegistryHandler.registerBlock(CutAndColored.MODID, "horizontalpanes", "horizontal_soul_glass_pane", new HorizontalSoulGlassPane(Block.Properties.create(Material.GLASS).notSolid().hardnessAndResistance(0.3F, 0.3F).sound(SoundType.GLASS)), CutAndColored.MOD_TAB);
    
    // STAIRS
    public static final Block GLASS_STAIRS = register("glass_stairs", new GlassStairsBlock(Blocks.GLASS::getDefaultState, Block.Properties.from(Blocks.GLASS)));
    public static final Block SOUL_GLASS_STAIRS = register("soul_glass_stairs", new GlassStairsBlock(ModBlocks.SOUL_GLASS::getDefaultState, Block.Properties.from(ModBlocks.SOUL_GLASS)));
    public static final Block WHITE_STAINED_GLASS_STAIRS = register("white_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.WHITE_STAINED_GLASS)));
    public static final Block ORANGE_STAINED_GLASS_STAIRS = register("orange_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block MAGENTA_STAINED_GLASS_STAIRS = register("magenta_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_STAIRS = register("light_blue_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block YELLOW_STAINED_GLASS_STAIRS = register("yellow_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block LIME_STAINED_GLASS_STAIRS = register("lime_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.LIME, Blocks.LIME_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.LIME_STAINED_GLASS)));
    public static final Block PINK_STAINED_GLASS_STAIRS = register("pink_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.PINK, Blocks.PINK_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.PINK_STAINED_GLASS)));
    public static final Block GRAY_STAINED_GLASS_STAIRS = register("gray_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.GRAY_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_STAIRS = register("light_gray_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block CYAN_STAINED_GLASS_STAIRS = register("cyan_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.CYAN_STAINED_GLASS)));
    public static final Block PURPLE_STAINED_GLASS_STAIRS = register("purple_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block BLUE_STAINED_GLASS_STAIRS = register("blue_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.BLUE_STAINED_GLASS)));
    public static final Block BROWN_STAINED_GLASS_STAIRS = register("brown_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.BROWN_STAINED_GLASS)));
    public static final Block GREEN_STAINED_GLASS_STAIRS = register("green_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.GREEN_STAINED_GLASS)));
    public static final Block RED_STAINED_GLASS_STAIRS = register("red_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.RED, Blocks.RED_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.RED_STAINED_GLASS)));
    public static final Block BLACK_STAINED_GLASS_STAIRS = register("black_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.BLACK_STAINED_GLASS)));
    
    // SLABS
    public static final Block GLASS_SLAB = register("glass_slab", new GlassSlabBlock(Blocks.GLASS::getDefaultState, Block.Properties.from(Blocks.GLASS)));
    public static final Block SOUL_GLASS_SLAB = register("soul_glass_slab", new GlassSlabBlock(ModBlocks.SOUL_GLASS::getDefaultState, Block.Properties.from(ModBlocks.SOUL_GLASS)));
    public static final Block WHITE_STAINED_GLASS_SLAB = register("white_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.WHITE_STAINED_GLASS)));
    public static final Block ORANGE_STAINED_GLASS_SLAB = register("orange_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block MAGENTA_STAINED_GLASS_SLAB = register("magenta_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = register("light_blue_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block YELLOW_STAINED_GLASS_SLAB = register("yellow_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block LIME_STAINED_GLASS_SLAB = register("lime_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.LIME, Blocks.LIME_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.LIME_STAINED_GLASS)));
    public static final Block PINK_STAINED_GLASS_SLAB = register("pink_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.PINK, Blocks.PINK_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.PINK_STAINED_GLASS)));
    public static final Block GRAY_STAINED_GLASS_SLAB = register("gray_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.GRAY_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = register("light_gray_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block CYAN_STAINED_GLASS_SLAB = register("cyan_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.CYAN_STAINED_GLASS)));
    public static final Block PURPLE_STAINED_GLASS_SLAB = register("purple_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block BLUE_STAINED_GLASS_SLAB = register("blue_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.BLUE_STAINED_GLASS)));
    public static final Block BROWN_STAINED_GLASS_SLAB = register("brown_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.BROWN_STAINED_GLASS)));
    public static final Block GREEN_STAINED_GLASS_SLAB = register("green_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.GREEN_STAINED_GLASS)));
    public static final Block RED_STAINED_GLASS_SLAB = register("red_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.RED, Blocks.RED_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.RED_STAINED_GLASS)));
    public static final Block BLACK_STAINED_GLASS_SLAB = register("black_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS::getDefaultState, Block.Properties.from(Blocks.BLACK_STAINED_GLASS)));
    
    /*************************WOOL**************************/
    // STAIRS
    public static final Block WHITE_WOOL_STAIRS = register("white_wool_stairs", new StairsBlock(Blocks.WHITE_WOOL::getDefaultState, Block.Properties.from(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_WOOL_STAIRS = register("orange_wool_stairs", new StairsBlock(Blocks.ORANGE_WOOL::getDefaultState, Block.Properties.from(Blocks.ORANGE_WOOL)));
    public static final Block MAGENTA_WOOL_STAIRS = register("magenta_wool_stairs", new StairsBlock(Blocks.MAGENTA_WOOL::getDefaultState, Block.Properties.from(Blocks.MAGENTA_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_STAIRS = register("light_blue_wool_stairs", new StairsBlock(Blocks.LIGHT_BLUE_WOOL::getDefaultState, Block.Properties.from(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block YELLOW_WOOL_STAIRS = register("yellow_wool_stairs", new StairsBlock(Blocks.YELLOW_WOOL::getDefaultState, Block.Properties.from(Blocks.YELLOW_WOOL)));
    public static final Block LIME_WOOL_STAIRS = register("lime_wool_stairs", new StairsBlock(Blocks.LIME_WOOL::getDefaultState, Block.Properties.from(Blocks.LIME_WOOL)));
    public static final Block PINK_WOOL_STAIRS = register("pink_wool_stairs", new StairsBlock(Blocks.PINK_WOOL::getDefaultState, Block.Properties.from(Blocks.PINK_WOOL)));
    public static final Block GRAY_WOOL_STAIRS = register("gray_wool_stairs", new StairsBlock(Blocks.GRAY_WOOL::getDefaultState, Block.Properties.from(Blocks.GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_STAIRS = register("light_gray_wool_stairs", new StairsBlock(Blocks.LIGHT_GRAY_WOOL::getDefaultState, Block.Properties.from(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block CYAN_WOOL_STAIRS = register("cyan_wool_stairs", new StairsBlock(Blocks.CYAN_WOOL::getDefaultState, Block.Properties.from(Blocks.CYAN_WOOL)));
    public static final Block PURPLE_WOOL_STAIRS = register("purple_wool_stairs", new StairsBlock(Blocks.PURPLE_WOOL::getDefaultState, Block.Properties.from(Blocks.PURPLE_WOOL)));
    public static final Block BLUE_WOOL_STAIRS = register("blue_wool_stairs", new StairsBlock(Blocks.BLUE_WOOL::getDefaultState, Block.Properties.from(Blocks.BLUE_WOOL)));
    public static final Block BROWN_WOOL_STAIRS = register("brown_wool_stairs", new StairsBlock(Blocks.BROWN_WOOL::getDefaultState, Block.Properties.from(Blocks.BROWN_WOOL)));
    public static final Block GREEN_WOOL_STAIRS = register("green_wool_stairs", new StairsBlock(Blocks.GREEN_WOOL::getDefaultState, Block.Properties.from(Blocks.GREEN_WOOL)));
    public static final Block RED_WOOL_STAIRS = register("red_wool_stairs", new StairsBlock(Blocks.RED_WOOL::getDefaultState, Block.Properties.from(Blocks.RED_WOOL)));
    public static final Block BLACK_WOOL_STAIRS = register("black_wool_stairs", new StairsBlock(Blocks.BLACK_WOOL::getDefaultState, Block.Properties.from(Blocks.BLACK_WOOL)));
    
    // SLABS
    public static final Block WHITE_WOOL_SLAB = register("white_wool_slab", new SlabBlock(Block.Properties.from(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = register("orange_wool_slab", new SlabBlock(Block.Properties.from(Blocks.ORANGE_WOOL)));
    public static final Block MAGENTA_WOOL_SLAB = register("magenta_wool_slab", new SlabBlock(Block.Properties.from(Blocks.MAGENTA_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = register("light_blue_wool_slab", new SlabBlock(Block.Properties.from(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = register("yellow_wool_slab", new SlabBlock(Block.Properties.from(Blocks.YELLOW_WOOL)));
    public static final Block LIME_WOOL_SLAB = register("lime_wool_slab", new SlabBlock(Block.Properties.from(Blocks.LIME_WOOL)));
    public static final Block PINK_WOOL_SLAB = register("pink_wool_slab", new SlabBlock(Block.Properties.from(Blocks.PINK_WOOL)));
    public static final Block GRAY_WOOL_SLAB = register("gray_wool_slab", new SlabBlock(Block.Properties.from(Blocks.GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_SLAB = register("light_gray_wool_slab", new SlabBlock(Block.Properties.from(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block CYAN_WOOL_SLAB = register("cyan_wool_slab", new SlabBlock(Block.Properties.from(Blocks.CYAN_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = register("purple_wool_slab", new SlabBlock(Block.Properties.from(Blocks.PURPLE_WOOL)));
    public static final Block BLUE_WOOL_SLAB = register("blue_wool_slab", new SlabBlock(Block.Properties.from(Blocks.BLUE_WOOL)));
    public static final Block BROWN_WOOL_SLAB = register("brown_wool_slab", new SlabBlock(Block.Properties.from(Blocks.BROWN_WOOL)));
    public static final Block GREEN_WOOL_SLAB = register("green_wool_slab", new SlabBlock(Block.Properties.from(Blocks.GREEN_WOOL)));
    public static final Block RED_WOOL_SLAB = register("red_wool_slab", new SlabBlock(Block.Properties.from(Blocks.RED_WOOL)));
    public static final Block BLACK_WOOL_SLAB = register("black_wool_slab", new SlabBlock(Block.Properties.from(Blocks.BLACK_WOOL)));
    
    /*******************STAINED_PLANKS**********************/
    // FULL BLOCKS
    public static final Block WHITE_STAINED_PLANKS = register("white_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.SNOW)));
    public static final Block ORANGE_STAINED_PLANKS = register("orange_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.ADOBE)));
    public static final Block MAGENTA_STAINED_PLANKS = register("magenta_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.MAGENTA)));
    public static final Block LIGHT_BLUE_STAINED_PLANKS = register("light_blue_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.LIGHT_BLUE)));
    public static final Block YELLOW_STAINED_PLANKS = register("yellow_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.YELLOW)));
    public static final Block LIME_STAINED_PLANKS = register("lime_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.LIME)));
    public static final Block PINK_STAINED_PLANKS = register("pink_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.PINK)));
    public static final Block GRAY_STAINED_PLANKS = register("gray_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.GRAY)));
    public static final Block LIGHT_GRAY_STAINED_PLANKS = register("light_gray_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.LIGHT_GRAY)));
    public static final Block CYAN_STAINED_PLANKS = register("cyan_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.CYAN)));
    public static final Block PURPLE_STAINED_PLANKS = register("purple_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.PURPLE)));
    public static final Block BLUE_STAINED_PLANKS = register("blue_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.BLUE)));
    public static final Block BROWN_STAINED_PLANKS = register("brown_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.BROWN)));
    public static final Block GREEN_STAINED_PLANKS = register("green_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.GREEN)));
    public static final Block RED_STAINED_PLANKS = register("red_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.RED)));
    public static final Block BLACK_STAINED_PLANKS = register("black_stained_planks", new Block(BlockProperties.StainedPlanks(MaterialColor.BLACK)));
    
    // STAIRS
    public static final Block WHITE_STAINED_PLANK_STAIRS = register("white_stained_plank_stairs", new StairsBlock(ModBlocks.WHITE_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.WHITE_STAINED_PLANKS)));
    public static final Block ORANGE_STAINED_PLANK_STAIRS = register("orange_stained_plank_stairs", new StairsBlock(ModBlocks.ORANGE_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.ORANGE_STAINED_PLANKS)));
    public static final Block MAGENTA_STAINED_PLANK_STAIRS = register("magenta_stained_plank_stairs", new StairsBlock(ModBlocks.MAGENTA_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.MAGENTA_STAINED_PLANKS)));
    public static final Block LIGHT_BLUE_STAINED_PLANK_STAIRS = register("light_blue_stained_plank_stairs", new StairsBlock(ModBlocks.LIGHT_BLUE_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.LIGHT_BLUE_STAINED_PLANKS)));
    public static final Block YELLOW_STAINED_PLANK_STAIRS = register("yellow_stained_plank_stairs", new StairsBlock(ModBlocks.YELLOW_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.YELLOW_STAINED_PLANKS)));
    public static final Block LIME_STAINED_PLANK_STAIRS = register("lime_stained_plank_stairs", new StairsBlock(ModBlocks.LIME_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.LIME_STAINED_PLANKS)));
    public static final Block PINK_STAINED_PLANK_STAIRS = register("pink_stained_plank_stairs", new StairsBlock(ModBlocks.PINK_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.PINK_STAINED_PLANKS)));
    public static final Block GRAY_STAINED_PLANK_STAIRS = register("gray_stained_plank_stairs", new StairsBlock(ModBlocks.GRAY_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.GRAY_STAINED_PLANKS)));
    public static final Block LIGHT_GRAY_STAINED_PLANK_STAIRS = register("light_gray_stained_plank_stairs", new StairsBlock(ModBlocks.LIGHT_GRAY_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.LIGHT_GRAY_STAINED_PLANKS)));
    public static final Block CYAN_STAINED_PLANK_STAIRS = register("cyan_stained_plank_stairs", new StairsBlock(ModBlocks.CYAN_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.CYAN_STAINED_PLANKS)));
    public static final Block PURPLE_STAINED_PLANK_STAIRS = register("purple_stained_plank_stairs", new StairsBlock(ModBlocks.PURPLE_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.PURPLE_STAINED_PLANKS)));
    public static final Block BLUE_STAINED_PLANK_STAIRS = register("blue_stained_plank_stairs", new StairsBlock(ModBlocks.BLUE_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.BLUE_STAINED_PLANKS)));
    public static final Block BROWN_STAINED_PLANK_STAIRS = register("brown_stained_plank_stairs", new StairsBlock(ModBlocks.BROWN_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.BROWN_STAINED_PLANKS)));
    public static final Block GREEN_STAINED_PLANK_STAIRS = register("green_stained_plank_stairs", new StairsBlock(ModBlocks.GREEN_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.GREEN_STAINED_PLANKS)));
    public static final Block RED_STAINED_PLANK_STAIRS = register("red_stained_plank_stairs", new StairsBlock(ModBlocks.RED_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.RED_STAINED_PLANKS)));
    public static final Block BLACK_STAINED_PLANK_STAIRS = register("black_stained_plank_stairs", new StairsBlock(ModBlocks.BLACK_STAINED_PLANKS::getDefaultState, Block.Properties.from(ModBlocks.BLACK_STAINED_PLANKS)));
    
    // SLABS
    public static final Block WHITE_STAINED_PLANK_SLAB = register("white_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.WHITE_STAINED_PLANKS)));
    public static final Block ORANGE_STAINED_PLANK_SLAB = register("orange_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.ORANGE_STAINED_PLANKS)));
    public static final Block MAGENTA_STAINED_PLANK_SLAB = register("magenta_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.MAGENTA_STAINED_PLANKS)));
    public static final Block LIGHT_BLUE_STAINED_PLANK_SLAB = register("light_blue_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_BLUE_STAINED_PLANKS)));
    public static final Block YELLOW_STAINED_PLANK_SLAB = register("yellow_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.YELLOW_STAINED_PLANKS)));
    public static final Block LIME_STAINED_PLANK_SLAB = register("lime_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.LIME_STAINED_PLANKS)));
    public static final Block PINK_STAINED_PLANK_SLAB = register("pink_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.PINK_STAINED_PLANKS)));
    public static final Block GRAY_STAINED_PLANK_SLAB = register("gray_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.GRAY_STAINED_PLANKS)));
    public static final Block LIGHT_GRAY_STAINED_PLANK_SLAB = register("light_gray_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_GRAY_STAINED_PLANKS)));
    public static final Block CYAN_STAINED_PLANK_SLAB = register("cyan_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.CYAN_STAINED_PLANKS)));
    public static final Block PURPLE_STAINED_PLANK_SLAB = register("purple_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.PURPLE_STAINED_PLANKS)));
    public static final Block BLUE_STAINED_PLANK_SLAB = register("blue_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.BLUE_STAINED_PLANKS)));
    public static final Block BROWN_STAINED_PLANK_SLAB = register("brown_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.BROWN_STAINED_PLANKS)));
    public static final Block GREEN_STAINED_PLANK_SLAB = register("green_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.GREEN_STAINED_PLANKS)));
    public static final Block RED_STAINED_PLANK_SLAB = register("red_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.RED_STAINED_PLANKS)));
    public static final Block BLACK_STAINED_PLANK_SLAB = register("black_stained_plank_slab", new SlabBlock(Block.Properties.from(ModBlocks.BLACK_STAINED_PLANKS)));
    
    /*********************TERRACOTTA************************/
    // STAIRS
    public static final Block TERRACOTTA_STAIRS = register("terracotta_stairs", new StairsBlock(Blocks.TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", new StairsBlock(Blocks.WHITE_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.WHITE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", new StairsBlock(Blocks.ORANGE_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.ORANGE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", new StairsBlock(Blocks.MAGENTA_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", new StairsBlock(Blocks.YELLOW_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", new StairsBlock(Blocks.LIME_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.LIME_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", new StairsBlock(Blocks.PINK_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.PINK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", new StairsBlock(Blocks.GRAY_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", new StairsBlock(Blocks.CYAN_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.CYAN_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", new StairsBlock(Blocks.PURPLE_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.PURPLE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", new StairsBlock(Blocks.BLUE_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.BLUE_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", new StairsBlock(Blocks.BROWN_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.BROWN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", new StairsBlock(Blocks.GREEN_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.GREEN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", new StairsBlock(Blocks.RED_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.RED_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", new StairsBlock(Blocks.BLACK_TERRACOTTA::getDefaultState, Block.Properties.from(Blocks.BLACK_TERRACOTTA)));
    
    // SLABS
    public static final Block TERRACOTTA_SLAB = register("terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.WHITE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.ORANGE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.LIME_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.PINK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.CYAN_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.PURPLE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.BLUE_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.BROWN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.GREEN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SLAB = register("red_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.RED_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab", new SlabBlock(Block.Properties.from(Blocks.BLACK_TERRACOTTA)));
    
    /**********************CONCRETE*************************/
    // STAIRS
    public static final Block WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", new StairsBlock(Blocks.WHITE_CONCRETE::getDefaultState, Block.Properties.from(Blocks.WHITE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", new StairsBlock(Blocks.ORANGE_CONCRETE::getDefaultState, Block.Properties.from(Blocks.ORANGE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", new StairsBlock(Blocks.MAGENTA_CONCRETE::getDefaultState, Block.Properties.from(Blocks.MAGENTA_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE::getDefaultState, Block.Properties.from(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", new StairsBlock(Blocks.YELLOW_CONCRETE::getDefaultState, Block.Properties.from(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", new StairsBlock(Blocks.LIME_CONCRETE::getDefaultState, Block.Properties.from(Blocks.LIME_CONCRETE)));
    public static final Block PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", new StairsBlock(Blocks.PINK_CONCRETE::getDefaultState, Block.Properties.from(Blocks.PINK_CONCRETE)));
    public static final Block GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", new StairsBlock(Blocks.GRAY_CONCRETE::getDefaultState, Block.Properties.from(Blocks.GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE::getDefaultState, Block.Properties.from(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", new StairsBlock(Blocks.CYAN_CONCRETE::getDefaultState, Block.Properties.from(Blocks.CYAN_CONCRETE)));
    public static final Block PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", new StairsBlock(Blocks.PURPLE_CONCRETE::getDefaultState, Block.Properties.from(Blocks.PURPLE_CONCRETE)));
    public static final Block BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", new StairsBlock(Blocks.BLUE_CONCRETE::getDefaultState, Block.Properties.from(Blocks.BLUE_CONCRETE)));
    public static final Block BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", new StairsBlock(Blocks.BROWN_CONCRETE::getDefaultState, Block.Properties.from(Blocks.BROWN_CONCRETE)));
    public static final Block GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", new StairsBlock(Blocks.GREEN_CONCRETE::getDefaultState, Block.Properties.from(Blocks.GREEN_CONCRETE)));
    public static final Block RED_CONCRETE_STAIRS = register("red_concrete_stairs", new StairsBlock(Blocks.RED_CONCRETE::getDefaultState, Block.Properties.from(Blocks.RED_CONCRETE)));
    public static final Block BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", new StairsBlock(Blocks.BLACK_CONCRETE::getDefaultState, Block.Properties.from(Blocks.BLACK_CONCRETE)));
    
	// SLABS
    public static final Block WHITE_CONCRETE_SLAB = register("white_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.WHITE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.ORANGE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.MAGENTA_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_SLAB = register("lime_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.LIME_CONCRETE)));
    public static final Block PINK_CONCRETE_SLAB = register("pink_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.PINK_CONCRETE)));
    public static final Block GRAY_CONCRETE_SLAB = register("gray_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.CYAN_CONCRETE)));
    public static final Block PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.PURPLE_CONCRETE)));
    public static final Block BLUE_CONCRETE_SLAB = register("blue_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.BLUE_CONCRETE)));
    public static final Block BROWN_CONCRETE_SLAB = register("brown_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.BROWN_CONCRETE)));
    public static final Block GREEN_CONCRETE_SLAB = register("green_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.GREEN_CONCRETE)));
    public static final Block RED_CONCRETE_SLAB = register("red_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.RED_CONCRETE)));
    public static final Block BLACK_CONCRETE_SLAB = register("black_concrete_slab", new SlabBlock(Block.Properties.from(Blocks.BLACK_CONCRETE)));
    
    /*******************STAINED_BRICKS**********************/
    // FULL BLOCKS
    public static final Block WHITE_STAINED_BRICKS = register("white_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.SNOW)));
    public static final Block ORANGE_STAINED_BRICKS = register("orange_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.ADOBE)));
    public static final Block MAGENTA_STAINED_BRICKS = register("magenta_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.MAGENTA)));
    public static final Block LIGHT_BLUE_STAINED_BRICKS = register("light_blue_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.LIGHT_BLUE)));
    public static final Block YELLOW_STAINED_BRICKS = register("yellow_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.YELLOW)));
    public static final Block LIME_STAINED_BRICKS = register("lime_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.LIME)));
    public static final Block PINK_STAINED_BRICKS = register("pink_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.PINK)));
    public static final Block GRAY_STAINED_BRICKS = register("gray_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.GRAY)));
    public static final Block LIGHT_GRAY_STAINED_BRICKS = register("light_gray_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.LIGHT_GRAY)));
    public static final Block CYAN_STAINED_BRICKS = register("cyan_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.CYAN)));
    public static final Block PURPLE_STAINED_BRICKS = register("purple_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.PURPLE)));
    public static final Block BLUE_STAINED_BRICKS = register("blue_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.BLUE)));
    public static final Block BROWN_STAINED_BRICKS = register("brown_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.BROWN)));
    public static final Block GREEN_STAINED_BRICKS = register("green_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.GREEN)));
    public static final Block RED_STAINED_BRICKS = register("red_stained_bricks", new Block(BlockProperties.StainedBricks(MaterialColor.RED)));
    public static final Block BLACK_STAINED_BRICKS = register("black_stained_bricks", new Block(BlockProperties.StainedBricks( MaterialColor.BLACK)));
    
    // STAIRS
    public static final Block WHITE_STAINED_BRICK_STAIRS = register("white_stained_brick_stairs", new StairsBlock(ModBlocks.WHITE_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.WHITE_STAINED_BRICKS)));
    public static final Block ORANGE_STAINED_BRICK_STAIRS = register("orange_stained_brick_stairs", new StairsBlock(ModBlocks.ORANGE_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.ORANGE_STAINED_BRICKS)));
    public static final Block MAGENTA_STAINED_BRICK_STAIRS = register("magenta_stained_brick_stairs", new StairsBlock(ModBlocks.MAGENTA_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.MAGENTA_STAINED_BRICKS)));
    public static final Block LIGHT_BLUE_STAINED_BRICK_STAIRS = register("light_blue_stained_brick_stairs", new StairsBlock(ModBlocks.LIGHT_BLUE_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.LIGHT_BLUE_STAINED_BRICKS)));
    public static final Block YELLOW_STAINED_BRICK_STAIRS = register("yellow_stained_brick_stairs", new StairsBlock(ModBlocks.YELLOW_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.YELLOW_STAINED_BRICKS)));
    public static final Block LIME_STAINED_BRICK_STAIRS = register("lime_stained_brick_stairs", new StairsBlock(ModBlocks.LIME_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.LIME_STAINED_BRICKS)));
    public static final Block PINK_STAINED_BRICK_STAIRS = register("pink_stained_brick_stairs", new StairsBlock(ModBlocks.PINK_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.PINK_STAINED_BRICKS)));
    public static final Block GRAY_STAINED_BRICK_STAIRS = register("gray_stained_brick_stairs", new StairsBlock(ModBlocks.GRAY_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.GRAY_STAINED_BRICKS)));
    public static final Block LIGHT_GRAY_STAINED_BRICK_STAIRS = register("light_gray_stained_brick_stairs", new StairsBlock(ModBlocks.LIGHT_GRAY_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.LIGHT_GRAY_STAINED_BRICKS)));
    public static final Block CYAN_STAINED_BRICK_STAIRS = register("cyan_stained_brick_stairs", new StairsBlock(ModBlocks.CYAN_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.CYAN_STAINED_BRICKS)));
    public static final Block PURPLE_STAINED_BRICK_STAIRS = register("purple_stained_brick_stairs", new StairsBlock(ModBlocks.PURPLE_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.PURPLE_STAINED_BRICKS)));
    public static final Block BLUE_STAINED_BRICK_STAIRS = register("blue_stained_brick_stairs", new StairsBlock(ModBlocks.BLUE_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.BLUE_STAINED_BRICKS)));
    public static final Block BROWN_STAINED_BRICK_STAIRS = register("brown_stained_brick_stairs", new StairsBlock(ModBlocks.BROWN_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.BROWN_STAINED_BRICKS)));
    public static final Block GREEN_STAINED_BRICK_STAIRS = register("green_stained_brick_stairs", new StairsBlock(ModBlocks.GREEN_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.GREEN_STAINED_BRICKS)));
    public static final Block RED_STAINED_BRICK_STAIRS = register("red_stained_brick_stairs", new StairsBlock(ModBlocks.RED_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.RED_STAINED_BRICKS)));
    public static final Block BLACK_STAINED_BRICK_STAIRS = register("black_stained_brick_stairs", new StairsBlock(ModBlocks.BLACK_STAINED_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.BLACK_STAINED_BRICKS)));
    
    // SLABS
    public static final Block WHITE_STAINED_BRICK_SLAB = register("white_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.WHITE_STAINED_BRICKS)));
    public static final Block ORANGE_STAINED_BRICK_SLAB = register("orange_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.ORANGE_STAINED_BRICKS)));
    public static final Block MAGENTA_STAINED_BRICK_SLAB = register("magenta_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.MAGENTA_STAINED_BRICKS)));
    public static final Block LIGHT_BLUE_STAINED_BRICK_SLAB = register("light_blue_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_BLUE_STAINED_BRICKS)));
    public static final Block YELLOW_STAINED_BRICK_SLAB = register("yellow_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.YELLOW_STAINED_BRICKS)));
    public static final Block LIME_STAINED_BRICK_SLAB = register("lime_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.LIME_STAINED_BRICKS)));
    public static final Block PINK_STAINED_BRICK_SLAB = register("pink_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.PINK_STAINED_BRICKS)));
    public static final Block GRAY_STAINED_BRICK_SLAB = register("gray_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.GRAY_STAINED_BRICKS)));
    public static final Block LIGHT_GRAY_STAINED_BRICK_SLAB = register("light_gray_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.LIGHT_GRAY_STAINED_BRICKS)));
    public static final Block CYAN_STAINED_BRICK_SLAB = register("cyan_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.CYAN_STAINED_BRICKS)));
    public static final Block PURPLE_STAINED_BRICK_SLAB = register("purple_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.PURPLE_STAINED_BRICKS)));
    public static final Block BLUE_STAINED_BRICK_SLAB = register("blue_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.BLUE_STAINED_BRICKS)));
    public static final Block BROWN_STAINED_BRICK_SLAB = register("brown_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.BROWN_STAINED_BRICKS)));
    public static final Block GREEN_STAINED_BRICK_SLAB = register("green_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.GREEN_STAINED_BRICKS)));
    public static final Block RED_STAINED_BRICK_SLAB = register("red_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.RED_STAINED_BRICKS)));
    public static final Block BLACK_STAINED_BRICK_SLAB = register("black_stained_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.BLACK_STAINED_BRICKS)));
    
    // WALLS
    public static final Block WHITE_STAINED_BRICK_WALL = register("white_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.WHITE_STAINED_BRICKS)));
    public static final Block ORANGE_STAINED_BRICK_WALL = register("orange_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.ORANGE_STAINED_BRICKS)));
    public static final Block MAGENTA_STAINED_BRICK_WALL = register("magenta_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.MAGENTA_STAINED_BRICKS)));
    public static final Block LIGHT_BLUE_STAINED_BRICK_WALL = register("light_blue_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.LIGHT_BLUE_STAINED_BRICKS)));
    public static final Block YELLOW_STAINED_BRICK_WALL = register("yellow_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.YELLOW_STAINED_BRICKS)));
    public static final Block LIME_STAINED_BRICK_WALL = register("lime_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.LIME_STAINED_BRICKS)));
    public static final Block PINK_STAINED_BRICK_WALL = register("pink_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.PINK_STAINED_BRICKS)));
    public static final Block GRAY_STAINED_BRICK_WALL = register("gray_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.GRAY_STAINED_BRICKS)));
    public static final Block LIGHT_GRAY_STAINED_BRICK_WALL = register("light_gray_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.LIGHT_GRAY_STAINED_BRICKS)));
    public static final Block CYAN_STAINED_BRICK_WALL = register("cyan_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.CYAN_STAINED_BRICKS)));
    public static final Block PURPLE_STAINED_BRICK_WALL = register("purple_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.PURPLE_STAINED_BRICKS)));
    public static final Block BLUE_STAINED_BRICK_WALL = register("blue_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.BLUE_STAINED_BRICKS)));
    public static final Block BROWN_STAINED_BRICK_WALL = register("brown_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.BROWN_STAINED_BRICKS)));
    public static final Block GREEN_STAINED_BRICK_WALL = register("green_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.GREEN_STAINED_BRICKS)));
    public static final Block RED_STAINED_BRICK_WALL = register("red_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.RED_STAINED_BRICKS)));
    public static final Block BLACK_STAINED_BRICK_WALL = register("black_stained_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.BLACK_STAINED_BRICKS)));
    
    /************************LAMPS**************************/
    public static final Block WHITE_REDSTONE_LAMP = register("white_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block ORANGE_REDSTONE_LAMP = register("orange_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block MAGENTA_REDSTONE_LAMP = register("magenta_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block LIGHT_BLUE_REDSTONE_LAMP = register("light_blue_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block YELLOW_REDSTONE_LAMP = register("yellow_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block LIME_REDSTONE_LAMP = register("lime_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block PINK_REDSTONE_LAMP = register("pink_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block GRAY_REDSTONE_LAMP = register("gray_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block LIGHT_GRAY_REDSTONE_LAMP = register("light_gray_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block CYAN_REDSTONE_LAMP = register("cyan_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block PURPLE_REDSTONE_LAMP = register("purple_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block BLUE_REDSTONE_LAMP = register("blue_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block BROWN_REDSTONE_LAMP = register("brown_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block GREEN_REDSTONE_LAMP = register("green_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block RED_REDSTONE_LAMP = register("red_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    public static final Block BLACK_REDSTONE_LAMP = register("black_redstone_lamp", new ColoredRedstoneLamp(Blocks.REDSTONE_LAMP::getDefaultState, Block.Properties.from(Blocks.REDSTONE_LAMP)));
    
    /******************GRANITE_BRICKS***********************/
    // FULL BLOCKS
    public static final Block GRANITE_BRICKS = register("granite_bricks", new Block(BlockProperties.Stone(MaterialColor.DIRT)));

    // STAIRS
    public static final Block GRANITE_BRICK_STAIRS = register("granite_brick_stairs", new StairsBlock(ModBlocks.GRANITE_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.GRANITE_BRICKS)));
    
    // SLABS
    public static final Block GRANITE_BRICK_SLAB = register("granite_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.GRANITE_BRICKS)));
    
    // WALLS
    public static final Block GRANITE_BRICK_WALL = register("granite_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.GRANITE_BRICKS)));
    
    /******************DIORITE_BRICKS***********************/
    // FULL BLOCKS
    public static final Block DIORITE_BRICKS = register("diorite_bricks", new Block(BlockProperties.Stone(MaterialColor.QUARTZ)));

    // STAIRS
    public static final Block DIORITE_BRICK_STAIRS = register("diorite_brick_stairs", new StairsBlock(ModBlocks.DIORITE_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.DIORITE_BRICKS)));

    // SLABS
    public static final Block DIORITE_BRICK_SLAB = register("diorite_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.DIORITE_BRICKS)));

    // WALLS
    public static final Block DIORITE_BRICK_WALL = register("diorite_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.DIORITE_BRICKS)));
    
    /******************ANDESITE_BRICKS**********************/
    // FULL BLOCKS
    public static final Block ANDESITE_BRICKS = register("andesite_bricks", new Block(BlockProperties.Stone(MaterialColor.STONE)));
    
    // STAIRS
    public static final Block ANDESITE_BRICK_STAIRS = register("andesite_brick_stairs", new StairsBlock(ModBlocks.ANDESITE_BRICKS::getDefaultState, Block.Properties.from(ModBlocks.ANDESITE_BRICKS)));
    
    // SLABS
    public static final Block ANDESITE_BRICK_SLAB = register("andesite_brick_slab", new SlabBlock(Block.Properties.from(ModBlocks.ANDESITE_BRICKS)));
    
    // WALLS
    public static final Block ANDESITE_BRICK_WALL = register("andesite_brick_wall", new WallBlock(Block.Properties.from(ModBlocks.ANDESITE_BRICKS)));

    /*******************SOUL_SANDSTONE**********************/
    // FULL BLOCKS
    public static final Block SOUL_SANDSTONE = register("soul_sandstone", new Block(BlockProperties.SOUL_SANDSTONE));
    public static final Block CHISELED_SOUL_SANDSTONE = register("chiseled_soul_sandstone", new Block(BlockProperties.SOUL_SANDSTONE));
    public static final Block CUT_SOUL_SANDSTONE = register("cut_soul_sandstone", new Block(BlockProperties.SOUL_SANDSTONE));
    public static final Block SMOOTH_SOUL_SANDSTONE = register("smooth_soul_sandstone", new Block(BlockProperties.SOUL_SANDSTONE));
    
    // STAIRS
    public static final Block SOUL_SANDSTONE_STAIR = register("soul_sandstone_stairs", new StairsBlock(ModBlocks.SOUL_SANDSTONE::getDefaultState, Block.Properties.from(ModBlocks.SOUL_SANDSTONE)));
    public static final Block SMOOTH_SOUL_SANDSTONE_STAIRS = register("smooth_soul_sandstone_stairs", new StairsBlock(ModBlocks.SMOOTH_SOUL_SANDSTONE::getDefaultState, Block.Properties.from(ModBlocks.SMOOTH_SOUL_SANDSTONE)));
    
    // SLABS
    public static final Block SOUL_SANDSTONE_SLAB = register("soul_sandstone_slab", new SlabBlock(Block.Properties.from(ModBlocks.SOUL_SANDSTONE)));
    public static final Block CUT_SOUL_SANDSTONE_SLAB = register("cut_soul_sandstone_slab", new SlabBlock(Block.Properties.from(ModBlocks.CUT_SOUL_SANDSTONE)));
    public static final Block SMOOTH_SOUL_SANDSTONE_SLAB = register("smooth_soul_sandstone_slab", new SlabBlock(Block.Properties.from(ModBlocks.SMOOTH_SOUL_SANDSTONE)));
    
    // WALLS
    public static final Block SOUL_SANDSTONE_WALL = register("soul_sandstone_wall", new WallBlock(Block.Properties.from(ModBlocks.SOUL_SANDSTONE)));
    
    /**********************MISC_BLOCKS**********************/
    // FULL BLOCKS
    public static final Block CHISELED_PRISMARINE_BRICKS = register("chiseled_prismarine_bricks", new Block(Block.Properties.from(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICK_PILLAR = register("prismarine_brick_pillar", new RotatedPillarBlock(Block.Properties.from(Blocks.PRISMARINE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_PILLAR = register("polished_blackstone_pillar", new RotatedPillarBlock(Block.Properties.from(Blocks.POLISHED_BLACKSTONE)));
    public static final Block END_STONE_BRICK_PILLAR = register("end_stone_brick_pillar", new RotatedPillarBlock(Block.Properties.from(Blocks.END_STONE_BRICKS)));
    public static final Block POLISHED_END_STONE = register("polished_end_stone", new Block(Block.Properties.from(Blocks.END_STONE_BRICKS)));
    public static final Block CHISELED_END_STONE_BRICKS = register("chiseled_end_stone_bricks", new Block(Block.Properties.from(Blocks.END_STONE_BRICKS)));
    public static final Block POLISHED_STONE = register("polished_stone", new Block(BlockProperties.Stone(MaterialColor.STONE)));
    
    // STAIRS
    public static final Block SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", new StairsBlock(Blocks.SMOOTH_STONE::getDefaultState, Block.Properties.from(Blocks.SMOOTH_STONE)));
    public static final Block CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new StairsBlock(Blocks.CRACKED_STONE_BRICKS::getDefaultState, Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = register("cracked_polished_blackstone_brick_stairs", new StairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS::getDefaultState, Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", new StairsBlock(Blocks.CRACKED_NETHER_BRICKS::getDefaultState, Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)));
    
    // SLABS
    public static final Block CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", new SlabBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = register("cracked_polished_blackstone_brick_slab", new SlabBlock(Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", new SlabBlock(Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)));
    
    // WALLS
    public static final Block PURPUR_WALL = register("purpur_wall", new WallBlock(Block.Properties.from(Blocks.PURPUR_BLOCK)));
    public static final Block PRISMARINE_BRICK_WALL = register("prismarine_brick_wall", new WallBlock(Block.Properties.from(Blocks.PRISMARINE_BRICKS)));
    public static final Block DARK_PRISMARINE_WALL = register("dark_prismarine_wall", new WallBlock(Block.Properties.from(Blocks.DARK_PRISMARINE)));
    public static final Block CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new WallBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = register("cracked_polished_blackstone_brick_wall", new WallBlock(Block.Properties.from(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", new WallBlock(Block.Properties.from(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block SMOOTH_STONE_WALL = register("smooth_stone_wall", new WallBlock(Block.Properties.from(Blocks.SMOOTH_STONE)));
    public static final Block QUARTZ_BRICK_WALL = register("quartz_brick_wall", new WallBlock(Block.Properties.from(Blocks.QUARTZ_BRICKS)));
    
    // MISC MODELS
    public static final Block NETHER_BRICK_FENCE_GATE = register("nether_brick_fence_gate", new FenceGateBlock(Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).hardnessAndResistance(2.0F, 6.0F)));
    public static final Block IRON_FENCE_GATE = register("iron_fence_gate", new IronFenceGateBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL)));
    
    public static Block register(String name, Block block) {
    	return RegistryHandler.registerBlock(CutAndColored.MODID, name, block, CutAndColored.MOD_TAB);
    }
    
	public static final List<Block> allBlocks = new ArrayList<Block>(ForgeRegistries.BLOCKS.getValues().stream()
            .filter((block) -> CutAndColored.MODID.equals(Objects.requireNonNull(block.getRegistryName()).getNamespace()))
            .collect(Collectors.toList()));
	
	public static final List<Block> allMCBlocks = new ArrayList<Block>(ForgeRegistries.BLOCKS.getValues().stream()
            .filter((block) -> CutAndColored.MCMODID.equals(Objects.requireNonNull(block.getRegistryName()).getNamespace()))
            .collect(Collectors.toList()));
	
    public static class BlockProperties
    {
    	public static final Block.Properties GLASS = Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid().setAllowsSpawn(Blocks::neverAllowSpawn).setOpaque(Blocks::isntSolid).setSuffocates(Blocks::isntSolid).setBlocksVision(Blocks::isntSolid);
    	public static final Block.Properties SOUL_SANDSTONE = Block.Properties.create(Material.ROCK, MaterialColor.BROWN).setRequiresTool().hardnessAndResistance(0.8F);
    	
    	public static Block.Properties StainedPlanks(MaterialColor color) {
    		return Block.Properties.create(Material.WOOD, color).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD);
    	}
    	
    	public static Block.Properties StainedBricks(MaterialColor color) {
    		return Block.Properties.create(Material.ROCK, color).setRequiresTool().hardnessAndResistance(2.0F, 6.0F);
    	}
    	
    	public static Block.Properties Stone(MaterialColor color) {
    		return Block.Properties.create(Material.ROCK, color).setRequiresTool().hardnessAndResistance(1.5F, 6.0F);
    	}
    }
}
