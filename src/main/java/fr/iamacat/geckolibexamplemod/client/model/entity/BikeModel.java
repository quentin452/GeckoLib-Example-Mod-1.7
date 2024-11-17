package fr.iamacat.geckolibexamplemod.client.model.entity;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.entity.BikeEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BikeModel extends AnimatedGeoModel<BikeEntity> {

    @Override
    public ResourceLocation getAnimationFileLocation(BikeEntity entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "animations/bike.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(BikeEntity entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "geo/bike.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BikeEntity entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/model/entity/bike.png");
    }
}
