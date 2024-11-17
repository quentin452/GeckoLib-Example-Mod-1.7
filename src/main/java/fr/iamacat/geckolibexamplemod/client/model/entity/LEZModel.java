package fr.iamacat.geckolibexamplemod.client.model.entity;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.entity.GeoExampleEntityLayerZ;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class LEZModel extends AnimatedTickingGeoModel<GeoExampleEntityLayerZ> {

    @Override
    public ResourceLocation getModelLocation(GeoExampleEntityLayerZ object) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "geo/le.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GeoExampleEntityLayerZ object) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/model/entity/le.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GeoExampleEntityLayerZ animatable) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "animations/le.animations.json");
    }
}
