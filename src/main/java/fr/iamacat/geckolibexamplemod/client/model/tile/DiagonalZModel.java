package fr.iamacat.geckolibexamplemod.client.model.tile;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.block.tile.DiagonalZTileEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DiagonalZModel extends AnimatedGeoModel<DiagonalZTileEntity> {

    @Override
    public ResourceLocation getAnimationFileLocation(DiagonalZTileEntity entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "animations/bat.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(DiagonalZTileEntity animatable) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "geo/testdiagonal.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DiagonalZTileEntity entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/block/testdiagonal.png");
    }
}
