package com.riphtix.miscmod;

import com.riphtix.miscmod.handler.ConfigurationHandler;
import com.riphtix.miscmod.proxy.IProxy;
import com.riphtix.miscmod.reference.Reference;
import com.riphtix.miscmod.utility.LogHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MiscMod {

    //Objects
    //Instances
    @Mod.Instance(Reference.MOD_ID)
    public static MiscMod instance;

    //Proxies
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    /*
    --PreInit--
    >>Network Handling<<
    >>Mod Config<<
    >>Items<<
    >>Blocks<<
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        LogHelper.info("Pre Initialization Complete!!!");
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

        LogHelper.info("Initialization Complete!!!");
    }

    /*
    --PostInit--
    >>Ran at the End<<
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete!!!");
    }
    
}
