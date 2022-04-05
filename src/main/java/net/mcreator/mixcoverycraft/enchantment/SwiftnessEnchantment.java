
package net.mcreator.mixcoverycraft.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class SwiftnessEnchantment extends Enchantment {
	public SwiftnessEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.ARMOR_FEET, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}
}
