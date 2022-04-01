package einstein.cutandcolored.data;

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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipeBuilder {
	private final Item result;
	private final Ingredient ingredient;
	private final int count;
	private final Advancement.Builder advancement = Advancement.Builder.advancement();
	private String group;
	private final RecipeSerializer<?> serializer;
	
	public ModRecipeBuilder(RecipeSerializer<?> serializerIn, Ingredient ingredientIn, ItemLike resultProviderIn, int countIn) {
		this.serializer = serializerIn;
		this.result = resultProviderIn.asItem();
		this.ingredient = ingredientIn;
		this.count = countIn;
	}
	
	public static ModRecipeBuilder glasscuttingRecipe(Ingredient ingredientIn, ItemLike resultIn) {
		return new ModRecipeBuilder(ModRecipeTypes.GLASSCUTTING.get(), ingredientIn, resultIn, 1);
	}
	
	public static ModRecipeBuilder glasscuttingRecipe(Ingredient ingredientIn, ItemLike resultIn, int countIn) {
		return new ModRecipeBuilder(ModRecipeTypes.GLASSCUTTING.get(), ingredientIn, resultIn, countIn);
	}
	
	public static ModRecipeBuilder sawmillingRecipe(Ingredient ingredientIn, ItemLike resultIn) {
		return new ModRecipeBuilder(ModRecipeTypes.SAWMILLING.get(), ingredientIn, resultIn, 1);
	}
	
	public static ModRecipeBuilder sawmillingRecipe(Ingredient ingredientIn, ItemLike resultIn, int countIn) {
		return new ModRecipeBuilder(ModRecipeTypes.SAWMILLING.get(), ingredientIn, resultIn, countIn);
	}
	
	public static ModRecipeBuilder weavingRecipe(Ingredient ingredientIn, ItemLike resultIn) {
		return new ModRecipeBuilder(ModRecipeTypes.WEAVING.get(), ingredientIn, resultIn, 1);
	}
	
	public static ModRecipeBuilder weavingRecipe(Ingredient ingredientIn, ItemLike resultIn, int countIn) {
		return new ModRecipeBuilder(ModRecipeTypes.WEAVING.get(), ingredientIn, resultIn, countIn);
	}
	
	// Used to add conditions to stonecutting recipes
	public static ModRecipeBuilder stonecuttingRecipe(Ingredient ingredientIn, ItemLike resultIn, int countIn) {
		return new ModRecipeBuilder(RecipeSerializer.STONECUTTER, ingredientIn, resultIn, countIn);
	}
	
	public ModRecipeBuilder unlockedBy(String p_176810_, CriterionTriggerInstance p_176811_) {
		this.advancement.addCriterion(p_176810_, p_176811_);
		return this;
	}
	
	public void save(Consumer<FinishedRecipe> consumerIn) {
		this.save(consumerIn, ForgeRegistries.ITEMS.getKey(this.result));
	}
	
	public void save(Consumer<FinishedRecipe> consumerIn, String save) {
		ResourceLocation resourcelocation = ForgeRegistries.ITEMS.getKey(this.result);
		if ((new ResourceLocation(save)).equals(resourcelocation)) {
			throw new IllegalStateException("Mod Recipe Builder " + save + " should remove its 'save' argument");
		} else {
			this.save(consumerIn, new ResourceLocation(save));
		}
	}
	
	public void save(Consumer<FinishedRecipe> consumer, ResourceLocation id) {
		this.ensureValid(id);
		this.advancement.parent(new ResourceLocation("recipes/root")).addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id)).rewards(AdvancementRewards.Builder.recipe(id)).requirements(RequirementsStrategy.OR);
		consumer.accept(new ModRecipeBuilder.Result(id, this.serializer, this.group == null ? "" : this.group,
				this.ingredient, this.result, this.count, this.advancement, new ResourceLocation(
						id.getNamespace(), "recipes/" + this.result.getItemCategory().getRecipeFolderName().toLowerCase() + "/" + id.getPath())));
	}
	
	private void ensureValid(ResourceLocation id) {
		if (this.advancement.getCriteria().isEmpty()) {
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
		
		@SuppressWarnings("deprecation")
		public void serializeRecipeData(JsonObject p_126349_) {
			if (!this.group.isEmpty()) {
				p_126349_.addProperty("group", this.group);
			}
			
			p_126349_.add("ingredient", this.ingredient.toJson());
			p_126349_.addProperty("result", Registry.ITEM.getKey(this.result).toString());
			p_126349_.addProperty("count", this.count);
		}
		
		public ResourceLocation getId() {
			return this.id;
		}
		
		public RecipeSerializer<?> getType() {
			return this.type;
		}
		
		@Nullable
		public JsonObject serializeAdvancement() {
			return this.advancement.serializeToJson();
		}
		
		@Nullable
		public ResourceLocation getAdvancementId() {
			return this.advancementId;
		}
	}
}
