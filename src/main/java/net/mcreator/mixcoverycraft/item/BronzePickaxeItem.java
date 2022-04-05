
package net.mcreator.mixcoverycraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mixcoverycraft.init.MixcoverycraftModTabs;
import net.mcreator.mixcoverycraft.init.MixcoverycraftModItems;

public class BronzePickaxeItem extends PickaxeItem {
	public BronzePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MixcoverycraftModItems.BRONZE_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(MixcoverycraftModTabs.TAB_MIXCOVERY_CRAFT_ITEMS));
		setRegistryName("bronze_pickaxe");
	}
}
