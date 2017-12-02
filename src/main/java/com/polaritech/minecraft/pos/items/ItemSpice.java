package com.polaritech.minecraft.pos.items;

import com.polaritech.minecraft.pos.PriceOfSpice;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSpice extends Item {

    public ItemSpice() {
        setRegistryName("item_spice");
        setUnlocalizedName(PriceOfSpice.MODID + ".item_spice");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this,
                0, new ModelResourceLocation(getRegistryName(),
                        "inventory"));
    }
}
