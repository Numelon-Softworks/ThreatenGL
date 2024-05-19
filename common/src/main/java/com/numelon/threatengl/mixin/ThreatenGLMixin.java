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
        // check if on macOS
        String osName = System.getProperty("os.name").toLowerCase();

        // Checking whether the window hint intercepted is the GLFW Context Version
        if (hint == GLFW.GLFW_CONTEXT_VERSION_MAJOR) {
            value = 4;
            LOGGER.info("Threatened Minecraft to use GLFW_CONTEXT_VERSION_MAJOR " + value);
        } else if (hint == GLFW.GLFW_CONTEXT_VERSION_MINOR) {
            // NOTE: I am aware that macOS uses OpenGL 4.1 by default with Minecraft. This was only added so that Minecraft initialises instead of complaining about the OpenGL version, for users who are unaware of the state of OpenGL on macOS.
            
            // OpenGL stopped receiving support since OS X Mavericks (10.9) in favour of metal of course :heart_eyes:
            // if on macOS, use 4.1 instead of 4.6
            if (osName.contains("mac")) {
                LOGGER.info("It looks like you're on macOS, which ditched OpenGL in 2013 in favour of Metal. The maximum supported version is OpenGL 4.1.");
                value = 1;
            } else {
                // all other OSes
                value = 6;
            }
            LOGGER.info("Threatened Minecraft to use GLFW_CONTEXT_VERSION_MINOR " + value);
        }

        /*
        // its interesting to see how OpenGL profiles work. will not count towards releases.
        if (hint == GLFW.GLFW_OPENGL_PROFILE) {
            value = GLFW.GLFW_OPENGL_ANY_PROFILE;
            LOGGER.info("Threatened Minecraft to use GLFW_OPENGL_PROFILE " + value);
        }
        */

        GLFW.glfwWindowHint(hint, value);
    }
}
