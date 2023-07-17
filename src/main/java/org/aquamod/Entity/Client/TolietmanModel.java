package org.aquamod.Entity.Client;

import mod.azure.azurelib.renderer.GeoEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.util.ResourceLocation;
import org.aquamod.Entity.Custom.TolietmanEntity;

public class TolietmanRenderer extends GeoEntityRenderer<TolietmanEntity> {

    public TolietmanRenderer(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn, new PinkyModel());
    }

    @Override
    public RenderType getRenderType(TolietmanEntity animatable, float partialTick, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    protected float getDeathMaxRotation(TolietmanEntity entityLivingBaseIn) {
        return 0.0F;
    }
}
