package xyz.sk1.bukkit.testplugin.utils.player;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerManager {

    private List<PaperPlayer> paperPlayerMap;

    public PlayerManager(){
        this.paperPlayerMap = new ArrayList<>();
    }

    public PaperPlayer get(Player p){

        return paperPlayerMap.stream().findFirst().orElse(null);
    }

    public boolean isRegistered(Player p){

        return paperPlayerMap.contains(
                paperPlayerMap.stream().filter(paperPlayer -> paperPlayer.getPlayer() == p).findFirst().get()
        );
    }

    public void registerPlayer(Player p){
        this.paperPlayerMap.add(() -> p);
    }

    public void unregisterPlayer(Player p){
        this.paperPlayerMap.remove(this.get(p));
    }

}
