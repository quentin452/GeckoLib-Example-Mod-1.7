package fr.iamacat.geckolibexamplemod;

import fr.iamacat.geckolibexamplemod.entity.BikeEntityZ;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.MinecraftForgeClient;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.iamacat.geckolibexamplemod.block.tile.BotariumZTileEntity;
import fr.iamacat.geckolibexamplemod.block.tile.FertilizerZTileEntity;
import fr.iamacat.geckolibexamplemod.client.renderer.armor.PotatoArmorZRenderer;
import fr.iamacat.geckolibexamplemod.client.renderer.entity.*;
import fr.iamacat.geckolibexamplemod.client.renderer.item.JackInTheBoxZRenderer;
import fr.iamacat.geckolibexamplemod.client.renderer.tile.BotariumTileZRenderer;
import fr.iamacat.geckolibexamplemod.client.renderer.tile.FertilizerTileZRenderer;
import fr.iamacat.geckolibexamplemod.entity.*;
import fr.iamacat.geckolibexamplemod.item.PotatoArmorItemZ;
import fr.iamacat.geckolibexamplemod.registry.BlockRegistryZ;
import fr.iamacat.geckolibexamplemod.registry.ItemRegistryZ;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import software.bernie.geckolib3.renderers.geo.GeoReplacedEntityRenderer;
import software.bernie.geckolib3.renderers.geo.RenderBlockItem;

public class ClientListenerZ {

    @SideOnly(Side.CLIENT)
    public static void registerRenderers(FMLInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(GeoExampleEntityLayerZ.class, new LEZRenderer());
        RenderingRegistry.registerEntityRenderingHandler(GeoExampleEntityZ.class, new ExampleGeoZRenderer());
        RenderingRegistry.registerEntityRenderingHandler(BikeEntityZ.class, new BikeGeoZRenderer());
        RenderingRegistry.registerEntityRenderingHandler(GeoNpcEntityZ.class, new GeoNpcZRenderer());

        GeoArmorRenderer.registerArmorRenderer(PotatoArmorItemZ.class, new PotatoArmorZRenderer());

        bindRender(BlockRegistryZ.BOTARIUM_BLOCK, new BotariumZTileEntity(), new BotariumTileZRenderer());
        bindRender(BlockRegistryZ.FERTILIZER_BLOCK, new FertilizerZTileEntity(), new FertilizerTileZRenderer());
        // bindRender(BlockRegistry.DIAGONAL_BLOCK, new DiagonalTileEntity(), new DiagonalTileRenderer());

        MinecraftForgeClient.registerItemRenderer(ItemRegistryZ.JACK_IN_THE_BOX, new JackInTheBoxZRenderer());
    }

    public static void bindRender(Block block, TileEntity tile, TileEntitySpecialRenderer tesr) {
        ClientRegistry.bindTileEntitySpecialRenderer(tile.getClass(), tesr);
        Item blockItem = ItemBlock.getItemFromBlock(block);
        MinecraftForgeClient.registerItemRenderer(blockItem, new RenderBlockItem(tesr, tile));
    }

    @SideOnly(Side.CLIENT)
    public static void registerReplacedRenderers(FMLInitializationEvent event) {
        ReplacedCreeperZRenderer creeperRenderer = new ReplacedCreeperZRenderer();
        RenderManager.instance.entityRenderMap.put(EntityCreeper.class, creeperRenderer);
        GeoReplacedEntityRenderer.registerReplacedEntity(ReplacedCreeperEntityZ.class, creeperRenderer);
    }
}
