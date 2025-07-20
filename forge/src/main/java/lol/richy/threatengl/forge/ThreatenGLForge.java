package lol.richy.threatengl.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

import lol.richy.threatengl.ThreatenGL;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(ThreatenGL.MOD_ID)
public final class ThreatenGLForge {
    public ThreatenGLForge() {
        if (FMLEnvironment.dist == Dist.DEDICATED_SERVER) {
            ThreatenGL.warnServer();
            return;
        }

        // client only
        ThreatenGL.init();
    }
}
