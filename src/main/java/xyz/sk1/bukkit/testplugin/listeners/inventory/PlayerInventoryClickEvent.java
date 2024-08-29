package xyz.sk1.bukkit.testplugin.listeners.inventory;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PlayerInventoryClickEvent implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event){
        if(event.getSlot() != 4) {
            event.setResult(Event.Result.DENY);

            event.getWhoClicked().sendActionBar(
                    Component.text("You are not allowed to move an item outside your available slot")
                            .color(NamedTextColor.RED)
            );
        }

    }
}
