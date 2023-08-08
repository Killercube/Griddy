
package killercube.griddyzombies.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import killercube.griddyzombies.entity.model.GriddyZombieModel;
import killercube.griddyzombies.entity.GriddyZombieEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GriddyZombieRenderer extends GeoEntityRenderer<GriddyZombieEntity> {
	public GriddyZombieRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GriddyZombieModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(GriddyZombieEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
