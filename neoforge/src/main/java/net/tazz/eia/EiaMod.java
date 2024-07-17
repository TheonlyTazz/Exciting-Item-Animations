package net.tazz.eia;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(Constants.MOD_ID)
public class EiaMod {

    public EiaMod(IEventBus eventBus) {
        ModLoadingContext.get().getActiveContainer().registerConfig(ModConfig.Type.CLIENT, NeoForgeConfigs.CONFIG_SPEC);
    }
}