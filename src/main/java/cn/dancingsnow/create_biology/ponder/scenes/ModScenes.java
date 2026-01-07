package cn.dancingsnow.create_biology.ponder.scenes;

import cn.dancingsnow.create_biology.init.ModBlocks;
import cn.dancingsnow.create_biology.init.ModItems;
import com.simibubi.create.foundation.ponder.CreateSceneBuilder;
import net.createmod.catnip.math.Pointing;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.minecraft.core.Direction;

public class ModScenes {
    public static void stainlessSteelCasing(SceneBuilder builder, SceneBuildingUtil util) {
        CreateSceneBuilder scene = new CreateSceneBuilder(builder);
        scene.title("stainless_steel_casing", "Stainless Steel Casing");
        scene.configureBasePlate(0, 0, 5);
        scene.world().showSection(util.select().layer(0), Direction.UP);
        scene.idle(10);

        scene.world().showSection(util.select().position(2, 1, 2), Direction.UP);
        scene.idle(20);

        scene.overlay().showText(60)
            .placeNearTarget()
            .pointAt(util.vector().topOf(2, 1, 2))
            .text("Use a Stainless Steel Ingot on a stripped log or wood to create a Stainless Steel Casing.");
        scene.overlay().showControls(util.vector().topOf(2, 1, 2), Pointing.UP, 60)
            .rightClick()
            .withItem(ModItems.STAINLESS_STEEL_INGOT.asStack());

        scene.idle(5);
        scene.world().setBlocks(util.select().position(2, 1, 2), ModBlocks.STAINLESS_STEEL_CASING.getDefaultState(), true);

        scene.idle(20);
    }
}
