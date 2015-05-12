package com.marco6971.AbsolutelyRandomObject.proxy;

import com.marco6971.AbsolutelyRandomObject.client.handler.KeyInputEventHandler;
import com.marco6971.AbsolutelyRandomObject.client.settings.Keybindings;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerKeyBindings()
    {
    	FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        for(Keybindings key : Keybindings.values()) {
            ClientRegistry.registerKeyBinding(key.getKeybind());
        }
    }
}
