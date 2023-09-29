package einstein.cutandcolored.util;

import einstein.cutandcolored.item.crafting.builders.ModRecipeBuilder;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

import static einstein.cutandcolored.CutAndColored.loc;
import static einstein.cutandcolored.CutAndColored.mcLoc;

public abstract class RecipeResources extends RecipeProvider {

    protected RecipeOutput output;

    public RecipeResources(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        this.output = output;
        buildRecipes();
    }
    
    protected abstract void buildRecipes();

    protected static Item getItem(ResourceLocation location) {
        Item item = ForgeRegistries.ITEMS.getValue(location);
        if (item != Items.AIR && item != null) {
            return item;
        }
        else {
            throw new NullPointerException("Could not find item: " + location.toString());
        }
    }

    protected static ResourceLocation location(String name, Type type) {
        return loc(type.addSuffix(name));
    }

    protected static ResourceLocation location(ItemLike item, Type type) {
        return loc(Objects.requireNonNull(type.addSuffix(Util.getItemRegistryName(item).getPath())));
    }

    // COOKING
    
    protected void smeltingRecipe(RecipeCategory category, ItemLike ingredient, ItemLike result, float experience, int cookTime) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient.asItem()), category, result, experience, cookTime).unlockedBy("has_item", has(ingredient)).save(output, location(result, Type.SMELTING));
    }

    protected void blastingRecipe(RecipeCategory category, ItemLike ingredient, ItemLike result, float experience, int cooktime) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredient.asItem()), category, result, experience, cooktime).unlockedBy("has_item", has(ingredient)).save(output, location(result, Type.BLASTING));
    }

    // STONECUTTING

    protected void stonecuttingRecipe(String name, RecipeCategory category, ItemLike result, int count, ItemLike triggerItem, ItemLike... ingredient) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), category, result, count).unlockedBy("has_item", has(triggerItem)).save(output, location(name, Type.GLASSCUTTING));
    }

    protected void stonecuttingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
        stonecuttingRecipe(name, category, result, count, ingredient, ingredient);
    }

    protected void stonecuttingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result) {
        stonecuttingRecipe(name, category, ingredient, result, 1);
    }

    protected void stonecuttingRecipe(String name, RecipeCategory category, TagKey<Item> ingredients, ItemLike result, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredients), category, result, count).unlockedBy("has_item", has(ingredients)).save(output, location(name, Type.GLASSCUTTING));
    }

    protected void stonecuttingRecipe(String name, RecipeCategory category, TagKey<Item> ingredients, ItemLike result) {
        stonecuttingRecipe(name, category, ingredients, result, 1);
    }

    // GLASSCUTTING

    protected void glasscuttingRecipe(String name, RecipeCategory category, ItemLike result, int count, ItemLike triggerItem, ItemLike... ingredients) {
        ModRecipeBuilder.glasscuttingRecipe(category, Ingredient.of(ingredients), result, count).unlockedBy("has_item", has(triggerItem)).save(output, location(name, Type.GLASSCUTTING));
    }

    protected void glasscuttingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
        glasscuttingRecipe(name, category, result, count, ingredient, ingredient);
    }

    protected void glasscuttingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result) {
        glasscuttingRecipe(name, category, ingredient, result, 1);
    }

    protected void glasscuttingRecipe(String name, RecipeCategory category, TagKey<Item> ingredients, ItemLike result, int count) {
        ModRecipeBuilder.glasscuttingRecipe(category, Ingredient.of(ingredients), result, count).unlockedBy("has_item", has(ingredients)).save(output, location(name, Type.GLASSCUTTING));
    }

    protected void glasscuttingRecipe(String name, RecipeCategory category, TagKey<Item> ingredients, ItemLike result) {
        glasscuttingRecipe(name, category, ingredients, result, 1);
    }

    // SAWMILLING


    protected void sawmillingRecipe(String name, RecipeCategory category, ItemLike result, int count, ItemLike triggerItem, ItemLike... ingredients) {
        ModRecipeBuilder.sawmillingRecipe(category, Ingredient.of(ingredients), result, count).unlockedBy("has_item", has(triggerItem)).save(output, location(name, Type.SAWMILLING));
    }

    protected void sawmillingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
        sawmillingRecipe(name, category, result, count, ingredient, ingredient);
    }

    protected void sawmillingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result) {
        sawmillingRecipe(name, category, ingredient, result, 1);
    }

    protected void sawmillingRecipe(String name, RecipeCategory category, TagKey<Item> ingredients, ItemLike result, int count) {
        ModRecipeBuilder.sawmillingRecipe(category, Ingredient.of(ingredients), result, count).unlockedBy("has_item", has(ingredients)).save(output, location(name, Type.SAWMILLING));
    }

    protected void sawmillingRecipe(String name, RecipeCategory category, TagKey<Item> ingredients, ItemLike result) {
        sawmillingRecipe(name, category, ingredients, result, 1);
    }

    // WEAVING

    protected void weavingRecipe(String name, RecipeCategory category, ItemLike result, int count, ItemLike triggerItem, ItemLike... ingredients) {
        ModRecipeBuilder.weavingRecipe(category, Ingredient.of(ingredients), result, count).unlockedBy("has_item", has(triggerItem)).save(output, location(name, Type.WEAVING));
    }

    protected void weavingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
        weavingRecipe(name, category, result, count, ingredient, ingredient);
    }

    protected void weavingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result) {
        weavingRecipe(name, category, ingredient, result, 1);
    }

    protected void weavingRecipe(String name, RecipeCategory category, TagKey<Item> ingredients, ItemLike result, int count) {
            ModRecipeBuilder.weavingRecipe(category, Ingredient.of(ingredients), result, count).unlockedBy("has_item", has(ingredients)).save(output, location(name, Type.WEAVING));
    }

    protected void weavingRecipe(String name, RecipeCategory category, TagKey<Item> ingredients, ItemLike result) {
        weavingRecipe(name, category, ingredients, result, 1);
    }


    // SHAPED
    
    protected void stairsRecipe(String name, ItemLike ingredient, ItemLike result, String group) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ingredient)
                .group(group)
                .unlockedBy("has_item", has(ingredient))
                .save(output, location(name, Type.CRAFTING));
    }

    protected void slabsRecipe(String name, ItemLike ingredient, ItemLike result, String group) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                .pattern("###")
                .define('#', ingredient)
                .group(group)
                .unlockedBy("has_item", has(ingredient))
                .save(output, location(name, Type.CRAFTING));
    }

    protected void wallsRecipe(String name, ItemLike ingredient, ItemLike result, String group) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                .pattern("###")
                .pattern("###")
                .define('#', ingredient)
                .group(group)
                .unlockedBy("has_item", has(ingredient))
                .save(output, location(name, Type.CRAFTING));
    }

    protected void blockRecipe4x4(String name, ItemLike ingredient, ItemLike result, int count) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, count)
                .pattern("##")
                .pattern("##")
                .define('#', ingredient)
                .unlockedBy("has_item", has(ingredient))
                .save(output, location(name, Type.CRAFTING));
    }

    protected void pillarRecipe(ItemLike ingredient, ItemLike result, int count) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, count)
                .pattern("#")
                .pattern("#")
                .define('#', ingredient)
                .unlockedBy("has_item", has(ingredient))
                .save(output, location(result, Type.CRAFTING));
    }

    protected void recolorObject(TagKey<Item> ingredients, ItemLike result, String color, String group) {
        Item dye = getItem(mcLoc(color + "_dye"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 8)
                .pattern("###")
                .pattern("#$#")
                .pattern("###")
                .define('#', ingredients)
                .define('$', dye)
                .group(group)
                .unlockedBy("has_item", has(ingredients))
                .save(output, location(Util.getItemRegistryName(result).getPath() + "_from_recolor", Type.CRAFTING));
    }

    public enum Type {
        CRAFTING("crafting"),
        SMELTING("smelting"),
        BLASTING("blasting"),
        STONECUTTING("stonecutting"),
        GLASSCUTTING("glasscutting"),
        SAWMILLING("sawmilling"),
        WEAVING("weaving");

        private final String suffix;

        Type(String suffix) {
            this.suffix = suffix;
        }

        public String addSuffix(String string) {
            return string + "_from_" + suffix;
        }
    }
}
