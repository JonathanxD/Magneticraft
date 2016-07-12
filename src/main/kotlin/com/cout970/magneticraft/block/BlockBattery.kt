package com.cout970.magneticraft.block

import com.cout970.magneticraft.Magneticraft
import com.cout970.magneticraft.tileentity.electric.TileBattery
import net.minecraft.block.ITileEntityProvider
import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraft.tileentity.TileEntity
import net.minecraft.util.EnumFacing
import net.minecraft.util.EnumHand
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

/**
 * Created by cout970 on 11/07/2016.
 */
object BlockBattery : BlockBase(Material.IRON, "block_battery"), ITileEntityProvider {

    override fun isFullBlock(state: IBlockState?) = false
    override fun isOpaqueCube(state: IBlockState?) = false
    override fun isFullCube(state: IBlockState?) = false
    override fun isVisuallyOpaque() = false

    override fun createNewTileEntity(worldIn: World?, meta: Int): TileEntity = TileBattery()

    override fun onBlockActivated(worldIn: World?, pos: BlockPos?, state: IBlockState?, playerIn: EntityPlayer?, hand: EnumHand?, heldItem: ItemStack?, side: EnumFacing?, hitX: Float, hitY: Float, hitZ: Float): Boolean {
        if (worldIn!!.isRemote) return true
        pos!!
        playerIn?.openGui(Magneticraft, -1, worldIn, pos.x, pos.y, pos.z)
        return true
    }
}