package cn.dancingsnow.create_biology.ponder;

import cn.dancingsnow.create_biology.CreateBiologyMod;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

public class ModPonderTags {


    public static void register(PonderTagRegistrationHelper<ResourceLocation> helper) {
        PonderTagRegistrationHelper<RegistryEntry<?, ?>> HELPER = helper.withKeyFunction(RegistryEntry::getId);
    }

    private static ResourceLocation loc(String path) {
        return CreateBiologyMod.of(path);
    }
}
