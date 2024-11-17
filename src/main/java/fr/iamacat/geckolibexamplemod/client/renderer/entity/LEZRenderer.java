package fr.iamacat.geckolibexamplemod.client.renderer.entity;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.client.model.entity.LEZModel;
import fr.iamacat.geckolibexamplemod.client.renderer.entity.layer.GeoExampleZLayer;
import fr.iamacat.geckolibexamplemod.entity.GeoExampleEntityLayerZ;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LEZRenderer extends GeoEntityRenderer<GeoExampleEntityLayerZ> {

    @SuppressWarnings("unchecked")
    public LEZRenderer() {
        super(new LEZModel());
        this.addLayer(new GeoExampleZLayer(this));
        this.shadowSize = 0.2f;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return null;
    }
}
