package com.marco6971.AbsolutelyRandomObject.world.gen;

import java.util.Random;

import com.marco6971.AbsolutelyRandomObject.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraftforge.fluids.FluidRegistry;

public class WorldGeneratorFlag implements IWorldGenerator {
	
	 private final WorldGenMinable flagGen = new WorldGenMinable(ModBlocks.flag1, 32);
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		int dimensionId=world.provider.dimensionId;
		if(dimensionId !=1 && dimensionId !=-1){
			
				int x= chunkX*16;
				int z= chunkZ*16;
				generateSurface(world, x, z, random);
				 
		}		
	}
	
	private void generateSurface(World world, int x,int z, Random random){
		if(random.nextInt(10)==0){
			int randX=x+random.nextInt(16);
			int randZ=z+random.nextInt(16);
			int randY=world.getHeightValue(randX, randZ);
			if (world.getBlock(randX, randY, randZ)!= Blocks.water && world.getBlock(randX, randY, randZ)!= Blocks.lava){
				generateFlag(world,randX,randY,randZ);
			}
		}
	    for(int i = 0; i < 5; i++) {
            int randX = x + random.nextInt(16);
            int randY = 20 + random.nextInt(40);
            int randZ = z + random.nextInt(16);
            flagGen.generate(world, random, randX, randY, randZ);
        }
	}
	private void generateFlag(World world, int x, int y, int z){
		for(int i=0; i<10; i++){
			world.setBlock(x,y+i,z,Blocks.fence,0,2);
		}
		for (int ix=0; ix<5; ix++){
			for(int iy=0;iy<3;iy++){
				world.setBlock(x+ix+1,y+7+iy,z,ModBlocks.flag);
			}
		
		}
	}
}
