package net.mcreator.mixcoverycraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.mixcoverycraft.init.MixcoverycraftModMobEffects;
import net.mcreator.mixcoverycraft.init.MixcoverycraftModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PotionImmuntyProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double enchantLevel = 0;
		enchantLevel = EnchantmentHelper.getItemEnchantmentLevel(MixcoverycraftModEnchantments.POTION_IMMUNITY,
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY));
		if (enchantLevel > 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MixcoverycraftModMobEffects.FLY);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DIG_SPEED);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DIG_SLOWDOWN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DAMAGE_BOOST);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HEAL);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HARM);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.JUMP);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.CONFUSION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.REGENERATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DAMAGE_RESISTANCE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.FIRE_RESISTANCE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WATER_BREATHING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.INVISIBILITY);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BLINDNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.NIGHT_VISION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HUNGER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WEAKNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WITHER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HEALTH_BOOST);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.ABSORPTION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.SATURATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.GLOWING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.LEVITATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.LUCK);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.UNLUCK);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.SLOW_FALLING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.CONDUIT_POWER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DOLPHINS_GRACE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BAD_OMEN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HERO_OF_THE_VILLAGE);
		}
		enchantLevel = EnchantmentHelper.getItemEnchantmentLevel(MixcoverycraftModEnchantments.POTION_IMMUNITY,
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY));
		if (enchantLevel > 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MixcoverycraftModMobEffects.FLY);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DIG_SPEED);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DIG_SLOWDOWN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DAMAGE_BOOST);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HEAL);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HARM);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.JUMP);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.CONFUSION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.REGENERATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DAMAGE_RESISTANCE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.FIRE_RESISTANCE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WATER_BREATHING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.INVISIBILITY);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BLINDNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.NIGHT_VISION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HUNGER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WEAKNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WITHER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HEALTH_BOOST);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.ABSORPTION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.SATURATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.GLOWING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.LEVITATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.LUCK);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.UNLUCK);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.SLOW_FALLING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.CONDUIT_POWER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DOLPHINS_GRACE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BAD_OMEN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HERO_OF_THE_VILLAGE);
		}
		enchantLevel = EnchantmentHelper.getItemEnchantmentLevel(MixcoverycraftModEnchantments.POTION_IMMUNITY,
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY));
		if (enchantLevel > 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MixcoverycraftModMobEffects.FLY);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DIG_SPEED);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DIG_SLOWDOWN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DAMAGE_BOOST);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HEAL);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HARM);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.JUMP);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.CONFUSION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.REGENERATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DAMAGE_RESISTANCE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.FIRE_RESISTANCE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WATER_BREATHING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.INVISIBILITY);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BLINDNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.NIGHT_VISION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HUNGER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WEAKNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WITHER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HEALTH_BOOST);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.ABSORPTION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.SATURATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.GLOWING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.LEVITATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.LUCK);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.UNLUCK);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.SLOW_FALLING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.CONDUIT_POWER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DOLPHINS_GRACE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BAD_OMEN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HERO_OF_THE_VILLAGE);
		}
		enchantLevel = EnchantmentHelper.getItemEnchantmentLevel(MixcoverycraftModEnchantments.POTION_IMMUNITY,
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY));
		if (enchantLevel > 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MixcoverycraftModMobEffects.FLY);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DIG_SPEED);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DIG_SLOWDOWN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DAMAGE_BOOST);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HEAL);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HARM);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.JUMP);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.CONFUSION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.REGENERATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DAMAGE_RESISTANCE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.FIRE_RESISTANCE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WATER_BREATHING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.INVISIBILITY);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BLINDNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.NIGHT_VISION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HUNGER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WEAKNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WITHER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HEALTH_BOOST);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.ABSORPTION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.SATURATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.GLOWING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.LEVITATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.LUCK);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.UNLUCK);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.SLOW_FALLING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.CONDUIT_POWER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DOLPHINS_GRACE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BAD_OMEN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HERO_OF_THE_VILLAGE);
		}
	}
}
