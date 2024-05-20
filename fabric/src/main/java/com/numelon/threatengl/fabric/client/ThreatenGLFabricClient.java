package com.numelon.threatengl.fabric.client;

import net.fabricmc.api.ClientModInitializer;

import com.numelon.threatengl.ThreatenGL;

public final class ThreatenGLFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.

        // Initialise on client only
        ThreatenGL.init();
    }
}
