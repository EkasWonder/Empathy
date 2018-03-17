package com.ekaswonder.empathy.item;

import com.ekaswonder.empathy.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class EmpathyItems {
		
	// crystals
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
	// phosphor crystal
	public static Item ancientPhosphorCrystal; // ancient phosphor
	public static Item redPhosphorCrystal; // red phosphor
	public static Item greenPhosphorCrystal; // green phosphor
	public static Item bluePhosphorCrystal; // blue phosphor
	public static Item purePhosphorCrystal; // pure phosphor
	// keraline
	//TODO give a texture to the keraline fragment
	public static Item keralineFragment; // keraline fragment
	//TODO give a texture to the keraline crystal
	public static Item keralineCrystal; // keraline crystal
	
	// laser items
	public static Item controlPanel;
	public static Item laserEmitter;
	
	// methods
	public static void buildMaterialItem(String itemString) {
		Item itemObject = new Item().setUnlocalizedName(itemString).setCreativeTab(Main.empathyTab).setTextureName(Main.MODID + ":" + itemString);
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
		// keraline
		buildMaterialItem("keralineFragment");
		buildMaterialItem("keralineCrystal");
		// laser items
		buildMaterialItem("controlPanel");
		buildMaterialItem("laserEmitter");
	}	
}
