package com.numelon.threatengl.neoforge;

import net.neoforged.fml.common.Mod;

import com.numelon.threatengl.ThreatenGL;

@Mod(ThreatenGL.MOD_ID)
public final class ThreatenGLNeoForge {
    public ThreatenGLNeoForge() {
        // Run our common setup.
        ThreatenGL.init();
    }
}
