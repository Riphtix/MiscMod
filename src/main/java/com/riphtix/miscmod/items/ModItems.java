package com.riphtix.miscmod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item iceShard;

    public static void createItems() {
        GameRegistry.registerItem(iceShard = new ItemMM("ice_shard"), "ice_shard");
    }

}
