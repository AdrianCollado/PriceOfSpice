package com.polaritech.minecraft.pos;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = PriceOfSpice.ID, version = PriceOfSpice.VERSION)
public class PriceOfSpice {
    public static final String ID = "pos";
    public static final String Version = "0.0.1-0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("PriceOfSpice - Price of Spice");
    }
}