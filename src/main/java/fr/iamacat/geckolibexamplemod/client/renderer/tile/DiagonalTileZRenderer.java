package fr.iamacat.geckolibexamplemod.client.renderer.tile;

import net.minecraft.tileentity.TileEntity;

import fr.iamacat.geckolibexamplemod.block.tile.DiagonalZTileEntity;
import fr.iamacat.geckolibexamplemod.client.model.tile.DiagonalZModel;
import software.bernie.geckolib3.collision.ComplexBB;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class DiagonalTileZRenderer extends GeoBlockRenderer<DiagonalZTileEntity> {

    public DiagonalTileZRenderer() {
        super(new DiagonalZModel());
    }

    @Override
    public void renderEarly(GeoModel model, DiagonalZTileEntity animatable, float ticks, float red, float green,
                            float blue, float alpha) {
        super.renderEarly(model, animatable, ticks, red, green, blue, alpha);
        // Cube cube = new Cube();
        // cube.setUv(new UvUnion(0,0));
        // MatrixStack stack = new MatrixStack();
        // animatable.boundingBox = new RotatableBB(GeoCube.createFromPojoCube(cube, model.properties,
        // null,null),stack);//new ComplexBB(model, animatable.xCoord,animatable.yCoord,animatable.zCoord);
        animatable.boundingBox = new ComplexBB(
            model,
            animatable.xCoord + 0.5,
            animatable.yCoord,
            animatable.zCoord + 0.5);
    }

    @Override
    public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_,
        float p_147500_8_) {

    }
}
