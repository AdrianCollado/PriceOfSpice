package com.polaritech.minecraft.pos;

import com.polaritech.minecraft.pos.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = PriceOfSpice.MODID, name = PriceOfSpice.MODNAME, version = PriceOfSpice.VERSION)
public class PriceOfSpice {

    public static final String MODID = "pos";
    public static final String MODNAME = "Price Of Spice";
    public static final String VERSION = "0.0.1-0";

    @SidedProxy(clientSide = "com.polaritech.minecraft.pos.proxy.ClientProxy",
            serverSide = "com.polaritech.minecraft.pos.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static PriceOfSpice instance;

    public static org.apache.logging.log4j.Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        System.out.println("PriceOfSpice - Price of Spice");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event){

    }
}