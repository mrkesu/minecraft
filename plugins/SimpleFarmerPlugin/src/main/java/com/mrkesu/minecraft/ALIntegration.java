package com.mrkesu.minecraft;

import acute.loot.*;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import acute.loot.API;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import java.util.ArrayList;

public class ALIntegration {

    private final Logger logger;
    private final API api;

    public ALIntegration(final Plugin plugin) {
        logger = plugin.getLogger();
        api = new API(plugin, "KRAKENSIMPLEFARMER");
    }

    public void removeStuff(ItemStack item) {
        if (api.getLootItem(item).isEmpty() == false) {
            ItemMeta meta = item.getItemMeta();
            meta.setLore(new ArrayList<>());
            meta.setDisplayName(null);
            NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("AcuteLoot"), "lootCodeKey");
            meta.getPersistentDataContainer().remove(key);
            item.setItemMeta(meta);
        }
    }
}