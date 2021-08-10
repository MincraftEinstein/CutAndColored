package einstein.cutandcolored.data;

import java.util.Objects;
import java.util.function.Consumer;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
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
	
	private static Consumer<IFinishedRecipe> consumer;
	
	public RecipeResources(DataGenerator generatorIn) {
		super(generatorIn);
	}

	protected void setConsumer(Consumer<IFinishedRecipe> consumer) {
		RecipeResources.consumer = consumer;
	}
	
	protected static Item getItem(ResourceLocation location) {
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
	
	protected static void smeltingRecipe(IItemProvider ingredient, IItemProvider result, float experience, int cookTime) {
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ingredient.asItem()), result, experience, cookTime).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(result, "smelting/"));
	}
	
	protected static void blastingRecipe(IItemProvider ingredient, IItemProvider result, float experience, int cooktime) {
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ingredient.asItem()), result, experience, cooktime).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(result, "blasting/"));
	}
	
	protected static void stonecuttingRecipe(String name, IItemProvider result, int count, IItemProvider triggerItem, IItemProvider... ingredient) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ingredient), result, count).addCriterion("has_item", hasItem(triggerItem)).build(consumer, location(name, "stonecutting/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(ingredient), result, count)
					.addCriterion("has_item", hasItem(triggerItem))::build).generateAdvancement().build(consumer, location(name, "stonecutting/"));
		}
	}
	
	protected static void stonecuttingRecipe(String name, IItemProvider ingredient, IItemProvider result, int count) {
		stonecuttingRecipe(name, result, count, ingredient, ingredient);
	}
	
	protected static void stonecuttingRecipe(String name, IItemProvider ingredient, IItemProvider result) {
		stonecuttingRecipe(name, ingredient, result, 1);
	}
	
	protected static void stonecuttingRecipe(String name, IItemProvider ingredient, IItemProvider result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.fromItems(ingredient), result, count)
				.addCriterion("has_item", hasItem(ingredient))::build).generateAdvancement().build(consumer, location(name, "stonecutting/"));
	}
	
	protected static void stonecuttingRecipe(String name, ITag<Item> ingredient, IItemProvider result, int count) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(ingredient), result, count).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "stonecutting/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(ingredient), result, count)
					.addCriterion("has_item", hasItem(ingredient))::build).generateAdvancement().build(consumer, location(name, "stonecutting/"));
		}
	}
	
	protected static void stonecuttingRecipe(String name, ITag<Item> ingredient, IItemProvider result) {
		stonecuttingRecipe(name, ingredient, result, 1);
	}
	
	protected static void glasscuttingRecipe(String name, IItemProvider result, int count, IItemProvider triggerItem, IItemProvider... ingredient) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.glasscuttingRecipe(Ingredient.fromItems(ingredient), result, count).addCriterion("has_item", hasItem(triggerItem)).build(consumer, location(name, "glasscutting/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.fromItems(ingredient), result, count)
					.addCriterion("has_item", hasItem(triggerItem))::build).generateAdvancement().build(consumer, location(name, "glasscutting/"));
		}
	}
	
	protected static void glasscuttingRecipe(String name, IItemProvider ingredient, IItemProvider result, int count) {
		glasscuttingRecipe(name, result, count, ingredient, ingredient);
	}
	
	protected static void glasscuttingRecipe(String name, IItemProvider ingredient, IItemProvider result) {
		glasscuttingRecipe(name, ingredient, result, 1);
	}

	protected static void glasscuttingRecipe(String name, IItemProvider ingredient, IItemProvider result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.fromItems(ingredient), result, count)
				.addCriterion("has_item", hasItem(ingredient))::build).generateAdvancement().build(consumer, location(name, "glasscutting/"));
	}
	
	protected static void glasscuttingRecipe(String name, ITag<Item> ingredient, IItemProvider result, int count) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.glasscuttingRecipe(Ingredient.fromTag(ingredient), result, count).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "glasscutting/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.fromTag(ingredient), result, count)
					.addCriterion("has_item", hasItem(ingredient))::build).generateAdvancement().build(consumer, location(name, "glasscutting/"));
		}
	}
	
	protected static void glasscuttingRecipe(String name, ITag<Item> ingredient, IItemProvider result) {
		glasscuttingRecipe(name, ingredient, result, 1);
	}
	
	protected static void sawmillingRecipe(String name, IItemProvider result, int count, IItemProvider triggerItem, IItemProvider... ingredient) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.sawmillingRecipe(Ingredient.fromItems(ingredient), result, count).addCriterion("has_item", hasItem(triggerItem)).build(consumer, location(name, "sawmilling/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.sawmillingRecipe(Ingredient.fromItems(ingredient), result, count)
					.addCriterion("has_item", hasItem(triggerItem))::build).generateAdvancement().build(consumer, location(name, "sawmilling/"));
		}
	}
	
	protected static void sawmillingRecipe(String name, IItemProvider ingredient, IItemProvider result, int count) {
		sawmillingRecipe(name, result, count, ingredient, ingredient);
	}
	
	protected static void sawmillingRecipe(String name, IItemProvider ingredient, IItemProvider result) {
		sawmillingRecipe(name, ingredient, result, 1);
	}
	
	protected static void sawmillingRecipe(String name, IItemProvider ingredient, IItemProvider result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.fromItems(ingredient), result, count)
				.addCriterion("has_item", hasItem(ingredient))::build).generateAdvancement().build(consumer, location(name, "sawmilling/"));
	}
	
	protected static void sawmillingRecipe(String name, ITag<Item> ingredient, IItemProvider result, int count) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.sawmillingRecipe(Ingredient.fromTag(ingredient), result, count).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "sawmilling/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.sawmillingRecipe(Ingredient.fromTag(ingredient), result, count)
					.addCriterion("has_item", hasItem(ingredient))::build).generateAdvancement().build(consumer, location(name, "sawmilling/"));
		}
	}
	
	protected static void sawmillingRecipe(String name, ITag<Item> ingredient, IItemProvider result) {
		sawmillingRecipe(name, ingredient, result, 1);
	}
	
	protected static void weavingRecipe(String name, IItemProvider result, int count, IItemProvider triggerItem, IItemProvider... ingredient) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.weavingRecipe(Ingredient.fromItems(ingredient), result, count).addCriterion("has_item", hasItem(triggerItem)).build(consumer, location(name, "weaving/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.weavingRecipe(Ingredient.fromItems(ingredient), result, count)
					.addCriterion("has_item", hasItem(triggerItem))::build).generateAdvancement().build(consumer, location(name, "weaving/"));
		}
	}
	
	protected static void weavingRecipe(String name, IItemProvider ingredient, IItemProvider result, int count) {
		weavingRecipe(name, result, count, ingredient, ingredient);
	}
	
	protected static void weavingRecipe(String name, IItemProvider ingredient, IItemProvider result) {
		weavingRecipe(name, ingredient, result, 1);
	}
	
	protected static void weavingRecipe(String name, IItemProvider ingredient, IItemProvider result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.fromItems(ingredient), result, count)
				.addCriterion("has_item", hasItem(ingredient))::build).generateAdvancement().build(consumer, location(name, "weaving/"));
	}
	
	protected static void weavingRecipe(String name, ITag<Item> ingredient, IItemProvider result, int count) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.weavingRecipe(Ingredient.fromTag(ingredient), result, count).addCriterion("has_item", hasItem(ingredient)).build(consumer, location(name, "weaving/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.weavingRecipe(Ingredient.fromTag(ingredient), result, count)
					.addCriterion("has_item", hasItem(ingredient))::build).generateAdvancement().build(consumer, location(name, "weaving/"));
		}
	}
	
	protected static void weavingRecipe(String name, ITag<Item> ingredient, IItemProvider result) {
		weavingRecipe(name, ingredient, result, 1);
	}
	
	protected static void stairsRecipe(String name, IItemProvider ingredient, IItemProvider result) {
		ShapedRecipeBuilder.shapedRecipe(result, 4)
			.patternLine("#  ")
			.patternLine("## ")
			.patternLine("###")
			.key('#', ingredient)
			.addCriterion("has_item", hasItem(ingredient))
			.build(consumer, location(name, "crafting/"));
	}
	
	protected static void slabsRecipe(String name, IItemProvider ingredient, IItemProvider result) {
		ShapedRecipeBuilder.shapedRecipe(result, 6)
			.patternLine("###")
			.key('#', ingredient)
			.addCriterion("has_item", hasItem(ingredient))
			.build(consumer, location(name, "crafting/"));
	}
	
	protected static void wallsRecipe(String name, IItemProvider ingredient, IItemProvider result) {
		ShapedRecipeBuilder.shapedRecipe(result, 6)
			.patternLine("###")
			.patternLine("###")
			.key('#', ingredient)
			.addCriterion("has_item", hasItem(ingredient))
			.build(consumer, location(name, "crafting/"));
	}
	
	protected static void blockRecipe4x4(String name, IItemProvider ingredient, IItemProvider result) {
		ShapedRecipeBuilder.shapedRecipe(result, 4)
		.patternLine("##")
		.patternLine("##")
		.key('#', ingredient)
		.addCriterion("has_item", hasItem(ingredient))
		.build(consumer, location(name, "crafting/"));
	}
	
//	protected static void recolorItemRecipe(IItemProvider item /*, ITag<Item> tag*/) {
//		for (int i = 0; i < DyeColor.values().length; i++) {
//			IItemProvider dye = getItem(ModRL(DyeColor.byId(i).getTranslationKey() + "_dye"));
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
	
//	protected static void recolorTagRecipes(Tag<Item> tag) {
//		//ShapedRecipeBuilder.shapedRecipe(resultIn);
//	}
}
