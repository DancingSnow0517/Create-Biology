package cn.dancingsnow.create_biology.init;

import cn.dancingsnow.create_biology.CreateBiologyMod;
import com.simibubi.create.foundation.block.connected.AllCTTypes;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.CTSpriteShifter;
import com.simibubi.create.foundation.block.connected.CTType;

public class ModSpriteShifts {

    public static final CTSpriteShiftEntry STAINLESS_STEEL_CASING = omni("stainless_steel_casing");

    private static CTSpriteShiftEntry omni(String name) {
        return getCT(AllCTTypes.OMNIDIRECTIONAL, name);
    }

    private static CTSpriteShiftEntry getCT(CTType type, String blockTextureName) {
        return getCT(type, blockTextureName, blockTextureName);
    }

    private static CTSpriteShiftEntry getCT(CTType type, String blockTextureName, String connectedTextureName) {
        return CTSpriteShifter.getCT(
            type,
            CreateBiologyMod.of("block/" + blockTextureName),
            CreateBiologyMod.of("block/" + connectedTextureName + "_connected")
        );
    }
}
