package net.mattias.campcretaceous.entity;

import net.mattias.campcretaceous.CampCretaceous;
import net.mattias.campcretaceous.entity.custom.AnkylosaurusEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CampCretaceous.MOD_ID);

    public static final RegistryObject<EntityType<AnkylosaurusEntity>> ANKYLOSAURUS =
            ENTITY_TYPES.register("anklyosaurus", () -> EntityType.Builder.of(AnkylosaurusEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f)
                    .clientTrackingRange(4)
                    .build("anklyosaurus"));






    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}


