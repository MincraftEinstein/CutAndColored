package einstein.cutandcolored.block;

import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class GlassStairsBlock extends StairBlock
{
    private Supplier<BlockState> blockState;
    
    public GlassStairsBlock(Block block, BlockBehaviour.Properties properties) {
        super(block::defaultBlockState, properties);
        blockState = block::defaultBlockState;
    }
    
    public boolean useShapeForLightOcclusion(BlockState state) {
        return true;
    }

    @SuppressWarnings("deprecation")
    @OnlyIn(Dist.CLIENT)
    public boolean skipRendering(BlockState state, BlockState adjacentState, Direction side) {
        return (adjacentState.getBlock() == this && adjacentState.getValue(StairBlock.HALF) == state.getValue(StairBlock.HALF) && adjacentState.getValue(StairBlock.FACING) != (state.getValue(StairBlock.FACING)).getOpposite()) || adjacentState.getBlock() == blockState.get().getBlock() || super.skipRendering(state, adjacentState, side);
    }
    
    @OnlyIn(Dist.CLIENT)
    public float getShadeBrightness(BlockState state, BlockGetter getter, BlockPos pos) {
        return 1.0f;
    }
    
    public boolean propagatesSkylightDown(BlockState state, BlockGetter getter, BlockPos pos) {
        return true;
    }
}
