package fr.iamacat.geckolibexamplemod.client.model.armor;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.item.PotatoArmorItem;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PotatoArmorModel extends AnimatedGeoModel<PotatoArmorItem> {

    @Override
    public ResourceLocation getModelLocation(PotatoArmorItem object) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "geo/potato_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PotatoArmorItem object) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/item/potato_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PotatoArmorItem animatable) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "animations/potato_armor.animation.json");
    }
}
