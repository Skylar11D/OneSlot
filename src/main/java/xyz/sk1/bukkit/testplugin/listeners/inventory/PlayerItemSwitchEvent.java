package xyz.sk1.bukkit.testplugin.listeners.inventory;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.audience.Audiences;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class PlayerItemSwitchEvent implements Listener {

    @EventHandler
    public void onItemSwitch(PlayerItemHeldEvent event){

        event.getPlayer().getInventory().setHeldItemSlot(4);

        event.getPlayer().sendActionBar(
                Component.text("Slot locked")
                        .color(NamedTextColor.RED)
        );

    }

}
