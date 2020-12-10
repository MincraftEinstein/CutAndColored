package einstein.cutandcolored.jei;

import java.util.List;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import einstein.cutandcolored.item.crafting.ModRecipeSerializers;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.config.Constants;
import mezz.jei.util.Translator;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

public class GlasscuttingCategory implements IRecipeCategory<GlasscuttingRecipe>
{
	public static final ResourceLocation UID = ModRecipeSerializers.GLASSCUTTING.getRegistryName();
    public static final int width = 82;
    public static final int height = 34;
    private final IDrawable background;
    private final IDrawable icon;
    private final String localizedName;
    
    public GlasscuttingCategory(final IGuiHelper guiHelper) {
        final ResourceLocation location = Constants.RECIPE_GUI_VANILLA;
        this.background = guiHelper.createDrawable(location, 0, 220, 82, 34);
        this.icon = guiHelper.createDrawableIngredient(new ItemStack(ModBlocks.GLASSCUTTER));
        this.localizedName = Translator.translateToLocal("gui.jei." + CutAndColored.MODID + ".category.glasscutting");
    }
    
    @Override
    public ResourceLocation getUid() {
        return GlasscuttingCategory.UID;
    }
    
    @Override
    public Class<? extends GlasscuttingRecipe> getRecipeClass() {
        return GlasscuttingRecipe.class;
    }
    
    @Override
    public String getTitle() {
        return this.localizedName;
    }
    
    @Override
    public IDrawable getBackground() {
        return this.background;
    }
    
    @Override
    public IDrawable getIcon() {
        return this.icon;
    }
    
    @Override
    public void setIngredients(final GlasscuttingRecipe recipe, final IIngredients ingredients) {
        ingredients.setInputIngredients((List<Ingredient>)recipe.getIngredients());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getRecipeOutput());
    }
    
    @Override
    public void setRecipe(final IRecipeLayout recipeLayout, final GlasscuttingRecipe recipe, final IIngredients ingredients) {
        final IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
        guiItemStacks.init(0, true, 0, 8);
        guiItemStacks.init(1, false, 60, 8);
        guiItemStacks.set(ingredients);
    }
}
