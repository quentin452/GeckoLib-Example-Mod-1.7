package fr.iamacat.geckolibexamplemod.client.renderer.tile;

import net.minecraft.tileentity.TileEntity;

import fr.iamacat.geckolibexamplemod.block.tile.BotariumZTileEntity;
import fr.iamacat.geckolibexamplemod.client.model.tile.BotariumZModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class BotariumTileZRenderer extends GeoBlockRenderer<BotariumZTileEntity> {

    public BotariumTileZRenderer() {
        super(new BotariumZModel());
    }

    @Override
    public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_,
        float p_147500_8_) {

    }
}
