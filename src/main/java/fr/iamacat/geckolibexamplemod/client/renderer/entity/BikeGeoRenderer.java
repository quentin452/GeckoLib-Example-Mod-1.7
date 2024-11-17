package fr.iamacat.geckolibexamplemod.client.renderer.entity;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import software.bernie.example.client.model.entity.BikeModel;
import software.bernie.example.entity.BikeEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BikeGeoRenderer extends GeoEntityRenderer<BikeEntity> {

    public BikeGeoRenderer() {
        super(new BikeModel());
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return null;
    }
}
