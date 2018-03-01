package com.ekaswonder.empathy;

import com.ekaswonder.empathy.block.ModBlocks;
import com.ekaswonder.empathy.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class EmpathyRecipes {

	public static void init() {
		// crystal blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.baelizBlock), "CCC", "CCC", "CCC", 'C', ModItems.baelizCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.nielizBlock), "CCC", "CCC", "CCC", 'C', ModItems.nielizCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.guelizBlock), "CCC", "CCC", "CCC", 'C', ModItems.guelizCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.daelizBlock), "CCC", "CCC", "CCC", 'C', ModItems.daelizCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.brelunBlock), "CCC", "CCC", "CCC", 'C', ModItems.brelunCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.raegolBlock), "CCC", "CCC", "CCC", 'C', ModItems.raegolCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.orayenBlock), "CCC", "CCC", "CCC", 'C', ModItems.orayenCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.jelionBlock), "CCC", "CCC", "CCC", 'C', ModItems.jelionCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.laraneBlock), "CCC", "CCC", "CCC", 'C', ModItems.laraneCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.garaleBlock), "CCC", "CCC", "CCC", 'C', ModItems.garaleCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cirylaBlock), "CCC", "CCC", "CCC", 'C', ModItems.cirylaCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.buedinBlock), "CCC", "CCC", "CCC", 'C', ModItems.buedinCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.brodinBlock), "CCC", "CCC", "CCC", 'C', ModItems.brodinCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.vieralBlock), "CCC", "CCC", "CCC", 'C', ModItems.vieralCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.maieraBlock), "CCC", "CCC", "CCC", 'C', ModItems.maieraCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.piteraBlock), "CCC", "CCC", "CCC", 'C', ModItems.piteraCrystal);
		// crystals
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.baelizCrystal), "B", 'B', ModBlocks.baelizBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.nielizCrystal), "B", 'B', ModBlocks.nielizBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.guelizCrystal), "B", 'B', ModBlocks.guelizBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.daelizCrystal), "B", 'B', ModBlocks.daelizBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.brelunCrystal), "B", 'B', ModBlocks.brelunBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.raegolCrystal), "B", 'B', ModBlocks.raegolBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.orayenCrystal), "B", 'B', ModBlocks.orayenBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.jelionCrystal), "B", 'B', ModBlocks.jelionBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.laraneCrystal), "B", 'B', ModBlocks.laraneBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.garaleCrystal), "B", 'B', ModBlocks.garaleBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cirylaCrystal), "B", 'B', ModBlocks.cirylaBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.buedinCrystal), "B", 'B', ModBlocks.buedinBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.brodinCrystal), "B", 'B', ModBlocks.brodinBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.vieralCrystal), "B", 'B', ModBlocks.vieralBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.maieraCrystal), "B", 'B', ModBlocks.maieraBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.piteraCrystal), "B", 'B', ModBlocks.piteraBlock);
	}
}
