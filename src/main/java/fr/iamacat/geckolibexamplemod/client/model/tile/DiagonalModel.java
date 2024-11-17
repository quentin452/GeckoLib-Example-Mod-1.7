package fr.iamacat.geckolibexamplemod.client.model.tile;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.block.tile.DiagonalTileEntity;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DiagonalModel extends AnimatedGeoModel<DiagonalTileEntity> {

    @Override
    public ResourceLocation getAnimationFileLocation(DiagonalTileEntity entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "animations/bat.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(DiagonalTileEntity animatable) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "geo/testdiagonal.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DiagonalTileEntity entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/block/testdiagonal.png");
    }
}
