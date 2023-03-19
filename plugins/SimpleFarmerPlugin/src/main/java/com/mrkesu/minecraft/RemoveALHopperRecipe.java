package com.mrkesu.minecraft;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.block.Hopper;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

public class RemoveALHopperRecipe implements Listener {

    public static void registerRecipe() {
        // Create custom hopper
        ItemStack removeALHopper = new ItemStack(Material.HOPPER);

        // Add command to item meta
        ItemMeta meta = removeALHopper.getItemMeta();
        meta.setDisplayName("Remove Acute Loot Hopper");
        meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        removeALHopper.setItemMeta(meta);

        // Create custom hopper recipe
        NamespacedKey key = new NamespacedKey(KrakenSimpleFarmer.getInstance(), "removeal_hopper");
        ShapedRecipe recipe = new ShapedRecipe(key, removeALHopper);
        recipe.shape("ICI", "CFC", "ICI");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('C', Material.CHEST);
        recipe.setIngredient('F', Material.FURNACE);

        // Add recipe to server
        Bukkit.getServer().addRecipe(recipe);
    }

    @EventHandler
    public void onItemMove(InventoryMoveItemEvent event) {
        if (event.getSource().getHolder() instanceof Hopper) {
            Hopper hopper = (Hopper) event.getSource().getHolder();
            if (hopper.getCustomName() != null && hopper.getCustomName().equals("Remove Acute Loot Hopper")) {
                ItemStack item = event.getItem();
                // Run command for each item passing through hopper
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "/acuteloot remove " + item.getType().getKey().getKey());
            }
        }
    }

}