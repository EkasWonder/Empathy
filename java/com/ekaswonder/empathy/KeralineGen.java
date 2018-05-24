package com.ekaswonder.empathy;

import java.util.Random;

import com.ekaswonder.empathy.block.EmpathyBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class KeralineGen implements IWorldGenerator{
	
	private WorldGenerator genKeralineOre;
	
	/**
	 * Generates keraline ore in the world
	 * @author Azurelan
	 * @author EkasWonder
	 * @since 1.7.10-0.5
	 */
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
	    case 0: //Overworld
	    	this.runGenerator(this.genKeralineOre, world, random, chunkX, chunkZ, 6, 0, 64);
	        break;
	    case -1: //Nether
	    	this.runGenerator(this.genKeralineOre, world, random, chunkX, chunkZ, 40, 7, 117);
	        break;
	    case 1: //End

	        break;
	    }
    }
	
    /**
     * Runs the keraline ore generator with the required parameters
     * @author Azurelan
     * @author EkasWonder
     * @since 1.7.10-0.5
     */
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
	    }
	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, x, y, z);
	    }
	}
	
	/**
	 * Constructs the keraline ore generator
	 * @author EkasWonder
	 * @since 1.7.10-0.5
	 */
	KeralineGen() {
	    this.genKeralineOre = new WorldGenMinable(EmpathyBlocks.keralineOre, 8);
	}
}