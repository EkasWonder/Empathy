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
	
	// constructors
		// constructItem constructs an Item and puts it in a CreativeTabs with a texture
			// itemName is the Item to construct
			// itemTab is the tab to put the Item in
	public static void constructItem(String itemString, CreativeTabs itemTab) {
		Item itemObject = new Item().setUnlocalizedName(itemString).setCreativeTab(itemTab).setTextureName(Main.MODID + ":" + itemString);
		GameRegistry.registerItem(itemObject, itemString);
	}
	
	public static final void init() {
		
		// crystal items
		constructItem("baeliz_crystal", tabEmpathyItems);		
		constructItem("nieliz_crystal", tabEmpathyItems);
		constructItem("gueliz_crystal", tabEmpathyItems);
		constructItem("daeliz_crystal", tabEmpathyItems);
		constructItem("brelun_crystal", tabEmpathyItems);
		constructItem("raegol_crystal", tabEmpathyItems);
		constructItem("orayen_crystal", tabEmpathyItems);
		constructItem("jelion_crystal", tabEmpathyItems);
		constructItem("larane_crystal", tabEmpathyItems);
		constructItem("garale_crystal", tabEmpathyItems);
		constructItem("ciryla_crystal", tabEmpathyItems);
		constructItem("buedin_crystal", tabEmpathyItems);
		constructItem("brodin_crystal", tabEmpathyItems);
		constructItem("vieral_crystal", tabEmpathyItems);
		constructItem("maiera_crystal", tabEmpathyItems);
		constructItem("pitera_crystal", tabEmpathyItems);
	}
	
}
