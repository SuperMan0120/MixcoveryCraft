
package net.mcreator.mixcoverycraft.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FlyMobEffect extends MobEffect {
	public FlyMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
		setRegistryName("fly");
	}

	@Override
	public String getDescriptionId() {
		return "effect.mixcoverycraft.fly";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
