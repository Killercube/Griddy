
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package killercube.griddyzombies.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import killercube.griddyzombies.client.renderer.GriddyZombieRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GriddyZombiesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GriddyZombiesModEntities.GRIDDY_ZOMBIE.get(), GriddyZombieRenderer::new);
	}
}
