package com.polaritech.minecraft.pos.proxy;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import com.polaritech.minecraft.pos.PriceOfSpiceBlocks;
import com.polaritech.minecraft.pos.PriceOfSpiceItems;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @SubscribeEvent
    public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
        ResourceLocation location = new ResourceLocation("pos", "christmas_music");
        SoundEvent sound = new SoundEvent(location).setRegistryName(location);
        event.getRegistry().register(sound);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        PriceOfSpiceItems.initModels();
        PriceOfSpiceBlocks.initModels();
    }
}