package xyz.sk1.bukkit.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import xyz.sk1.bukkit.testplugin.utils.player.PaperPlayer;
import xyz.sk1.bukkit.testplugin.utils.player.PlayerManager;
import xyz.sk1.bukkit.testplugin.utils.plugin.Provider;

public class MainProvider implements Provider {

    private Main instance;

    public MainProvider(Main plugin){
        this.instance = plugin;
    }

    @Override
    public void onEnable() {
//        PlayerManager playerManager = instance.getPlayerManager();
//
//        for(Player o : Bukkit.getOnlinePlayers()){
//
//            if(playerManager.isRegistered(o))
//                playerManager.unregisterPlayer(o);
//
//            playerManager.registerPlayer(o);
//
//            PaperPlayer player = playerManager.get(o);
//
//            player.populateInventory();
//
//        }

    }

}
