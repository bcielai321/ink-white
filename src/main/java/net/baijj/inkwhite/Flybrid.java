package net.baijj.inkwhite;

import net.baijj.inkwhite.item.ModItemGroups;
import net.baijj.inkwhite.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Flybrid implements ModInitializer {
	public static final String MOD_ID = "ink-white";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}