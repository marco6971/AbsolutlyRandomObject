package com.marco6971.AbsolutelyRandomObject.init;

import com.marco6971.AbsolutelyRandomObject.block.BlockARO;
import com.marco6971.AbsolutelyRandomObject.block.BlockFlag;
import com.marco6971.AbsolutelyRandomObject.block.BlockFlag1;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static final BlockARO flag = new BlockFlag();
	public static final BlockARO flag1 = new BlockFlag1();
	public static void init(){
		GameRegistry.registerBlock(flag, "flag");
		GameRegistry.registerBlock(flag1, "flag1");
	}
}
