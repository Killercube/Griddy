
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package killercube.griddyzombies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import killercube.griddyzombies.GriddyZombiesMod;

public class GriddyZombiesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GriddyZombiesMod.MODID);
	public static final RegistryObject<Item> GRIDDY_ZOMBIE_SPAWN_EGG = REGISTRY.register("griddy_zombie_spawn_egg", () -> new ForgeSpawnEggItem(GriddyZombiesModEntities.GRIDDY_ZOMBIE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
