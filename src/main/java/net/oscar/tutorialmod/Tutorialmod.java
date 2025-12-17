package net.oscar.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.oscar.tutorialmod.block.ModBlocks;
import net.oscar.tutorialmod.item.ModItemGroups;
import net.oscar.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorialmod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBLocks();
		ModItemGroups.registerItemGroups();
	}
}