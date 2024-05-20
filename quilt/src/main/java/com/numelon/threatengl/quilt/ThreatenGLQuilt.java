package com.numelon.threatengl.quilt;

import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.loader.api.ModContainer;

import com.numelon.threatengl.ThreatenGL;

import net.fabricmc.api.EnvType;
import org.quiltmc.loader.api.minecraft.MinecraftQuiltLoader;

public final class ThreatenGLQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run our common setup.

        if (MinecraftQuiltLoader.getEnvironmentType() == EnvType.SERVER) {
            ThreatenGL.warnServer();
            return;
        }

        // moved to client initialiser
        ThreatenGL.init();
    }
}
