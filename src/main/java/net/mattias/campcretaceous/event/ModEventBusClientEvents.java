package net.mattias.campcretaceous.event;

import net.mattias.campcretaceous.CampCretaceous;
import net.mattias.campcretaceous.entity.client.AnklyosaurusModel;
import net.mattias.campcretaceous.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CampCretaceous.MOD_ID, bus =  Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.ANKLYOSAURUS_LAYER, AnklyosaurusModel::createBodyLayer);



    }

}