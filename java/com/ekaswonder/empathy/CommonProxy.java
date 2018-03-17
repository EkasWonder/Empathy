package com.ekaswonder.empathy;
import com.ekaswonder.empathy.block.EmpathyBlocks;
import com.ekaswonder.empathy.item.EmpathyItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    		EmpathyItems.init();
    		EmpathyBlocks.init();
    		EmpathyRecipes.init();
    }

    public void init(FMLInitializationEvent e) {
    		
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
