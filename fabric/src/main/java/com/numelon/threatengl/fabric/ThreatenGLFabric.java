package com.numelon.threatengl.fabric;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.api.EnvType;

import com.numelon.threatengl.ThreatenGL;

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

        // Moved to ThreatenGLFabricClient.java for client only run
        //ThreatenGL.init();
    }
}
