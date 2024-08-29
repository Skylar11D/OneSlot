package xyz.sk1.bukkit.testplugin.utils.builder;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemStackBuilder {

    private ItemStack item;

    public ItemStackBuilder(Material material){
        item = new ItemStack(material);
    }

    public ItemStackBuilder(Material material, int quantity){
        item = new ItemStack(material, quantity);
    }

    public ItemStackBuilder(Material material, int quantity, short durability){
        item = new ItemStack(material, quantity, durability);
    }

    public ItemStackBuilder putName(Component name){
        ItemMeta meta = item.getItemMeta();

        meta.displayName(name);
        item.setItemMeta(meta);

        return this;
    }

    public ItemStack build(){
        return item;
    }

}
