
package net.mcreator.mixcoverycraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.mixcoverycraft.init.MixcoverycraftModTabs;

public class FriedEggItem extends Item {
	public FriedEggItem() {
		super(new Item.Properties().tab(MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_ITEMS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f)

						.build()));
		setRegistryName("fried_egg");
	}
}
