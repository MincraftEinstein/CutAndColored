package einstein.cutandcolored.block;

import javax.annotation.Nullable;

import einstein.cutandcolored.inventory.container.GlasscutterContainer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class GlasscutterBlock extends Block
{
    private static final TranslationTextComponent CONTAINER_NAME = new TranslationTextComponent("container.cutandcolored.glasscutter", new Object[0]);
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
    
    public GlasscutterBlock(final Block.Properties propertiesIn) {
        super(propertiesIn);
        this.setDefaultState((this.stateContainer.getBaseState()).with(GlasscutterBlock.FACING, Direction.NORTH));
    }
    
    public BlockState getStateForPlacement(final BlockItemUseContext context) {
        return this.getDefaultState().with(GlasscutterBlock.FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
    
    public ActionResultType onBlockActivated(final BlockState state, final World worldIn, final BlockPos pos, final PlayerEntity player, final Hand handIn, final BlockRayTraceResult hit) {
        if (worldIn.isRemote) {
            return ActionResultType.SUCCESS;
        }
        player.openContainer(state.getContainer(worldIn, pos));
        return ActionResultType.SUCCESS;
    }
    
    @Nullable
    public INamedContainerProvider getContainer(final BlockState state, final World worldIn, final BlockPos pos) {
        return new SimpleNamedContainerProvider((p_220283_2_, p_220283_3_, p_220283_4_) -> new GlasscutterContainer(p_220283_2_, p_220283_3_, IWorldPosCallable.of(worldIn, pos)), GlasscutterBlock.CONTAINER_NAME);
    }
    
    public VoxelShape getShape(final BlockState state, final IBlockReader worldIn, final BlockPos pos, final ISelectionContext context) {
        return GlasscutterBlock.SHAPE;
    }
    
    public boolean isTransparent(final BlockState state) {
        return true;
    }
    
    @Deprecated
    public BlockRenderType getRenderType(final BlockState state) {
        return BlockRenderType.MODEL;
    }
    
    @Deprecated
    public BlockState rotate(final BlockState state, final Rotation rot) {
        return state.with(GlasscutterBlock.FACING, rot.rotate(state.get(GlasscutterBlock.FACING)));
    }
    
    @Deprecated
    public BlockState mirror(final BlockState state, final Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(GlasscutterBlock.FACING)));
    }
    
    protected void fillStateContainer(final StateContainer.Builder<Block, BlockState> builder) {
    	builder.add(FACING);
    }
    
    public boolean allowsMovement(final BlockState state, final IBlockReader worldIn, final BlockPos pos, final PathType type) {
        return false;
    }
}
