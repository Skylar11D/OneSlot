package xyz.sk1.bukkit.testplugin.utils.player;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import xyz.sk1.bukkit.testplugin.utils.builder.ItemStackBuilder;

public interface PaperPlayer {

    Player getPlayer();

    default void showActionBar(Audience audience){
//        IChatBaseComponent icbc = IChatBaseComponent.ChatSerializer.a("{\"text\":\""+title+"\"}");
//        PacketPlayOutChat packet = new PacketPlayOutChat(icbc, (byte)2);
//
//        ((CraftPlayer)getPlayer()).getHandle().playerConnection.sendPacket(packet);

        audience.sendActionBar(
                Component.text("Slot locked").color(NamedTextColor.RED)
        );

    }

    default void populateInventory(){
        Inventory inv = getPlayer().getInventory();
        ItemStack item = new ItemStackBuilder(Material.GRAY_STAINED_GLASS_PANE)
                .putName(
                        Component.text("locked!")
                                .color(NamedTextColor.RED)
                                .asComponent()
                )
                .build();

        for(int x=0;x<inv.getSize();x++){

            if(x == 4 || x == 40) {
                inv.setItem(x, null);
                continue;
            }

            inv.setItem(x, item);
        }
    }

}
