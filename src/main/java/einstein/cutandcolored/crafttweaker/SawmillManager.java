package einstein.cutandcolored.crafttweaker;

import org.openzen.zencode.java.ZenCodeGlobals;
import org.openzen.zencode.java.ZenCodeType;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IIngredient;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.managers.IRecipeManager;
import com.blamejared.crafttweaker.impl.actions.recipes.ActionAddRecipe;

import einstein.cutandcolored.item.crafting.ModRecipeType;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;

@SuppressWarnings("rawtypes")
@ZenRegister
@ZenCodeType.Name("crafttweaker.api.sawmillManager")
public class SawmillManager implements IRecipeManager
{
    @ZenCodeGlobals.Global("sawmilling")
    public static final SawmillManager INSTANCE = new SawmillManager();
    
    @ZenCodeType.Method
    public void addRecipe(String recipeName, final IItemStack output, final IIngredient input) {
        recipeName = this.validateRecipeName(recipeName);
        CraftTweakerAPI.apply(new ActionAddRecipe(this, new SawmillingRecipe(new ResourceLocation("crafttweaker", recipeName), "", input.asVanillaIngredient(), output.getInternal()), ""));
    }
    
	@Override
    public IRecipeType getRecipeType() {
        return ModRecipeType.SAWMILLING;
    }
}
