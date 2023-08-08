
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package killercube.griddyzombies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import killercube.griddyzombies.GriddyZombiesMod;

public class GriddyZombiesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GriddyZombiesMod.MODID);
	public static final RegistryObject<SoundEvent> GRIDDYSOUND = REGISTRY.register("griddysound", () -> new SoundEvent(new ResourceLocation("griddy_zombies", "griddysound")));
}
