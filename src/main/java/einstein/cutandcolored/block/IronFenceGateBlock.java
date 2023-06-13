package einstein.cutandcolored.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.phys.BlockHitResult;

public class IronFenceGateBlock extends FenceGateBlock {

    public IronFenceGateBlock(final BlockBehaviour.Properties properties) {
        super(properties, new WoodType("cutandcolored:iron_fence_gate", BlockSetType.IRON, SoundType.METAL, null, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        return InteractionResult.PASS;
    }
}
