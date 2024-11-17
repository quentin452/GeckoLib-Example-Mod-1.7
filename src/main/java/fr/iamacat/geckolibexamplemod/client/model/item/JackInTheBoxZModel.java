package fr.iamacat.geckolibexamplemod.client.model.item;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.item.JackInTheBoxItemZ;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JackInTheBoxZModel extends AnimatedGeoModel<JackInTheBoxItemZ> {

    @Override
    public ResourceLocation getModelLocation(JackInTheBoxItemZ object) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "geo/jack.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(JackInTheBoxItemZ object) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/item/jack.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(JackInTheBoxItemZ animatable) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "animations/jackinthebox.animation.json");
    }
}
