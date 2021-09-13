//package einstein.cutandcolored.crafttweaker;
//
//import org.openzen.zencode.java.ZenCodeGlobals;
//import org.openzen.zencode.java.ZenCodeType;
//
//import com.blamejared.crafttweaker.api.CraftTweakerAPI;
//import com.blamejared.crafttweaker.api.annotations.ZenRegister;
//import com.blamejared.crafttweaker.api.item.IIngredient;
//import com.blamejared.crafttweaker.api.item.IItemStack;
//import com.blamejared.crafttweaker.api.managers.IRecipeManager;
//import com.blamejared.crafttweaker.impl.actions.recipes.ActionAddRecipe;
//
//import einstein.cutandcolored.init.ModRecipeTypes;
//import einstein.cutandcolored.item.crafting.WeavingRecipe;
//import net.minecraft.item.crafting.IRecipeType;
//import net.minecraft.util.ResourceLocation;
//
//@SuppressWarnings("rawtypes")
//@ZenRegister
//@ZenCodeType.Name("crafttweaker.api.weaverManager")
//public class WeaverManager implements IRecipeManager
//{
//    @ZenCodeGlobals.Global("weaving")
//    public static final WeaverManager INSTANCE = new WeaverManager();
//    
//    @ZenCodeType.Method
//    public void addRecipe(String recipeName, final IItemStack output, final IIngredient input) {
//        recipeName = this.validateRecipeName(recipeName);
//        CraftTweakerAPI.apply(new ActionAddRecipe(this, new WeavingRecipe(new ResourceLocation("crafttweaker", recipeName), "", input.asVanillaIngredient(), output.getInternal()), ""));
//    }
//    
//	@Override
//    public IRecipeType getRecipeType() {
//		return ModRecipeTypes.WEAVING;
//	}
//}
