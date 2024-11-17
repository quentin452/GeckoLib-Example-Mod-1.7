package fr.iamacat.geckolibexamplemod.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandlerZ {

    public static Configuration config;
    public static boolean enableExampleBoolean;

    public ConfigHandlerZ() {}

    public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
    }

    public static void load() {
        config.load();
    }

    public static void syncConfig() {
        config.addCustomCategoryComment("general", "General Settings");
        enableExampleBoolean = config.getBoolean("example_boolean", "general", false, "Enable Geckolib Examples");
        config.save();
    }
}
