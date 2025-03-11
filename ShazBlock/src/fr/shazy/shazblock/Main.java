package fr.shazy.shazblock;

import fr.shazy.shazblock.commands.CommandSpawn;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Le plugin est op!");

        // On associe les commandes aux executeurs
        getCommand("spawn").setExecutor(new CommandSpawn());

        // On crée un listener
        getServer().getPluginManager().registerEvents(new ShazBlockListener(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Le plugin s'est correctement arreté.");
    }
}
