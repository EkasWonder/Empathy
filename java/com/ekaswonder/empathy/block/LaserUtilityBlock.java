package com.ekaswonder.empathy.block;

import com.ekaswonder.empathy.EmpathyTabs;
import com.ekaswonder.empathy.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LaserUtilityBlock extends Block {

	protected LaserUtilityBlock(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(EmpathyTabs.empathyTab);
		this.setHardness(1.8F);
		this.setResistance(100.0F);
		this.setStepSound(soundTypeAnvil);
		this.setLightOpacity(16);
		this.setLightLevel(0.0F);
		this.setHarvestLevel("pickaxe", 2);
	}
}