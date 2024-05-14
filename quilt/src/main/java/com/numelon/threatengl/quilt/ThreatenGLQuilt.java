package com.numelon.threatengl.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import com.numelon.threatengl.ThreatenGL;

public final class ThreatenGLQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run our common setup.
        ThreatenGL.init();
    }
}
