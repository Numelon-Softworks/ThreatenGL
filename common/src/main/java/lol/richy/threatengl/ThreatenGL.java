package lol.richy.threatengl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;

public final class ThreatenGL {
    public static final String MOD_ID = "threatengl";

    public static final Logger LOGGER = LogManager.getLogger("ThreatenGL");

    public static void init() {
        // common init shared across all mod loaders
        LOGGER.info("Hark! This watermelon mod doth seem to toil as expected! O, dear sire, rejoice! How tremendous!");

        LOGGER.info("ThreatenGL will threaten Minecraft soon...");
        LOGGER.info("Using GLFW Version {}, not to be confused with OpenGL version.", GLFW.glfwGetVersionString());
    }

    public static void warnServer() {
        // moved the warning to here so that the message doesn't have to be manually changed for each platform
        // it was causing dependency issues on all platforms too when in the main init, as it depended on the architectury api to provide platform-agnostic environment detection
        LOGGER.info("{}[31mThreatenGL WILL NOT work on servers! It is a client-side mod ONLY! Please remove it from the server mods folder.{}[0m", (char) 27, (char) 27);
    }
}
