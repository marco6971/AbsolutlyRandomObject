package com.marco6971.AbsolutelyRandomObject.client.gui;

import com.marco6971.AbsolutelyRandomObject.Reference.Reference;
import com.marco6971.AbsolutelyRandomObject.handler.ConfigurationHandler;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;

public class ModGuiConfig  extends GuiConfig{
	public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
        		new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
 