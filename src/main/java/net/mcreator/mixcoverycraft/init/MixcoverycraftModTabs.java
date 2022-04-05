
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mixcoverycraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MixcoverycraftModTabs {
	public static CreativeModeTab TAB_MIXCOVERY_CRAFT_BLOCKS;
	public static CreativeModeTab TAB_MIXCOVERY_CRAFT_ITEMS;
	public static CreativeModeTab TAB_MIXCOVERY_CRAFT_ENTITIES;

	public static void load() {
		TAB_MIXCOVERY_CRAFT_BLOCKS = new CreativeModeTab("tabmixcovery_craft_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.MOSS_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_MIXCOVERY_CRAFT_ITEMS = new CreativeModeTab("tabmixcovery_craft_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.WARPED_FUNGUS_ON_A_STICK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_MIXCOVERY_CRAFT_ENTITIES = new CreativeModeTab("tabmixcovery_craft_entities") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.AXOLOTL_BUCKET);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
