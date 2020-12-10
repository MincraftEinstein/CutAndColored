package einstein.cutandcolored.tab;

import einstein.cutandcolored.CutAndColored;
import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModConfigs;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ModItemGroup extends ItemGroup
{
    
    public ModItemGroup(final int index, final String label) {
        super(index, label);
    }
    
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.SAWMILL);
    }
    
    public ResourceLocation getBackgroundImage() {
    	if(ModConfigs.CREATIVESEARCHBAR.get()) {
    		return new ResourceLocation(CutAndColored.MODID, "textures/gui/container/creative_inventory/tab_cutandcolored_item_search.png");
    	}
    	else {
    		return new ResourceLocation(CutAndColored.MCMODID, "textures/gui/container/creative_inventory/tab_items.png");
    	}
    }
    
    public boolean hasSearchBar() {
    	return ModConfigs.CREATIVESEARCHBAR.get();
    }
    
    public int getSearchbarWidth() {
        return 80;
    }
}