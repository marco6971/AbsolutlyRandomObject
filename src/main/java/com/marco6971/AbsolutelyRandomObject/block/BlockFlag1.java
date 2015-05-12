package com.marco6971.AbsolutelyRandomObject.block;

import com.marco6971.AbsolutelyRandomObject.creativetab.CreativeTabARO;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockFlag1 extends BlockARO{
	public BlockFlag1(){
		super(Material.glass);
		this.setBlockName("flag1");
		this.setCreativeTab(CreativeTabARO.ARO_TAB);
	}
	
}

