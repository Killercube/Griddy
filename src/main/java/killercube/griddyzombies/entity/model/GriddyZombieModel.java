package killercube.griddyzombies.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import killercube.griddyzombies.entity.GriddyZombieEntity;

public class GriddyZombieModel extends AnimatedGeoModel<GriddyZombieEntity> {
	@Override
	public ResourceLocation getAnimationResource(GriddyZombieEntity entity) {
		return new ResourceLocation("griddy_zombies", "animations/griddyzombie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GriddyZombieEntity entity) {
		return new ResourceLocation("griddy_zombies", "geo/griddyzombie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GriddyZombieEntity entity) {
		return new ResourceLocation("griddy_zombies", "textures/entities/" + entity.getTexture() + ".png");
	}

}
