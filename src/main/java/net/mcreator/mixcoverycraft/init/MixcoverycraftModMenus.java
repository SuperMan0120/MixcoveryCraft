
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mixcoverycraft.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.mixcoverycraft.world.inventory.StorageSelfInventoryMenu;
import net.mcreator.mixcoverycraft.world.inventory.RefinerGuiMenu;
import net.mcreator.mixcoverycraft.world.inventory.DnaMixerGUIMenu;
import net.mcreator.mixcoverycraft.world.inventory.BasketGuiMenu;
import net.mcreator.mixcoverycraft.world.inventory.AlloyGuiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MixcoverycraftModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<AlloyGuiMenu> ALLOY_GUI = register("alloy_gui", (id, inv, extraData) -> new AlloyGuiMenu(id, inv, extraData));
	public static final MenuType<RefinerGuiMenu> REFINER_GUI = register("refiner_gui",
			(id, inv, extraData) -> new RefinerGuiMenu(id, inv, extraData));
	public static final MenuType<BasketGuiMenu> BASKET_GUI = register("basket_gui", (id, inv, extraData) -> new BasketGuiMenu(id, inv, extraData));
	public static final MenuType<DnaMixerGUIMenu> DNA_MIXER_GUI = register("dna_mixer_gui",
			(id, inv, extraData) -> new DnaMixerGUIMenu(id, inv, extraData));
	public static final MenuType<StorageSelfInventoryMenu> STORAGE_SELF_INVENTORY = register("storage_self_inventory",
			(id, inv, extraData) -> new StorageSelfInventoryMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
