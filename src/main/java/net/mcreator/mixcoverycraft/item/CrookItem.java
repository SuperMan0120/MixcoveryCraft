
package net.mcreator.mixcoverycraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mixcoverycraft.init.MixcoverycraftModTabs;

public class CrookItem extends Item {
	public CrookItem() {
		super(new Item.Properties().tab(MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_ITEMS).durability(59).rarity(Rarity.COMMON));
		setRegistryName("crook");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
