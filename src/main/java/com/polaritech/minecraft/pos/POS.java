package com.polaritech.minecraft.pos;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = POS.ID, version = POS.VERSION)
public class POS {
    public static final String ID = "pos";
    public static final String Version = "0.0.1-0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("POS - Price of Spice");
    }
}