package net.mcreator.mixcoverycraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Strider;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.mixcoverycraft.init.MixcoverycraftModItems;
import net.mcreator.mixcoverycraft.init.MixcoverycraftModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HydrophobiaMechanicsProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity, event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof Blaze || entity instanceof EnderMan || entity instanceof Strider || entity instanceof MagmaCube)
				&& ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getItem() == MixcoverycraftModItems.BRONZE_SWORD
						|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getItem() == MixcoverycraftModItems.NETHER_SWORD
						|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getItem() == Items.WOODEN_SWORD
						|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.STONE_SWORD
						|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_SWORD
						|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getItem() == Items.GOLDEN_SWORD
						|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getItem() == Items.DIAMOND_SWORD
						|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getItem() == Items.NETHERITE_SWORD)
				&& EnchantmentHelper.getItemEnchantmentLevel(MixcoverycraftModEnchantments.HYDROPHOBIA,
						(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) > 0) {
			entity.hurt(DamageSource.GENERIC, EnchantmentHelper.getItemEnchantmentLevel(MixcoverycraftModEnchantments.HYDROPHOBIA,
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)));
		}
	}
}
