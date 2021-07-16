package einstein.cutandcolored.data;

import java.util.Objects;
import java.util.function.Consumer;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.SingleItemRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ITag;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.registries.ForgeRegistries;

public class RecipeResources extends RecipeProvider {
	
	public RecipeResources(DataGenerator generatorIn) {
		super(generatorIn);
	}

	protected Item getItem(ResourceLocation location) {
		Item item = ForgeRegistries.ITEMS.getValue(location);
		if (item != Items.AIR) {
			return item;
		}
		else {
			throw new NullPointerException("Could not find item: " + location.toString());
		}
	}
	
	protected static ResourceLocation ModRL(String string) {
		return new ResourceLocation(CutAndColored.MODID, string);
	}
	
	protected static ResourceLocation MCRL(String string) {
		return new ResourceLocation(CutAndColored.MCMODID, string);
	}
	
	protected static ResourceLocation FRL(String string) {
		return new ResourceLocation(CutAndColored.FMODID, string);
	}
	
	protected static ResourceLocation location(String name, String folder) {
		return ModRL(folder + name);
	}

	protected static ResourceLocation location(IItemProvider item, String folder) {
		return ModRL(folder + Objects.requireNonNull(item.asItem().getRegistryName().getPath()));
	}
	
	protected static void stonecuttingRecipe(Consumer<IFinishedRecipe> consumer, String name, IItemProvider ingredient, IItemProvider result) {
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ingredient), result).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "stonecutting/"));
	}
	
	protected static void stonecuttingRecipe(Consumer<IFinishedRecipe> consumer, String name, IItemProvider ingredient, IItemProvider result, int count) {
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ingredient), result, count).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "stonecutting/"));
	}
	
	protected static void stonecuttingRecipe(Consumer<IFinishedRecipe> consumer, String name, IItemProvider ingredient, IItemProvider result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ingredient), result, count)
				.addCriterion("has_item", hasItem(ingredient))::build).generateAdvancement().build(consumer, location(name, "stonecutting/"));
	}
	
	protected static void smeltingRecipe(Consumer<IFinishedRecipe> consumer, IItemProvider ingredient, IItemProvider result, float experience, int cookTime) {
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ingredient.asItem()), result, experience, cookTime).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(result, "smelting/"));
	}
	
	protected static void blastingRecipe(Consumer<IFinishedRecipe> consumer, IItemProvider ingredient, IItemProvider result, float experience, int cooktime) {
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ingredient.asItem()), result, experience, cooktime).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(result, "blasting/"));
	}
	
	protected static void glasscuttingRecipe(Consumer<IFinishedRecipe> consumer, String name, IItemProvider ingredient, IItemProvider result) {
		ModRecipeBuilder.glasscuttingRecipe(Ingredient.fromItems(ingredient), result).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "glasscutting/"));
	}
	
	protected static void glasscuttingRecipe(Consumer<IFinishedRecipe> consumer, String name, IItemProvider ingredient, IItemProvider result, int count) {
		ModRecipeBuilder.glasscuttingRecipe(Ingredient.fromItems(ingredient), result, count).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "glasscutting/"));
	}
	
	protected static void glasscuttingRecipe(Consumer<IFinishedRecipe> consumer, String name, IItemProvider ingredient, IItemProvider result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.fromItems(ingredient), result, count)
				.addCriterion("has_item", hasItem(ingredient))::build).generateAdvancement().build(consumer, location(name, "glasscutting/"));
	}
	
	protected static void sawmillingRecipe(Consumer<IFinishedRecipe> consumer, String name, IItemProvider ingredient, IItemProvider result) {
		ModRecipeBuilder.sawmillingRecipe(Ingredient.fromItems(ingredient), result).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "sawmilling/"));
	}
	
