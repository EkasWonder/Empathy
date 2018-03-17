package com.ekaswonder.empathy.block;

import com.ekaswonder.empathy.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class LaserUtilityBlock extends Block {

	private IIcon[] icons = new IIcon[6];
	private String unlocalizedName;
	
	protected LaserUtilityBlock(String unlocalizedName) {
		super(Material.iron);
		this.setBlockName(unlocalizedName+"Block");
		this.setCreativeTab(Main.empathyTab);
		this.setHardness(1.8F);
		this.setResistance(100.0F);
		this.setStepSound(soundTypeAnvil);
		this.setLightOpacity(16);
		this.setLightLevel(0.0F);
		this.unlocalizedName = unlocalizedName;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		icons[0] = reg.registerIcon(Main.MODID + ":" + "laserUtilityBlockBottom");
		icons[1] = reg.registerIcon(Main.MODID + ":" + "laserUtilityBlockTop");
		icons[2] = reg.registerIcon(Main.MODID + ":" + unlocalizedName + "Side");
		icons[3] = reg.registerIcon(Main.MODID + ":" + "laserUtilityBlockSide");
		icons[4] = reg.registerIcon(Main.MODID + ":" + "laserUtilityBlockSide");
		icons[5] = reg.registerIcon(Main.MODID + ":" + "laserUtilityBlockSide");
		/* missing textures
		laserUtilityBlockTop
		laserUtilityBlockSide
		laserUtilityBlockBottom
		laserAssemblerBlockSide
		laserInfuserBlockSide
		laserCutterBlockSide
		*/
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[side];
	}
}