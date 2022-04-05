
package net.mcreator.mixcoverycraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mixcoverycraft.procedures.SupremeMedicalDustFoodEatenProcedure;
import net.mcreator.mixcoverycraft.init.MixcoverycraftModTabs;

public class SupremeMedicalDustItem extends Item {
	public SupremeMedicalDustItem() {
		super(new Item.Properties().tab(MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_ITEMS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

						.build()));
		setRegistryName("supreme_medical_dust");
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SupremeMedicalDustFoodEatenProcedure.execute(entity);
		return retval;
	}
}
