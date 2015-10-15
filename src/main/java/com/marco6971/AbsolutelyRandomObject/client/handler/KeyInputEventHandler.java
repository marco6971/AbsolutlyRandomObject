package com.marco6971.AbsolutelyRandomObject.client.handler;

import com.marco6971.AbsolutelyRandomObject.client.settings.Keybindings;
import com.marco6971.AbsolutelyRandomObject.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;


import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler{
    private Keybindings getPressedKey(){
        for(Keybindings key : Keybindings.values()) {
            if(key.isPressed()) return key;
        }
        return null;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
        Keybindings key = getPressedKey();
        if(key != null) {
            switch(key){
                case EXPLODE:
                	LogHelper.info("Explosion");
                    break;
                case EXPLODE_BIG:
                    LogHelper.info("Big explosion");
                    break;
            }
        }
    }
}

