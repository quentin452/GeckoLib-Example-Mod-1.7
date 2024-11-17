package fr.iamacat.geckolibexamplemod.client.renderer.item;

import fr.iamacat.geckolibexamplemod.client.model.item.JackInTheBoxModel;
import fr.iamacat.geckolibexamplemod.item.JackInTheBoxItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class JackInTheBoxRenderer extends GeoItemRenderer<JackInTheBoxItem> {

    public JackInTheBoxRenderer() {
        super(new JackInTheBoxModel());
    }
}
