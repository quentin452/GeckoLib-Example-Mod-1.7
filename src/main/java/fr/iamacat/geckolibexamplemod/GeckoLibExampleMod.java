/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package fr.iamacat.geckolibexamplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.iamacat.geckolibexamplemod.config.ConfigHandler;
import fr.iamacat.geckolibexamplemod.registry.ItemRegistry;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.handler.PlayerLoginHandler;

@Mod(modid = GeckoLibExampleMod.ModID, version = GeckoLibExampleMod.VERSION,dependencies = "required-after:geckolib3;")
public class GeckoLibExampleMod {

    public static final String ModID = "geckolibexamplemod";
    public static final String VERSION = "1.0";
    public static CreativeTabs geckolibItemGroup;

    public static GeckoLibExampleMod instance;

    public static CreativeTabs getGeckolibItemGroup() {
        if (geckolibItemGroup == null) {
            geckolibItemGroup = new CreativeTabs(CreativeTabs.getNextID(), "geckolib_examples") {

                @Override
                public Item getTabIconItem() {
                    return (ItemRegistry.JACK_IN_THE_BOX);
                }
            };
        }

        return geckolibItemGroup;
    }

    public GeckoLibExampleMod() {
        instance = this;
        MinecraftForge.EVENT_BUS.register(new CommonListener());
        FMLCommonHandler.instance()
            .bus()
            .register(new PlayerLoginHandler());
        MinecraftForge.EVENT_BUS.register(new PlayerLoginHandler());
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        CommonListener.onRegisterBlocks();
        CommonListener.onRegisterItems();
        CommonListener.onRegisterEntities();
    }

    @SideOnly(Side.CLIENT)
    @Mod.EventHandler
    public void registerRenderers(FMLInitializationEvent event) {
        if (event.getSide() == Side.CLIENT) {
            ClientListener.registerReplacedRenderers(event);
            ClientListener.registerRenderers(event);
        }
        GeckoLib.initialize();
    }

}
