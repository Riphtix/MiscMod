package com.riphtix.miscmod.items;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMM extends Item {

    public ItemMM(){
        super();
    }

    public ItemMM(String unlocalizedName){
        super();

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
}
