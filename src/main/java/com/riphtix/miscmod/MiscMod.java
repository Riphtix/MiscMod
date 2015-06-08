package com.riphtix.miscmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "miscmod", name = "Miscellaneous Mod", version = "1.8-1.0")
public class MiscMod {

    //Objects
    //Instances
    @Mod.Instance("miscmod")
    public static MiscMod instance;

    /*
    --PreInit--
    >>Network Handling<<
    >>Mod Config<<
    >>Items<<
    >>Blocks<<
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    /*
    --Init--
    >>GUI<<
    >>Tile Entities<<
    >>Crafting Recipes<<
    >>General Event Handlers<<
    >>Etcetera<<
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    /*
    --PostInit--
    >>Ran at the End<<
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
    
}
