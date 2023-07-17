package org.aquamod.Entity.Client;

import com.mojang.blaze3d.matrix.MatrixStack;
import mod.azure.azurelib.renderer.GeoEntityRenderer;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;

import org.aquamod.Entity.Custom.TolietmanEntity;

public class TolietmanRenderer extends GeoEntityRenderer<TolietmanEntity> {

    public TolietmanRenderer(EntityRendererManager renderManager) {
        super(renderManager, new TolietmanModel());
    }


    @Override
    public void render(TolietmanEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       IRenderTypeBuffer bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}