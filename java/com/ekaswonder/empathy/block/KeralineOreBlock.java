package com.ekaswonder.empathy.block;

import java.util.Random;

import com.ekaswonder.empathy.Main;
import com.ekaswonder.empathy.item.EmpathyItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class KeralineOreBlock extends Block {
	
	/** The item dropped by the ore block */
	private Item drop;
	/** The drop's metadata */
	private int meta;
	/** The least drops you can get from one ore block */
	private int least_quantity;
	/** The most drops you can get from one ore block */
	private int most_quantity;
	
	/**
	 * Builds a keraline ore block with the required parameters
	 * @param world The world to generate the ore block in
	 * @author EkasWonder
	 * @since 1.7.10-0.5
	 */
	protected KeralineOreBlock(int world) {
		super(Material.rock);
		this.drop = EmpathyItems.keralineFragment;
		this.least_quantity = 3;
		this.most_quantity = 7;
		this.setBlockName("keralineOre");
		if (world == 0) {
			this.setBlockTextureName(Main.MODID + ":" + "keralineOre");
		} else if (world == 1) {
			this.setBlockTextureName(Main.MODID + ":" + "keralineNetherOre");
		} else {
			this.setBlockTextureName(Main.MODID + ":" + "keralineEndOre");
		}
		this.setCreativeTab(Main.empathyTab);
		this.setHardness(5.6F);
		this.setResistance(200.0F);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	/**
	 * Gives the block an item to drop
	 * @return The item to drop
	 * @author Azurelan
	 * @since 1.7.10-0.5
	 */
	public Item getItemDropped(int meta, Random random, int fortune) {
		return this.drop;
	}
	
	/**
	 * Gives the block the meta of the item to drop
	 * @author EkasWonder
	 * @since 1.7.10-0.5
	 */
	public int damageDropped(int metadata) {
		return this.meta;
	}
	
	/**
	 * Gives the block a quantity to drop
	 * @author Azurelan
	 * @author EkasWonder
	 * @since 1.7.10-0.5
	 */
	public int quantityDropped(int meta, int fortune, Random random) {
		if (this.least_quantity >= this.most_quantity) {
			return this.least_quantity;
		} else {
			return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
		}
	}
}
