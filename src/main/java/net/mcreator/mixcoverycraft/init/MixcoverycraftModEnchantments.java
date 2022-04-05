
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mixcoverycraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.mixcoverycraft.enchantment.VenomEnchantment;
import net.mcreator.mixcoverycraft.enchantment.SwiftnessEnchantment;
import net.mcreator.mixcoverycraft.enchantment.PotionImmunityEnchantment;
import net.mcreator.mixcoverycraft.enchantment.PhotosyntesysEnchantment;
import net.mcreator.mixcoverycraft.enchantment.PhotoKineticEnchantment;
import net.mcreator.mixcoverycraft.enchantment.NightVisionEnchantment;
import net.mcreator.mixcoverycraft.enchantment.LifeStealEnchantment;
import net.mcreator.mixcoverycraft.enchantment.JumpBoostEnchantment;
import net.mcreator.mixcoverycraft.enchantment.HydrophobiaEnchantment;
import net.mcreator.mixcoverycraft.enchantment.CurseOfUnpredictabilytyEnchantment;
import net.mcreator.mixcoverycraft.enchantment.ButheringEnchantment;
import net.mcreator.mixcoverycraft.enchantment.BuchersSmiteEnchantment;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MixcoverycraftModEnchantments {
	private static final List<Enchantment> REGISTRY = new ArrayList<>();
	public static final Enchantment LIFE_STEAL = register("mixcoverycraft:life_steal", new LifeStealEnchantment());
	public static final Enchantment BUTHERING = register("mixcoverycraft:buthering", new ButheringEnchantment());
	public static final Enchantment BUCHERS_SMITE = register("mixcoverycraft:buchers_smite", new BuchersSmiteEnchantment());
	public static final Enchantment HYDROPHOBIA = register("mixcoverycraft:hydrophobia", new HydrophobiaEnchantment());
	public static final Enchantment CURSE_OF_UNPREDICTABILYTY = register("mixcoverycraft:curse_of_unpredictabilyty",
			new CurseOfUnpredictabilytyEnchantment());
	public static final Enchantment PHOTO_KINETIC = register("mixcoverycraft:photo_kinetic", new PhotoKineticEnchantment());
	public static final Enchantment VENOM = register("mixcoverycraft:venom", new VenomEnchantment());
	public static final Enchantment SWIFTNESS = register("mixcoverycraft:swiftness", new SwiftnessEnchantment());
	public static final Enchantment JUMP_BOOST = register("mixcoverycraft:jump_boost", new JumpBoostEnchantment());
	public static final Enchantment NIGHT_VISION = register("mixcoverycraft:night_vision", new NightVisionEnchantment());
	public static final Enchantment POTION_IMMUNITY = register("mixcoverycraft:potion_immunity", new PotionImmunityEnchantment());
	public static final Enchantment PHOTOSYNTESYS = register("mixcoverycraft:photosyntesys", new PhotosyntesysEnchantment());

	private static Enchantment register(String registryname, Enchantment enchantment) {
		REGISTRY.add(enchantment.setRegistryName(registryname));
		return enchantment;
	}

	@SubscribeEvent
	public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Enchantment[0]));
	}
}
