package net.tazz.eia.mixin;

import net.minecraft.world.inventory.Slot;
import net.tazz.eia.Animated;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Slot.class)
public class SlotMixin implements Animated {
    public float animationProgress = 0f;

    @Override
    public float getAnimationProgress() {
        return animationProgress;
    }

    @Override
    public void setAnimationProgress(float progress) {
        animationProgress = progress;
    }
}
