
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mixcoverycraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.mixcoverycraft.block.WoodcutterBlock;
import net.mcreator.mixcoverycraft.block.TitaniumOreBlock;
import net.mcreator.mixcoverycraft.block.TitaniumBlockBlock;
import net.mcreator.mixcoverycraft.block.TinOreBlock;
import net.mcreator.mixcoverycraft.block.TinBlockBlock;
import net.mcreator.mixcoverycraft.block.SupremeMedicalFlowerBlock;
import net.mcreator.mixcoverycraft.block.StorageSelfBlock;
import net.mcreator.mixcoverycraft.block.StoneMagmaBlock;
import net.mcreator.mixcoverycraft.block.RefinerBlock;
import net.mcreator.mixcoverycraft.block.MedicalFlowerBlock;
import net.mcreator.mixcoverycraft.block.DnaMixerBlock;
import net.mcreator.mixcoverycraft.block.BronzeBlockBlock;
import net.mcreator.mixcoverycraft.block.AlloyFurnaceBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MixcoverycraftModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block WOODCUTTER = register(new WoodcutterBlock());
	public static final Block TIN_ORE = register(new TinOreBlock());
	public static final Block TIN_BLOCK = register(new TinBlockBlock());
	public static final Block BRONZE_BLOCK = register(new BronzeBlockBlock());
	public static final Block ALLOY_FURNACE = register(new AlloyFurnaceBlock());
	public static final Block MEDICAL_FLOWER = register(new MedicalFlowerBlock());
	public static final Block SUPREME_MEDICAL_FLOWER = register(new SupremeMedicalFlowerBlock());
	public static final Block TITANIUM_ORE = register(new TitaniumOreBlock());
	public static final Block TITANIUM_BLOCK = register(new TitaniumBlockBlock());
	public static final Block REFINER = register(new RefinerBlock());
	public static final Block DNA_MIXER = register(new DnaMixerBlock());
	public static final Block STORAGE_SELF = register(new StorageSelfBlock());
	public static final Block STONE_MAGMA = register(new StoneMagmaBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			WoodcutterBlock.registerRenderLayer();
			MedicalFlowerBlock.registerRenderLayer();
			SupremeMedicalFlowerBlock.registerRenderLayer();
		}
	}
}
