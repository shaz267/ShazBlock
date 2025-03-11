package fr.shazy.shazblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class CommandSpawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String msg, String[] args) {
        // On récupère le joueur
        Player p = (Player) commandSender;

        // On téléporte le joueur au spawn
        Location spawn = new Location(p.getWorld(), 100, 100, 100);

        p.teleport(spawn);

        return false;
    }
}