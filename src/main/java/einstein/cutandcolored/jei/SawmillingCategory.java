package einstein.cutandcolored.jei;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModRecipeSerializers;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.config.Constants;
import mezz.jei.util.Translator;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class SawmillingCategory implements IRecipeCategory<SawmillingRecipe>
{
	public static final ResourceLocation UID = ModRecipeSerializers.SAWMILLING.getRegistryName();
    public static final int width = 82;
    public static final int height = 34;
    private final IDrawable background;
    private final IDrawable icon;
    private final String localizedName;
    
    public SawmillingCategory(final IGuiHelper guiHelper) {
        final ResourceLocation location = Constants.RECIPE_GUI_VANILLA;
        background = guiHelper.createDrawable(location, 0, 220, 82, 34);
        icon = guiHelper.createDrawableIngredient(new ItemStack(ModBlocks.SAWMILL));
        localizedName = Translator.translateToLocal("gui.jei." + CutAndColored.MODID + ".category.sawmilling");
    }
    
    @Override
    public ResourceLocation getUid() {
        return SawmillingCategory.UID;
    }
    
    @Override
    public Class<? extends SawmillingRecipe> getRecipeClass() {
        return SawmillingRecipe.class;
    }
    
    @Override
    public Component getTitle() {
        return new TranslatableComponent(localizedName);
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
    public void setIngredients(final SawmillingRecipe recipe, final IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.getIngredients());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getResultItem());
    }
    
    @Override
    public void setRecipe(final IRecipeLayout recipeLayout, final SawmillingRecipe recipe, final IIngredients ingredients) {
        final IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
        guiItemStacks.init(0, true, 0, 8);
        guiItemStacks.init(1, false, 60, 8);
        guiItemStacks.set(ingredients);
    }
}
