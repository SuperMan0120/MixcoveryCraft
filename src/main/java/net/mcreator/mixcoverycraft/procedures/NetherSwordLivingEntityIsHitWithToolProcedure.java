package net.mcreator.mixcoverycraft.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mixcoverycraft.init.MixcoverycraftModEnchantments;

public class NetherSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity sourceentity, ItemStack itemstack) {
		if (sourceentity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(MixcoverycraftModEnchantments.LIFE_STEAL, itemstack) == 1) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 3, 0, (false), (false)));
		} else if (EnchantmentHelper.getItemEnchantmentLevel(MixcoverycraftModEnchantments.LIFE_STEAL, itemstack) == 2) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 3, 1, (false), (false)));
		}
	}
}
