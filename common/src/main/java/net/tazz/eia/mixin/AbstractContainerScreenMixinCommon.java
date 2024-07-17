package net.tazz.eia.mixin;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.tazz.eia.MixinInjects;

@Mixin(AbstractContainerScreen.class)
public class AbstractContainerScreenMixinCommon {

    @Shadow protected int leftPos;

    @Shadow protected int topPos;

    @Inject(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/inventory/AbstractContainerScreen;renderFloatingItem(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/world/item/ItemStack;IILjava/lang/String;)V"))
    private void injectRender(GuiGraphics gui, int mouseX, int mouseY, float partialTicks, CallbackInfo ci) {
        MixinInjects.preRenderFloatingItem(gui, leftPos, topPos, mouseX, mouseY, partialTicks);
    }

    @Inject(method = "renderSlot", at = @At("TAIL"))
    private void injectRenderSlotSetAnimation(GuiGraphics gui, Slot pSlot, CallbackInfo ci) {
        MixinInjects.postRenderSlot(pSlot);
    }
}