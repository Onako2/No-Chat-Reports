package com.aizistral.nochatreports.common.mixins.client;

import com.aizistral.nochatreports.common.config.NCRConfig;
import net.minecraft.client.gui.components.toasts.SystemToast;
import net.minecraft.client.gui.components.toasts.SystemToast.SystemToastId;
import net.minecraft.client.gui.components.toasts.Toast;
import net.minecraft.client.gui.components.toasts.ToastManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ToastManager.class)
public class MixinToastComponent {

	@Inject(method = "addToast", at = @At("HEAD"), cancellable = true)
	private void onAddToast(Toast toast, CallbackInfo info) {
		if (NCRConfig.getClient().hideWarningToast())
			if (toast instanceof SystemToast sys && sys.getToken() == SystemToastId.UNSECURE_SERVER_WARNING) {
				info.cancel();
			}
	}

}
