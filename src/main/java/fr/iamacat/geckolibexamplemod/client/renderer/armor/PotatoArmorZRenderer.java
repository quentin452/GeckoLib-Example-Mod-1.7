package fr.iamacat.geckolibexamplemod.client.renderer.armor;

import fr.iamacat.geckolibexamplemod.client.model.armor.PotatoArmorZModel;
import fr.iamacat.geckolibexamplemod.item.PotatoArmorItemZ;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class PotatoArmorZRenderer extends GeoArmorRenderer<PotatoArmorItemZ> {

    public PotatoArmorZRenderer() {
        super(new PotatoArmorZModel());

        // These values are what each bone name is in blockbench. So if your head bone
        // is named "bone545", make sure to do this.headBone = "bone545";
        // The default values are the ones that come with the default armor template in
        // the geckolib blockbench plugin.
        this.headBone = "helmet";
        this.bodyBone = "chestplate";
        this.rightArmBone = "rightArm";
        this.leftArmBone = "leftArm";
        this.rightLegBone = "rightLeg";
        this.leftLegBone = "leftLeg";
        this.rightBootBone = "rightBoot";
        this.leftBootBone = "leftBoot";
    }
}
