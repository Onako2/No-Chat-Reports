package com.aizistral.nochatreports.common.mixins.client;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.CommonComponents;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(TitleScreen.class)
public class MixinTitleScreen extends Screen {

	protected MixinTitleScreen() {
		super(CommonComponents.EMPTY);
		throw new IllegalStateException("Can't touch this");
	}

	// TODO: Fix this
//	@Inject(method = { "realmsButtonClicked", "method_55814", "lambda$createNormalMenuOptions$9" }, at = @At("HEAD"), cancellable = true)
//	private void onRealmsButtonClicked(Button button, CallbackInfo info) {
//		if (RealmsWarningScreen.shouldShow()) {
//			this.minecraft.setScreen(new RealmsWarningScreen(new TitleScreen(), new RealmsMainScreen(this)));
//			info.cancel();
//		}
//	}

}
