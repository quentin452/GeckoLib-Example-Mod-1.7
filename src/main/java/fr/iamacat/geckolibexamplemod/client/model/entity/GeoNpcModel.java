package fr.iamacat.geckolibexamplemod.client.model.entity;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.entity.GeoNpcEntity;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GeoNpcModel extends AnimatedGeoModel<GeoNpcEntity> {

    @Override
    public ResourceLocation getAnimationFileLocation(GeoNpcEntity entity) {
        return new ResourceLocation("custom", "geo_npc.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(GeoNpcEntity entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "geo/npc.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GeoNpcEntity entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/model/entity/geo_npc.png");
    }
}
