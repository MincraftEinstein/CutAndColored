package einstein.cutandcolored.data;

import java.util.function.Consumer;

import javax.annotation.Nullable;

import com.google.gson.JsonObject;

import einstein.cutandcolored.init.ModRecipeSerializers;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.ICriterionInstance;
import net.minecraft.advancements.IRequirementsStrategy;
import net.minecraft.advancements.criterion.RecipeUnlockedTrigger;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipeBuilder {
	private final Item result;
	private final Ingredient ingredient;
	private final int count;
	private final Advancement.Builder advancementBuilder = Advancement.Builder.builder();
	private String group;
	private final IRecipeSerializer<?> serializer;

	public ModRecipeBuilder(IRecipeSerializer<?> serializerIn, Ingredient ingredientIn, IItemProvider resultProviderIn, int countIn) {
		this.serializer = serializerIn;
		this.result = resultProviderIn.asItem();
		this.ingredient = ingredientIn;
		this.count = countIn;
	}

	public static ModRecipeBuilder glasscuttingRecipe(Ingredient ingredientIn, IItemProvider resultIn) {
		return new ModRecipeBuilder(ModRecipeSerializers.GLASSCUTTING, ingredientIn, resultIn, 1);
	}

	public static ModRecipeBuilder glasscuttingRecipe(Ingredient ingredientIn, IItemProvider resultIn, int countIn) {
		return new ModRecipeBuilder(ModRecipeSerializers.GLASSCUTTING, ingredientIn, resultIn, countIn);
	}

	public static ModRecipeBuilder sawmillingRecipe(Ingredient ingredientIn, IItemProvider resultIn) {
		return new ModRecipeBuilder(ModRecipeSerializers.SAWMILLING, ingredientIn, resultIn, 1);
	}

	public static ModRecipeBuilder sawmillingRecipe(Ingredient ingredientIn, IItemProvider resultIn, int countIn) {
		return new ModRecipeBuilder(ModRecipeSerializers.SAWMILLING, ingredientIn, resultIn, countIn);
	}

	public static ModRecipeBuilder weavingRecipe(Ingredient ingredientIn, IItemProvider resultIn) {
		return new ModRecipeBuilder(ModRecipeSerializers.WEAVING, ingredientIn, resultIn, 1);
	}

	public static ModRecipeBuilder weavingRecipe(Ingredient ingredientIn, IItemProvider resultIn, int countIn) {
		return new ModRecipeBuilder(ModRecipeSerializers.WEAVING, ingredientIn, resultIn, countIn);
	}

	public ModRecipeBuilder addCriterion(String name, ICriterionInstance criterionIn) {
		this.advancementBuilder.withCriterion(name, criterionIn);
		return this;
	}
	
	public void build(Consumer<IFinishedRecipe> consumerIn) {
		this.build(consumerIn, ForgeRegistries.ITEMS.getKey(this.result));
	}
	
	public void build(Consumer<IFinishedRecipe> consumerIn, String save) {
		ResourceLocation resourcelocation = ForgeRegistries.ITEMS.getKey(this.result);
		if ((new ResourceLocation(save)).equals(resourcelocation)) {
			throw new IllegalStateException("Mod Recipe Builder " + save + " should remove its 'save' argument");
		} else {
			this.build(consumerIn, new ResourceLocation(save));
		}
	}

	public void build(Consumer<IFinishedRecipe> consumerIn, ResourceLocation id) {
		this.validate(id);
		this.advancementBuilder.withParentId(new ResourceLocation("recipes/root")).withCriterion("has_the_recipe", RecipeUnlockedTrigger.create(id)).withRewards(AdvancementRewards.Builder.recipe(id)).withRequirementsStrategy(IRequirementsStrategy.OR);
		consumerIn.accept(new ModRecipeBuilder.Result(id, this.serializer, this.group == null ? "" : this.group, this.ingredient, this.result, this.count, this.advancementBuilder, new ResourceLocation(id.getNamespace(), "recipes/" + this.result.getGroup().getPath() + "/" + id.getPath())));
	}

	private void validate(ResourceLocation id) {
		if (this.advancementBuilder.getCriteria().isEmpty()) {
			throw new IllegalStateException("No way of obtaining recipe " + id);
		}
	}

	public static class Result implements IFinishedRecipe {
		private final ResourceLocation id;
		private final String group;
		private final Ingredient ingredient;
		private final Item result;
		private final int count;
		private final Advancement.Builder advancementBuilder;
		private final ResourceLocation advancementId;
		private final IRecipeSerializer<?> serializer;

		public Result(ResourceLocation idIn, IRecipeSerializer<?> serializerIn, String groupIn, Ingredient ingredientIn, Item resultIn, int countIn, Advancement.Builder advancementBuilderIn, ResourceLocation advancementIdIn) {
			this.id = idIn;
			this.serializer = serializerIn;
			this.group = groupIn;
			this.ingredient = ingredientIn;
			this.result = resultIn;
			this.count = countIn;
			this.advancementBuilder = advancementBuilderIn;
			this.advancementId = advancementIdIn;
		}

		public void serialize(JsonObject json) {
			if (!this.group.isEmpty()) {
				json.addProperty("group", this.group);
			}

			json.add("ingredient", this.ingredient.serialize());
			json.addProperty("result", ForgeRegistries.ITEMS.getKey(this.result).toString());
			json.addProperty("count", this.count);
		}

		public ResourceLocation getID() {
			return this.id;
		}

		public IRecipeSerializer<?> getSerializer() {
			return this.serializer;
		}

		@Nullable
		public JsonObject getAdvancementJson() {
			return this.advancementBuilder.serialize();
		}

		@Nullable
		public ResourceLocation getAdvancementID() {
			return this.advancementId;
		}
	}
}
