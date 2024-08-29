package xyz.sk1.bukkit.testplugin.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import xyz.sk1.bukkit.testplugin.Main;
import xyz.sk1.bukkit.testplugin.utils.player.PaperPlayer;
import xyz.sk1.bukkit.testplugin.utils.player.PlayerManager;

public class ConnectionListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        PlayerManager playerManager = Main.getInstance().getPlayerManager();

        playerManager.registerPlayer(p);
        playerManager.get(p).populateInventory();

        e.setJoinMessage(null);

    }

    @EventHandler
    public void quit(PlayerQuitEvent e){
        Player p = e.getPlayer();
        PlayerManager playerManager = Main.getInstance().getPlayerManager();

        if(playerManager.isRegistered(p))
            playerManager.unregisterPlayer(p);

    }

}
