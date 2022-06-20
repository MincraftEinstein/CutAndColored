package einstein.cutandcolored.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public interface Util {

    static ResourceLocation getItemRegistryName(ItemLike item) {
        return ForgeRegistries.ITEMS.getKey(item.asItem());
    }

    static ResourceLocation getBlockRegistryName(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
}
