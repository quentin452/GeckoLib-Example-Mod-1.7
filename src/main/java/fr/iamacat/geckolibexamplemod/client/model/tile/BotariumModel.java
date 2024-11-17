// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLibMod
// Paste this class into your mod and follow the documentation for GeckoLibMod to use animations. You can find the
// documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package fr.iamacat.geckolibexamplemod.client.model.tile;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.block.tile.BotariumTileEntity;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BotariumModel extends AnimatedGeoModel<BotariumTileEntity> {

    @Override
    public ResourceLocation getAnimationFileLocation(BotariumTileEntity entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "animations/botarium.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(BotariumTileEntity animatable) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "geo/botarium.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BotariumTileEntity entity) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/block/botarium.png");
    }
}
