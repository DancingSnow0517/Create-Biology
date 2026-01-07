package cn.dancingsnow.create_biology.ponder;

import cn.dancingsnow.create_biology.init.ModBlocks;
import cn.dancingsnow.create_biology.ponder.scenes.ModScenes;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

public class ModPonderScenes {
    public static void register(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        PonderSceneRegistrationHelper<ItemProviderEntry<?, ?>> HELPER = helper.withKeyFunction(RegistryEntry::getId);

        HELPER.forComponents(ModBlocks.STAINLESS_STEEL_CASING)
            .addStoryBoard("stainless_steel_casing", ModScenes::stainlessSteelCasing);
    }
}
