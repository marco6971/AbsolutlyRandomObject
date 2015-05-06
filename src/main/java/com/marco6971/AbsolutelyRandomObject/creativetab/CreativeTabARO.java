package com.marco6971.AbsolutelyRandomObject.creativetab;

import com.marco6971.AbsolutelyRandomObject.Reference.Reference;
import com.marco6971.AbsolutelyRandomObject.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class CreativeTabARO {
	 
	public static final CreativeTabs ARO_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
		@Override
		public Item getTabIconItem() {
			return ModItems.erpene;
		}
	};
}
