package xyz.sk1.bukkit.testplugin.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import xyz.sk1.bukkit.testplugin.Main;
import xyz.sk1.bukkit.testplugin.utils.player.PaperPlayer;
import xyz.sk1.bukkit.testplugin.utils.player.PlayerManager;

public class RespawnListener implements Listener {

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event){
        PlayerManager playerManager = Main.getInstance().getPlayerManager();
        PaperPlayer player = playerManager.get(event.getPlayer());

        player.populateInventory();

    }

}
