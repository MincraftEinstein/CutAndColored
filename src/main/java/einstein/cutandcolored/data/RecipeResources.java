package einstein.cutandcolored.data;

import java.util.Objects;
import java.util.function.Consumer;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.registries.ForgeRegistries;

public class RecipeResources extends RecipeProvider {
	
	protected static Consumer<FinishedRecipe> consumer;
	
	public RecipeResources(DataGenerator generatorIn) {
		super(generatorIn);
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

	protected static ResourceLocation location(ItemLike item, String folder) {
		return ModRL(folder + Objects.requireNonNull(item.asItem().getRegistryName().getPath()));
	}
	
	protected static void smeltingRecipe(ItemLike ingredient, ItemLike result, float experience, int cookTime) {
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient.asItem()), result, experience, cookTime).unlockedBy("has_item", has(ingredient)).save(consumer, location(result, "smelting/"));
	}
	
	protected static void blastingRecipe(ItemLike ingredient, ItemLike result, float experience, int cooktime) {
		SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredient.asItem()), result, experience, cooktime).unlockedBy("has_item", has(ingredient)).save(consumer, location(result, "blasting/"));
	}
	
	protected static void stonecuttingRecipe(String name, ItemLike result, int count, ItemLike triggerItem, ItemLike... ingredient) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.stonecuttingRecipe(Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(triggerItem)).save(consumer, location(name, "stonecutting/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.stonecuttingRecipe(Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(triggerItem))::save).generateAdvancement().build(consumer, location(name, "stonecutting/"));
		}
	}
	
	protected static void stonecuttingRecipe(String name, ItemLike ingredient, ItemLike result, int count) {
		stonecuttingRecipe(name, result, count, ingredient, ingredient);
	}
	
	protected static void stonecuttingRecipe(String name, ItemLike ingredient, ItemLike result) {
		stonecuttingRecipe(name, ingredient, result, 1);
	}
	
	protected static void stonecuttingRecipe(String name, ItemLike ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "stonecutting/"));
	}
	
	protected static void stonecuttingRecipe(String name, Tag<Item> ingredient, ItemLike result, int count) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.stonecuttingRecipe(Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(ingredient)).save(consumer, location(name, "stonecutting/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.stonecuttingRecipe(Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "stonecutting/"));
		}
	}
	
	protected static void stonecuttingRecipe(String name, Tag<Item> ingredient, ItemLike result) {
		stonecuttingRecipe(name, ingredient, result, 1);
	}
	
	protected static void stonecuttingRecipe(String name, Tag<Item> ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.stonecuttingRecipe(Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "stonecutting/"));
	}
	
	protected static void glasscuttingRecipe(String name, ItemLike result, int count, ItemLike triggerItem, ItemLike... ingredient) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.glasscuttingRecipe(Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(triggerItem)).save(consumer, location(name, "glasscutting/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(triggerItem))::save).generateAdvancement().build(consumer, location(name, "glasscutting/"));
		}
	}
	
	protected static void glasscuttingRecipe(String name, ItemLike ingredient, ItemLike result, int count) {
		glasscuttingRecipe(name, result, count, ingredient, ingredient);
	}
	
	protected static void glasscuttingRecipe(String name, ItemLike ingredient, ItemLike result) {
		glasscuttingRecipe(name, ingredient, result, 1);
	}

	protected static void glasscuttingRecipe(String name, ItemLike ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "glasscutting/"));
	}
	
	protected static void glasscuttingRecipe(String name, Tag<Item> ingredient, ItemLike result, int count) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.glasscuttingRecipe(Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(ingredient)).save(consumer, location(name, "glasscutting/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "glasscutting/"));
		}
	}
	
	protected static void glasscuttingRecipe(String name, Tag<Item> ingredient, ItemLike result) {
		glasscuttingRecipe(name, ingredient, result, 1);
	}
	
	protected static void glasscuttingRecipe(String name, Tag<Item> ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "glasscutting/"));
	}
	
	protected static void sawmillingRecipe(String name, ItemLike result, int count, ItemLike triggerItem, ItemLike... ingredient) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.sawmillingRecipe(Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(triggerItem)).save(consumer, location(name, "sawmilling/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.sawmillingRecipe(Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(triggerItem))::save).generateAdvancement().build(consumer, location(name, "sawmilling/"));
		}
	}
	
	protected static void sawmillingRecipe(String name, ItemLike ingredient, ItemLike result, int count) {
		sawmillingRecipe(name, result, count, ingredient, ingredient);
	}
	
	protected static void sawmillingRecipe(String name, ItemLike ingredient, ItemLike result) {
		sawmillingRecipe(name, ingredient, result, 1);
	}
	
	protected static void sawmillingRecipe(String name, ItemLike ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "sawmilling/"));
	}
	
	protected static void sawmillingRecipe(String name, Tag<Item> ingredient, ItemLike result, int count) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.sawmillingRecipe(Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(ingredient)).save(consumer, location(name, "sawmilling/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.sawmillingRecipe(Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "sawmilling/"));
		}
	}
	
	protected static void sawmillingRecipe(String name, Tag<Item> ingredient, ItemLike result) {
		sawmillingRecipe(name, ingredient, result, 1);
	}
	
	protected static void sawmillingRecipe(String name, Tag<Item> ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.sawmillingRecipe(Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "sawmilling/"));
	}
	
	protected static void weavingRecipe(String name, ItemLike result, int count, ItemLike triggerItem, ItemLike... ingredient) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.weavingRecipe(Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(triggerItem)).save(consumer, location(name, "weaving/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.weavingRecipe(Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(triggerItem))::save).generateAdvancement().build(consumer, location(name, "weaving/"));
		}
	}
	
	protected static void weavingRecipe(String name, ItemLike ingredient, ItemLike result, int count) {
		weavingRecipe(name, result, count, ingredient, ingredient);
	}
	
	protected static void weavingRecipe(String name, ItemLike ingredient, ItemLike result) {
		weavingRecipe(name, ingredient, result, 1);
	}
	
	protected static void weavingRecipe(String name, ItemLike ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.glasscuttingRecipe(Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "weaving/"));
	}
	
	protected static void weavingRecipe(String name, Tag<Item> ingredient, ItemLike result, int count) {
		String modid = result.asItem().getRegistryName().getNamespace();
		if (modid.contains(CutAndColored.MCMODID) || modid.contains(CutAndColored.MODID)) {
			ModRecipeBuilder.weavingRecipe(Ingredient.of(ingredient), result, count).unlockedBy("has_item", has(ingredient)).save(consumer, location(name, "weaving/"));
		}
		else {
			ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
			.addRecipe(ModRecipeBuilder.weavingRecipe(Ingredient.of(ingredient), result, count)
					.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "weaving/"));
		}
	}
	
	protected static void weavingRecipe(String name, Tag<Item> ingredient, ItemLike result) {
		weavingRecipe(name, ingredient, result, 1);
	}
	
	protected static void weavingRecipe(String name, Tag<Item> ingredient, ItemLike result, int count, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ModRecipeBuilder.weavingRecipe(Ingredient.of(ingredient), result, count)
				.unlockedBy("has_item", has(ingredient))::save).generateAdvancement().build(consumer, location(name, "weaving/"));
	}
	
	protected static void stairsRecipe(String name, ItemLike ingredient, ItemLike result, String group) {
		ShapedRecipeBuilder.shaped(result, 4)
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
		.addRecipe(ShapedRecipeBuilder.shaped(result, 4)
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
		ShapedRecipeBuilder.shaped(result, 6)
			.pattern("###")
			.define('#', ingredient)
			.group(group)
			.unlockedBy("has_item", has(ingredient))
			.save(consumer, location(name, "crafting/"));
	}
	
	protected static void slabsRecipe(String name, ItemLike ingredient, ItemLike result, String group, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ShapedRecipeBuilder.shaped(result, 6)
			.pattern("###")
			.define('#', ingredient)
			.group(group)
			.unlockedBy("has_item", has(ingredient))::save)
			.generateAdvancement()
			.build(consumer, location(name, "crafting/"));
	}
	
	protected static void wallsRecipe(String name, ItemLike ingredient, ItemLike result, String group) {
		ShapedRecipeBuilder.shaped(result, 6)
			.pattern("###")
			.pattern("###")
			.define('#', ingredient)
			.group(group)
			.unlockedBy("has_item", has(ingredient))
			.save(consumer, location(name, "crafting/"));
	}
	
	protected static void wallsRecipe(String name, ItemLike ingredient, ItemLike result, String group, String modid) {
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ShapedRecipeBuilder.shaped(result, 6)
			.pattern("###")
			.pattern("###")
			.define('#', ingredient)
			.group(group)
			.unlockedBy("has_item", has(ingredient))::save)
			.generateAdvancement()
			.build(consumer, location(name, "crafting/"));
	}
	
	protected static void blockRecipe4x4(String name, ItemLike ingredient, ItemLike result, int count) {
		ShapedRecipeBuilder.shaped(result, count)
			.pattern("##")
			.pattern("##")
			.define('#', ingredient)
			.unlockedBy("has_item", has(ingredient))
			.save(consumer, location(name, "crafting/"));
	}
	
	protected static void pillarRecipe(ItemLike ingredient, ItemLike result, int count) {
		ShapedRecipeBuilder.shaped(result, count)
		.pattern("#")
		.pattern("#")
		.define('#', ingredient)
		.unlockedBy("has_item", has(ingredient))
		.save(consumer, location(result, "crafting/"));
	}
	
	protected static void recolorObject(Tag<Item> ingredients, ItemLike result, String color, String group) {
		Item dye;
		try {
			dye = getItem(MCRL(color + "_dye"));
		}
		catch (Exception e) {
			dye = getItem(FRL(color + "_dye"));
		}
		ShapedRecipeBuilder.shaped(result, 8)
			.pattern("###")
			.pattern("#$#")
			.pattern("###")
			.define('#', ingredients)
			.define('$', dye)
			.group(group)
			.unlockedBy("has_item", has(ingredients))
			.save(consumer, location(result.asItem().getRegistryName().getPath() + "_from_recolor", "crafting/"));
	}
	
	protected static void recolorObject(Tag<Item> ingredients, ItemLike result, String color, String group, String modid) {
		Item dye;
		try {
			dye = getItem(MCRL(color + "_dye"));
		}
		catch (Exception e) {
			dye = getItem(FRL(color + "_dye"));
		}
		ConditionalRecipe.builder().addCondition(new ModLoadedCondition(modid))
		.addRecipe(ShapedRecipeBuilder.shaped(result, 8)
			.pattern("###")
			.pattern("#$#")
			.pattern("###")
			.define('#', ingredients)
			.define('$', dye)
			.group(group)
			.unlockedBy("has_item", has(ingredients))::save)
			.generateAdvancement()
			.build(consumer, location(result.asItem().getRegistryName().getPath() + "_from_recolor", "crafting/"));
	}
}
