package fr.iamacat.geckolibexamplemod.client.renderer.item;

import fr.iamacat.geckolibexamplemod.client.model.item.JackInTheBoxZModel;
import fr.iamacat.geckolibexamplemod.item.JackInTheBoxItemZ;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class JackInTheBoxZRenderer extends GeoItemRenderer<JackInTheBoxItemZ> {

    public JackInTheBoxZRenderer() {
        super(new JackInTheBoxZModel());
    }
}
