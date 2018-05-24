package com.ekaswonder.empathy.block;

import com.ekaswonder.empathy.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CrystalBlock extends Block {

	/**
	 * Builds a crystal block out of a given name.
	 * @param unlocalizedName code name for the crystal block
	 * @author EkasWonder
	 * @since 1.7.10-0.4 
	 */
	protected CrystalBlock(String unlocalizedName) {
		super(Material.glass);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(Main.empathyTab);
		//this.slipperiness = (1.1F);
		this.setHardness(1.2F);
		this.setResistance(2.0F);
		this.setStepSound(soundTypeGlass);
		this.setLightOpacity(4);
		this.setHarvestLevel("pickaxe", 2);	
	}
}