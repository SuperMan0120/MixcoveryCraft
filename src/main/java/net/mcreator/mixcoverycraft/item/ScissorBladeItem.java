
package net.mcreator.mixcoverycraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mixcoverycraft.init.MixcoverycraftModTabs;

public class ScissorBladeItem extends Item {
	public ScissorBladeItem() {
		super(new Item.Properties().tab(MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("scissor_blade");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
