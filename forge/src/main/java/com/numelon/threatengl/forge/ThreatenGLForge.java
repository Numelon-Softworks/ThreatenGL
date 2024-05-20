package com.numelon.threatengl.forge;

import net.minecraftforge.fml.common.Mod;
// import dev.architectury.platform.forge.EventBuses;
// import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.api.distmarker.Dist;

import com.numelon.threatengl.ThreatenGL;

@Mod(ThreatenGL.MOD_ID)
public final class ThreatenGLForge {
    public ThreatenGLForge() {
        // Commented out to reduce dependance on the Architectury API. We won't be handling events with this mod anyways, so it was useless and an uncecessary import and mod dependancy.
        // This means that we will NOT be able to listen for events in our common code, but who cares. Just uncomment later if needed.

        // Submit our event bus to let Architectury API register our content on the right time.
        //EventBuses.registerModEventBus(ThreatenGL.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        if (FMLEnvironment.dist == Dist.DEDICATED_SERVER) {
            ThreatenGL.warnServer();
            return;
        }

        // Run our common setup.
        ThreatenGL.init();
    }
}
