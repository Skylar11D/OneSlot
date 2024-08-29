package xyz.sk1.bukkit.testplugin.utils.plugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import xyz.sk1.bukkit.testplugin.Main;
import xyz.sk1.bukkit.testplugin.listeners.ConnectionListener;
import xyz.sk1.bukkit.testplugin.listeners.DropEventListener;
import xyz.sk1.bukkit.testplugin.listeners.RespawnListener;
import xyz.sk1.bukkit.testplugin.listeners.inventory.PlayerInventoryClickEvent;
import xyz.sk1.bukkit.testplugin.listeners.inventory.PlayerItemSwitchEvent;

import java.util.Arrays;

public class PluginManager {

    private Listener[] listeners = {
            new ConnectionListener(),
            new PlayerItemSwitchEvent(),
            new PlayerInventoryClickEvent(),
            new RespawnListener(),
            new DropEventListener()
    };
    private Main main;
    public PluginManager(Main instance){
        this.main = instance;
    }

    public void registerEventListeners(){
        org.bukkit.plugin.PluginManager pm = Bukkit.getServer().getPluginManager();

        Bukkit.getLogger().info("Registering the plugin's events listeners..");
        Arrays.stream(listeners).forEach(listener -> pm.registerEvents(listener, main));
    }

}
