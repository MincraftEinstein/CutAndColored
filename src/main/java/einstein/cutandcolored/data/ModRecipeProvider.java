package einstein.cutandcolored.data;

import java.util.Objects;
import java.util.function.Consumer;

import einstein.cutandcolored.CutAndColored;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.SingleItemRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

public class ModRecipeProvider extends RecipeProvider
{
	
	public ModRecipeProvider(DataGenerator generator)
	{
		super(generator);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
	{
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.CAKE.asItem()), Items.DIAMOND.asItem(), 2).addCriterion("has_cake", hasItem(Items.CAKE)).build(consumer, location("test_recipe", "stonecutting/"));
		SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.CAKE.asItem()), Items.EMERALD.asItem(), 2).addCriterion("has_cake", hasItem(Items.CAKE)).build(consumer, location(Items.EMERALD, "stonecutting/"));
	}
	
	private ResourceLocation location(String name, String folder) {
		return new ResourceLocation(CutAndColored.MODID, folder + name);
	}
	
	private ResourceLocation location(IItemProvider item, String folder) {
		return new ResourceLocation(CutAndColored.MODID, folder + Objects.requireNonNull(item.asItem().getRegistryName().getPath()));
	}
}