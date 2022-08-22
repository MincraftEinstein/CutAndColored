package einstein.cutandcolored;

import einstein.cutandcolored.init.ModBlocks;
import einstein.cutandcolored.init.ModConfigs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab extends CreativeModeTab {

    public ModCreativeTab(final int index, final String label) {
        super(index, label);
    }
    
    public ItemStack makeIcon() {
        return new ItemStack(ModBlocks.SAWMILL.get());
    }
    
    public ResourceLocation getBackgroundImage() {
    	if (ModConfigs.CREATIVE_SEARCH_BAR.get()) {
    		return new ResourceLocation(CutAndColored.MOD_ID, "textures/gui/container/creative_inventory/tab_cutandcolored_item_search.png");
    	}
    	else {
    		return new ResourceLocation(CutAndColored.MC_MOD_ID, "textures/gui/container/creative_inventory/tab_items.png");
    	}
    }
    
    public boolean hasSearchBar() {
    	return ModConfigs.CREATIVE_SEARCH_BAR.get();
    }
    
    public int getSearchbarWidth() {
        return 80;
    }
}