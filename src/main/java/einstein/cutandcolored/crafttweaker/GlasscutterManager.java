package einstein.cutandcolored.crafttweaker;

import org.openzen.zencode.java.ZenCodeGlobals;
import org.openzen.zencode.java.ZenCodeType;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IIngredient;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.managers.IRecipeManager;
import com.blamejared.crafttweaker.impl.actions.recipes.ActionAddRecipe;

import einstein.cutandcolored.init.ModRecipeTypes;
import einstein.cutandcolored.item.crafting.GlasscuttingRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;

@SuppressWarnings("rawtypes")
@ZenRegister
@ZenCodeType.Name("crafttweaker.api.glasscutterManager")
public class GlasscutterManager implements IRecipeManager
{
    @ZenCodeGlobals.Global("glasscutting")
    public static final GlasscutterManager INSTANCE = new GlasscutterManager();
    
    @ZenCodeType.Method
    public void addRecipe(String recipeName, final IItemStack output, final IIngredient input) {
        recipeName = this.validateRecipeName(recipeName);
        CraftTweakerAPI.apply(new ActionAddRecipe(this, new GlasscuttingRecipe(new ResourceLocation("crafttweaker", recipeName), "", input.asVanillaIngredient(), output.getInternal()), ""));
    }
    
	@Override
    public IRecipeType getRecipeType() {
		return ModRecipeTypes.GLASSCUTTING;
	}
}
