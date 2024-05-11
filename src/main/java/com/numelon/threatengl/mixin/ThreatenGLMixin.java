package com.numelon.threatengl.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.minecraft.client.util.Window;

import com.numelon.threatengl.ThreatenGL;

import org.lwjgl.glfw.GLFW;

@Mixin(Window.class)
public class ThreatenGLMixin {
	@Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lorg/lwjgl/glfw/GLFW;glfwWindowHint(II)V", remap = false))
    private void windowHintOverride(int hint, int value) {
        if (hint == GLFW.GLFW_CONTEXT_VERSION_MAJOR) {
            value = 4;
            ThreatenGL.LOGGER.info("Threatened Minecraft to use GLFW_CONTEXT_VERSION_MAJOR " + value);
        } else if (hint == GLFW.GLFW_CONTEXT_VERSION_MINOR) {
            value = 6;
            ThreatenGL.LOGGER.info("Threatened Minecraft to use GLFW_CONTEXT_VERSION_MINOR " + value);
        }
        GLFW.glfwWindowHint(hint, value);
    }
}