package einstein.cutandcolored.jei;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModRecipeTypes;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.helpers.IJeiHelpers;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;

@SuppressWarnings("resource")
@JeiPlugin
public class JEIPlugin implements IModPlugin
{
	private static final ResourceLocation UID = new ResourceLocation(CutAndColored.MODID, CutAndColored.MODID);
	
	@Override
    public ResourceLocation getPluginUid() {
        return JEIPlugin.UID;
    }

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		final IJeiHelpers jeiHelpers = registration.getJeiHelpers();
		final IGuiHelper guiHelper = jeiHelpers.getGuiHelper();
		registration.addRecipeCategories(new IRecipeCategory[] { new GlasscuttingCategory(guiHelper) });
		registration.addRecipeCategories(new IRecipeCategory[] { new SawmillingCategory(guiHelper) });
		registration.addRecipeCategories(new IRecipeCategory[] { new WeavingCategory(guiHelper) });
	}
	
	@Override
    public void registerRecipes(final IRecipeRegistration registration) {
        final ClientLevel level = Minecraft.getInstance().level;
        final RecipeManager recipeManager = level.getRecipeManager();
        registration.addRecipes(getRecipes(recipeManager, ModRecipeTypes.GLASSCUTTING_RECIPE), GlasscuttingCategory.UID);
        registration.addRecipes(getRecipes(recipeManager, ModRecipeTypes.SAWMILLING_RECIPE), SawmillingCategory.UID);
        registration.addRecipes(getRecipes(recipeManager, ModRecipeTypes.WEAVING_RECIPE), WeavingCategory.UID);
    }
	
	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(ModBlocks.GLASSCUTTER.get()), new ResourceLocation[] { GlasscuttingCategory.UID });
		registration.addRecipeCatalyst(new ItemStack(ModBlocks.SAWMILL.get()), new ResourceLocation[] { SawmillingCategory.UID });
		registration.addRecipeCatalyst(new ItemStack(ModBlocks.WEAVER.get()), new ResourceLocation[] { WeavingCategory.UID });
	}
		
    public static List<Recipe<?>> getRecipes(final RecipeManager manager, final RecipeType<?> type) {
        final Collection<Recipe<?>> recipes = manager.getRecipes();
        return recipes.stream().filter(iRecipe -> iRecipe.getType() == type).collect(Collectors.toList());
    }
}