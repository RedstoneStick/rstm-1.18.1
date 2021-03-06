package net.guwy.rstm.world.gen;

import net.guwy.rstm.world.feature.ModPlacedFeatures;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.FLUORITE_ORE_PLACED);
        base.add(ModPlacedFeatures.MAGNESIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.NITER_ORE_PLACED);
        base.add(ModPlacedFeatures.PALLADIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.PLATINUM_ORE_PLACED);
        base.add(ModPlacedFeatures.THORIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.TITANIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.URANIUM_ORE_PLACED);

        base.add((ModPlacedFeatures.BAUXITE_SOIL_PLACED));


    }
}
