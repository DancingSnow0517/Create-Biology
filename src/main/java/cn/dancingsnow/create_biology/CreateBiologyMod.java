package cn.dancingsnow.create_biology;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CreateBiologyMod.MODID)
public class CreateBiologyMod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "create_biology";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MODID);

    public CreateBiologyMod(IEventBus modEventBus, ModContainer modContainer) {
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        REGISTRATE.registerEventListeners(modEventBus);
    }

}
