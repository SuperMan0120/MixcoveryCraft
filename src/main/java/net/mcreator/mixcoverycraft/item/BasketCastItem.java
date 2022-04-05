
package net.mcreator.mixcoverycraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mixcoverycraft.init.MixcoverycraftModTabs;

public class BasketCastItem extends Item {
	public BasketCastItem() {
		super(new Item.Properties().tab(MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("basket_cast");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
