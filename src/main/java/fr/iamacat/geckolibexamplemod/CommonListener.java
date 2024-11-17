package fr.iamacat.geckolibexamplemod;

import fr.iamacat.geckolibexamplemod.item.ItemEggSpawner;
import software.bernie.example.block.BotariumBlock;
import software.bernie.example.block.DiagonalBlock;
import software.bernie.example.block.FertilizerBlock;
import software.bernie.example.block.tile.BotariumTileEntity;
import software.bernie.example.block.tile.FertilizerTileEntity;
import software.bernie.example.entity.BikeEntity;
import software.bernie.example.entity.GeoExampleEntity;
import software.bernie.example.entity.GeoExampleEntityLayer;
import software.bernie.example.entity.GeoNpcEntity;
import software.bernie.example.item.JackInTheBoxItem;
import software.bernie.example.item.PotatoArmorItem;
import software.bernie.example.registry.BlockRegistry;
import software.bernie.example.registry.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


public class CommonListener {
    private static void registerEggSpawner(String entityName, Class<? extends Entity> entityClass) {
        ItemEggSpawner eggSpawner = new ItemEggSpawner(entityName, entityClass);
        GameRegistry.registerItem(eggSpawner, "eggSpawner_" + entityName);
    }
    public static void onRegisterBlocks() {
        BlockRegistry.BOTARIUM_BLOCK = new BotariumBlock();
        BlockRegistry.FERTILIZER_BLOCK = new FertilizerBlock();
        BlockRegistry.DIAGONAL_BLOCK = new DiagonalBlock();

        BlockRegistry.BOTARIUM_BLOCK.setCreativeTab(GeckoLibExampleMod.getGeckolibItemGroup());
        BlockRegistry.FERTILIZER_BLOCK.setCreativeTab(GeckoLibExampleMod.getGeckolibItemGroup());
        BlockRegistry.DIAGONAL_BLOCK.setCreativeTab(GeckoLibExampleMod.getGeckolibItemGroup());

        registerBlock(BlockRegistry.BOTARIUM_BLOCK, "botariumblock");
        registerBlock(BlockRegistry.FERTILIZER_BLOCK, "fertilizerblock");
        // registerBlock(BlockRegistry.DIAGONAL_BLOCK,"diagonalblock");
    }

    public static void onRegisterEntities() {
        int id = 0;
        EntityRegistry.registerModEntity(BikeEntity.class, "bike", id++, GeckoLibExampleMod.instance, 160, 2, false);
        registerEggSpawner("bike", BikeEntity.class);
        EntityRegistry
            .registerModEntity(GeoExampleEntity.class, "example", id++, GeckoLibExampleMod.instance, 160, 2, false);
        registerEggSpawner("example", GeoExampleEntity.class);
        EntityRegistry.registerModEntity(
            GeoExampleEntityLayer.class,
            "examplelayer",
            id++,
            GeckoLibExampleMod.instance,
            160,
            2,
            false);
        registerEggSpawner("examplelayer", GeoExampleEntityLayer.class);
        EntityRegistry
            .registerModEntity(GeoNpcEntity.class, "geonpc", id++, GeckoLibExampleMod.instance, 160, 2, false);
        registerEggSpawner("geonpc", GeoNpcEntity.class);
        /* Tile entities */
        GameRegistry.registerTileEntity(BotariumTileEntity.class, "botariumtile");
        GameRegistry.registerTileEntity(FertilizerTileEntity.class, "fertilizertile");
        // GameRegistry.registerTileEntity(DiagonalTileEntity.class, "diagonaltile");

    }
    public static void onRegisterItems() {
        ItemRegistry.JACK_IN_THE_BOX = new JackInTheBoxItem();
        ItemRegistry.JACK_IN_THE_BOX.setUnlocalizedName("jackintheboxitem");
        GameRegistry.registerItem(ItemRegistry.JACK_IN_THE_BOX, "jackintheboxitem");

        ItemRegistry.POTATO_HEAD = registerItem(
            new PotatoArmorItem(ItemArmor.ArmorMaterial.DIAMOND, 0, 0),
            "potato_head");
        ItemRegistry.POTATO_CHEST = registerItem(
            new PotatoArmorItem(ItemArmor.ArmorMaterial.DIAMOND, 0, 1),
            "potato_chest");
        ItemRegistry.POTATO_LEGGINGS = registerItem(
            new PotatoArmorItem(ItemArmor.ArmorMaterial.DIAMOND, 0, 2),
            "potato_leggings");
        ItemRegistry.POTATO_BOOTS = registerItem(
            new PotatoArmorItem(ItemArmor.ArmorMaterial.DIAMOND, 0, 3),
            "potato_boots");
    }

    private static <T extends Item> T registerItem(T item, String name) {
        GameRegistry.registerItem(
            item.setUnlocalizedName(name)
                .setTextureName("geckolibexamplemod:" + name),
            name);
        return item;
    }

    private static void registerBlock(Block block, String name) {
        GameRegistry.registerBlock(block.setBlockName(name), name);
    }
}
