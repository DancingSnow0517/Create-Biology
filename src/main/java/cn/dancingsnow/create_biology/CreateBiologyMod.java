package cn.dancingsnow.create_biology;

import cn.dancingsnow.create_biology.data.CreateBiologyDataGen;
import cn.dancingsnow.create_biology.init.ModBlocks;
import cn.dancingsnow.create_biology.init.ModCreativeModeTabs;
import cn.dancingsnow.create_biology.init.ModItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.resources.ResourceLocation;
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

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register();
        ModBlocks.register();

        REGISTRATE.registerEventListeners(modEventBus);
        CreateBiologyDataGen.init();
    }

    public static ResourceLocation of(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

}
