
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mixcoverycraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mixcoverycraft.item.WormItem;
import net.mcreator.mixcoverycraft.item.WormGooItem;
import net.mcreator.mixcoverycraft.item.WoodenBasketItem;
import net.mcreator.mixcoverycraft.item.TitaniumPlateItem;
import net.mcreator.mixcoverycraft.item.TitaniumIngotItem;
import net.mcreator.mixcoverycraft.item.TitaniumDustItem;
import net.mcreator.mixcoverycraft.item.TitaniumBasketItem;
import net.mcreator.mixcoverycraft.item.TinIngotItem;
import net.mcreator.mixcoverycraft.item.SupremeMedicalDustItem;
import net.mcreator.mixcoverycraft.item.ScissorItem;
import net.mcreator.mixcoverycraft.item.ScissorBladeItem;
import net.mcreator.mixcoverycraft.item.SawbladeItem;
import net.mcreator.mixcoverycraft.item.SawItem;
import net.mcreator.mixcoverycraft.item.RabbitDnaItem;
import net.mcreator.mixcoverycraft.item.PristineTitaniumIngotItem;
import net.mcreator.mixcoverycraft.item.PresserItem;
import net.mcreator.mixcoverycraft.item.PebbleItem;
import net.mcreator.mixcoverycraft.item.PeatItem;
import net.mcreator.mixcoverycraft.item.NetherSwordItem;
import net.mcreator.mixcoverycraft.item.MoltenIronItem;
import net.mcreator.mixcoverycraft.item.MedicalDustItem;
import net.mcreator.mixcoverycraft.item.IronPlateItem;
import net.mcreator.mixcoverycraft.item.IronGolemDNAItem;
import net.mcreator.mixcoverycraft.item.HammerheadItem;
import net.mcreator.mixcoverycraft.item.HammerItem;
import net.mcreator.mixcoverycraft.item.GillsItem;
import net.mcreator.mixcoverycraft.item.FriedEggItem;
import net.mcreator.mixcoverycraft.item.FlintHachetItem;
import net.mcreator.mixcoverycraft.item.FishDnaItem;
import net.mcreator.mixcoverycraft.item.DynamiteItem;
import net.mcreator.mixcoverycraft.item.CrookItem;
import net.mcreator.mixcoverycraft.item.CastItem;
import net.mcreator.mixcoverycraft.item.BronzeSwordItem;
import net.mcreator.mixcoverycraft.item.BronzeShovelItem;
import net.mcreator.mixcoverycraft.item.BronzePickaxeItem;
import net.mcreator.mixcoverycraft.item.BronzeIngotItem;
import net.mcreator.mixcoverycraft.item.BronzeHoeItem;
import net.mcreator.mixcoverycraft.item.BronzeAxeItem;
import net.mcreator.mixcoverycraft.item.BronzeArmorItem;
import net.mcreator.mixcoverycraft.item.BatWingItem;
import net.mcreator.mixcoverycraft.item.BatDnaItem;
import net.mcreator.mixcoverycraft.item.BasketCastItem;
import net.mcreator.mixcoverycraft.item.BasicDnaItem;
import net.mcreator.mixcoverycraft.item.BarkItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MixcoverycraftModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item FLINT_HACHET = register(new FlintHachetItem());
	public static final Item HAMMER = register(new HammerItem());
	public static final Item HAMMERHEAD = register(new HammerheadItem());
	public static final Item SAW = register(new SawItem());
	public static final Item SAWBLADE = register(new SawbladeItem());
	public static final Item SCISSOR = register(new ScissorItem());
	public static final Item SCISSOR_BLADE = register(new ScissorBladeItem());
	public static final Item WOODCUTTER = register(MixcoverycraftModBlocks.WOODCUTTER, MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item PEBBLE = register(new PebbleItem());
	public static final Item TIN_INGOT = register(new TinIngotItem());
	public static final Item TIN_ORE = register(MixcoverycraftModBlocks.TIN_ORE, MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item TIN_BLOCK = register(MixcoverycraftModBlocks.TIN_BLOCK, MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item BRONZE_INGOT = register(new BronzeIngotItem());
	public static final Item BRONZE_BLOCK = register(MixcoverycraftModBlocks.BRONZE_BLOCK, MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item BRONZE_PICKAXE = register(new BronzePickaxeItem());
	public static final Item BRONZE_AXE = register(new BronzeAxeItem());
	public static final Item BRONZE_SWORD = register(new BronzeSwordItem());
	public static final Item BRONZE_SHOVEL = register(new BronzeShovelItem());
	public static final Item BRONZE_HOE = register(new BronzeHoeItem());
	public static final Item BRONZE_ARMOR_HELMET = register(new BronzeArmorItem.Helmet());
	public static final Item BRONZE_ARMOR_CHESTPLATE = register(new BronzeArmorItem.Chestplate());
	public static final Item BRONZE_ARMOR_LEGGINGS = register(new BronzeArmorItem.Leggings());
	public static final Item BRONZE_ARMOR_BOOTS = register(new BronzeArmorItem.Boots());
	public static final Item ALLOY_FURNACE = register(MixcoverycraftModBlocks.ALLOY_FURNACE, MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item PEAT = register(new PeatItem());
	public static final Item MEDICAL_FLOWER = register(MixcoverycraftModBlocks.MEDICAL_FLOWER, MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item MEDICAL_DUST = register(new MedicalDustItem());
	public static final Item BARK = register(new BarkItem());
	public static final Item SUPREME_MEDICAL_FLOWER = register(MixcoverycraftModBlocks.SUPREME_MEDICAL_FLOWER,
			MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item SUPREME_MEDICAL_DUST = register(new SupremeMedicalDustItem());
	public static final Item TITANIUM_INGOT = register(new TitaniumIngotItem());
	public static final Item TITANIUM_ORE = register(MixcoverycraftModBlocks.TITANIUM_ORE, MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item TITANIUM_BLOCK = register(MixcoverycraftModBlocks.TITANIUM_BLOCK, MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item REFINER = register(MixcoverycraftModBlocks.REFINER, MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item TITANIUM_DUST = register(new TitaniumDustItem());
	public static final Item PRISTINE_TITANIUM_INGOT = register(new PristineTitaniumIngotItem());
	public static final Item CAST = register(new CastItem());
	public static final Item MOLTEN_IRON = register(new MoltenIronItem());
	public static final Item IRON_PLATE = register(new IronPlateItem());
	public static final Item TITANIUM_PLATE = register(new TitaniumPlateItem());
	public static final Item PRESSER = register(new PresserItem());
	public static final Item BASKET_CAST = register(new BasketCastItem());
	public static final Item WOODEN_BASKET = register(new WoodenBasketItem());
	public static final Item TITANIUM_BASKET = register(new TitaniumBasketItem());
	public static final Item CROOK = register(new CrookItem());
	public static final Item WORM = register(new WormItem());
	public static final Item WORM_GOO = register(new WormGooItem());
	public static final Item BASIC_DNA = register(new BasicDnaItem());
	public static final Item BAT_DNA = register(new BatDnaItem());
	public static final Item BAT_WING = register(new BatWingItem());
	public static final Item GILLS = register(new GillsItem());
	public static final Item FISH_DNA = register(new FishDnaItem());
	public static final Item RABBIT_DNA = register(new RabbitDnaItem());
	public static final Item DNA_MIXER = register(MixcoverycraftModBlocks.DNA_MIXER, MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item IRON_GOLEM_DNA = register(new IronGolemDNAItem());
	public static final Item STORAGE_SELF = register(MixcoverycraftModBlocks.STORAGE_SELF, MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item STONE_MAGMA = register(MixcoverycraftModBlocks.STONE_MAGMA, MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_BLOCKS);
	public static final Item NETHER_SWORD = register(new NetherSwordItem());
	public static final Item DYNAMITE = register(new DynamiteItem());
	public static final Item FRIED_EGG = register(new FriedEggItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
