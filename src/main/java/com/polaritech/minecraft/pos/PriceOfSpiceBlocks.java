package com.polaritech.minecraft.pos;

import com.polaritech.minecraft.pos.blocks.BlockSpice;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PriceOfSpiceBlocks {

    @GameRegistry.ObjectHolder("pos:block_spice")
    public static BlockSpice blockSpice;

    @SideOnly(Side.CLIENT)
    public static void initModels() {

    }
}