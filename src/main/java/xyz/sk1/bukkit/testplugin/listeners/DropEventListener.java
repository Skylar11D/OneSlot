package xyz.sk1.bukkit.testplugin.listeners;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropEventListener implements Listener {

    @EventHandler
    public void onDropping(PlayerDropItemEvent e){
        Component comp = Component.text("locked!")
                .color(NamedTextColor.RED)
                .asComponent();

        if(e.getItemDrop().getItemStack().getItemMeta().displayName() == comp || e.getItemDrop().getItemStack().getType() == Material.GRAY_STAINED_GLASS_PANE) {
            e.setCancelled(true);

            e.getPlayer().sendActionBar(
                    Component.text("You can't throw a barrier")
                            .color(NamedTextColor.RED)
            );
        }

    }

}
