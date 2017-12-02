package com.polaritech.minecraft.pos.blocks;

import com.polaritech.minecraft.pos.PriceOfSpice;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSpice extends Block {

    public BlockSpice() {
        super(Material.LEAVES);
        setRegistryName("block_spice");
        setUnlocalizedName(PriceOfSpice.MODID + ".block_spice");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this),
                0, new ModelResourceLocation(getRegistryName(),
                        "inventory"));
    }
}
