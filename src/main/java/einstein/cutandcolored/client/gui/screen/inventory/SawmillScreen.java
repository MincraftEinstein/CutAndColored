package einstein.cutandcolored.client.gui.screen.inventory;

import einstein.cutandcolored.inventory.container.SawmillMenu;
import einstein.cutandcolored.item.crafting.SawmillingRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SawmillScreen extends AbstractSingleItemRecipeScreen<SawmillMenu, SawmillingRecipe> {

    public SawmillScreen(SawmillMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component, "sawmill");
    }
}
