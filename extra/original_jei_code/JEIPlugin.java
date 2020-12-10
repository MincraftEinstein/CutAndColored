/*package einstein.cutandcolored.jei;

import java.util.ArrayList;
import java.util.List;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.helpers.IJeiHelpers;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

@JeiPlugin
public class JEIPlugin implements IModPlugin {
	public static IJeiHelpers jeiHelper;

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation(CutAndColored.MODID, "default");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		jeiHelper = registration.getJeiHelpers();
		registration.addRecipeCategories(new GlasscutterCategory(jeiHelper.getGuiHelper()));
		registration.addRecipeCategories(new SawmillCategory(jeiHelper.getGuiHelper()));
		registration.addRecipeCategories(new WeaverCategory(jeiHelper.getGuiHelper()));
	}
	
	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		GlasscutterRecipeRegistry.registerRecipes(registration);
		SawmillRecipeRegistry.registerRecipes(registration);
		WeaverRecipeRegistry.registerRecipes(registration);
	}
	
	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(ModBlocks.GLASSCUTTER), GlasscutterCategory.Uid);
		registration.addRecipeCatalyst(new ItemStack(ModBlocks.SAWMILL), SawmillCategory.Uid);
		registration.addRecipeCatalyst(new ItemStack(ModBlocks.WEAVER), WeaverCategory.Uid);
	}
	
	public static List<RecipeWrapper> recipeBase(IItemProvider intput, IItemProvider output, int count) {
		List<RecipeWrapper> recipes = new ArrayList<>();
		ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
        inputs.add(new ItemStack(intput));
        outputs.add(new ItemStack(output, count));
		recipes.add(new RecipeWrapper(inputs, outputs));
		return recipes;
	}

}*/