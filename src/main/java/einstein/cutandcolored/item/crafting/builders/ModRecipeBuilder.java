package einstein.cutandcolored.item.crafting.builders;

import java.util.function.Consumer;

import javax.annotation.Nullable;

import com.google.gson.JsonObject;

import einstein.cutandcolored.init.ModRecipeTypes;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipeBuilder {
	
	private final RecipeCategory category;
	private final Item result;
	private final Ingredient ingredient;
	private final int count;
	private final Advancement.Builder advancement = Advancement.Builder.advancement();
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
	
	public ModRecipeBuilder unlockedBy(String name, CriterionTriggerInstance trigger) {
		advancement.addCriterion(name, trigger);
		return this;
	}

	public ModRecipeBuilder group(String group) {
		this.group = group;
		return this;
	}

	public void save(Consumer<FinishedRecipe> consumer) {
		save(consumer, ForgeRegistries.ITEMS.getKey(result));
	}
	
	public void save(Consumer<FinishedRecipe> consumer, String save) {
		ResourceLocation resourcelocation = ForgeRegistries.ITEMS.getKey(result);
		if ((new ResourceLocation(save)).equals(resourcelocation)) {
			throw new IllegalStateException("Mod Recipe Builder " + save + " should remove its 'save' argument");
		} else {
			save(consumer, new ResourceLocation(save));
		}
	}
	
	public void save(Consumer<FinishedRecipe> consumer, ResourceLocation id) {
		ensureValid(id);
		advancement.parent(new ResourceLocation("recipes/root")).addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id)).rewards(AdvancementRewards.Builder.recipe(id)).requirements(RequirementsStrategy.OR);
		consumer.accept(new ModRecipeBuilder.Result(id, serializer, group == null ? "" : group,
				ingredient, result, count, advancement, id.withPrefix("recipes/" + category.getFolderName() + "/")));
	}
	
	private void ensureValid(ResourceLocation id) {
		if (advancement.getCriteria().isEmpty()) {
			throw new IllegalStateException("No way of obtaining recipe " + id);
		}
	}
	
	public static class Result implements FinishedRecipe {
		private final ResourceLocation id;
		private final String group;
		private final Ingredient ingredient;
		private final Item result;
		private final int count;
		private final Advancement.Builder advancement;
		private final ResourceLocation advancementId;
		private final RecipeSerializer<?> type;
		
		public Result(ResourceLocation id, RecipeSerializer<?> serializer, String group, Ingredient ingredient, Item result, int count, Advancement.Builder advancement, ResourceLocation advancementId) {
			this.id = id;
			this.type = serializer;
			this.group = group;
			this.ingredient = ingredient;
			this.result = result;
			this.count = count;
			this.advancement = advancement;
			this.advancementId = advancementId;
		}
		
		public void serializeRecipeData(JsonObject json) {
			if (!group.isEmpty()) {
				json.addProperty("group", group);
			}
			
			json.add("ingredient", ingredient.toJson());
			json.addProperty("result", ForgeRegistries.ITEMS.getKey(result).toString());
			json.addProperty("count", count);
		}
		
		public ResourceLocation getId() {
			return id;
		}
		
		public RecipeSerializer<?> getType() {
			return type;
		}
		
		@Nullable
		public JsonObject serializeAdvancement() {
			return advancement.serializeToJson();
		}
		
		@Nullable
		public ResourceLocation getAdvancementId() {
			return advancementId;
		}
	}
}
