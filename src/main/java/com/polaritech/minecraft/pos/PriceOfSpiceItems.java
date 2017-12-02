package com.polaritech.minecraft.pos;

import com.polaritech.minecraft.pos.items.ItemSpice;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PriceOfSpiceItems {

    @GameRegistry.ObjectHolder("pos:item_spice")
    public static ItemSpice itemSpice;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemSpice.initModel();
    }
}
