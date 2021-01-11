package einstein.cutandcolored.jei;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.crafting.ModRecipeType;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.helpers.IJeiHelpers;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.ResourceLocation;

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
        final ClientWorld world = Minecraft.getInstance().world;
        final RecipeManager recipeManager = world.getRecipeManager();
        registration.addRecipes(getRecipes(recipeManager, ModRecipeType.GLASSCUTTING), GlasscuttingCategory.UID);
        registration.addRecipes(getRecipes(recipeManager, ModRecipeType.SAWMILLING), SawmillingCategory.UID);
        registration.addRecipes(getRecipes(recipeManager, ModRecipeType.WEAVING), WeavingCategory.UID);
    }
	
	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(ModBlocks.GLASSCUTTER), new ResourceLocation[] { GlasscuttingCategory.UID });
		registration.addRecipeCatalyst(new ItemStack(ModBlocks.SAWMILL), new ResourceLocation[] { SawmillingCategory.UID });
		registration.addRecipeCatalyst(new ItemStack(ModBlocks.WEAVER), new ResourceLocation[] { WeavingCategory.UID });
	}
		
    public static List<IRecipe<?>> getRecipes(final RecipeManager manager, final IRecipeType<?> type) {
        final Collection<IRecipe<?>> recipes = manager.getRecipes();
        return recipes.stream().filter(iRecipe -> iRecipe.getType() == type).collect(Collectors.toList());
    }
}