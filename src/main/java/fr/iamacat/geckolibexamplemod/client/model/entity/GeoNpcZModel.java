package fr.iamacat.geckolibexamplemod.client.model.entity;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.entity.GeoNpcEntityZ;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GeoNpcZModel extends AnimatedGeoModel<GeoNpcEntityZ> {

    @Override
    public ResourceLocation getAnimationFileLocation(GeoNpcEntityZ entity) {
        return new ResourceLocation("custom", "geo_npc.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(GeoNpcEntityZ entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "geo/npc.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GeoNpcEntityZ entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/model/entity/geo_npc.png");
    }
}
