package fr.iamacat.geckolibexamplemod;

import fr.iamacat.geckolibexamplemod.item.ItemEggSpawnerZ;
import fr.iamacat.geckolibexamplemod.block.BotariumZBlock;
import fr.iamacat.geckolibexamplemod.block.DiagonalZBlock;
import fr.iamacat.geckolibexamplemod.block.FertilizerZBlock;
import fr.iamacat.geckolibexamplemod.block.tile.BotariumZTileEntity;
import fr.iamacat.geckolibexamplemod.block.tile.FertilizerZTileEntity;
import fr.iamacat.geckolibexamplemod.entity.BikeEntityZ;
import fr.iamacat.geckolibexamplemod.entity.GeoExampleEntityZ;
import fr.iamacat.geckolibexamplemod.entity.GeoExampleEntityLayerZ;
import fr.iamacat.geckolibexamplemod.entity.GeoNpcEntityZ;
import fr.iamacat.geckolibexamplemod.item.JackInTheBoxItemZ;
import fr.iamacat.geckolibexamplemod.item.PotatoArmorItemZ;
import fr.iamacat.geckolibexamplemod.registry.BlockRegistryZ;
import fr.iamacat.geckolibexamplemod.registry.ItemRegistryZ;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


public class CommonListenerZ {
    private static void registerEggSpawner(String entityName, Class<? extends Entity> entityClass) {
        ItemEggSpawnerZ eggSpawner = new ItemEggSpawnerZ(entityName, entityClass);
        GameRegistry.registerItem(eggSpawner, "eggSpawner_" + entityName);
    }
    public static void onRegisterBlocks() {
        BlockRegistryZ.BOTARIUM_BLOCK = new BotariumZBlock();
        BlockRegistryZ.FERTILIZER_BLOCK = new FertilizerZBlock();
        BlockRegistryZ.DIAGONAL_BLOCK = new DiagonalZBlock();

        BlockRegistryZ.BOTARIUM_BLOCK.setCreativeTab(GeckoLibExampleMod.getGeckolibItemGroup());
        BlockRegistryZ.FERTILIZER_BLOCK.setCreativeTab(GeckoLibExampleMod.getGeckolibItemGroup());
        BlockRegistryZ.DIAGONAL_BLOCK.setCreativeTab(GeckoLibExampleMod.getGeckolibItemGroup());

        registerBlock(BlockRegistryZ.BOTARIUM_BLOCK, "botariumblock");
        registerBlock(BlockRegistryZ.FERTILIZER_BLOCK, "fertilizerblock");
        // registerBlock(BlockRegistry.DIAGONAL_BLOCK,"diagonalblock");
    }

    public static void onRegisterEntities() {
        int id = 0;
        EntityRegistry.registerModEntity(BikeEntityZ.class, "bike", id++, GeckoLibExampleMod.instance, 160, 2, false);
        registerEggSpawner("bike", BikeEntityZ.class);
        EntityRegistry
            .registerModEntity(GeoExampleEntityZ.class, "example", id++, GeckoLibExampleMod.instance, 160, 2, false);
        registerEggSpawner("example", GeoExampleEntityZ.class);
        EntityRegistry.registerModEntity(
            GeoExampleEntityLayerZ.class,
            "examplelayer",
            id++,
            GeckoLibExampleMod.instance,
            160,
            2,
            false);
        registerEggSpawner("examplelayer", GeoExampleEntityLayerZ.class);
        EntityRegistry
            .registerModEntity(GeoNpcEntityZ.class, "geonpc", id++, GeckoLibExampleMod.instance, 160, 2, false);
        registerEggSpawner("geonpc", GeoNpcEntityZ.class);
        /* Tile entities */
        GameRegistry.registerTileEntity(BotariumZTileEntity.class, "botariumtile");
        GameRegistry.registerTileEntity(FertilizerZTileEntity.class, "fertilizertile");
        // GameRegistry.registerTileEntity(DiagonalTileEntity.class, "diagonaltile");

    }
    public static void onRegisterItems() {
        ItemRegistryZ.JACK_IN_THE_BOX = new JackInTheBoxItemZ();
        ItemRegistryZ.JACK_IN_THE_BOX.setUnlocalizedName("jackintheboxitem");
        GameRegistry.registerItem(ItemRegistryZ.JACK_IN_THE_BOX, "jackintheboxitem");

        ItemRegistryZ.POTATO_HEAD = registerItem(
            new PotatoArmorItemZ(ItemArmor.ArmorMaterial.DIAMOND, 0, 0),
            "potato_head");
        ItemRegistryZ.POTATO_CHEST = registerItem(
            new PotatoArmorItemZ(ItemArmor.ArmorMaterial.DIAMOND, 0, 1),
            "potato_chest");
        ItemRegistryZ.POTATO_LEGGINGS = registerItem(
            new PotatoArmorItemZ(ItemArmor.ArmorMaterial.DIAMOND, 0, 2),
            "potato_leggings");
        ItemRegistryZ.POTATO_BOOTS = registerItem(
            new PotatoArmorItemZ(ItemArmor.ArmorMaterial.DIAMOND, 0, 3),
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
