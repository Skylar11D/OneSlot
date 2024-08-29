package xyz.sk1.bukkit.testplugin.utils.plugin;

public interface Provider {

    void onEnable();
    default void onDisable(){}

}
