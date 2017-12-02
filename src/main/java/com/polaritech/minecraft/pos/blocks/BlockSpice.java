package com.polaritech.minecraft.pos.blocks;

import com.polaritech.minecraft.pos.PriceOfSpice;
import com.polaritech.minecraft.pos.PriceOfSpiceItems;
import com.polaritech.minecraft.pos.items.ItemSpice;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
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

    @GameRegistry.ObjectHolder("pos:christmas_music")
    public static SoundEvent musicSound;

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
                                    EnumFacing side, float hitX, float hitY, float hitZ) {
        player.addItemStackToInventory(new ItemStack(PriceOfSpiceItems.itemSpice));
        world.playSound(player, pos, musicSound, SoundCategory.MUSIC, 1, 1);
        return true;
    }
}
