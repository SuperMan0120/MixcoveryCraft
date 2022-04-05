package net.mcreator.mixcoverycraft.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mixcoverycraft.network.MixcoverycraftModVariables;

public class AgesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.STONE_PICKAXE)) : false) {
			{
				double _setval = 1;
				entity.getCapability(MixcoverycraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Age = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
