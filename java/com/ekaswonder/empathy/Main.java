package com.ekaswonder.empathy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "empathy";
    public static final String MODNAME = "Empathy";
    public static final String VERSION = "1.7.10-1.0";
        
    @Instance
    public static Main instance = new Main();
        
    @SidedProxy(clientSide="com.ekaswonder.empathy.CommonProxy", serverSide="com.ekaswonder.empathy.ServerProxy")
    public static CommonProxy proxy; 
    
    /**
     * Enumerates the laser utility blocks for easier GUI coding
     * @author ekasw
     * @since 1.7.10-0.6
     */
    public enum guiEnum {
    	assembler, infuser, cutter
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
    
    
    public static final CreativeTabs empathyTab = new CreativeTabs("empathyTab") {
        public Item getTabIconItem() {
        	return Items.emerald;
        }
    };
}