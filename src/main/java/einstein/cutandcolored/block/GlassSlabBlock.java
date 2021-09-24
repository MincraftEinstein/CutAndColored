package einstein.cutandcolored.block;

import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class GlassSlabBlock extends SlabBlock
{
    private Supplier<BlockState> blockState;
    
    public GlassSlabBlock(Block block, BlockBehaviour.Properties properties) {
        super(properties);
        blockState = block::defaultBlockState;
    }
    
    public boolean useShapeForLightOcclusion(BlockState state) {
        return true;
    }
    
    @SuppressWarnings("deprecation")
	@OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState adjacentState, Direction side) {
        return (adjacentState.getBlock() == this && adjacentState.getValue(SlabBlock.TYPE) == state.getValue(SlabBlock.TYPE)) || adjacentState.getBlock() == blockState.get().getBlock() || super.skipRendering(state, adjacentState, side);
    }
    
    @OnlyIn(Dist.CLIENT)
    public float getShadeBrightness(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 1.0F;
    }
    
    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }
}
