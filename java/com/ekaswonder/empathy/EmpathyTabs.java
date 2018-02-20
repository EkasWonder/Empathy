package com.ekaswonder.empathy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class EmpathyTabs {
	
	public static final CreativeTabs empathyTab = new CreativeTabs("empathyTab") {
        @Override
        public Item getTabIconItem() {
            //TODO give a special icon to the tab
        	//return ModItems.vieral_crystal;
        	return Items.emerald;
        }
    };
}