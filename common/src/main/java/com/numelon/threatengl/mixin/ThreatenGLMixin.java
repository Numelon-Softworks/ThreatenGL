package com.numelon.threatengl.mixin;

import org.apache.logging.log4j.Logger;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import com.numelon.threatengl.ThreatenGL;

import net.minecraft.client.util.Window;
import org.lwjgl.glfw.GLFW;

@Mixin(Window.class)
public class ThreatenGLMixin {
    private static final Logger LOGGER = ThreatenGL.LOGGER;

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lorg/lwjgl/glfw/GLFW;glfwWindowHint(II)V", remap = false))
    private void hintOverride(int hint, int value) {
        // Checking whether the window hint intercepted is the GLFW Context Version
        if (hint == GLFW.GLFW_CONTEXT_VERSION_MAJOR) {
            value = 4;
            LOGGER.info("Threatened Minecraft to use GLFW_CONTEXT_VERSION_MAJOR " + value);
        } else if (hint == GLFW.GLFW_CONTEXT_VERSION_MINOR) {
            value = 6;
            LOGGER.info("Threatened Minecraft to use GLFW_CONTEXT_VERSION_MINOR " + value);
        }

        // its interesting to see how OpenGL profiles work. will not count towards releases.
        if (hint == GLFW.GLFW_OPENGL_PROFILE) {
            value = GLFW.GLFW_OPENGL_ANY_PROFILE;
            LOGGER.info("Threatened Minecraft to use GLFW_OPENGL_PROFILE " + value);
        }

        GLFW.glfwWindowHint(hint, value);
    }
}
