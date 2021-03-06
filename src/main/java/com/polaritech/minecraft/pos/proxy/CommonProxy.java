package com.polaritech.minecraft.pos.proxy;

import com.polaritech.minecraft.pos.PriceOfSpice;
import com.polaritech.minecraft.pos.PriceOfSpiceBlocks;
import com.polaritech.minecraft.pos.blocks.BlockSpice;
import com.polaritech.minecraft.pos.items.ItemSpice;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.polaritech.minecraft.pos.Config;

import java.io.File;


@Mod.EventBusSubscriber
public class CommonProxy {

    public static Configuration config;

    public void preInit(FMLPreInitializationEvent event) {
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getParent(), "pos.cfg"));
        Config.readConfig();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {
        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockSpice());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemSpice());
        event.getRegistry().register(new ItemBlock(PriceOfSpiceBlocks.blockSpice).setRegistryName(PriceOfSpiceBlocks.blockSpice.getRegistryName()));
    }
}