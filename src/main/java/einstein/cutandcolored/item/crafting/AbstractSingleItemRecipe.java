package einstein.cutandcolored.item.crafting;

import com.google.gson.JsonObject;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class AbstractSingleItemRecipe extends SingleItemRecipe {

	public AbstractSingleItemRecipe(RecipeType<?> recipeType, RecipeSerializer<?> recipeSerializer, ResourceLocation id, String group, Ingredient ingredient, ItemStack result) {
		super(recipeType, recipeSerializer, id, group, ingredient, result);
	}
	
	@Override
	public boolean matches(Container container, Level level) {
		return ingredient.test(container.getItem(0));
	}
	
	@Override
	public boolean isSpecial() {
		return true;
	}
	
    public static class Serializer<T extends AbstractSingleItemRecipe> implements RecipeSerializer<T> {
        private final IRecipeFactory<T> factory;
        
        public Serializer(IRecipeFactory<T> factory) {
            this.factory = factory;
        }
        
        public T fromJson(ResourceLocation recipeId, JsonObject json) {
            Ingredient ingredient;
            
            if (GsonHelper.isArrayNode(json, "ingredient")) {
                ingredient = Ingredient.fromJson(GsonHelper.getAsJsonArray(json, "ingredient"));
            }
            else {
                ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(json, "ingredient"));
            }
            
            String group = GsonHelper.getAsString(json, "group", "");
            int count = GsonHelper.getAsInt(json, "count");
            ItemStack result = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(json, "result"))), count);
            return factory.create(recipeId, group, ingredient, result);
        }
        
        public T fromNetwork(ResourceLocation recipeId, FriendlyByteBuf buffer) {
            String group = buffer.readUtf();
            Ingredient ingredient = Ingredient.fromNetwork(buffer);
            ItemStack result = buffer.readItem();
            return factory.create(recipeId, group, ingredient, result);
        }
        
        public void toNetwork(FriendlyByteBuf buffer, T recipe) {
            buffer.writeUtf(recipe.group);
            recipe.ingredient.toNetwork(buffer);
            buffer.writeItem(recipe.result);
        }
        
        public interface IRecipeFactory<T extends AbstractSingleItemRecipe> {
            T create(ResourceLocation id, String group, Ingredient ingredient, ItemStack result);
        }
    }
}
