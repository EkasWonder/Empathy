package com.ekaswonder.empathy.item;

import com.ekaswonder.empathy.EmpathyTabs;
import com.ekaswonder.empathy.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class ModItems {
		
	// crystal items
	public static Item baelizCrystal; // white
	public static Item nielizCrystal; // light gray
	public static Item guelizCrystal; // gray
	public static Item daelizCrystal; // black
	public static Item brelunCrystal; // brown
	public static Item raegolCrystal; // red
	public static Item orayenCrystal; // orange
	public static Item jelionCrystal; // yellow
	public static Item laraneCrystal; // lime
	public static Item garaleCrystal; // green
	public static Item cirylaCrystal; // cyan
	public static Item buedinCrystal; // light blue
	public static Item brodinCrystal; // blue
	public static Item vieralCrystal; // purple
	public static Item maieraCrystal; // magenta
	public static Item piteraCrystal; // pink
	//TODO initialize the keraline item
	
	// methods
	public static void buildMaterialItem(String itemString) {
		Item itemObject = new Item().setUnlocalizedName(itemString).setCreativeTab(EmpathyTabs.empathyTab).setTextureName(Main.MODID + ":" + itemString);
		GameRegistry.registerItem(itemObject, itemString);
	}
	
	public static final void init() {
		
		// crystal items
		buildMaterialItem("baelizCrystal");		
		buildMaterialItem("nielizCrystal");
		buildMaterialItem("guelizCrystal");
		buildMaterialItem("daelizCrystal");
		buildMaterialItem("brelunCrystal");
		buildMaterialItem("raegolCrystal");
		buildMaterialItem("orayenCrystal");
		buildMaterialItem("jelionCrystal");
		buildMaterialItem("laraneCrystal");
		buildMaterialItem("garaleCrystal");
		buildMaterialItem("cirylaCrystal");
		buildMaterialItem("buedinCrystal");
		buildMaterialItem("brodinCrystal");
		buildMaterialItem("vieralCrystal");
		buildMaterialItem("maieraCrystal");
		buildMaterialItem("piteraCrystal");
		//TODO create the keraline item
	}	
}
