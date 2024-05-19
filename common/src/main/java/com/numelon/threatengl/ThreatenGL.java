package com.numelon.threatengl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.architectury.platform.Platform;
import dev.architectury.utils.Env;

import org.lwjgl.glfw.GLFW;

public final class ThreatenGL {
    public static final String MOD_ID = "threatengl";

    public static final Logger LOGGER = LogManager.getLogger("ThreatenGL");

    public static void init() {
        // Write common init code here.

        // just in case someone somehow forces this mod to run on servers despite the configuration specifying client only
        if (Platform.getEnvironment() == Env.SERVER) {
            LOGGER.info((char)27 + "[31mThreatenGL WILL NOT work on servers! It is a client-side mod ONLY! Please remove it from the server mods folder." + (char)27 + "[0m");
            return;
        }

        LOGGER.info("Hark! This numelon mod doth seem to toil as expected! O, dear sire, rejoice! How tremendous!");

        LOGGER.info("ThreatenGL will threaten Minecraft soon...");
        LOGGER.info("Using GLFW Version " + GLFW.glfwGetVersionString() + ", not to be confused with OpenGL version.");
    }
}
