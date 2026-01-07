package cn.dancingsnow.create_biology.init;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static cn.dancingsnow.create_biology.CreateBiologyMod.REGISTRATE;

public class ModItems {
    static {
        REGISTRATE.defaultCreativeTab(ModCreativeModeTabs.BIOLOGY.getKey());
    }
    public static final ItemEntry<Item> STAINLESS_STEEL_INGOT = REGISTRATE
        .item("stainless_steel_ingot", Item::new)
        .tag(ModTags.Items.STAINLESS_STEEL_INGOTS)
        .register();

    public static void register() {}
}
