package org.aquamod.events;

import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.aquamod.Aqua;
import org.aquamod.Entity.Custom.TolietmanEntity;
import org.aquamod.Entity.ModEntityTypes;

@Mod.EventBusSubscriber(modid = Aqua.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.TOLIET_MAN.get(), TolietmanEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
      //  ModSpawnEggItem.initSpawnEggs();
    }
}