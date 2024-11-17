package fr.iamacat.geckolibexamplemod.client.renderer.entity;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.client.model.entity.BikeZModel;
import fr.iamacat.geckolibexamplemod.entity.BikeEntityZ;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BikeGeoZRenderer extends GeoEntityRenderer<BikeEntityZ> {

    public BikeGeoZRenderer() {
        super(new BikeZModel());
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/model/entity/bike.png");
    }
}
