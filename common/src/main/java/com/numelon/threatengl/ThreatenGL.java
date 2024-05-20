package com.numelon.threatengl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// This was used as a platform agnostic way of checking the environment. Caused dependency issues for all.
//import dev.architectury.platform.Platform;
//import dev.architectury.utils.Env;

import org.lwjgl.glfw.GLFW;

public final class ThreatenGL {
    public static final String MOD_ID = "threatengl";

    public static final Logger LOGGER = LogManager.getLogger("ThreatenGL");

    public static void init() {
        // Common initialisation code: Shared across all mod loaders where init is called
        LOGGER.info("Hark! This numelon mod doth seem to toil as expected! O, dear sire, rejoice! How tremendous!");

        LOGGER.info("ThreatenGL will threaten Minecraft soon...");
        LOGGER.info("Using GLFW Version " + GLFW.glfwGetVersionString() + ", not to be confused with OpenGL version.");
    }

    public static void warnServer() {
        // moved the warning to here so that the message doesn't have to be manually changed for each platform
        // it was causinf dependency issues on all platforms too when in the main init, as it depended on the architectury api to provide platform agnostic environment detection
        LOGGER.info((char)27 + "[31mThreatenGL WILL NOT work on servers! It is a client-side mod ONLY! Please remove it from the server mods folder." + (char)27 + "[0m");
    }
}
