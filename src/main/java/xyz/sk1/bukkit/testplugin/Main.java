package xyz.sk1.bukkit.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.sk1.bukkit.testplugin.utils.player.PaperPlayer;
import xyz.sk1.bukkit.testplugin.utils.player.PlayerManager;
import xyz.sk1.bukkit.testplugin.utils.plugin.PluginManager;

public class Main extends JavaPlugin {

    private static volatile Main instance;
    private MainProvider provider;
    private PluginManager pluginManager;
    private PlayerManager playerManager;

    @Override
    public void onEnable() {
        instance = this;
        this.pluginManager = new PluginManager(this);
        this.pluginManager.registerEventListeners();
        this.playerManager = new PlayerManager();

        this.provider = new MainProvider(this);
        this.provider.onEnable();

    }

    @Override
    public void onDisable() {

    }

    public static Main getInstance() {

        return instance;
    }

    public PluginManager getPluginManager() {
        return pluginManager;
    }

    public PlayerManager getPlayerManager() {
        return playerManager;
    }
}
