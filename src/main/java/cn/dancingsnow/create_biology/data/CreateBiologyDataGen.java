package cn.dancingsnow.create_biology.data;

import cn.dancingsnow.create_biology.CreateBiologyMod;
import cn.dancingsnow.create_biology.ponder.CreateBiologyPonderPlugin;
import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.providers.RegistrateLangProvider;
import net.createmod.ponder.foundation.PonderIndex;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import static cn.dancingsnow.create_biology.CreateBiologyMod.REGISTRATE;

@EventBusSubscriber(modid = CreateBiologyMod.MODID)
public class CreateBiologyDataGen {
    @SubscribeEvent()
    public static void onGatherData(GatherDataEvent event) {

    }

    public static void init() {
        REGISTRATE.addDataGenerator(ProviderType.LANG, CreateBiologyDataGen::providePonderLang);
    }

    private static void providePonderLang(RegistrateLangProvider provider) {
        PonderIndex.addPlugin(new CreateBiologyPonderPlugin());
        PonderIndex.getLangAccess().provideLang(CreateBiologyMod.MODID, provider::add);
    }
}
