package net.tazz.eia;

import net.fabricmc.api.ClientModInitializer;

public class EiaMod implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        FabricConfigs.load();
    }
}
