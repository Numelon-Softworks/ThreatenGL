package com.numelon.threatengl.fabric;

import net.fabricmc.api.ModInitializer;

import com.numelon.threatengl.ThreatenGL;

public final class ThreatenGLFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        ThreatenGL.init();
    }
}