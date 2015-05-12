package com.marco6971.AbsolutelyRandomObject.client.settings;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

public enum Keybindings{

    EXPLODE("Explosion", Keyboard.KEY_B), EXPLODE_BIG("Big explosion", Keyboard.KEY_G);

    private final KeyBinding keybinding;

    private Keybindings(String keyName, int defaultKeyCode){
        keybinding = new KeyBinding(keyName, defaultKeyCode, "Absolutely Random Object");
    }

    public KeyBinding getKeybind(){
        return keybinding;
    }

    public boolean isPressed(){
        return keybinding.isPressed();
    }

}