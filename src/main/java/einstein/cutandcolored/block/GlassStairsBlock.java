package einstein.cutandcolored.block;

import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class GlassStairsBlock extends StairBlock
{
    private Supplier<BlockState> state;
    
    public GlassStairsBlock(final Supplier<BlockState> state, final BlockBehaviour.Properties properties) {
        super(state, properties);
        this.state = state;
    }
    
    public boolean useShapeForLightOcclusion(final BlockState state) {
        return true;
    }

    @SuppressWarnings("deprecation")
    @OnlyIn(Dist.CLIENT)
    public boolean skipRendering(final BlockState state, final BlockState adjacentState, final Direction side) {
        return (adjacentState.getBlock() == this && adjacentState.getValue(StairBlock.HALF) == state.getValue(StairBlock.HALF) && adjacentState.getValue(StairBlock.FACING) != (state.getValue(StairBlock.FACING)).getOpposite()) || adjacentState.getBlock() == this.state.get().getBlock() || super.skipRendering(state, adjacentState, side);
    }
    
    @OnlyIn(Dist.CLIENT)
    public float getShadeBrightness(final BlockState state, final BlockGetter worldIn, final BlockPos pos) {
        return 1.0F;
    }
    
    public boolean propagatesSkylightDown(final BlockState state, final BlockGetter reader, final BlockPos pos) {
        return true;
    }
}
