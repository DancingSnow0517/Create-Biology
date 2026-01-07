package cn.dancingsnow.create_biology.client;

import cn.dancingsnow.create_biology.CreateBiologyMod;
import cn.dancingsnow.create_biology.ponder.CreateBiologyPonderPlugin;
import net.createmod.ponder.foundation.PonderIndex;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = CreateBiologyMod.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(value = Dist.CLIENT, modid = CreateBiologyMod.MODID)
public class CreateBiologyModClient {
    public CreateBiologyModClient(ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    public static void clientInit(final FMLClientSetupEvent event) {
        PonderIndex.addPlugin(new CreateBiologyPonderPlugin());
    }
}
