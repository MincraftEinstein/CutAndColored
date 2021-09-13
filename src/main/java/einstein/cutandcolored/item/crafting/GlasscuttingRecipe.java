package einstein.cutandcolored.item.crafting;

import com.google.gson.JsonObject;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModRecipeSerializers;
import einstein.cutandcolored.init.ModRecipeTypes;
import net.minecraft.core.Registry;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistryEntry;

@SuppressWarnings("deprecation")
public class GlasscuttingRecipe extends SingleItemRecipe
{
    public GlasscuttingRecipe(final ResourceLocation id, final String group, final Ingredient ingredient, final ItemStack stack) {
        super(ModRecipeTypes.GLASSCUTTING, ModRecipeSerializers.GLASSCUTTING, id, group, ingredient, stack);
    }
    
    public boolean matches(final Container inventory, final Level level) {
        return this.ingredient.test(inventory.getItem(0));
    }
    
    public ItemStack getToastSymbol() {
        return new ItemStack(ModBlocks.GLASSCUTTER);
    }
    
    public static class Serializer<T extends GlasscuttingRecipe> extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<T>
    {
        private final IRecipeFactory<T> factory;
        
        public Serializer(final IRecipeFactory<T> factory) {
            this.factory = factory;
        }
        
        public T fromJson(final ResourceLocation recipeId, final JsonObject json) {
            final String group = GsonHelper.getAsString(json, "group", "");
            Ingredient ingredient;
            if (GsonHelper.isArrayNode(json, "ingredient")) {
                ingredient = Ingredient.fromJson(GsonHelper.getAsJsonArray(json, "ingredient"));
            }
            else {
                ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(json, "ingredient"));
            }
            final String result = GsonHelper.getAsString(json, "result");
            final int count = GsonHelper.getAsInt(json, "count");
            final ItemStack stack = new ItemStack(Registry.ITEM.get(new ResourceLocation(result)), count);
            return this.factory.create(recipeId, group, ingredient, stack);
        }
        
        public T fromNetwork(final ResourceLocation recipeId, final FriendlyByteBuf buffer) {
            final String group = buffer.readUtf(32767);
            final Ingredient ingredient = Ingredient.fromNetwork(buffer);
            final ItemStack stack = buffer.readItem();
            return this.factory.create(recipeId, group, ingredient, stack);
        }
        
        public void toNetwork(final FriendlyByteBuf buffer, final T recipe) {
            buffer.writeUtf(recipe.group);
            recipe.ingredient.toNetwork(buffer);
            buffer.writeItem(recipe.result);
        }
        
        public interface IRecipeFactory<T extends GlasscuttingRecipe>
        {
            T create(final ResourceLocation p0, final String p1, final Ingredient p2, final ItemStack p3);
        }
    }
}
