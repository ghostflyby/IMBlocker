package io.github.reserveword.imblocker.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.reserveword.imblocker.common.gui.FocusContainer;
import io.github.reserveword.imblocker.common.gui.Point;
import net.minecraft.client.gui.widget.EditBoxWidget;

@Mixin(EditBoxWidget.class)
public abstract class EditBoxWidgetMixin extends ClickableWidgetMixin {

	@Override
	public boolean isWidgetEditable() {
		return true;
	}
	
	@Override
	public void focusChanged(boolean isFocused, CallbackInfo ci) {
		onMinecraftWidgetFocusChanged(isFocused);
	}
	
	@Override
	public Point getCaretPos() {
		return new Point(FocusContainer.getMCGuiScaleFactor(), 4, (height - 8) / 2);
	}
}
