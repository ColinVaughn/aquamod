package org.aquamod.Entity.Client;

import mod.azure.azurelib.model.GeoModel;
import mod.azure.azurelib.renderer.GeoEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.util.ResourceLocation;
import org.aquamod.Aqua;
import org.aquamod.Entity.Custom.TolietmanEntity;

public class TolietmanModel extends GeoModel<TolietmanEntity> {


    @Override
    public ResourceLocation getModelResource(TolietmanEntity object) {
        return new ResourceLocation(Aqua.MOD_ID, "geo/speakerman.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TolietmanEntity object) {
        return new ResourceLocation(Aqua.MOD_ID, "textures/speakerman.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TolietmanEntity object) {
        return new ResourceLocation(Aqua.MOD_ID, "animations/speakerman.animation.json");
    }
}