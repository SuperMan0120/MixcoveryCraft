
package net.mcreator.mixcoverycraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.mixcoverycraft.procedures.IronGolemDNARightClickedInAirProcedure;
import net.mcreator.mixcoverycraft.init.MixcoverycraftModTabs;

public class IronGolemDNAItem extends Item {
	public IronGolemDNAItem() {
		super(new Item.Properties().tab(MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("iron_golem_dna");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		IronGolemDNARightClickedInAirProcedure.execute(entity);
		return ar;
	}
}
