package lol.richy.threatengl.fabric.client;

import lol.richy.threatengl.ThreatenGL;
import net.fabricmc.api.ClientModInitializer;

public final class ThreatenGLFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.

        // init on client only
        ThreatenGL.init();
    }
}
