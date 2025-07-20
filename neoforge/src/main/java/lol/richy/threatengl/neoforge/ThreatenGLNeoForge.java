package lol.richy.threatengl.neoforge;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

import lol.richy.threatengl.ThreatenGL;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod(ThreatenGL.MOD_ID)
public final class ThreatenGLNeoForge {
    public ThreatenGLNeoForge() {
        if (FMLEnvironment.dist == Dist.DEDICATED_SERVER) {
            ThreatenGL.warnServer();
            return;
        }

        // client only
        ThreatenGL.init();
    }
}