//	protected static void sawmillingRecipe(Consumer<IFinishedRecipe> consumer, String name, IItemProvider ingredient, IItemProvider result, int count) {
//		ModRecipeBuilder.sawmillingRecipe(Ingredient.fromItems(ingredient), result, count).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "sawmilling/"));
//	}
	
	protected static void sawmillingRecipe(Consumer<IFinishedRecipe> consumer, String name, IItemProvider result, int count, IItemProvider... ingredient) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid == CutAndColored.MCMODID || modid == CutAndColored.MODID) {
			ModRecipeBuilder.sawmillingRecipe(Ingredient.fromItems(ingredient), result, count).addCriterion("has_item", hasItem(ingredient[0])).build(consumer, location(name, "sawmilling/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.sawmillingRecipe(Ingredient.fromItems(ingredient), result, count)
					.addCriterion("has_item", hasItem(ingredient[0]))::build).generateAdvancement().build(consumer, location(name, "sawmilling/"));
		}
	}
	
	protected static void sawmillingRecipe(Consumer<IFinishedRecipe> consumer, String name, ITag<Item> ingredient, IItemProvider result) {
		ModRecipeBuilder.sawmillingRecipe(Ingredient.fromTag(ingredient), result).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "sawmilling/"));
	}
	
	protected static void sawmillingRecipe(Consumer<IFinishedRecipe> consumer, String name, ITag<Item> ingredient, IItemProvider result, int count) {
		ModRecipeBuilder.sawmillingRecipe(Ingredient.fromTag(ingredient), result, count).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "sawmilling/"));
	}
	
	protected static void sawmillingRecipe(Consumer<IFinishedRecipe> consumer, String name, ITag<Item> ingredient, IItemProvider result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.sawmillingRecipe(Ingredient.fromTag(ingredient), result, count)
				.addCriterion("has_item", hasItem(ingredient))::build).generateAdvancement().build(consumer, location(name, "sawmilling/"));
	}
	
	protected static void weavingRecipe(Consumer<IFinishedRecipe> consumer, String name, IItemProvider ingredient, IItemProvider result) {
		ModRecipeBuilder.weavingRecipe(Ingredient.fromItems(ingredient), result).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "weaving/"));
	}
	
	protected static void weavingRecipe(Consumer<IFinishedRecipe> consumer, String name, IItemProvider ingredient, IItemProvider result, int count) {
		ModRecipeBuilder.weavingRecipe(Ingredient.fromItems(ingredient), result, count).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "weaving/"));
	}
	
	protected static void weavingRecipe(Consumer<IFinishedRecipe> consumer, String name, IItemProvider ingredient, IItemProvider result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.weavingRecipe(Ingredient.fromItems(ingredient), result, count)
				.addCriterion("has_item", hasItem(ingredient))::build).generateAdvancement().build(consumer, location(name, "weaving/"));
	}
	
	protected static void stairsRecipe(Consumer<IFinishedRecipe> consumer, IItemProvider ingredient, IItemProvider result) {
		ShapedRecipeBuilder.shapedRecipe(result, 4)
			.patternLine("#  ")
			.patternLine("## ")
			.patternLine("###")
			.key('#', ingredient)
			.addCriterion("has_item", hasItem(ingredient))
			.build(consumer, location(result, "crafting/"));
	}
	
	protected static void slabsRecipe(Consumer<IFinishedRecipe> consumer, IItemProvider ingredient, IItemProvider result) {
		ShapedRecipeBuilder.shapedRecipe(result, 6)
			.patternLine("###")
			.key('#', ingredient)
			.addCriterion("has_item", hasItem(ingredient))
			.build(consumer, location(result, "crafting/"));
	}
	
	protected static void wallRecipe(Consumer<IFinishedRecipe> consumer, IItemProvider ingredient, IItemProvider result) {
		ShapedRecipeBuilder.shapedRecipe(result, 6)
			.patternLine("###")
			.patternLine("###")
			.key('#', ingredient)
			.addCriterion("has_item", hasItem(ingredient))
			.build(consumer, location(result, "crafting/"));
	}
	
//	protected static void recolorItemRecipe(Consumer<IFinishedRecipe> consumer, IItemProvider item /*, ITag<Item> tag*/) {
//		for (int i = 0; i < Tags.Items.DYES.getAllElements().size(); i++) {
//			IItemProvider dye = Tags.Items.DYES.getAllElements().get(i);
//			ShapedRecipeBuilder.shapedRecipe(item, 8)
//				.patternLine("###")
//				.patternLine("#$#")
//				.patternLine("###")
//				.key('#', item)
//				.key('$', dye)
//				.addCriterion("has_item", hasItem(item))
//				.build(consumer, location(item.asItem().getRegistryName().getPath() + "_recolor_" + dye.asItem().getRegistryName().getPath(), "crafting/"));
//		}
//	}
//	
//	protected static void recolorTagRecipes(Consumer<IFinishedRecipe> consumer, Tag<Item> tag) {
//		//ShapedRecipeBuilder.shapedRecipe(resultIn);
//	}
}
