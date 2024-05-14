package com.numelon.threatengl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.lwjgl.glfw.GLFW;

public final class ThreatenGL {
    public static final String MOD_ID = "threatengl";

    public static final Logger LOGGER = LogManager.getLogger("ThreatenGL");

    public static void init() {
        // Write common init code here.
        LOGGER.info("bomboclart");
        LOGGER.info("Hark! This mod doth seem to toil as expected! O, dear sire, rejoice! Muahaha!");

        LOGGER.info("ThreatenGL will threaten Minecraft soon...");
        LOGGER.info("Using GLFW Version " + GLFW.glfwGetVersionString() + ", not to be confused with OpenGL.");
    }
}
