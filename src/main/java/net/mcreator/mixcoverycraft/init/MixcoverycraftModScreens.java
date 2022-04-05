
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mixcoverycraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.mixcoverycraft.client.gui.StorageSelfInventoryScreen;
import net.mcreator.mixcoverycraft.client.gui.RefinerGuiScreen;
import net.mcreator.mixcoverycraft.client.gui.DnaMixerGUIScreen;
import net.mcreator.mixcoverycraft.client.gui.BasketGuiScreen;
import net.mcreator.mixcoverycraft.client.gui.AlloyGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MixcoverycraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MixcoverycraftModMenus.ALLOY_GUI, AlloyGuiScreen::new);
			MenuScreens.register(MixcoverycraftModMenus.REFINER_GUI, RefinerGuiScreen::new);
			MenuScreens.register(MixcoverycraftModMenus.BASKET_GUI, BasketGuiScreen::new);
			MenuScreens.register(MixcoverycraftModMenus.DNA_MIXER_GUI, DnaMixerGUIScreen::new);
			MenuScreens.register(MixcoverycraftModMenus.STORAGE_SELF_INVENTORY, StorageSelfInventoryScreen::new);
		});
	}
}
