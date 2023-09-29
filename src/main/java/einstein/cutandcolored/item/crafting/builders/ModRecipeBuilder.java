package einstein.cutandcolored.item.crafting.builders;

import com.google.gson.JsonObject;
import einstein.cutandcolored.init.ModRecipeTypes;
import net.minecraft.advancements.*;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

public class ModRecipeBuilder implements RecipeBuilder {

    private final RecipeCategory category;
    private final Item result;
    private final Ingredient ingredient;
    private final int count;
    private final Map<String, Criterion<?>> criteria = new HashMap<>();
    private String group;
    private final RecipeSerializer<?> serializer;

    public ModRecipeBuilder(RecipeCategory category, RecipeSerializer<?> serializer, Ingredient ingredient, ItemLike result, int count) {
        this.category = category;
        this.serializer = serializer;
        this.result = result.asItem();
        this.ingredient = ingredient;
        this.count = count;
    }

    public static ModRecipeBuilder glasscuttingRecipe(RecipeCategory category, Ingredient ingredientIn, ItemLike resultIn) {
        return new ModRecipeBuilder(category, ModRecipeTypes.GLASSCUTTING.get(), ingredientIn, resultIn, 1);
    }

    public static ModRecipeBuilder glasscuttingRecipe(RecipeCategory category, Ingredient ingredientIn, ItemLike resultIn, int countIn) {
        return new ModRecipeBuilder(category, ModRecipeTypes.GLASSCUTTING.get(), ingredientIn, resultIn, countIn);
    }

    public static ModRecipeBuilder sawmillingRecipe(RecipeCategory category, Ingredient ingredientIn, ItemLike resultIn) {
        return new ModRecipeBuilder(category, ModRecipeTypes.SAWMILLING.get(), ingredientIn, resultIn, 1);
    }

    public static ModRecipeBuilder sawmillingRecipe(RecipeCategory category, Ingredient ingredientIn, ItemLike resultIn, int countIn) {
        return new ModRecipeBuilder(category, ModRecipeTypes.SAWMILLING.get(), ingredientIn, resultIn, countIn);
    }

    public static ModRecipeBuilder weavingRecipe(RecipeCategory category, Ingredient ingredientIn, ItemLike resultIn) {
        return new ModRecipeBuilder(category, ModRecipeTypes.WEAVING.get(), ingredientIn, resultIn, 1);
    }

    public static ModRecipeBuilder weavingRecipe(RecipeCategory category, Ingredient ingredientIn, ItemLike resultIn, int countIn) {
        return new ModRecipeBuilder(category, ModRecipeTypes.WEAVING.get(), ingredientIn, resultIn, countIn);
    }

    // Used to add conditions to stonecutting recipes
    public static ModRecipeBuilder stonecuttingRecipe(RecipeCategory category, Ingredient ingredientIn, ItemLike resultIn, int countIn) {
        return new ModRecipeBuilder(category, RecipeSerializer.STONECUTTER, ingredientIn, resultIn, countIn);
    }

    @Override
    public RecipeBuilder unlockedBy(String name, Criterion<?> criterion) {
        criteria.put(name, criterion);
        return this;
    }

    @Override
    public RecipeBuilder group(String group) {
        this.group = group;
        return this;
    }

    @Override
    public Item getResult() {
        return result;
    }

    //    public void save(Consumer<FinishedRecipe> consumer) {
//        save(consumer, ForgeRegistries.ITEMS.getKey(result));
//    }
//
//    public void save(Consumer<FinishedRecipe> consumer, String save) {
//        ResourceLocation resourcelocation = ForgeRegistries.ITEMS.getKey(result);
//        if ((new ResourceLocation(save)).equals(resourcelocation)) {
//            throw new IllegalStateException("Mod Recipe Builder " + save + " should remove its 'save' argument");
//        }
//        else {
//            save(consumer, new ResourceLocation(save));
//        }
//    }

    @Override
    public void save(RecipeOutput output, ResourceLocation id) {
        ensureValid(id);
        Advancement.Builder builder = output.advancement()
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                .rewards(AdvancementRewards.Builder.recipe(id))
                .requirements(AdvancementRequirements.Strategy.OR);
        criteria.forEach(builder::addCriterion);
        output.accept(new Result(id, serializer, group != null ? group : "", ingredient, result, count, builder.build(id.withPrefix("recipes/" + category.getFolderName() + "/"))));
    }

    private void ensureValid(ResourceLocation id) {
        if (criteria.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + id);
        }
    }

    public record Result(ResourceLocation id, RecipeSerializer<?> type, String group, Ingredient ingredient, Item result, int count, AdvancementHolder advancement) implements FinishedRecipe {

        @Override
        public void serializeRecipeData(JsonObject json) {
            if (!group.isEmpty()) {
                json.addProperty("group", group);
            }

            json.add("ingredient", ingredient.toJson(false));
            json.addProperty("result", ForgeRegistries.ITEMS.getKey(result).toString());
            json.addProperty("count", count);
        }
    }
}
