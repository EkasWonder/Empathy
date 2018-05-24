package com.ekaswonder.empathy.block;

import com.ekaswonder.empathy.Main;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class LaserUtilityBlock extends BlockContainer {

	/** Contains the textures of the block */
	private IIcon[] icons = new IIcon[6];
	/** Used to list the block's textures correctly */
	private String unlocalizedNameSide;
	
	/**
	 * Builds a laser utility block with the required parameters
	 * @param unlocalizedName code name for the laser utility block
	 * @author EkasWonder
	 * @since 1.7.10-0.6
	 */
	protected LaserUtilityBlock(String unlocalizedName) {
		super(Material.iron);
		this.setBlockName(unlocalizedName+"Block");
		this.setCreativeTab(Main.empathyTab);
		this.setHardness(1.8F);
		this.setResistance(100.0F);
		this.setStepSound(soundTypeAnvil);
		this.setLightOpacity(16);
		this.setLightLevel(0.0F);
		this.unlocalizedNameSide = unlocalizedName + "BlockSide";
	}
	
	/**
	 * Registers a texture for each side of the block
	 * @author EkasWonder
	 * @since 1.7.10-0.6
	 */
	public void registerBlockIcons(IIconRegister reg) {
		icons[0] = reg.registerIcon(Main.MODID + ":" + "laserUtilityBlockBottom");
		icons[1] = reg.registerIcon(Main.MODID + ":" + "laserUtilityBlockTop");
		icons[2] = reg.registerIcon(Main.MODID + ":" + unlocalizedNameSide);
		icons[3] = reg.registerIcon(Main.MODID + ":" + unlocalizedNameSide);
		icons[4] = reg.registerIcon(Main.MODID + ":" + "laserUtilityBlockSide");
		icons[5] = reg.registerIcon(Main.MODID + ":" + "laserUtilityBlockSide");
	}
	
	/**
	 * Returns the icon's textures
	 * @author EkasWonder
	 * @since 1.7.10-0.6
	 */
	public IIcon getIcon(int side, int meta) {
		return icons[side];
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO Auto-generated method stub
		return null;
	}
}