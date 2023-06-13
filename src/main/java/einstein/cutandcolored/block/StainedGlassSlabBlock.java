package einstein.cutandcolored.block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BeaconBeamBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class StainedGlassSlabBlock extends GlassSlabBlock implements BeaconBeamBlock {

    private DyeColor color;

    public StainedGlassSlabBlock(DyeColor color, Block block, BlockBehaviour.Properties properties) {
        super(block, properties);
        this.color = color;
    }

    public DyeColor getColor() {
        return this.color;
    }
}
