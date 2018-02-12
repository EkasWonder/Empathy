package com.ekaswonder.empathy.block;

import com.ekaswonder.empathy.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CrystalBlock extends Block {

	protected CrystalBlock(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(ModBlocks.tabEmpathyBlocks);
		this.setHardness(1.2F);
		this.setResistance(2.0F);
		this.setStepSound(soundTypeGlass);
		this.setLightOpacity(4);
		this.setLightLevel(0.1F);
		this.setHarvestLevel("pickaxe", 2);
	}
}
