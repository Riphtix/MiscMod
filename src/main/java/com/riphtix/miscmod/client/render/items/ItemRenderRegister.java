package com.riphtix.miscmod.client.render.items;

import com.riphtix.miscmod.items.ModItems;
import com.riphtix.miscmod.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

    public static void registerItemRenderer(){
        reg(ModItems.iceShard);
    }

    public static void reg(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(item.getUnlocalizedName().indexOf("_")), "inventory"));
    }
    
}
