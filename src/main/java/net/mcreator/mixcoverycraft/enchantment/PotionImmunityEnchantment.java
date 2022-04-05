
package net.mcreator.mixcoverycraft.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class PotionImmunityEnchantment extends Enchantment {
	public PotionImmunityEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.ARMOR, slots);
	}
}
