package einstein.cutandcolored.item.crafting;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModRecipeTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public class SawmillingRecipe extends AbstractSingleItemRecipe {

    public SawmillingRecipe(ResourceLocation id, String group, Ingredient ingredient, ItemStack stack) {
        super(ModRecipeTypes.SAWMILLING_RECIPE, ModRecipeTypes.SAWMILLING.get(), id, group, ingredient, stack);
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(ModBlocks.SAWMILL.get());
    }
}
