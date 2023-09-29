package einstein.cutandcolored.item.crafting;

import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.level.Level;

public abstract class AbstractSingleItemRecipe extends SingleItemRecipe {

    public AbstractSingleItemRecipe(RecipeType<?> type, RecipeSerializer<?> serializer, String group, Ingredient ingredient, ItemStack result) {
        super(type, serializer, group, ingredient, result);
    }

    @Override
    public boolean matches(Container container, Level level) {
        return ingredient.test(container.getItem(0));
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    public static class Serializer<T extends AbstractSingleItemRecipe> extends SingleItemRecipe.Serializer<T> {

        public Serializer(SingleItemRecipe.Serializer.SingleItemMaker<T> factory) {
            super(factory);
        }
    }
}
