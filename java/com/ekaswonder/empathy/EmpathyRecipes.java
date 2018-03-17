package com.ekaswonder.empathy;

import com.ekaswonder.empathy.block.EmpathyBlocks;
import com.ekaswonder.empathy.item.EmpathyItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EmpathyRecipes {
	
	public static final void buildCrystal(Item item, int dye) {
		GameRegistry.addRecipe(new ItemStack(item),
			new Object[] {"DDD", "DKD", "DDD",
				'D', new ItemStack(Items.dye, 1, dye),
				'K', new ItemStack(EmpathyItems.keralineCrystal)
			}
		);
	}
	
	public static void init() {
		// ingredients
		GameRegistry.addRecipe(new ItemStack(EmpathyItems.controlPanel),
			new Object[] {"LLL", "SRS", "III",
				'S', new ItemStack(Blocks.stone_button),
				'L', new ItemStack(Blocks.lever),
				'I', new ItemStack(Blocks.heavy_weighted_pressure_plate),
				'R', new ItemStack(Blocks.redstone_block)
			}
		);
		// laser utility blocks
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.laserAssembler), // compact and deconstruct
			new Object[] {"ICI", "P P", "SSS",
				'I', new ItemStack(Items.iron_ingot),
				'C', new ItemStack(EmpathyItems.controlPanel),
				'P', new ItemStack(Blocks.piston),
				'S', new ItemStack(Blocks.stone)
			}
		);
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.laserInfuser), // improve and evolve
			new Object[] {"IXI", "GBG", "RWR",
				'I', new ItemStack(Items.iron_ingot),
				'X', new ItemStack(EmpathyItems.controlPanel),
				'G', new ItemStack(Blocks.glass),
				'B', new ItemStack(Blocks.iron_bars),
				'R', new ItemStack(Blocks.gravel),
				'W', new ItemStack(Blocks.wool)
			}
		);
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.laserCutter), // reshape and create
			new Object[] {"IXI", "IDI", "GPG",
				'I', new ItemStack(Items.iron_ingot),
				'X', new ItemStack(EmpathyItems.controlPanel),
				'D', new ItemStack(Items.diamond),
				'G', new ItemStack(Items.gold_ingot),
				'P', new ItemStack(Blocks.heavy_weighted_pressure_plate)
			}
		);
		// keraline+dye to crystal (to be infuser-only)
		buildCrystal((Item)EmpathyItems.baelizCrystal, 15);
		buildCrystal((Item)EmpathyItems.nielizCrystal, 7);
		buildCrystal((Item)EmpathyItems.guelizCrystal, 8);
		buildCrystal((Item)EmpathyItems.daelizCrystal, 0);
		buildCrystal((Item)EmpathyItems.brelunCrystal, 3);
		buildCrystal((Item)EmpathyItems.raegolCrystal, 1);
		buildCrystal((Item)EmpathyItems.orayenCrystal, 14);
		buildCrystal((Item)EmpathyItems.jelionCrystal, 11);
		buildCrystal((Item)EmpathyItems.laraneCrystal, 10);
		buildCrystal((Item)EmpathyItems.garaleCrystal, 2);
		buildCrystal((Item)EmpathyItems.cirylaCrystal, 6);
		buildCrystal((Item)EmpathyItems.buedinCrystal, 12);
		buildCrystal((Item)EmpathyItems.brodinCrystal, 4);
		buildCrystal((Item)EmpathyItems.vieralCrystal, 5);
		buildCrystal((Item)EmpathyItems.maieraCrystal, 13);
		buildCrystal((Item)EmpathyItems.piteraCrystal, 9);
		// crystal to crystal block (to be assembler-only)
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.baelizBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.baelizCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.nielizBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.nielizCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.guelizBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.guelizCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.daelizBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.daelizCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.brelunBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.brelunCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.raegolBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.raegolCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.orayenBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.orayenCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.jelionBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.jelionCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.laraneBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.laraneCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.garaleBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.garaleCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.cirylaBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.cirylaCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.buedinBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.buedinCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.brodinBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.brodinCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.vieralBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.vieralCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.maieraBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.maieraCrystal)});
		GameRegistry.addRecipe(new ItemStack(EmpathyBlocks.piteraBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(EmpathyItems.piteraCrystal)});
		// crystal block to crystal (to be assembler-only)
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.baelizCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.baelizBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.nielizCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.nielizBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.guelizCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.guelizBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.daelizCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.daelizBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.brelunCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.brelunBlock)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.raegolCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.raegolBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.orayenCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.orayenBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.jelionCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.jelionBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.laraneCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.laraneBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.garaleCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.garaleBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.cirylaCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.cirylaBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.buedinCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.buedinBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.brodinCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.brodinBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.vieralCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.vieralBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.maieraCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.maieraBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(EmpathyItems.piteraCrystal, 9), new Object[] {new ItemStack(EmpathyBlocks.piteraBlock)});
	}
}
