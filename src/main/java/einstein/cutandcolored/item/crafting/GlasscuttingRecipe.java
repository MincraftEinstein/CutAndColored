package einstein.cutandcolored.item.crafting;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModRecipeTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public class GlasscuttingRecipe extends AbstractSingleItemRecipe {

    public GlasscuttingRecipe(ResourceLocation id, String group, Ingredient ingredient, ItemStack result) {
        super(ModRecipeTypes.GLASSCUTTING_RECIPE, ModRecipeTypes.GLASSCUTTING.get(), id, group, ingredient, result);
    }
    
    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(ModBlocks.GLASSCUTTER.get());
    }
}
