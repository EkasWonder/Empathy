package com.ekaswonder.empathy.block;

import java.util.Random;

import com.ekaswonder.empathy.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class KeralineOreBlock extends Block {
	
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	protected KeralineOreBlock(String unlocalizedName, Item drop, int least_quantity, int most_quantity) {
		super(Material.rock);
		this.drop = drop;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + "keralineOre");
		this.setCreativeTab(Main.empathyTab);
		this.setHardness(5.6F);
		this.setResistance(200.0F);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		return this.drop;
	}
	
	@Override
	public int damageDropped(int metadata) {
		return this.meta;
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		if (this.least_quantity >= this.most_quantity) {
			return this.least_quantity;
		} else {
			return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
		}
	}
}
