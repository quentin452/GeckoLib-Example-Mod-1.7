package fr.iamacat.geckolibexamplemod.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

    public static Configuration config;
    public static boolean enableExamples;

    public ConfigHandler() {}

    public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
    }

    public static void load() {
        config.load();
    }

    public static void syncConfig() {
        config.addCustomCategoryComment("general", "General Settings");
        enableExamples = config.getBoolean("enableexamples", "general", false, "Enable Geckolib Examples");
        config.save();
    }
}
