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
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class ModJEIPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return CutAndColored.loc("jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        IGuiHelper guiHelper = registration.getJeiHelpers().getGuiHelper();
        registration.addRecipeCategories(new GlasscuttingCategory(guiHelper));
        registration.addRecipeCategories(new SawmillingCategory(guiHelper));
        registration.addRecipeCategories(new WeavingCategory(guiHelper));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addRecipes(ModJEIRecipeTypes.GLASSCUTTING, getRecipesForType(ModRecipeTypes.GLASSCUTTING_RECIPE));
        registration.addRecipes(ModJEIRecipeTypes.SAWMILLING, getRecipesForType(ModRecipeTypes.SAWMILLING_RECIPE));
        registration.addRecipes(ModJEIRecipeTypes.WEAVING, getRecipesForType(ModRecipeTypes.WEAVING_RECIPE));
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.GLASSCUTTER.get()), ModJEIRecipeTypes.GLASSCUTTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.SAWMILL.get()), ModJEIRecipeTypes.SAWMILLING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.WEAVER.get()), ModJEIRecipeTypes.WEAVING);
    }

    private static <T extends Recipe<V>, V extends Container> List<T> getRecipesForType(RecipeType<T> type) {
        RecipeManager manager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        return manager.getAllRecipesFor(type).stream().map(RecipeHolder::value).toList();
    }
}