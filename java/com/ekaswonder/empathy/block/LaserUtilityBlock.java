package com.ekaswonder.empathy.block;

import com.ekaswonder.empathy.EmpathyTabs;
import com.ekaswonder.empathy.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class LaserUtilityBlock extends Block {

	private IIcon[] icons = new IIcon[6];
	
	protected LaserUtilityBlock(String unlocalizedName) {
		super(Material.iron);
		this.setBlockName(unlocalizedName+"Block");
		this.setCreativeTab(EmpathyTabs.empathyTab);
		this.setHardness(1.8F);
		this.setResistance(100.0F);
		this.setStepSound(soundTypeAnvil);
		this.setLightOpacity(16);
		this.setLightLevel(0.0F);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		icons[0] = reg.registerIcon(Main.MODID + ":" + "laserCutterBottom");
		icons[1] = reg.registerIcon(Main.MODID + ":" + "laserCutterTop");
		icons[2] = reg.registerIcon(Main.MODID + ":" + "laserCutterSide");
		icons[3] = reg.registerIcon(Main.MODID + ":" + "laserCutterSide");
		icons[4] = reg.registerIcon(Main.MODID + ":" + "laserCutterSide");
		icons[5] = reg.registerIcon(Main.MODID + ":" + "laserCutterSide");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[side];
	}
}