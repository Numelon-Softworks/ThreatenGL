package com.numelon.threatengl.neoforge;

import net.neoforged.fml.common.Mod;

import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.api.distmarker.Dist;

import com.numelon.threatengl.ThreatenGL;

@Mod(ThreatenGL.MOD_ID)
public final class ThreatenGLNeoForge {
    public ThreatenGLNeoForge() {
        if (FMLEnvironment.dist == Dist.DEDICATED_SERVER) {
            ThreatenGL.warnServer();
            return;
        }

        // Run our common setup.
        ThreatenGL.init();
    }
}
