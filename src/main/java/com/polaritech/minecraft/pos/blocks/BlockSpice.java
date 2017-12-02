package com.polaritech.minecraft.pos.blocks;

import com.polaritech.minecraft.pos.PriceOfSpice;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSpice extends Block {

    public BlockSpice() {
        super(Material.LEAVES);
        setRegistryName("block_spice");
        setUnlocalizedName(PriceOfSpice.MODID + ".block_spice");
    }
}
