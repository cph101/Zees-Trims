/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package com.cph.supplementary_one;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import com.cph.supplementary_one.init.Supplementary1ModItems;

public class Supplementary1Mod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "supplementary_1";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Supplementary1Mod");

		Supplementary1ModItems.load();

	}
}
