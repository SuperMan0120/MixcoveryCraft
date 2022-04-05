
package net.mcreator.mixcoverycraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mixcoverycraft.procedures.NetherSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.mixcoverycraft.init.MixcoverycraftModTabs;

public class NetherSwordItem extends SwordItem {
	public NetherSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().tab(MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_ITEMS).fireResistant());
		setRegistryName("nether_sword");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		NetherSwordLivingEntityIsHitWithToolProcedure.execute(sourceentity, itemstack);
		return retval;
	}
}
