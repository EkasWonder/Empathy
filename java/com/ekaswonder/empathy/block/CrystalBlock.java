package com.ekaswonder.empathy.block;

import com.ekaswonder.empathy.EmpathyTabs;
import com.ekaswonder.empathy.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CrystalBlock extends Block {

	protected CrystalBlock(String unlocalizedName) {
		super(Material.glass);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(EmpathyTabs.empathyTab);
		this.slipperiness = (1.1F);
		this.setHardness(1.2F);
		this.setResistance(2.0F);
		this.setStepSound(soundTypeGlass);
		this.setLightOpacity(4);
		//this.setLightLevel(0.0F);
		this.setHarvestLevel("pickaxe", 2);	
	}
	
	/*@SideOnly(Side.CLIENT)
    public int getRenderBlockPass() {
        return 1;
    }
	
	@SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side) {
        return super.shouldSideBeRendered(blockAccess, x, y, z, 1 - side);
    }*/
}
