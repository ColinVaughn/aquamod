package org.aquamod;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aquamod.Entity.Client.TolietmanRenderer;
import org.aquamod.Entity.ModEntityTypes;

@Mod(Aqua.MOD_ID)
public class Aqua {
    public static final String MOD_ID = "aqua";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();


    public Aqua() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModEntityTypes.register(eventBus);
        eventBus.addListener(this::doClientStuff);


        MinecraftForge.EVENT_BUS.register(this);

    }
    private void doClientStuff(final FMLClientSetupEvent event) {

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TOLIET_MAN.get(), TolietmanRenderer::new);}

}
