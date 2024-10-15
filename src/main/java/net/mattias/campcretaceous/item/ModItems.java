package net.mattias.campcretaceous.item;


import net.mattias.campcretaceous.CampCretaceous;
import net.mattias.campcretaceous.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CampCretaceous.MOD_ID);


    public static final RegistryObject<Item> ANKYLOSAURUS_SCALE = ITEMS.register("ankylosaurus_scale",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ANKYLOSAURUS = ITEMS.register("raw_ankylosaurus",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_ANKYLOSAURUS)));

    public static final RegistryObject<Item> COOKED_ANKYLOSAURUS = ITEMS.register("cooked_ankylosaurus",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_ANKYLOSAURUS)));


    public static final RegistryObject<Item> ANKYLOSAURUS_SPAWN_EGG = ITEMS.register("ankylosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.ANKYLOSAURUS, 0x647748, 0x768e7f,
                    new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}