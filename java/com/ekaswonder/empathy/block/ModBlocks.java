package com.ekaswonder.empathy.block;

import com.ekaswonder.empathy.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModBlocks {
	
	// crystal blocks
	public static Block baeliz_block; // white
	public static Block nieliz_block; // light gray
	public static Block gueliz_block; // gray
	public static Block daeliz_block; // black
	public static Block brelun_block; // brown
	public static Block raegol_block; // red
	public static Block orayen_block; // orange
	public static Block jelion_block; // yellow
	public static Block larane_block; // lime
	public static Block garale_block; // green
	public static Block ciryla_block; // cyan
	public static Block buedin_block; // light blue
	public static Block brodin_block; // blue
	public static Block vieral_block; // purple
	public static Block maiera_block; // magenta
	public static Block pitera_block; // pink
	
	// tabs
	public static CreativeTabs tabEmpathyBlocks = new CreativeTabs("empathyBlocks") { // empathy blocks
		@Override public Item getTabIconItem() {
			return Item.getItemFromBlock(vieral_block);
		}
	};
	
	public static final void init() {
		GameRegistry.registerBlock(baeliz_block = new CrystalBlock("baeliz_block", Material.glass), "baeliz_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(nieliz_block = new CrystalBlock("nieliz_block", Material.glass), "nieliz_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(gueliz_block = new CrystalBlock("gueliz_block", Material.glass), "gueliz_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(daeliz_block = new CrystalBlock("daeliz_block", Material.glass), "daeliz_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(brelun_block = new CrystalBlock("brelun_block", Material.glass), "brelun_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(raegol_block = new CrystalBlock("raegol_block", Material.glass), "raegol_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(orayen_block = new CrystalBlock("orayen_block", Material.glass), "orayen_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(jelion_block = new CrystalBlock("jelion_block", Material.glass), "jelion_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(larane_block = new CrystalBlock("larane_block", Material.glass), "larane_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(garale_block = new CrystalBlock("garale_block", Material.glass), "garale_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(ciryla_block = new CrystalBlock("ciryla_block", Material.glass), "ciryla_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(buedin_block = new CrystalBlock("buedin_block", Material.glass), "buedin_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(brodin_block = new CrystalBlock("brodin_block", Material.glass), "brodin_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(vieral_block = new CrystalBlock("vieral_block", Material.glass), "vieral_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(maiera_block = new CrystalBlock("maiera_block", Material.glass), "maiera_block").setCreativeTab(ModItems.tabEmpathyItems);
		GameRegistry.registerBlock(pitera_block = new CrystalBlock("pitera_block", Material.glass), "pitera_block").setCreativeTab(ModItems.tabEmpathyItems);
	}
}
