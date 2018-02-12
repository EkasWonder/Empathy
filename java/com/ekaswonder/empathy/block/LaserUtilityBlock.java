package com.ekaswonder.empathy.block;

import com.ekaswonder.empathy.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class LaserUtilityBlock extends Block {

	protected LaserUtilityBlock(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(ModBlocks.tabEmpathyBlocks);
		this.setHardness(1.8F);
		this.setResistance(100.0F);
		this.setStepSound(soundTypeAnvil);
		this.setLightOpacity(16);
		this.setLightLevel(0.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.isBlockContainer = true;
	}
	
	public IIcon[] icons = new IIcon[6];

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.icons[0] = reg.registerIcon(this.textureName + "_" + "bottom");
		this.icons[1] = reg.registerIcon(this.textureName + "_" + "top");
		this.icons[2] = reg.registerIcon(this.textureName + "_" + "side");
		this.icons[3] = reg.registerIcon(this.textureName + "_" + "side");
		this.icons[4] = reg.registerIcon(this.textureName + "_" + "side");
		this.icons[5] = reg.registerIcon(this.textureName + "_" + "side");
	}
	@Override
	public IIcon getIcon(int side, int meta) {
		return this.icons[side];
	}
}