package fr.iamacat.geckolibexamplemod.item;

import fr.iamacat.geckolibexamplemod.GeckoLibExampleMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEggSpawnerZ extends Item {
    private final Class<? extends Entity> entityClass;

    public ItemEggSpawnerZ(String entityName, Class<? extends Entity> entityClass) {
        this.setCreativeTab(GeckoLibExampleMod.geckolibItemGroup);
        this.setUnlocalizedName("eggSpawner_" + entityName);
        this.setTextureName(GeckoLibExampleMod.ModID + ":eggSpawner_" + entityName);
        this.setMaxStackSize(64);
        this.entityClass = entityClass;
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            spawnEntity(world, x, y, z);
            stack.stackSize--;
        }
        return true;
    }

    private void spawnEntity(World world, int x, int y, int z) {
        try {
            Entity entity = entityClass.getConstructor(World.class).newInstance(world);
            entity.setPosition(x, y + 1, z);
            world.spawnEntityInWorld(entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}