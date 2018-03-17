package com.ekaswonder.empathy.block;

import com.ekaswonder.empathy.item.EmpathyItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class EmpathyBlocks {
	
	// crystal blocks
	public static Block baelizBlock; // white
	public static Block nielizBlock; // light gray
	public static Block guelizBlock; // gray
	public static Block daelizBlock; // black
	public static Block brelunBlock; // brown
	public static Block raegolBlock; // red
	public static Block orayenBlock; // orange
	public static Block jelionBlock; // yellow
	public static Block laraneBlock; // lime
	public static Block garaleBlock; // green
	public static Block cirylaBlock; // cyan
	public static Block buedinBlock; // light blue
	public static Block brodinBlock; // blue
	public static Block vieralBlock; // purple
	public static Block maieraBlock; // magenta
	public static Block piteraBlock; // pink
	// keraline blocks
	//TODO give textures to the keraline ore
	public static Block keralineOre; // keraline ore
	//TODO give textures to the keraline block
	public static Block keralineBlock; // keraline block
	// laser utility blocks
	public static Block laserAssembler; // laser assembler
	public static Block laserInfuser; // laser infuser
	public static Block laserCutter; // laser cutter
	
	public static final void init() {
		
		// crystal blocks
		GameRegistry.registerBlock(baelizBlock = new CrystalBlock("baelizBlock"), "baelizBlock");
		GameRegistry.registerBlock(nielizBlock = new CrystalBlock("nielizBlock"), "nielizBlock");
		GameRegistry.registerBlock(guelizBlock = new CrystalBlock("guelizBlock"), "guelizBlock");
		GameRegistry.registerBlock(daelizBlock = new CrystalBlock("daelizBlock"), "daelizBlock");
		GameRegistry.registerBlock(brelunBlock = new CrystalBlock("brelunBlock"), "brelunBlock");
		GameRegistry.registerBlock(raegolBlock = new CrystalBlock("raegolBlock"), "raegolBlock");
		GameRegistry.registerBlock(orayenBlock = new CrystalBlock("orayenBlock"), "orayenBlock");
		GameRegistry.registerBlock(jelionBlock = new CrystalBlock("jelionBlock"), "jelionBlock");
		GameRegistry.registerBlock(laraneBlock = new CrystalBlock("laraneBlock"), "laraneBlock");
		GameRegistry.registerBlock(garaleBlock = new CrystalBlock("garaleBlock"), "garaleBlock");
		GameRegistry.registerBlock(cirylaBlock = new CrystalBlock("cirylaBlock"), "cirylaBlock");
		GameRegistry.registerBlock(buedinBlock = new CrystalBlock("buedinBlock"), "buedinBlock");
		GameRegistry.registerBlock(brodinBlock = new CrystalBlock("brodinBlock"), "brodinBlock");
		GameRegistry.registerBlock(vieralBlock = new CrystalBlock("vieralBlock"), "vieralBlock");
		GameRegistry.registerBlock(maieraBlock = new CrystalBlock("maieraBlock"), "maieraBlock");
		GameRegistry.registerBlock(piteraBlock = new CrystalBlock("piteraBlock"), "piteraBlock");
		// keraline blocks
		GameRegistry.registerBlock(keralineOre = new KeralineOreBlock("keralineOre", EmpathyItems.keralineFragment, 1, 9), "keralineOre");
		GameRegistry.registerBlock(keralineBlock = new CrystalBlock("keralineBlock"), "keralineBlock");
		// laser utility blocks
		GameRegistry.registerBlock(laserAssembler = new LaserUtilityBlock("laserAssembler"), "laserAssemblerBlock");
		GameRegistry.registerBlock(laserInfuser = new LaserUtilityBlock("laserInfuser"), "laserInfuserBlock");
		GameRegistry.registerBlock(laserCutter = new LaserUtilityBlock("laserCutter"), "laserCutterBlock");
		}
}
