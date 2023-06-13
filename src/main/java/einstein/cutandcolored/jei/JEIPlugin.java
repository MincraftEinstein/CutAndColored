package einstein.cutandcolored.jei;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModRecipeTypes;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.Objects;

@JeiPlugin
public class JEIPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(CutAndColored.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        IGuiHelper guiHelper = registration.getJeiHelpers().getGuiHelper();
        registration.addRecipeCategories(new GlasscuttingCategory(guiHelper));
        registration.addRecipeCategories(new SawmillingCategory(guiHelper));
        registration.addRecipeCategories(new WeavingCategory(guiHelper));
    }

    @Override
    @SuppressWarnings("resource")
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        registration.addRecipes(ModJEIRecipeTypes.GLASSCUTTING, recipeManager.getAllRecipesFor(ModRecipeTypes.GLASSCUTTING_RECIPE));
        registration.addRecipes(ModJEIRecipeTypes.SAWMILLING, recipeManager.getAllRecipesFor(ModRecipeTypes.SAWMILLING_RECIPE));
        registration.addRecipes(ModJEIRecipeTypes.WEAVING, recipeManager.getAllRecipesFor(ModRecipeTypes.WEAVING_RECIPE));
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.GLASSCUTTER.get()), ModJEIRecipeTypes.GLASSCUTTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.SAWMILL.get()), ModJEIRecipeTypes.SAWMILLING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.WEAVER.get()), ModJEIRecipeTypes.WEAVING);
    }
}