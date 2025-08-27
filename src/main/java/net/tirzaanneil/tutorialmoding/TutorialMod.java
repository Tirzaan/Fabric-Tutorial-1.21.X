package net.tirzaanneil.tutorialmoding;

import net.fabricmc.api.ModInitializer;

import net.tirzaanneil.tutorialmoding.block.ModBlocks;
import net.tirzaanneil.tutorialmoding.item.ModItemGroups;
import net.tirzaanneil.tutorialmoding.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod"; //Change to tutorialmod?
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}