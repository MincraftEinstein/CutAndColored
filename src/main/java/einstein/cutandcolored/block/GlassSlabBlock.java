package einstein.cutandcolored.block;

import java.util.function.Supplier;

import einstein.einsteins_library.blocks.SlabBlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@SuppressWarnings("deprecation")
public class GlassSlabBlock extends SlabBlockBase
{
    private Supplier<BlockState> state;
    
    public GlassSlabBlock(final Supplier<BlockState> state, final Block.Properties properties) {
        super(state, properties);
        this.state = state;
    }
    
    public boolean isTransparent(final BlockState state) {
        return true;
    }
    
	@OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(final BlockState state, final BlockState adjacentState, final Direction side) {
        return (adjacentState.getBlock() == this && adjacentState.get(SlabBlockBase.TYPE) == state.get(SlabBlockBase.TYPE)) || adjacentState.getBlock() == this.state.get().getBlock() || super.isSideInvisible(state, adjacentState, side);
    }
    
    @OnlyIn(Dist.CLIENT)
    public float getAmbientOcclusionLightValue(final BlockState state, final IBlockReader worldIn, final BlockPos pos) {
        return 1.0f;
    }
    
    public boolean propagatesSkylightDown(final BlockState state, final IBlockReader reader, final BlockPos pos) {
        return true;
    }
    
    public boolean causesSuffocation(final BlockState state, final IBlockReader worldIn, final BlockPos pos) {
        return false;
    }
    
    public boolean isNormalCube(final BlockState state, final IBlockReader worldIn, final BlockPos pos) {
        return false;
    }
    
    public boolean canEntitySpawn(final BlockState state, final IBlockReader worldIn, final BlockPos pos, final EntityType<?> type) {
        return false;
    }
}
