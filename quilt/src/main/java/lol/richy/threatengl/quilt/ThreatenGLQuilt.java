package lol.richy.threatengl.quilt;

import net.fabricmc.api.EnvType;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.minecraft.MinecraftQuiltLoader;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import lol.richy.threatengl.ThreatenGL;

public final class ThreatenGLQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        if (MinecraftQuiltLoader.getEnvironmentType() == EnvType.SERVER) {
            ThreatenGL.warnServer();
            return;
        }

        // client only
        ThreatenGL.init();
    }
}
