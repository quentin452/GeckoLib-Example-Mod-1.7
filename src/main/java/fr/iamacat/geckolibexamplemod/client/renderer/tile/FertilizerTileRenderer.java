package fr.iamacat.geckolibexamplemod.client.renderer.tile;

import net.minecraft.tileentity.TileEntity;

import software.bernie.example.block.tile.FertilizerTileEntity;
import software.bernie.example.client.model.tile.FertilizerModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class FertilizerTileRenderer extends GeoBlockRenderer<FertilizerTileEntity> {

    public FertilizerTileRenderer() {
        super(new FertilizerModel());
    }

    @Override
    public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_,
        float p_147500_8_) {

    }
}