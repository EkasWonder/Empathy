package com.ekaswonder.empathy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy {

	/**
	 * First step of the initialization system
	 * @author EkasWonder
	 * @since 1.7.10-0.2
	 */
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    /**
	 * Second step of the initialization system
	 * @author EkasWonder
	 * @since 1.7.10-0.2
	 */
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    /**
	 * Third step of the initialization system
	 * @author EkasWonder
	 * @since 1.7.10-0.2
	 */
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
