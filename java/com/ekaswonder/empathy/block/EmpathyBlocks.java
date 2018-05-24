package com.ekaswonder.empathy.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class EmpathyBlocks {
	
	/** White crystal block */
	public static Block baelizBlock;
	/** Light gray crystal block */
	public static Block nielizBlock;
	/** Gray crystal block */
	public static Block guelizBlock;
	/** Black crystal block */
	public static Block daelizBlock;
	/** Brown crystal block */
	public static Block brelunBlock;
	/** Red crystal block */
	public static Block raegolBlock;
	/** Orange crystal block */
	public static Block orayenBlock;
	/** Yellow crystal block */
	public static Block jelionBlock;
	/** Lime crystal block */
	public static Block laraneBlock;
	/** Green crystal block */
	public static Block garaleBlock;
	/** Cyan crystal block */
	public static Block cirylaBlock;
	/** Light blue crystal block */
	public static Block buedinBlock;
	/** Blue crystal block */
	public static Block brodinBlock;
	/** Purple crystal block */
	public static Block vieralBlock;
	/** Magenta crystal block */
	public static Block maieraBlock;
	/** Pink crystal block */
	public static Block piteraBlock;
	
	/** Keraline ore block */
	public static Block keralineOre; // keraline ore
	/** Keraline crystal block */
	public static Block keralineBlock; // keraline block
	
	/** Laser assembler utility block, assembles items into blocks */
	public static Block laserAssembler; // laser assembler
	/** Laser infuser utility block, infuses keraline into crystals */
	public static Block laserInfuser; // laser infuser
	/** Laser cutter utility, cuts crystals into charms and other useful items */
	public static Block laserCutter; // laser cutter
	
	/**
	 * Registers blocks in the game registry
	 * @author EkasWonder
	 * @since 1.7.10-0.4
	 */
	public static final void init() {
		
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
		
		GameRegistry.registerBlock(keralineOre = new KeralineOreBlock(0), "keralineOre");
		GameRegistry.registerBlock(keralineOre = new KeralineOreBlock(1), "keralineNetherOre");
		GameRegistry.registerBlock(keralineBlock = new CrystalBlock("keralineBlock"), "keralineBlock");
		
		GameRegistry.registerBlock(laserAssembler = new LaserUtilityBlock("laserAssembler"), "laserAssemblerBlock");
		GameRegistry.registerBlock(laserInfuser = new LaserUtilityBlock("laserInfuser"), "laserInfuserBlock");
		GameRegistry.registerBlock(laserCutter = new LaserUtilityBlock("laserCutter"), "laserCutterBlock");
		}
}
