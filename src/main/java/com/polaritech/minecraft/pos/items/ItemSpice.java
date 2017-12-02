package com.polaritech.minecraft.pos.items;

import com.polaritech.minecraft.pos.PriceOfSpice;
import net.minecraft.item.Item;

public class ItemSpice extends Item {

    public ItemSpice() {
        setRegistryName("item_spice");
        setUnlocalizedName(PriceOfSpice.MODID + ".item_spice");
    }
}
