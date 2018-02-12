package com.ekaswonder.empathy.item;

import com.ekaswonder.empathy.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems {
		
	// crystal items
	public static Item baeliz_crystal; // white
	public static Item nieliz_crystal; // light gray
	public static Item gueliz_crystal; // gray
	public static Item daeliz_crystal; // black
	public static Item brelun_crystal; // brown
	public static Item raegol_crystal; // red
	public static Item orayen_crystal; // orange
	public static Item jelion_crystal; // yellow
	public static Item larane_crystal; // lime
	public static Item garale_crystal; // green
	public static Item ciryla_crystal; // cyan
	public static Item buedin_crystal; // light blue
	public static Item brodin_crystal; // blue
	public static Item vieral_crystal; // purple
	public static Item maiera_crystal; // magenta
	public static Item pitera_crystal; // pink

	// tabs
	public static final CreativeTabs tabEmpathyItems = new CreativeTabs("empathyItems") { // empathy items
		@Override public Item getTabIconItem() {
			return vieral_crystal;
		}
	};
	
	// methods
		// buildItem builds an Item and puts it in a CreativeTabs with a texture
			// itemName is the Item to build
			// itemTab is the tab to put the Item in
	public static void buildItem(String itemString, CreativeTabs itemTab) {
		Item itemObject = new Item().setUnlocalizedName(itemString).setCreativeTab(itemTab).setTextureName(Main.MODID + ":" + itemString);
		GameRegistry.registerItem(itemObject, itemString);
	}
	
	public static final void init() {
		
		// crystal items
		buildItem("baeliz_crystal", tabEmpathyItems);		
		buildItem("nieliz_crystal", tabEmpathyItems);
		buildItem("gueliz_crystal", tabEmpathyItems);
		buildItem("daeliz_crystal", tabEmpathyItems);
		buildItem("brelun_crystal", tabEmpathyItems);
		buildItem("raegol_crystal", tabEmpathyItems);
		buildItem("orayen_crystal", tabEmpathyItems);
		buildItem("jelion_crystal", tabEmpathyItems);
		buildItem("larane_crystal", tabEmpathyItems);
		buildItem("garale_crystal", tabEmpathyItems);
		buildItem("ciryla_crystal", tabEmpathyItems);
		buildItem("buedin_crystal", tabEmpathyItems);
		buildItem("brodin_crystal", tabEmpathyItems);
		buildItem("vieral_crystal", tabEmpathyItems);
		buildItem("maiera_crystal", tabEmpathyItems);
		buildItem("pitera_crystal", tabEmpathyItems);
	}
	
}
