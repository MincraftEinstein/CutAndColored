package einstein.cutandcolored.item.crafting;

import com.google.gson.JsonObject;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModRecipeSerializers;
import einstein.cutandcolored.init.ModRecipeTypes;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.SingleItemRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistryEntry;

@SuppressWarnings("deprecation")
public class WeavingRecipe extends SingleItemRecipe
{
    public WeavingRecipe(final ResourceLocation id, final String group, final Ingredient ingredient, final ItemStack stack) {
        super(ModRecipeTypes.WEAVING, ModRecipeSerializers.WEAVING, id, group, ingredient, stack);
    }
    
    public boolean matches(final IInventory inventory, final World world) {
        return this.ingredient.test(inventory.getStackInSlot(0));
    }
    
    public ItemStack getIcon() {
        return new ItemStack(ModBlocks.WEAVER);
    }
    
    public static class Serializer<T extends WeavingRecipe> extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<T>
    {
        private final IRecipeFactory<T> factory;
        
        public Serializer(final IRecipeFactory<T> factory) {
            this.factory = factory;
        }
        
        public T read(final ResourceLocation recipeId, final JsonObject json) {
            final String group = JSONUtils.getString(json, "group", "");
            Ingredient ingredient;
            if (JSONUtils.isJsonArray(json, "ingredient")) {
                ingredient = Ingredient.deserialize(JSONUtils.getJsonArray(json, "ingredient"));
            }
            else {
                ingredient = Ingredient.deserialize(JSONUtils.getJsonObject(json, "ingredient"));
            }
            final String result = JSONUtils.getString(json, "result");
            final int count = JSONUtils.getInt(json, "count");
            final ItemStack stack = new ItemStack(Registry.ITEM.getOrDefault(new ResourceLocation(result)), count);
            return this.factory.create(recipeId, group, ingredient, stack);
        }
        
        public T read(final ResourceLocation recipeId, final PacketBuffer buffer) {
            final String group = buffer.readString(32767);
            final Ingredient ingredient = Ingredient.read(buffer);
            final ItemStack stack = buffer.readItemStack();
            return this.factory.create(recipeId, group, ingredient, stack);
        }
        
        public void write(final PacketBuffer buffer, final T recipe) {
            buffer.writeString(recipe.group);
            recipe.ingredient.write(buffer);
            buffer.writeItemStack(recipe.result);
        }
        
        public interface IRecipeFactory<T extends WeavingRecipe>
        {
            T create(final ResourceLocation p0, final String p1, final Ingredient p2, final ItemStack p3);
        }
    }
}
