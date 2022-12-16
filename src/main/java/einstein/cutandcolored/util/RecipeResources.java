package einstein.cutandcolored.util;

import java.util.Objects;
import java.util.function.Consumer;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.item.crafting.builders.ModRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class RecipeResources extends RecipeProvider {
	
	protected static Consumer<FinishedRecipe> consumer;
	
	public RecipeResources(PackOutput output) {
		super(output);
	}

	protected void setConsumer(Consumer<FinishedRecipe> consumer) {
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
	
	protected static ResourceLocation modRL(String string) {
		return new ResourceLocation(CutAndColored.MOD_ID, string);
	}
	
	protected static ResourceLocation MCRL(String string) {
		return new ResourceLocation(CutAndColored.MC_MOD_ID, string);
	}
	
	protected static ResourceLocation location(String name, String folder) {
		return modRL(folder + name);
	}

	protected static ResourceLocation location(ItemLike item, String folder) {
		return modRL(folder + Objects.requireNonNull(Util.getItemRegistryName(item).getPath()));
	}
	
	protected static void smeltingRecipe(RecipeCategory category, ItemLike ingredient, ItemLike result, float experience, int cookTime) {
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient.asItem()), category, result, experience, cookTime).unlockedBy("has_item", has(ingredient)).save(consumer, location(result, "smelting/"));
	}
	
	protected static void blastingRecipe(RecipeCategory category, ItemLike ingredient, ItemLike result, float experience, int cooktime) {
		SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredient.asItem()), category, result, experience, cooktime).unlockedBy("has_item", has(ingredient)).save(consumer, location(result, "blasting/"));
	}
	
	protected static void stonecuttingRecipe(String name, RecipeCategory category, ItemLike result, int count, ItemLike triggerItem, ItemLike... ingredient) {
		String modid = Util.getItemRegistryName(result).getNamespace();
		if (modid.contains(CutAndColored.MC_MOD_ID) || modid.contains(CutAndColored.MOD_ID)) {
			ModRecipeBuilder.stonecuttingRecipe(category, Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(triggerItem)).save(consumer, location(name, "stonecutting/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.stonecuttingRecipe(category, Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(triggerItem))::save).generateAdvancement().build(consumer, location(name, "stonecutting/"));
		}
	}
	
	protected static void stonecuttingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
		stonecuttingRecipe(name, category, result, count, ingredient, ingredient);
	}
	
	protected static void stonecuttingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result) {
		stonecuttingRecipe(name, category, ingredient, result, 1);
	}
	
	protected static void stonecuttingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.stonecuttingRecipe(category, Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "stonecutting/"));
	}
	
	protected static void stonecuttingRecipe(String name, RecipeCategory category, TagKey<Item> ingredient, ItemLike result, int count) {
		String modid = Util.getItemRegistryName(result).getNamespace();
		if (modid.contains(CutAndColored.MC_MOD_ID) || modid.contains(CutAndColored.MOD_ID)) {
			ModRecipeBuilder.stonecuttingRecipe(category, Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(ingredient)).save(consumer, location(name, "stonecutting/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.stonecuttingRecipe(category, Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "stonecutting/"));
		}
	}
	
	protected static void stonecuttingRecipe(String name, RecipeCategory category, TagKey<Item> ingredient, ItemLike result) {
		stonecuttingRecipe(name, category, ingredient, result, 1);
	}
	
	protected static void stonecuttingRecipe(String name, RecipeCategory category, TagKey<Item> ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.stonecuttingRecipe(category, Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "stonecutting/"));
	}
	
	protected static void glasscuttingRecipe(String name, RecipeCategory category, ItemLike result, int count, ItemLike triggerItem, ItemLike... ingredient) {
		String modid = Util.getItemRegistryName(result).getNamespace();
		if (modid.contains(CutAndColored.MC_MOD_ID) || modid.contains(CutAndColored.MOD_ID)) {
			ModRecipeBuilder.glasscuttingRecipe(category, Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(triggerItem)).save(consumer, location(name, "glasscutting/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.glasscuttingRecipe(category, Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(triggerItem))::save).generateAdvancement().build(consumer, location(name, "glasscutting/"));
		}
	}
	
	protected static void glasscuttingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
		glasscuttingRecipe(name, category, result, count, ingredient, ingredient);
	}
	
	protected static void glasscuttingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result) {
		glasscuttingRecipe(name, category, ingredient, result, 1);
	}

	protected static void glasscuttingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.glasscuttingRecipe(category, Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "glasscutting/"));
	}
	
	protected static void glasscuttingRecipe(String name, RecipeCategory category, TagKey<Item> ingredient, ItemLike result, int count) {
		String modid = Util.getItemRegistryName(result).getNamespace();
		if (modid.contains(CutAndColored.MC_MOD_ID) || modid.contains(CutAndColored.MOD_ID)) {
			ModRecipeBuilder.glasscuttingRecipe(category, Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(ingredient)).save(consumer, location(name, "glasscutting/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.glasscuttingRecipe(category, Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "glasscutting/"));
		}
	}
	
	protected static void glasscuttingRecipe(String name, RecipeCategory category, TagKey<Item> ingredient, ItemLike result) {
		glasscuttingRecipe(name, category, ingredient, result, 1);
	}
	
	protected static void glasscuttingRecipe(String name, RecipeCategory category, TagKey<Item> ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.glasscuttingRecipe(category, Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "glasscutting/"));
	}
	
	protected static void sawmillingRecipe(String name, RecipeCategory category, ItemLike result, int count, ItemLike triggerItem, ItemLike... ingredient) {
		String modid = Util.getItemRegistryName(result).getNamespace();
		if (modid.contains(CutAndColored.MC_MOD_ID) || modid.contains(CutAndColored.MOD_ID)) {
			ModRecipeBuilder.sawmillingRecipe(category, Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(triggerItem)).save(consumer, location(name, "sawmilling/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.sawmillingRecipe(category, Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(triggerItem))::save).generateAdvancement().build(consumer, location(name, "sawmilling/"));
		}
	}
	
	protected static void sawmillingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
		sawmillingRecipe(name, category, result, count, ingredient, ingredient);
	}
	
	protected static void sawmillingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result) {
		sawmillingRecipe(name, category, ingredient, result, 1);
	}
	
	protected static void sawmillingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.sawmillingRecipe(category, Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "sawmilling/"));
	}
	
	protected static void sawmillingRecipe(String name, RecipeCategory category, TagKey<Item> ingredient, ItemLike result, int count) {
		String modid = Util.getItemRegistryName(result).getNamespace();
		if (modid.contains(CutAndColored.MC_MOD_ID) || modid.contains(CutAndColored.MOD_ID)) {
			ModRecipeBuilder.sawmillingRecipe(category, Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(ingredient)).save(consumer, location(name, "sawmilling/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.sawmillingRecipe(category, Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "sawmilling/"));
		}
	}
	
	protected static void sawmillingRecipe(String name, RecipeCategory category, TagKey<Item> ingredient, ItemLike result) {
		sawmillingRecipe(name, category, ingredient, result, 1);
	}
	
	protected static void sawmillingRecipe(String name, RecipeCategory category, TagKey<Item> ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.sawmillingRecipe(category, Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "sawmilling/"));
	}
	
	protected static void weavingRecipe(String name, RecipeCategory category, ItemLike result, int count, ItemLike triggerItem, ItemLike... ingredient) {
		String modid = Util.getItemRegistryName(result).getNamespace();
		if (modid.contains(CutAndColored.MC_MOD_ID) || modid.contains(CutAndColored.MOD_ID)) {
			ModRecipeBuilder.weavingRecipe(category, Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(triggerItem)).save(consumer, location(name, "weaving/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.weavingRecipe(category, Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(triggerItem))::save).generateAdvancement().build(consumer, location(name, "weaving/"));
		}
	}
	
	protected static void weavingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
		weavingRecipe(name, category, result, count, ingredient, ingredient);
	}
	
	protected static void weavingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result) {
		weavingRecipe(name, category, ingredient, result, 1);
	}

	protected static void weavingRecipe(String name, RecipeCategory category, ItemLike ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.weavingRecipe(category, Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "weaving/"));
	}
	
	protected static void weavingRecipe(String name, RecipeCategory category, TagKey<Item> ingredient, ItemLike result, int count) {
		String modid = Util.getItemRegistryName(result).getNamespace();
		if (modid.contains(CutAndColored.MC_MOD_ID) || modid.contains(CutAndColored.MOD_ID)) {
			ModRecipeBuilder.weavingRecipe(category, Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(ingredient)).save(consumer, location(name, "weaving/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.weavingRecipe(category, Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "weaving/"));
		}
	}
	
	protected static void weavingRecipe(String name, RecipeCategory category, TagKey<Item> ingredient, ItemLike result) {
		weavingRecipe(name, category, ingredient, result, 1);
	}
	
	protected static void weavingRecipe(String name, RecipeCategory category, TagKey<Item> ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.weavingRecipe(category, Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "weaving/"));
	}
	
	protected static void stairsRecipe(String name, ItemLike ingredient, ItemLike result, String group) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
			.pattern("#  ")
			.pattern("## ")
			.pattern("###")
			.define('#', ingredient)
			.group(group)
			.unlockedBy("has_item", has(ingredient))
			.save(consumer, location(name, "crafting/"));
	}
	
	protected static void stairsRecipe(String name, ItemLike ingredient, ItemLike result, String group, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
			.pattern("#  ")
			.pattern("## ")
			.pattern("###")
			.define('#', ingredient)
			.group(group)
			.unlockedBy("has_item", has(ingredient))::save)
			.generateAdvancement()
			.build(consumer, location(name, "crafting/"));
	}
	
	protected static void slabsRecipe(String name, ItemLike ingredient, ItemLike result, String group) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
			.pattern("###")
			.define('#', ingredient)
			.group(group)
			.unlockedBy("has_item", has(ingredient))
			.save(consumer, location(name, "crafting/"));
	}
	
	protected static void slabsRecipe(String name, ItemLike ingredient, ItemLike result, String group, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
			.pattern("###")
			.define('#', ingredient)
			.group(group)
			.unlockedBy("has_item", has(ingredient))::save)
			.generateAdvancement()
			.build(consumer, location(name, "crafting/"));
	}
	
	protected static void wallsRecipe(String name, ItemLike ingredient, ItemLike result, String group) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
			.pattern("###")
			.pattern("###")
			.define('#', ingredient)
			.group(group)
			.unlockedBy("has_item", has(ingredient))
			.save(consumer, location(name, "crafting/"));
	}
	
	protected static void wallsRecipe(String name, ItemLike ingredient, ItemLike result, String group, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
			.pattern("###")
			.pattern("###")
			.define('#', ingredient)
			.group(group)
			.unlockedBy("has_item", has(ingredient))::save)
			.generateAdvancement()
			.build(consumer, location(name, "crafting/"));
	}
	
	protected static void blockRecipe4x4(String name, ItemLike ingredient, ItemLike result, int count) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, count)
			.pattern("##")
			.pattern("##")
			.define('#', ingredient)
			.unlockedBy("has_item", has(ingredient))
			.save(consumer, location(name, "crafting/"));
	}
	
	protected static void pillarRecipe(ItemLike ingredient, ItemLike result, int count) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, count)
		.pattern("#")
		.pattern("#")
		.define('#', ingredient)
		.unlockedBy("has_item", has(ingredient))
		.save(consumer, location(result, "crafting/"));
	}
	
	protected static void recolorObject(TagKey<Item> ingredients, ItemLike result, String color, String group) {
		Item dye = getItem(MCRL(color + "_dye"));
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 8)
			.pattern("###")
			.pattern("#$#")
			.pattern("###")
			.define('#', ingredients)
			.define('$', dye)
			.group(group)
			.unlockedBy("has_item", has(ingredients))
			.save(consumer, location(Util.getItemRegistryName(result).getPath() + "_from_recolor", "crafting/"));
	}
	
	protected static void recolorObject(TagKey<Item> ingredients, ItemLike result, String color, String group, String modid) {
		Item dye = getItem(MCRL(color + "_dye"));
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 8)
			.pattern("###")
			.pattern("#$#")
			.pattern("###")
			.define('#', ingredients)
			.define('$', dye)
			.group(group)
			.unlockedBy("has_item", has(ingredients))::save)
			.generateAdvancement()
			.build(consumer, location(Util.getItemRegistryName(result).getPath() + "_from_recolor", "crafting/"));
	}
}
