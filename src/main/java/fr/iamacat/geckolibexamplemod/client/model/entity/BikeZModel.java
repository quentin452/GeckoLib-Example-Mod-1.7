package fr.iamacat.geckolibexamplemod.client.model.entity;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.entity.BikeEntityZ;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BikeZModel extends AnimatedGeoModel<BikeEntityZ> {

    @Override
    public ResourceLocation getAnimationFileLocation(BikeEntityZ entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "animations/bike.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(BikeEntityZ entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "geo/bike.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BikeEntityZ entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/model/entity/bike.png");
    }
}
