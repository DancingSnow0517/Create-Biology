package cn.dancingsnow.create_biology.init;

import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.content.kinetics.deployer.ItemApplicationRecipe;
import com.simibubi.create.content.kinetics.deployer.ManualApplicationRecipe;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.neoforge.common.Tags;

import static cn.dancingsnow.create_biology.CreateBiologyMod.REGISTRATE;

public class ModBlocks {
    static {
        REGISTRATE.defaultCreativeTab(ModCreativeModeTabs.BIOLOGY.getKey());
    }
    public static final BlockEntry<CasingBlock> STAINLESS_STEEL_CASING = REGISTRATE
        .block("stainless_steel_casing", CasingBlock::new)
        .transform(BuilderTransformers.casing(() -> ModSpriteShifts.STAINLESS_STEEL_CASING))
        .properties(p -> p.sound(SoundType.METAL))
        .recipe((ctx, provider) -> {
            new ItemApplicationRecipe.Builder<>(ManualApplicationRecipe::new, ctx.getId().withSuffix("_from_log"))
                .require(Tags.Items.STRIPPED_LOGS)
                .require(ModTags.Items.STAINLESS_STEEL_INGOTS)
                .output(ctx.get())
                .build(provider);
            new ItemApplicationRecipe.Builder<>(ManualApplicationRecipe::new, ctx.getId().withSuffix("_from_wood"))
                .require(Tags.Items.STRIPPED_WOODS)
                .require(ModTags.Items.STAINLESS_STEEL_INGOTS)
                .output(ctx.get())
                .build(provider);
        })
        .register();

    public static void register() {}
}
