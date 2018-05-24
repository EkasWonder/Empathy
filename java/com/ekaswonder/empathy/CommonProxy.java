package com.ekaswonder.empathy;
import com.ekaswonder.empathy.block.EmpathyBlocks;
import com.ekaswonder.empathy.item.EmpathyItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	/**
	 * First step of the initialization system
	 * @author EkasWonder
	 * @since 1.7.10-0.2
	 */
    public void preInit(FMLPreInitializationEvent e) {
    		EmpathyItems.init();
    		EmpathyBlocks.init();
    		EmpathyRecipes.init();
    }

    /**
	 * Second step of the initialization system
	 * @author EkasWonder
	 * @since 1.7.10-0.2
	 */
    public void init(FMLInitializationEvent e) {
    		
    }

    /**
	 * Third and last step of the initialization system
	 * @author EkasWonder
	 * @since 1.7.10-0.2
	 */
    public void postInit(FMLPostInitializationEvent e) {

    }
}
