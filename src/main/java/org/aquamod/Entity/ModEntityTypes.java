package org.aquamod.Entity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.aquamod.Aqua;
import org.aquamod.Entity.Custom.TolietmanEntity;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, Aqua.MOD_ID);

    public static final RegistryObject<EntityType<TolietmanEntity>> TOLIET_MAN =
            ENTITY_TYPES.register("toliet_man",
                    () -> EntityType.Builder.of(TolietmanEntity::new,
                                    EntityClassification.MONSTER).sized(1f, 3f)
                            .build(new ResourceLocation(Aqua.MOD_ID, "toliet_man").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}