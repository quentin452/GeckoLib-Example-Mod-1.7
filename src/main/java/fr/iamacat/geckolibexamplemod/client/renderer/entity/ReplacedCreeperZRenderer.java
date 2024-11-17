package fr.iamacat.geckolibexamplemod.client.renderer.entity;

import net.geckominecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import fr.iamacat.geckolibexamplemod.client.model.entity.ReplacedCreeperZModel;
import fr.iamacat.geckolibexamplemod.entity.ReplacedCreeperEntityZ;
import software.bernie.geckolib3.renderers.geo.GeoReplacedEntityRenderer;

public class ReplacedCreeperZRenderer extends GeoReplacedEntityRenderer<ReplacedCreeperEntityZ> {

    @SuppressWarnings("unchecked")
    public ReplacedCreeperZRenderer() {
        super(new ReplacedCreeperZModel(), new ReplacedCreeperEntityZ());
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entitylivingbaseIn, float partialTickTime) {
        EntityCreeper creeper = (EntityCreeper) entitylivingbaseIn;
        float f = creeper.getCreeperFlashIntensity(partialTickTime);
        float f1 = 1.0F + MathHelper.sin(f * 100.0F) * f * 0.01F;
        f = MathHelper.clamp_float(f, 0.0F, 1.0F);
        f = f * f;
        f = f * f;
        float f2 = (1.0F + f * 0.4F) * f1;
        float f3 = (1.0F + f * 0.1F) / f1;
        GlStateManager.scale(f2, f3, f2);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return null;
    }
}
