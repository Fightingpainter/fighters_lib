package net.fightingpainter.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class Lib implements ModInitializer {

	public static final String MOD_ID = "fighters_lib"; //mod id
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID); //init the logger

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Fighters Mods");
	}
}