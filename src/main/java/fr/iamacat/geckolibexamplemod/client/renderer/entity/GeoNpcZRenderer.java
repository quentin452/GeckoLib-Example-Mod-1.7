package fr.iamacat.geckolibexamplemod.client.renderer.entity;

import java.util.ArrayList;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import fr.iamacat.geckolibexamplemod.client.model.entity.GeoNpcZModel;
import fr.iamacat.geckolibexamplemod.entity.GeoNpcEntityZ;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GeoNpcZRenderer extends GeoEntityRenderer<GeoNpcEntityZ> {

    public GeoNpcZRenderer() {
        super(new GeoNpcZModel());
    }

    @Override
    public void renderAfter(GeoModel model, GeoNpcEntityZ animatable, float ticks, float red, float green, float blue,
                            float alpha) {
        super.renderAfter(model, animatable, ticks, red, green, blue, alpha);
        if (model.getBone("held_item")
            .isPresent() && animatable.getHeldItem() != null) {
            GeoBone bone = model.getBone("held_item")
                .get();
            renderItem(animatable, bone, ticks);
        }

        // drawParticles(model,animatable,ticks);
    }

    public GeoBone[] getPathFromRoot(GeoBone bone) {
        ArrayList<GeoBone> bones = new ArrayList<>();
        while (bone != null) {
            bones.add(0, bone);
            bone = bone.parent;
        }
        return bones.toArray(new GeoBone[0]);
    }

    public void renderItem(GeoNpcEntityZ animatable, GeoBone locator, float ticks) {

        GL11.glPushMatrix();
        float scale = 0.5f;
        GL11.glScaled(scale, scale, scale);

        GeoBone[] bonePath = getPathFromRoot(locator);
        for (int i = 0; i < bonePath.length; i++) {
            GeoBone b = bonePath[i];
            GL11.glTranslatef(
                b.getPositionX() / (16 * scale),
                b.getPositionY() / (16 * scale),
                b.getPositionZ() / (16 * scale));
            GL11.glTranslatef(b.getPivotX() / (16 * scale), b.getPivotY() / (16 * scale), b.getPivotZ() / (16 * scale));

            GL11.glRotated(b.getRotationZ() / Math.PI * 180, 0, 0, 1);
            GL11.glRotated(b.getRotationY() / Math.PI * 180, 0, 1, 0);
            GL11.glRotated(b.getRotationX() / Math.PI * 180, 1, 0, 0);

            GL11.glScalef(b.getScaleX(), b.getScaleY(), b.getScaleZ());
            GL11.glTranslatef(
                -b.getPivotX() / (16 * scale),
                -b.getPivotY() / (16 * scale),
                -b.getPivotZ() / (16 * scale));
        }
        GL11.glRotatef(250, 1, 0, 0);
        GL11.glRotatef(40, 0, 1, 0);
        GL11.glTranslatef(-0.4f, -0.55f, 1.7f);
        ItemStack stack = animatable.getHeldItem();
        RenderManager.instance.itemRenderer.renderItem(animatable, stack, 0, IItemRenderer.ItemRenderType.INVENTORY);
        GL11.glPopMatrix();
    }

    @Override
    public boolean isBoneRenderOverriden(GeoNpcEntityZ entity, GeoBone bone) {
        return bone.name.equals("held_item");
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return new ResourceLocation(GeckoLibExampleMod.ModID, "textures/model/entity/geo_npc.png");
    }
}
