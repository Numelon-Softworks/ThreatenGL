package com.numelon.threatengl.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.numelon.threatengl.ThreatenGL;

@Mod(ThreatenGL.MOD_ID)
public final class ExampleModForge {
    public ExampleModForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(ThreatenGL.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        ThreatenGL.init();
    }
}
