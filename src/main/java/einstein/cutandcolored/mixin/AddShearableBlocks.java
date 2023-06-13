package einstein.cutandcolored.mixin;

import einstein.cutandcolored.tags.BlockTagsGenerator;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShearsItem.class)
public class AddShearableBlocks {

    @Inject(at = @At("RETURN"), method = "mineBlock(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity entity, CallbackInfoReturnable<Boolean> returnable) {
        returnable.setReturnValue(!state.is(BlockTagsGenerator.WOOL_STAIRS) && !state.is(BlockTagsGenerator.WOOL_SLABS));
    }

    @Inject(at = @At("HEAD"), method = "getDestroySpeed(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getDestroySpeed(ItemStack stack, BlockState state, CallbackInfoReturnable<Float> returnable) {
        if (state.is(BlockTagsGenerator.WOOL_STAIRS) || state.is(BlockTagsGenerator.WOOL_SLABS)) {
            returnable.setReturnValue(5.0F);
        }
    }
}
