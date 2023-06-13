package einstein.cutandcolored.data;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.tags.ItemTagsGenerator;
import einstein.cutandcolored.util.RecipeResources;
import einstein.cutandcolored.util.Util;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipesGenerator extends RecipeResources {

    private final List<String[]> woodTypes = new ArrayList<>();
    private String namespace;

    public ModRecipesGenerator(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        setConsumer(consumer);
        buildCraftingRecipes();
        buildGlasscuttingRecipes();
        buildWeavingRecipes();
        buildStoneCuttingRecipes();
        buildSmeltingRecipes();
        buildSawmillingRecipes();
    }

    private void buildCraftingRecipes() {
        vanillaColoredRecipes();
        stoneBrickTypeRecipes();

        for (int i = 0; i < CutAndColored.BOARD_TYPES.length; i++) {
            String type = CutAndColored.BOARD_TYPES[i];
            String slab = type + "_board_slab";
            String stairs = type + "_board_stairs";
            Item block = getItem(modRL(type + "_boards"));

            slabsRecipe(slab, block, getItem(modRL(slab)), "board_slabs");
            stairsRecipe(stairs, block, getItem(modRL(stairs)), "board_stairs");
        }

        pillarRecipe(Blocks.END_STONE_BRICK_SLAB, ModBlocks.CHISELED_END_STONE_BRICKS.get(), 1);
        pillarRecipe(Blocks.PRISMARINE_BRICK_SLAB, ModBlocks.CHISELED_PRISMARINE_BRICKS.get(), 1);
        pillarRecipe(ModBlocks.SOUL_SANDSTONE_SLAB.get(), ModBlocks.CHISELED_SOUL_SANDSTONE.get(), 1);

        slabsRecipe("cracked_nether_brick_slab", Blocks.CRACKED_NETHER_BRICKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB.get(), "");
        stairsRecipe("cracked_nether_brick_stairs", Blocks.CRACKED_NETHER_BRICKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), "");
        wallsRecipe("cracked_nether_brick_wall", Blocks.CRACKED_NETHER_BRICKS, ModBlocks.CRACKED_NETHER_BRICK_WALL.get(), "");

        slabsRecipe("cracked_polished_blackstone_brick_slab", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), "");
        stairsRecipe("cracked_polished_blackstone_brick_stairs", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), "");
        wallsRecipe("cracked_polished_blackstone_brick_wall", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(), "");

        slabsRecipe("cracked_stone_brick_slab", Blocks.CRACKED_STONE_BRICKS, ModBlocks.CRACKED_STONE_BRICK_SLAB.get(), "");
        stairsRecipe("cracked_stone_brick_stairs", Blocks.CRACKED_STONE_BRICKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS.get(), "");
        wallsRecipe("cracked_stone_brick_wall", Blocks.CRACKED_STONE_BRICKS, ModBlocks.CRACKED_STONE_BRICK_WALL.get(), "");

        slabsRecipe("cracked_deepslate_brick_slab", Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), "");
        stairsRecipe("cracked_deepslate_brick_stairs", Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), "");
        wallsRecipe("cracked_deepslate_brick_wall", Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(), "");

        slabsRecipe("cracked_deepslate_tile_slab", Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), "");
        stairsRecipe("cracked_deepslate_tile_stairs", Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), "");
        wallsRecipe("cracked_deepslate_tile_wall", Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(), "");

        blockRecipe4x4("cut_soul_sandstone", ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE.get(), 1);
        slabsRecipe("cut_soul_sandstone_slab", ModBlocks.CUT_SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE_SLAB.get(), "");

        wallsRecipe("dark_prismarine_wall", Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_WALL.get(), "");

        pillarRecipe(Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_PILLAR.get(), 2);

        blockRecipe4x4("obsidian_bricks", Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_BRICKS.get(), 4);
        pillarRecipe(ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_PILLAR.get(), 2);
        stairsRecipe("obsidian_brick_stairs", ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_STAIRS.get(), "");
        slabsRecipe("obsidian_brick_slab", ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_SLAB.get(), "");
        wallsRecipe("obsidian_brick_wall", ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_WALL.get(), "");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLASSCUTTER.get())
                .pattern(" # ")
                .pattern("$$$")
                .define('#', Items.DIAMOND)
                .define('$', Blocks.STONE)
                .unlockedBy("has_item", has(Items.DIAMOND))
                .save(consumer, location(ModBlocks.GLASSCUTTER.get(), Type.CRAFTING));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.IRON_FENCE_GATE.get())
                .pattern("$#$")
                .pattern("$#$")
                .define('#', Items.IRON_INGOT)
                .define('$', Items.IRON_NUGGET)
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, location(ModBlocks.IRON_FENCE_GATE.get(), Type.CRAFTING));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.NETHER_BRICK_FENCE_GATE.get())
                .pattern("$#$")
                .pattern("$#$")
                .define('#', Blocks.NETHER_BRICKS)
                .define('$', Items.NETHER_BRICK)
                .unlockedBy("has_item", has(Blocks.NETHER_BRICKS))
                .save(consumer, location(ModBlocks.NETHER_BRICK_FENCE_GATE.get(), Type.CRAFTING));

        pillarRecipe(Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_PILLAR.get(), 2);

        blockRecipe4x4("polished_end_stone", Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE.get(), 4);

        blockRecipe4x4("polished_stone", Blocks.STONE_BRICKS, ModBlocks.POLISHED_STONE.get(), 4);

        pillarRecipe(Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_PILLAR.get(), 2);
        wallsRecipe("prismarine_brick_wall", Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_WALL.get(), "");

        wallsRecipe("purpur_wall", Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_WALL.get(), "");

        slabsRecipe("quartz_brick_slab", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_SLAB.get(), "");
        stairsRecipe("quartz_brick_stairs", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_STAIRS.get(), "");
        wallsRecipe("quartz_brick_wall", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_WALL.get(), "");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAWMILL.get())
                .pattern(" # ")
                .pattern("$$$")
                .define('#', Items.IRON_INGOT)
                .define('$', ItemTags.PLANKS)
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, location(ModBlocks.SAWMILL.get(), Type.CRAFTING));

        slabsRecipe("smooth_soul_sandstone_slab", ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get(), "");
        stairsRecipe("smooth_soul_sandstone_stairs", ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get(), "");

        stairsRecipe("smooth_stone_stairs", Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS.get(), "");
        wallsRecipe("smooth_stone_wall", Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_WALL.get(), "");

        wallsRecipe("glass_window_pane", ModBlocks.GLASS_WINDOW.get(), ModBlocks.GLASS_WINDOW_PANE.get(), "");
        wallsRecipe("soul_glass_window_pane", ModBlocks.SOUL_GLASS_WINDOW.get(), ModBlocks.SOUL_GLASS_WINDOW_PANE.get(), "");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SOUL_GLASS_PANE.get(), 16)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.SOUL_GLASS.get())
                .unlockedBy("has_item", has(ModBlocks.SOUL_GLASS.get()))
                .save(consumer, location(ModBlocks.SOUL_GLASS_PANE.get(), Type.CRAFTING));
        wallsRecipe("tinted_glass_window_pane", ModBlocks.TINTED_GLASS_WINDOW.get(), ModBlocks.TINTED_GLASS_WINDOW_PANE.get(), "");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TINTED_GLASS_PANE.get(), 16)
                .pattern("###")
                .pattern("###")
                .define('#', Blocks.TINTED_GLASS)
                .unlockedBy("has_item", has(Blocks.TINTED_GLASS))
                .save(consumer, location(ModBlocks.TINTED_GLASS_PANE.get(), Type.CRAFTING));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SANDSTONE_SLAB.get(), 6)
                .pattern("###")
                .define('#', Ingredient.of(ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CHISELED_SOUL_SANDSTONE.get()))
                .unlockedBy("has_soul_sandstone", has(ModBlocks.SOUL_SANDSTONE.get()))
                .unlockedBy("has_chiseled_soul_sandstone", has(ModBlocks.CHISELED_SOUL_SANDSTONE.get()))
                .save(consumer, location("soul_sandstone_slab", Type.CRAFTING));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SANDSTONE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Ingredient.of(ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CHISELED_SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE.get()))
                .unlockedBy("has_soul_sandstone", has(ModBlocks.SOUL_SANDSTONE.get()))
                .unlockedBy("has_chiseled_soul_sandstone", has(ModBlocks.CHISELED_SOUL_SANDSTONE.get()))
                .unlockedBy("has_cut_soul_sandstone", has(ModBlocks.CUT_SOUL_SANDSTONE.get()))
                .save(consumer, location("soul_sandstone_stairs", Type.CRAFTING));
        wallsRecipe("soul_sandstone_wall", ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.SOUL_SANDSTONE_WALL.get(), "");
        blockRecipe4x4("soul_sandstone", Blocks.SOUL_SAND, ModBlocks.SOUL_SANDSTONE.get(), 1);

        slabsRecipe("terracotta_slab", Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_SLAB.get(), "");
        stairsRecipe("terracotta_stairs", Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_STAIRS.get(), "");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WEAVER.get())
                .pattern("#~#")
                .pattern("#~#")
                .pattern("$ $")
                .define('#', Items.STICK)
                .define('~', Items.STRING)
                .define('$', ItemTags.PLANKS)
                .unlockedBy("has_item", has(Items.STRING))
                .save(consumer, location(ModBlocks.WEAVER.get(), Type.CRAFTING));

        slabsRecipe("calcite_slab", Blocks.CALCITE, ModBlocks.CALCITE_SLAB.get(), "");
        stairsRecipe("calcite_stairs", Blocks.CALCITE, ModBlocks.CALCITE_STAIRS.get(), "");
        wallsRecipe("calcite_wall", Blocks.CALCITE, ModBlocks.CALCITE_WALL.get(), "");

        slabsRecipe("tuff_slab", Blocks.TUFF, ModBlocks.TUFF_SLAB.get(), "");
        stairsRecipe("tuff_stairs", Blocks.TUFF, ModBlocks.TUFF_STAIRS.get(), "");
        wallsRecipe("tuff_wall", Blocks.TUFF, ModBlocks.TUFF_WALL.get(), "");

        slabsRecipe("raw_iron_slab", Blocks.RAW_IRON_BLOCK, ModBlocks.RAW_IRON_SLAB.get(), "");
        stairsRecipe("raw_iron_stairs", Blocks.RAW_IRON_BLOCK, ModBlocks.RAW_IRON_STAIRS.get(), "");

        slabsRecipe("raw_gold_slab", Blocks.RAW_GOLD_BLOCK, ModBlocks.RAW_GOLD_SLAB.get(), "");
        stairsRecipe("raw_gold_stairs", Blocks.RAW_GOLD_BLOCK, ModBlocks.RAW_GOLD_STAIRS.get(), "");

        slabsRecipe("raw_copper_slab", Blocks.RAW_COPPER_BLOCK, ModBlocks.RAW_COPPER_SLAB.get(), "");
        stairsRecipe("raw_copper_stairs", Blocks.RAW_COPPER_BLOCK, ModBlocks.RAW_COPPER_STAIRS.get(), "");

    }

    private void buildGlasscuttingRecipes() {
        for (int i = 0; i < DyeColor.values().length; i++) {
            String color = DyeColor.byId(i).getName();
            Item glass = getItem(MCRL(color + "_stained_glass"));
            TagKey<Item> tag = ItemTags.create(new ResourceLocation("forge", "glass/" + color));

            Item pane = getItem(MCRL(color + "_stained_glass_pane"));
            glasscuttingRecipe(Util.getItemRegistryName(pane).getPath(), RecipeCategory.BUILDING_BLOCKS, glass, pane, 4);

            Item slab = getItem(modRL(color + "_stained_glass_slab"));
            glasscuttingRecipe(Util.getItemRegistryName(slab).getPath(), RecipeCategory.BUILDING_BLOCKS, glass, slab, 2);

            Item stairs = getItem(modRL(color + "_stained_glass_stairs"));
            glasscuttingRecipe(Util.getItemRegistryName(stairs).getPath(), RecipeCategory.BUILDING_BLOCKS, glass, stairs);

            Item window = getItem(modRL(color + "_stained_glass_window"));
            glasscuttingRecipe(Util.getItemRegistryName(window).getPath(), RecipeCategory.BUILDING_BLOCKS, glass, window);

            Item windowPane = getItem(modRL(color + "_stained_glass_window_pane"));
            glasscuttingRecipe(Util.getItemRegistryName(windowPane).getPath() + "_from_glass", RecipeCategory.BUILDING_BLOCKS, tag, windowPane, 4);
            glasscuttingRecipe(Util.getItemRegistryName(windowPane).getPath(), RecipeCategory.BUILDING_BLOCKS, getItem(MCRL(color + "_stained_glass_pane")), windowPane);
        }

        glasscuttingRecipe("glass_bottle", RecipeCategory.BUILDING_BLOCKS, Tags.Items.GLASS_COLORLESS, Items.GLASS_BOTTLE);
        glasscuttingRecipe("glass_pane", RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS, Blocks.GLASS_PANE, 4);
        glasscuttingRecipe("glass_slab", RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS, ModBlocks.GLASS_SLAB.get(), 2);
        glasscuttingRecipe("glass_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS, ModBlocks.GLASS_STAIRS.get());
        glasscuttingRecipe("glass_window", RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS, ModBlocks.GLASS_WINDOW.get());
        glasscuttingRecipe("glass_window_pane_from_glass", RecipeCategory.BUILDING_BLOCKS, Tags.Items.GLASS_COLORLESS, ModBlocks.GLASS_WINDOW_PANE.get(), 4);
        glasscuttingRecipe("glass_window_pane", RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS_PANE, ModBlocks.GLASS_WINDOW_PANE.get());

        glasscuttingRecipe("soul_glass_pane", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_PANE.get(), 4);
        glasscuttingRecipe("soul_glass_slab", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_SLAB.get(), 2);
        glasscuttingRecipe("soul_glass_stairs", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_STAIRS.get());
        glasscuttingRecipe("soul_glass_window", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_GLASS.get(), ModBlocks.SOUL_GLASS_WINDOW.get());
        glasscuttingRecipe("soul_glass_window_pane_from_glass", RecipeCategory.BUILDING_BLOCKS, ItemTagsGenerator.SOUL_GLASS, ModBlocks.SOUL_GLASS_WINDOW_PANE.get(), 4);
        glasscuttingRecipe("soul_glass_window_pane", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_GLASS_PANE.get(), ModBlocks.SOUL_GLASS_WINDOW_PANE.get());

        glasscuttingRecipe("tinted_glass_pane", RecipeCategory.BUILDING_BLOCKS, Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_PANE.get(), 4);
        glasscuttingRecipe("tinted_glass_slab", RecipeCategory.BUILDING_BLOCKS, Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_SLAB.get(), 2);
        glasscuttingRecipe("tinted_glass_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_STAIRS.get());
        glasscuttingRecipe("tinted_glass_window", RecipeCategory.BUILDING_BLOCKS, Blocks.TINTED_GLASS, ModBlocks.TINTED_GLASS_WINDOW.get());
        glasscuttingRecipe("tinted_glass_window_pane_from_glass", RecipeCategory.BUILDING_BLOCKS, ItemTagsGenerator.TINTED_GLASS, ModBlocks.TINTED_GLASS_WINDOW_PANE.get(), 4);
        glasscuttingRecipe("tinted_glass_window_pane", RecipeCategory.BUILDING_BLOCKS, ModBlocks.TINTED_GLASS_PANE.get(), ModBlocks.TINTED_GLASS_WINDOW_PANE.get());
    }

    private void buildWeavingRecipes() {
        for (DyeColor dyeColor : DyeColor.values()) {
            String color = dyeColor.getName();
            Item item = getItem(MCRL(color + "_wool"));

            Item carpet = getItem(MCRL(color + "_carpet"));
            weavingRecipe(Util.getItemRegistryName(carpet).getPath(), RecipeCategory.BUILDING_BLOCKS, item, carpet, 2);

            Item slab = getItem(modRL(color + "_wool_slab"));
            weavingRecipe(Util.getItemRegistryName(slab).getPath(), RecipeCategory.BUILDING_BLOCKS, item, slab, 2);

            Item stairs = getItem(modRL(color + "_wool_stairs"));
            weavingRecipe(Util.getItemRegistryName(stairs).getPath(), RecipeCategory.BUILDING_BLOCKS, item, stairs);
        }
    }

    private void buildStoneCuttingRecipes() {
        for (int i = 0; i < DyeColor.values().length; i++) {
            String color = DyeColor.byId(i).getName();

            String type = color + "_concrete";
            stonecuttingRecipe(type + "_slab", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL(type)), getItem(modRL(type + "_slab")), 2);
            stonecuttingRecipe(type + "_stairs", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL(type)), getItem(modRL(type + "_stairs")));

            type = color + "_stained_brick";
            stonecuttingRecipe(type + "_slab", RecipeCategory.BUILDING_BLOCKS, getItem(modRL(type + "s")), getItem(modRL(type + "_slab")), 2);
            stonecuttingRecipe(type + "_stairs", RecipeCategory.BUILDING_BLOCKS, getItem(modRL(type + "s")), getItem(modRL(type + "_stairs")));
            stonecuttingRecipe(type + "_wall", RecipeCategory.BUILDING_BLOCKS, getItem(modRL(type + "s")), getItem(modRL(type + "_wall")));

            type = color + "_terracotta";
            stonecuttingRecipe(type + "_slab", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL(type)), getItem(modRL(type + "_slab")), 2);
            stonecuttingRecipe(type + "_stairs", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL(type)), getItem(modRL(type + "_stairs")));
        }

        String[] stoneTypes = {"andesite", "diorite", "granite"};
        for (String type : stoneTypes) {
            stonecuttingRecipe(type + "_bricks", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL(type)), getItem(modRL(type + "_bricks")));
            stonecuttingRecipe(type + "_bricks_from_polished", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL("polished_" + type)), getItem(modRL(type + "_bricks")));
            stonecuttingRecipe(type + "_brick_slab", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL(type)), getItem(modRL(type + "_brick_slab")), 2);
            stonecuttingRecipe(type + "_brick_slab_from_polished", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL("polished_" + type)), getItem(modRL(type + "_brick_slab")), 2);
            stonecuttingRecipe(type + "_brick_slab_from_bricks", RecipeCategory.BUILDING_BLOCKS, getItem(modRL(type + "_bricks")), getItem(modRL(type + "_brick_slab")), 2);
            stonecuttingRecipe(type + "_brick_stairs", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL(type)), getItem(modRL(type + "_brick_stairs")));
            stonecuttingRecipe(type + "_brick_stairs_from_polished", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL("polished_" + type)), getItem(modRL(type + "_brick_stairs")));
            stonecuttingRecipe(type + "_brick_stairs_from_bricks", RecipeCategory.BUILDING_BLOCKS, getItem(modRL(type + "_bricks")), getItem(modRL(type + "_brick_stairs")));
            stonecuttingRecipe(type + "_brick_wall", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL(type)), getItem(modRL(type + "_brick_wall")));
            stonecuttingRecipe(type + "_brick_wall_from_polished", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL("polished_" + type)), getItem(modRL(type + "_brick_wall")));
            stonecuttingRecipe(type + "_brick_wall_from_bricks", RecipeCategory.BUILDING_BLOCKS, getItem(modRL(type + "_bricks")), getItem(modRL(type + "_brick_wall")));
            stonecuttingRecipe("polished_" + type + "_wall", RecipeCategory.BUILDING_BLOCKS, getItem(MCRL("polished_" + type)), getItem(modRL("polished_" + type + "_wall")));
        }

        stonecuttingRecipe("chiseled_end_stone_bricks", RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE, ModBlocks.CHISELED_END_STONE_BRICKS.get());
        stonecuttingRecipe("chiseled_end_stone_bricks_from_end_stone_bricks", RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, ModBlocks.CHISELED_END_STONE_BRICKS.get());
        stonecuttingRecipe("chiseled_prismarine_bricks", RecipeCategory.BUILDING_BLOCKS, Blocks.PRISMARINE_BRICKS, ModBlocks.CHISELED_PRISMARINE_BRICKS.get());
        stonecuttingRecipe("chiseled_soul_sandstone", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CHISELED_SOUL_SANDSTONE.get());
        stonecuttingRecipe("cut_soul_sandstone_slab", RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE_SLAB.get(), 2);
        stonecuttingRecipe("cut_soul_sandstone_slab_from_soul_sandstone", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE_SLAB.get(), 2);
        stonecuttingRecipe("cut_soul_sandstone", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.CUT_SOUL_SANDSTONE.get());
        stonecuttingRecipe("dark_prismarine_wall", RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_WALL.get());
        stonecuttingRecipe("end_stone_brick_pillar", RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_PILLAR.get());
        stonecuttingRecipe("end_stone_brick_pillar_from_end_stone", RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE, ModBlocks.END_STONE_BRICK_PILLAR.get());
        stonecuttingRecipe("polished_blackstone_pillar", RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_PILLAR.get());
        stonecuttingRecipe("polished_end_stone", RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE, ModBlocks.POLISHED_END_STONE.get());
        stonecuttingRecipe("polished_end_stone_from_end_stone_bricks", RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE.get());
        stonecuttingRecipe("polished_stone", RecipeCategory.BUILDING_BLOCKS, Blocks.STONE, ModBlocks.POLISHED_STONE.get());
        stonecuttingRecipe("polished_stone_from_bricks", RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICKS, ModBlocks.POLISHED_STONE.get());
        stonecuttingRecipe("prismarine_brick_pillar", RecipeCategory.BUILDING_BLOCKS, Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_PILLAR.get());
        stonecuttingRecipe("prismarine_brick_wall", RecipeCategory.BUILDING_BLOCKS, Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_WALL.get());
        stonecuttingRecipe("purpur_wall", RecipeCategory.BUILDING_BLOCKS, Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_WALL.get());
        stonecuttingRecipe("quartz_brick_slab", RecipeCategory.BUILDING_BLOCKS, Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_SLAB.get());
        stonecuttingRecipe("quartz_brick_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_STAIRS.get());
        stonecuttingRecipe("quartz_brick_wall", RecipeCategory.BUILDING_BLOCKS, Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_WALL.get());
        stonecuttingRecipe("smooth_soul_sandstone_slab", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get(), 2);
        stonecuttingRecipe("smooth_soul_sandstone_stairs", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get());
        stonecuttingRecipe("smooth_stone_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS.get());
        stonecuttingRecipe("smooth_stone_wall", RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_WALL.get());
        stonecuttingRecipe("soul_sandstone_slab", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.SOUL_SANDSTONE_SLAB.get(), 2);
        stonecuttingRecipe("soul_sandstone_stairs", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.SOUL_SANDSTONE_STAIRS.get());
        stonecuttingRecipe("soul_sandstone_wall", RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.SOUL_SANDSTONE_WALL.get());
        stonecuttingRecipe("terracotta_slab", RecipeCategory.BUILDING_BLOCKS, Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_SLAB.get(), 2);
        stonecuttingRecipe("terracotta_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_STAIRS.get());
        stonecuttingRecipe("calcite_slab", RecipeCategory.BUILDING_BLOCKS, Blocks.CALCITE, ModBlocks.CALCITE_SLAB.get(), 2);
        stonecuttingRecipe("calcite_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.CALCITE, ModBlocks.CALCITE_STAIRS.get());
        stonecuttingRecipe("calcite_wall", RecipeCategory.BUILDING_BLOCKS, Blocks.CALCITE, ModBlocks.CALCITE_WALL.get());
        stonecuttingRecipe("tuff_slab", RecipeCategory.BUILDING_BLOCKS, Blocks.TUFF, ModBlocks.TUFF_SLAB.get(), 2);
        stonecuttingRecipe("tuff_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.TUFF, ModBlocks.TUFF_STAIRS.get());
        stonecuttingRecipe("tuff_wall", RecipeCategory.BUILDING_BLOCKS, Blocks.TUFF, ModBlocks.TUFF_WALL.get());
        stonecuttingRecipe("raw_iron_slab", RecipeCategory.BUILDING_BLOCKS, Blocks.RAW_IRON_BLOCK, ModBlocks.RAW_IRON_SLAB.get(), 2);
        stonecuttingRecipe("raw_iron_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.RAW_IRON_BLOCK, ModBlocks.RAW_IRON_STAIRS.get());
        stonecuttingRecipe("raw_gold_slab", RecipeCategory.BUILDING_BLOCKS, Blocks.RAW_GOLD_BLOCK, ModBlocks.RAW_GOLD_SLAB.get(), 2);
        stonecuttingRecipe("raw_gold_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.RAW_GOLD_BLOCK, ModBlocks.RAW_GOLD_STAIRS.get());
        stonecuttingRecipe("raw_copper_slab", RecipeCategory.BUILDING_BLOCKS, Blocks.RAW_COPPER_BLOCK, ModBlocks.RAW_COPPER_SLAB.get(), 2);
        stonecuttingRecipe("raw_copper_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.RAW_COPPER_BLOCK, ModBlocks.RAW_COPPER_STAIRS.get());
        stonecuttingRecipe("obsidian_bricks", RecipeCategory.BUILDING_BLOCKS, Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_BRICKS.get());
        stonecuttingRecipe("obsidian_brick_stairs", RecipeCategory.BUILDING_BLOCKS, Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_BRICK_STAIRS.get());
        stonecuttingRecipe("obsidian_brick_stairs_from_bricks", RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_STAIRS.get());
        stonecuttingRecipe("obsidian_brick_slab", RecipeCategory.BUILDING_BLOCKS, Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_BRICK_SLAB.get(), 2);
        stonecuttingRecipe("obsidian_brick_slab_from_bricks", RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_SLAB.get(), 2);
        stonecuttingRecipe("obsidian_brick_pillar", RecipeCategory.BUILDING_BLOCKS, Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_BRICK_PILLAR.get());
        stonecuttingRecipe("obsidian_brick_pillar_from_bricks", RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_PILLAR.get());
        stonecuttingRecipe("obsidian_brick_wall", RecipeCategory.BUILDING_BLOCKS, Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_BRICK_WALL.get());
        stonecuttingRecipe("obsidian_brick_wall_from_bricks", RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS.get(), ModBlocks.OBSIDIAN_BRICK_WALL.get());
    }

    private void buildSmeltingRecipes() {
        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.SOUL_SAND, ModBlocks.SOUL_GLASS.get(), 0.3F, 300);
        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SANDSTONE.get(), ModBlocks.SMOOTH_SOUL_SANDSTONE.get(), 0.3F, 300);

        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_SLAB, ModBlocks.CRACKED_STONE_BRICK_SLAB.get(), 0.1F, 200);
        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_STAIRS, ModBlocks.CRACKED_STONE_BRICK_STAIRS.get(), 0.1F, 200);
        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_WALL, ModBlocks.CRACKED_STONE_BRICK_WALL.get(), 0.1F, 200);

        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), 0.1F, 200);
        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), 0.1F, 200);
        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(), 0.1F, 200);

        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.NETHER_BRICK_SLAB, ModBlocks.CRACKED_NETHER_BRICK_SLAB.get(), 0.1F, 200);
        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.NETHER_BRICK_STAIRS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), 0.1F, 200);
        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.NETHER_BRICK_WALL, ModBlocks.CRACKED_NETHER_BRICK_WALL.get(), 0.1F, 200);

        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), 0.1F, 200);
        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), 0.1F, 200);
        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(), 0.1F, 200);

        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), 0.1F, 200);
        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), 0.1F, 200);
        smeltingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(), 0.1F, 200);
    }

    private void buildSawmillingRecipes() {
        for (int i = 0; i < DyeColor.values().length; i++) {
            String color = DyeColor.byId(i).getName();
            Item item = getItem(modRL(color + "_stained_planks"));

            sawmillingRecipe(color + "_stained_plank_slab", RecipeCategory.BUILDING_BLOCKS, item, getItem(modRL(color + "_stained_plank_slab")), 2);
            sawmillingRecipe(color + "_stained_plank_stairs", RecipeCategory.BUILDING_BLOCKS, item, getItem(modRL(color + "_stained_plank_stairs")));
        }

        woodRecipes();

        sawmillingRecipe("bowl_from_logs", RecipeCategory.BUILDING_BLOCKS, ItemTags.LOGS, Items.BOWL, 4);
        sawmillingRecipe("bowl", RecipeCategory.BUILDING_BLOCKS, ItemTags.PLANKS, Items.BOWL);
        sawmillingRecipe("crafting_table", RecipeCategory.BUILDING_BLOCKS, ItemTags.LOGS, Blocks.CRAFTING_TABLE);
        sawmillingRecipe("sticks_from_logs", RecipeCategory.BUILDING_BLOCKS, ItemTags.LOGS, Items.STICK, 16);
        sawmillingRecipe("sticks_from_planks", RecipeCategory.BUILDING_BLOCKS, ItemTags.PLANKS, Items.STICK, 4);
        sawmillingRecipe("carved_pumpkin", RecipeCategory.BUILDING_BLOCKS, Blocks.PUMPKIN, Blocks.CARVED_PUMPKIN);
    }

    private void woodRecipes() {
        getWood();
        for (String[] woodType : woodTypes) {
            String modid = woodType[0];
            namespace = modid;
            String woodName = woodType[1];
            String logKind;
            String woodKind;
            Item log;
            Item wood;
            Item bars = null;
            Item crossedBars = null;
            Item horizontalBars = null;
            Item horizontalCrossedBars = null;
            Item planks = getItem(RL(woodName + "_planks"));
            Item stairs = getItem(RL(woodName + "_stairs"));
            Item slab = getItem(RL(woodName + "_slab"));

            try {
                logKind = "_log";
                log = getItem(RL(woodName + logKind));
            }
            catch (Exception e) {
                logKind = "_stem";
                log = getItem(RL(woodName + logKind));
            }

            try {
                woodKind = "_wood";
                wood = getItem(RL(woodName + woodKind));
            }
            catch (Exception e) {
                woodKind = "_hyphae";
                wood = getItem(RL(woodName + woodKind));
            }

            Item strippedLog = getItem(RL("stripped_" + woodName + logKind));
            Item strippedWood = getItem(RL("stripped_" + woodName + woodKind));
            String s = logKind + "s";
            TagKey<Item> logTypes = ItemTags.create(new ResourceLocation(modid + ":" + woodName + s));

            sawmillingRecipe(woodName + "_planks", RecipeCategory.BUILDING_BLOCKS, logTypes, planks, 4);
            sawmillingRecipe(woodName + "_slab", RecipeCategory.BUILDING_BLOCKS, planks, slab, 2);
            sawmillingRecipe(woodName + "_stairs", RecipeCategory.BUILDING_BLOCKS, planks, stairs);
            sawmillingRecipe("stripped_" + woodName + s, RecipeCategory.BUILDING_BLOCKS, log, strippedLog);
            sawmillingRecipe("stripped_" + woodName + woodKind, RecipeCategory.BUILDING_BLOCKS, wood, strippedWood);
            sawmillingRecipe(woodName + "_door", RecipeCategory.BUILDING_BLOCKS, logTypes, getItem(RL(woodName + "_door")), 1);
            sawmillingRecipe(woodName + "_fence", RecipeCategory.BUILDING_BLOCKS, logTypes, getItem(RL(woodName + "_fence")), 1);
            sawmillingRecipe(woodName + "_fence_gate", RecipeCategory.BUILDING_BLOCKS, logTypes, getItem(RL(woodName + "_fence_gate")), 1);
            sawmillingRecipe(woodName + "_slab_from" + s, RecipeCategory.BUILDING_BLOCKS, logTypes, slab, 8);
            sawmillingRecipe(woodName + "_stairs_from" + s, RecipeCategory.BUILDING_BLOCKS, logTypes, stairs, 4);
            sawmillingRecipe(woodName + "_trapdoor", RecipeCategory.BUILDING_BLOCKS, logTypes, getItem(RL(woodName + "_trapdoor")), 2);

            try {
                sawmillingRecipe(woodName + "_boat", RecipeCategory.BUILDING_BLOCKS, logTypes, getItem(RL(woodName + "_boat")), 1);
            }
            catch (Exception e) {
            }

            try {
                sawmillingRecipe(woodName + "_sign", RecipeCategory.BUILDING_BLOCKS, logTypes, getItem(RL(woodName + "_sign")), 1);
            }
            catch (Exception e) {
            }

            try {
                Item boards = getItem(modRL(woodName + "_boards"));
                Item boardSlab = getItem(modRL(woodName + "_board_slab"));
                Item boardStairs = getItem(modRL(woodName + "_board_stairs"));

                sawmillingRecipe(woodName + "_boards_from" + s, RecipeCategory.BUILDING_BLOCKS, logTypes, boards, 4);
                sawmillingRecipe(woodName + "_boards", RecipeCategory.BUILDING_BLOCKS, planks, boards);

                sawmillingRecipe(woodName + "_board_slab_from" + s, RecipeCategory.BUILDING_BLOCKS, logTypes, boardSlab, 8);
                sawmillingRecipe(woodName + "_board_slab_from_planks", RecipeCategory.BUILDING_BLOCKS, planks, boardSlab, 2);
                sawmillingRecipe(woodName + "_board_slab", RecipeCategory.BUILDING_BLOCKS, boards, boardSlab, 2);

                sawmillingRecipe(woodName + "_board_stairs_from" + s, RecipeCategory.BUILDING_BLOCKS, logTypes, boardStairs, 4);
                sawmillingRecipe(woodName + "_board_stairs_from_planks", RecipeCategory.BUILDING_BLOCKS, planks, boardStairs);
                sawmillingRecipe(woodName + "_board_stairs", RecipeCategory.BUILDING_BLOCKS, boards, boardStairs);
            }
            catch (Exception e) {
            }

            try {
                bars = getItem(new ResourceLocation("additionalbars", woodName + "_bars"));
                horizontalBars = getItem(new ResourceLocation("additionalbars", "horizontal_" + woodName + "_bars"));
                horizontalCrossedBars = getItem(new ResourceLocation("additionalbars", "horizontal_crossed_" + woodName + "_bars"));
                crossedBars = getItem(new ResourceLocation("additionalbars", "crossed_" + woodName + "_bars"));
            }
            catch (Exception e) {
                try {
                    bars = getItem(new ResourceLocation("additionalbarsbop", woodName + "_bars"));
                    horizontalBars = getItem(new ResourceLocation("additionalbarsbop", "horizontal_" + woodName + "_bars"));
                    horizontalCrossedBars = getItem(new ResourceLocation("additionalbarsbop", "horizontal_crossed_" + woodName + "_bars"));
                    crossedBars = getItem(new ResourceLocation("additionalbarsbop", "crossed_" + woodName + "_bars"));
                }
                catch (Exception e2) {
                }
            }

            try {
                sawmillingRecipe(woodName + "_bars", RecipeCategory.BUILDING_BLOCKS, logTypes, bars, 2);
                sawmillingRecipe(woodName + "_bars_from_bars", RecipeCategory.BUILDING_BLOCKS, bars, 1, horizontalBars, horizontalCrossedBars, crossedBars);

                sawmillingRecipe("crossed_" + woodName + "_bars", RecipeCategory.BUILDING_BLOCKS, logTypes, crossedBars, 2);
                sawmillingRecipe("crossed_" + woodName + "_bars_from_bars", RecipeCategory.BUILDING_BLOCKS, crossedBars, 1, horizontalBars, horizontalCrossedBars, bars);

                sawmillingRecipe("horizontal_" + woodName + "_bars", RecipeCategory.BUILDING_BLOCKS, logTypes, horizontalBars, 2);
                sawmillingRecipe("horizontal_" + woodName + "_bars_from_bars", RecipeCategory.BUILDING_BLOCKS, horizontalBars, 1, horizontalCrossedBars, bars, crossedBars);

                sawmillingRecipe("horizontal_crossed_" + woodName + "_bars", RecipeCategory.BUILDING_BLOCKS, logTypes, horizontalCrossedBars, 2);
                sawmillingRecipe("horizontal_crossed_" + woodName + "_bars_from_bars", RecipeCategory.BUILDING_BLOCKS, horizontalCrossedBars, 1, horizontalBars, bars, crossedBars);
            }
            catch (Exception e) {
            }
        }
    }

    private void getWood() {
        for (int i = 0; i < ForgeRegistries.BLOCKS.getValues().size(); i++) {
            Block block = ForgeRegistries.BLOCKS.getValues().stream().toList().get(i);
            if (Util.getBlockRegistryName(block).getPath().contains("_log") && !Util.getBlockRegistryName(block).getPath().contains("stripped_")) {
                String[] object = {Util.getBlockRegistryName(block).getNamespace(), Util.getBlockRegistryName(block).getPath().replace("_log", "")};
                woodTypes.add(object);
            }
        }

        String[] object = {CutAndColored.MC_MOD_ID, "crimson"};
        woodTypes.add(object);
        String[] object2 = {CutAndColored.MC_MOD_ID, "warped"};
        woodTypes.add(object2);

        CutAndColored.LOGGER.debug("Found " + woodTypes.size() + " wood types");
    }

    private ResourceLocation RL(String string) {
        return new ResourceLocation(namespace, string);
    }

    private void vanillaColoredRecipes() {
        for (int i = 0; i < DyeColor.values().length; i++) {
            String color = DyeColor.byId(i).getName();
            Item dye = getItem(MCRL(color + "_dye"));

            // Concrete
            String blockKind = "_concrete";
            String block = color + blockKind;
            slabsRecipe(block + "_slab", getItem(MCRL(block)), getItem(modRL(block + "_slab")), "concrete_slabs");
            recolorObject(ItemTagsGenerator.CONCRETE_SLABS, getItem(modRL(block + "_slab")), color, "recolor_concrete_slabs");
            stairsRecipe(block + "_stairs", getItem(MCRL(block)), getItem(modRL(block + "_stairs")), "concrete_stairs");
            recolorObject(ItemTagsGenerator.CONCRETE_STAIRS, getItem(modRL(block + "_stairs")), color, "recolor_concrete_stairs");

            // Stained Bricks
            blockKind = "_stained_brick";
            block = color + blockKind + "s";
            slabsRecipe(color + blockKind + "_slab", getItem(modRL(block)), getItem(modRL(color + blockKind + "_slab")), "stained_brick_slabs");
            recolorObject(ItemTagsGenerator.CLAY_BRICK_SLABS, getItem(modRL(color + blockKind + "_slab")), color, "recolor_stained_brick_slabs");
            stairsRecipe(color + blockKind + "_stairs", getItem(modRL(block)), getItem(modRL(color + blockKind + "_stairs")), "stained_brick_stairs");
            recolorObject(ItemTagsGenerator.CLAY_BRICK_STAIRS, getItem(modRL(color + blockKind + "_stairs")), color, "recolor_stained_brick_stairs");
            wallsRecipe(color + blockKind + "_wall", getItem(modRL(block)), getItem(modRL(color + blockKind + "_wall")), "stained_brick_walls");
            recolorObject(ItemTagsGenerator.CLAY_BRICK_WALLS, getItem(modRL(color + blockKind + "_wall")), color, "recolor_stained_brick_walls");
            recolorObject(ItemTagsGenerator.CLAY_BRICKS, getItem(modRL(block)), color, "recolor_stained_bricks");

            // Stained Glass
            blockKind = "_stained_glass";
            block = color + blockKind;
            recolorObject(ItemTagsGenerator.GLASS_SLABS, getItem(modRL(block + "_slab")), color, "recolor_stained_glass_slabs");
            recolorObject(ItemTagsGenerator.GLASS_STAIRS, getItem(modRL(block + "_stairs")), color, "recolor_stained_glass_stairs");
            wallsRecipe(block + "_window_pane", getItem(modRL(block + "_window")), getItem(modRL(block + "_window_pane")), "stained_glass_window_panes");
            recolorObject(ItemTagsGenerator.GLASS_WINDOWS, getItem(modRL(block + "_window")), color, "recolor_stained_glass_windows");
            recolorObject(ItemTagsGenerator.GLASS_WINDOW_PANES, getItem(modRL(block + "_window_pane")), color, "recolor_stained_glass_window_panes");

            // Stained Planks
            blockKind = "_stained_plank";
            block = color + blockKind + "s";
            slabsRecipe(color + blockKind + "_slab", getItem(modRL(block)), getItem(modRL(color + blockKind + "_slab")), "stained_plank_slabs");
            recolorObject(ItemTags.WOODEN_SLABS, getItem(modRL(color + blockKind + "_slab")), color, "recolor_stained_plank_slabs");
            stairsRecipe(color + blockKind + "_stairs", getItem(modRL(block)), getItem(modRL(color + blockKind + "_stairs")), "stained_plank_stairs");
            recolorObject(ItemTags.WOODEN_STAIRS, getItem(modRL(color + blockKind + "_stairs")), color, "recolor_stained_plank_stairs");
            recolorObject(ItemTags.PLANKS, getItem(modRL(block)), color, "recolor_stained_planks");

            // Terracotta
            blockKind = "_terracotta";
            block = color + blockKind;
            slabsRecipe(block + "_slab", getItem(MCRL(block)), getItem(modRL(block + "_slab")), "colored_tarracotta_slabs");
            recolorObject(ItemTagsGenerator.TERRACOTTA_SLABS, getItem(modRL(block + "_slab")), color, "recolored_tarracotta_slabs");
            stairsRecipe(block + "_stairs", getItem(MCRL(block)), getItem(modRL(block + "_stairs")), "colored_tarracotta_stairs");
            recolorObject(ItemTagsGenerator.TERRACOTTA_STAIRS, getItem(modRL(block + "_stairs")), color, "recolored_tarracotta_stairs");

            // Wool
            blockKind = "_wool";
            block = color + blockKind;
            slabsRecipe(block + "_slab", getItem(MCRL(block)), getItem(modRL(block + "_slab")), "wool_slabs");
            recolorObject(ItemTagsGenerator.WOOL_SLABS, getItem(modRL(block + "_slab")), color, "recolor_wool_slabs");
            stairsRecipe(block + "_stairs", getItem(MCRL(block)), getItem(modRL(block + "_stairs")), "wool_stairs");
            recolorObject(ItemTagsGenerator.WOOL_STAIRS, getItem(modRL(block + "_stairs")), color, "recolor_wool_stairs");

            // Redstone Lamps
            String name = color + "_redstone_lamp";
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, getItem(modRL(name)))
                    .requires(ItemTagsGenerator.REDSTONE_LAMPS)
                    .requires(dye)
                    .group("redstone_lamp")
                    .unlockedBy("has_item", has(ItemTagsGenerator.REDSTONE_LAMPS))
                    .save(consumer, location(name, Type.CRAFTING));
        }
    }

    private void stoneBrickTypeRecipes() {
        String[] stoneTypes = {"andesite", "diorite", "granite"};
        for (String stoneType : stoneTypes) {
            String type = stoneType + "_brick";
            String block = type + "s";
            slabsRecipe(type + "_slab", getItem(modRL(block)), getItem(modRL(type + "_slab")), "");
            stairsRecipe(type + "_stairs", getItem(modRL(block)), getItem(modRL(type + "_stairs")), "");
            wallsRecipe(type + "_wall", getItem(modRL(block)), getItem(modRL(type + "_wall")), "");
            blockRecipe4x4(block, getItem(MCRL("polished_" + stoneType)), getItem(modRL(block)), 4);
        }
    }
}
