package com.marco6971.AbsolutelyRandomObject.block;

import java.util.Random;

import net.minecraft.block.BlockStone;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import com.marco6971.AbsolutelyRandomObject.creativetab.CreativeTabARO;
import com.marco6971.AbsolutelyRandomObject.init.ModBlocks;

public class BlockFlag extends BlockARO{
	public BlockFlag(){
		super();
		this.setBlockName("flag");
		this.setCreativeTab(CreativeTabARO.ARO_TAB);
	}
	
    @Override
    public void updateTick(World world, int x, int y, int z, Random random){
        if(random.nextInt(10) == 0) world.playSoundEffect(x, y, z, "mob.enderdragon.wings", 1.0F, random.nextFloat() + 0.5F);
    }
	 @Override
	    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		 	world.playSoundEffect(x, y, z, "mob.enderdragon.wings", 1.0F,player.getRNG().nextFloat() + 0.5F);
	        return true;					
	    }
 }
 
