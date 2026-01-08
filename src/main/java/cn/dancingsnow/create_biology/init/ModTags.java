package cn.dancingsnow.create_biology.init;

import cn.dancingsnow.create_biology.CreateBiologyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> STAINLESS_STEEL_INGOTS = common("ingots/stainless_steel");
        public static final TagKey<Item> NICKEL_INGOT = common("ingots/nickel");
        public static final TagKey<Item> CHROMIUM_INGOT = common("ingots/chromium");

        private static TagKey<Item> common(String path) {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", path));
        }

        private static TagKey<Item> mod(String path) {
            return TagKey.create(Registries.ITEM, CreateBiologyMod.of(path));
        }
    }



    public static class Blocks {
        public static final TagKey<Block> STAINLESS_STEEL_BLOCK = common("storage_blocks/stainless_steel");

        private static TagKey<Block> common(String path) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", path));
        }

        private static TagKey<Block> mod(String path) {
            return TagKey.create(Registries.BLOCK, CreateBiologyMod.of(path));
        }
    }
}
