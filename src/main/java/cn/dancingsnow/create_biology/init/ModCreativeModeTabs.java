package cn.dancingsnow.create_biology.init;

import cn.dancingsnow.create_biology.CreateBiologyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static cn.dancingsnow.create_biology.CreateBiologyMod.REGISTRATE;

public class ModCreativeModeTabs {

    private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateBiologyMod.MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BIOLOGY = CREATIVE_MODE_TABS.register(
        "biology",
        () -> CreativeModeTab.builder()
            .title(REGISTRATE.addLang("itemGroup", CreateBiologyMod.of("biology"), "Biology"))
            .icon(ModItems.STAINLESS_STEEL_INGOT::asStack)
            .build()
    );

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }
}
