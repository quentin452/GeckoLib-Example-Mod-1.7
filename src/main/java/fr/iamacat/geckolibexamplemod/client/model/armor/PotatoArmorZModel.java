package fr.iamacat.geckolibexamplemod.client.model.armor;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.item.PotatoArmorItemZ;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PotatoArmorZModel extends AnimatedGeoModel<PotatoArmorItemZ> {

    @Override
    public ResourceLocation getModelLocation(PotatoArmorItemZ object) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "geo/potato_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PotatoArmorItemZ object) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/item/potato_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PotatoArmorItemZ animatable) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "animations/potato_armor.animation.json");
    }
}
