package fr.iamacat.geckolibexamplemod.client.renderer.entity;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.client.model.entity.LEModel;
import fr.iamacat.geckolibexamplemod.client.renderer.entity.layer.GeoExampleLayer;
import fr.iamacat.geckolibexamplemod.entity.GeoExampleEntityLayer;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LERenderer extends GeoEntityRenderer<GeoExampleEntityLayer> {

    @SuppressWarnings("unchecked")
    public LERenderer() {
        super(new LEModel());
        this.addLayer(new GeoExampleLayer(this));
        this.shadowSize = 0.2f;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return null;
    }
}
