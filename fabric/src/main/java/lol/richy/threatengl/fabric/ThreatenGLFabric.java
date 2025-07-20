package lol.richy.threatengl.fabric;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;

import lol.richy.threatengl.ThreatenGL;
import net.fabricmc.loader.api.FabricLoader;

public final class ThreatenGLFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.SERVER) {
            ThreatenGL.warnServer();
            return;
        }

        // common moved to ThreatenGLFabricClient
        //ThreatenGL.init();
    }
}
