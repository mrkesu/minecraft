package com.mrkesu.minecraft;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class KrakenSimpleFarmer extends JavaPlugin {

    private static KrakenSimpleFarmer instance;

    public static ALIntegration alIntegration;

    @Override
    public void onEnable() {

        instance = this;

        alIntegration = new ALIntegration(this);

        // Register custom hopper recipe
        ModRecipes.registerRecipes();

        // Register RemoveALHopperRecipe listener
        Bukkit.getPluginManager().registerEvents(new RemoveALHopperRecipe(), this);
 

        //Bukkit.getLogger().info("AcuteLoot API version: " + alIntegration.checkVersion());

        Bukkit.getLogger().info("Krakens Simple Farmer Plugin enabled.");
    }

    @Override
    public void onDisable() {
        alIntegration = null;
        Bukkit.getLogger().info("Krakens Simple Farmer Plugin disabled.");
    }

    public static KrakenSimpleFarmer getInstance() {
        return instance;
    }

}
