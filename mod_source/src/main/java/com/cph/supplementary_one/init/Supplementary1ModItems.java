/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.cph.supplementary_one.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import com.cph.supplementary_one.item.JebCrystalItem;
import com.cph.supplementary_one.Supplementary1Mod;

public class Supplementary1ModItems {
	public static Item JEB_CRYSTAL;

	public static void load() {
		JEB_CRYSTAL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Supplementary1Mod.MODID, "jeb_crystal"), new JebCrystalItem());
	}

	public static void clientLoad() {
	}
}
