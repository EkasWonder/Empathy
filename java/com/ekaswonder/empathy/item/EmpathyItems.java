package com.ekaswonder.empathy.item;

import com.ekaswonder.empathy.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class EmpathyItems {
		
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

	public static Item auraPhosphorCrystal;
	public static Item massPhosphorCrystal;

	public static Item keralineFragment;
	public static Item keralinePiece;

	public static Item controlPanel;
	public static Item laserEmitter;
	
	// methods
	public static void buildMaterialItem(String itemString) {
		Item itemObject = new Item().setUnlocalizedName(itemString).setCreativeTab(Main.empathyTab).setTextureName(Main.MODID + ":" + itemString);
		GameRegistry.registerItem(itemObject, itemString);
	}
	
	public static final void init() {
		
		buildMaterialItem("baelizCrystal");	// white	
		buildMaterialItem("nielizCrystal"); // light gray
		buildMaterialItem("guelizCrystal"); // gray
		buildMaterialItem("daelizCrystal"); // black
		buildMaterialItem("brelunCrystal"); // brown
		buildMaterialItem("raegolCrystal"); // red
		buildMaterialItem("orayenCrystal"); // orange
		buildMaterialItem("jelionCrystal"); // yellow
		buildMaterialItem("laraneCrystal"); // lime
		buildMaterialItem("garaleCrystal"); // green
		buildMaterialItem("cirylaCrystal"); // cyan
		buildMaterialItem("buedinCrystal"); // light blue
		buildMaterialItem("brodinCrystal"); // blue
		buildMaterialItem("vieralCrystal"); // purple
		buildMaterialItem("maieraCrystal"); // magenta
		buildMaterialItem("piteraCrystal"); // pink

		buildMaterialItem("auraPhosphorCrystal");
		buildMaterialItem("massPhosphorCrystal");
		
		buildMaterialItem("keralineFragment");
		buildMaterialItem("keralinePiece");

		buildMaterialItem("controlPanel");
		buildMaterialItem("laserEmitter");
	}	
}
