
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mixcoverycraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.mixcoverycraft.block.entity.StorageSelfBlockEntity;
import net.mcreator.mixcoverycraft.block.entity.RefinerBlockEntity;
import net.mcreator.mixcoverycraft.block.entity.DnaMixerBlockEntity;
import net.mcreator.mixcoverycraft.block.entity.AlloyFurnaceBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MixcoverycraftModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> ALLOY_FURNACE = register("mixcoverycraft:alloy_furnace", MixcoverycraftModBlocks.ALLOY_FURNACE,
			AlloyFurnaceBlockEntity::new);
	public static final BlockEntityType<?> REFINER = register("mixcoverycraft:refiner", MixcoverycraftModBlocks.REFINER, RefinerBlockEntity::new);
	public static final BlockEntityType<?> DNA_MIXER = register("mixcoverycraft:dna_mixer", MixcoverycraftModBlocks.DNA_MIXER,
			DnaMixerBlockEntity::new);
	public static final BlockEntityType<?> STORAGE_SELF = register("mixcoverycraft:storage_self", MixcoverycraftModBlocks.STORAGE_SELF,
			StorageSelfBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
