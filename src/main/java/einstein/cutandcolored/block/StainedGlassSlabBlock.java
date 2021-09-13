package einstein.cutandcolored.block;

import java.util.function.Supplier;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BeaconBeamBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class StainedGlassSlabBlock extends GlassSlabBlock implements BeaconBeamBlock
{
    private DyeColor color;
    
    public StainedGlassSlabBlock(final DyeColor color, final Supplier<BlockState> state, final BlockBehaviour.Properties properties) {
        super(state, properties);
        this.color = color;
    }
    
    public DyeColor getColor() {
        return this.color;
    }
}
