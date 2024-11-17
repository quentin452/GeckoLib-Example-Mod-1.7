package fr.iamacat.geckolibexamplemod.client.renderer.entity;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.client.model.entity.BikeModel;
import fr.iamacat.geckolibexamplemod.entity.BikeEntity;
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
