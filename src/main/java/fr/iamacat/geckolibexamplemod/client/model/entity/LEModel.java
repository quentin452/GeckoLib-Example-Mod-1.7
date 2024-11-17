package fr.iamacat.geckolibexamplemod.client.model.entity;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.entity.GeoExampleEntityLayer;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class LEModel extends AnimatedTickingGeoModel<GeoExampleEntityLayer> {

    @Override
    public ResourceLocation getModelLocation(GeoExampleEntityLayer object) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "geo/le.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GeoExampleEntityLayer object) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/model/entity/le.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GeoExampleEntityLayer animatable) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "animations/le.animations.json");
    }
}
