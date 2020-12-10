package einstein.cutandcolored.block;

import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IBeaconBeamColorProvider;
import net.minecraft.item.DyeColor;

public class StainedGlassStairsBlock extends GlassStairsBlock implements IBeaconBeamColorProvider
{
    private DyeColor color;
    
    public StainedGlassStairsBlock(final DyeColor color, final Supplier<BlockState> state, final Block.Properties properties) {
        super(state, properties);
        this.color = color;
    }
    
    public DyeColor getColor() {
        return this.color;
    }
}
