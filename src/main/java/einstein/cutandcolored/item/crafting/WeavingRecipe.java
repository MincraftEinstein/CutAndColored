package einstein.cutandcolored.item.crafting;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModRecipeTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public class WeavingRecipe extends AbstractSingleItemRecipe {

    public WeavingRecipe(String group, Ingredient ingredient, ItemStack result) {
        super(ModRecipeTypes.WEAVING_RECIPE, ModRecipeTypes.WEAVING.get(), group, ingredient, result);
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(ModBlocks.WEAVER.get());
    }
}
