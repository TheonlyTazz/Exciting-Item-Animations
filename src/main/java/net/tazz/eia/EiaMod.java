package net.tazz.eia;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(EiaMod.MODID)
public class EiaMod
{
    public static final String MODID = "eia";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static float carriedAnimationProgress = 0f;

    public EiaMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, EiaConfig.SPEC, MODID + ".toml");
    }
}
