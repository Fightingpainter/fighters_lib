package net.fightingpainter.lib.items;

import net.fightingpainter.lib.Lib;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CustomModItem {

    /*
        so this is normally how to add an item:

            public static final Item COOL_ITEM = registerItem("cool_item", new Item(new FabricItemSettings()));

        now we change it so to create a new Item:

            public static final CustomModItem COOL_ITEM = new CustomModItem("cool_item");
        
        so When we create a new item, we just need to create a new CustomModItem, and pass the name of the item as a string.
        and then if we want to change stuff about the item we can just use methods like this: (I'll add methods later for now just the registering part)

            public static final CustomModItem COOL_ITEM = new CustomModItem("cool_item");
            COOL_ITEM.set_maxStack(64);
            COOL_ITEM.set_rarity(Rarity.EPIC);

        :D
    */

    private String itemName;
    private Item item;

    public CustomModItem(String name, String modId) {
        Lib.LOGGER.info("Registering Item: " + name);
        this.itemName = name;
        this.item = Registry.register(Registries.ITEM, new Identifier(modId, name), new Item(new FabricItemSettings()));
    }

    public CustomModItem(String name) {
        Lib.LOGGER.info("Registering Item: " + name);
        this.itemName = name;
        this.item = Registry.register(Registries.ITEM, new Identifier(Lib.MOD_ID, name), new Item(new FabricItemSettings()));
    } 

    public Item getItem(){
        return this.item;
    }





}
