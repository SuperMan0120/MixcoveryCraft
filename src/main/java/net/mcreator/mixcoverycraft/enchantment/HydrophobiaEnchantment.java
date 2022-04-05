
package net.mcreator.mixcoverycraft.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.mixcoverycraft.init.MixcoverycraftModItems;

public class HydrophobiaEnchantment extends Enchantment {
	public HydrophobiaEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == MixcoverycraftModItems.BRONZE_SWORD)
			return true;
		if (stack.getItem() == MixcoverycraftModItems.NETHER_SWORD)
			return true;
		if (stack.getItem() == Items.WOODEN_SWORD)
			return true;
		if (stack.getItem() == Items.STONE_SWORD)
			return true;
		if (stack.getItem() == Items.IRON_SWORD)
			return true;
		if (stack.getItem() == Items.GOLDEN_SWORD)
			return true;
		if (stack.getItem() == Items.DIAMOND_SWORD)
			return true;
		if (stack.getItem() == Items.NETHERITE_SWORD)
			return true;
		return false;
	}
}
