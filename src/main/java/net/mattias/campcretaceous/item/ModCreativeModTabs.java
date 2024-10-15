package net.mattias.campcretaceous.item;

import net.mattias.campcretaceous.CampCretaceous;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CampCretaceous.MOD_ID);

   public static final RegistryObject<CreativeModeTab> CAMP_CRETACEOUS = CREATIVE_MODE_TABS.register("camp_cretaceous",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ANKYLOSAURUS_SCALE.get()))
                    .title(Component.translatable("creativetab.camp_cretaceous"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ANKYLOSAURUS_SCALE.get());
                        pOutput.accept(ModItems.RAW_ANKYLOSAURUS.get());
                        pOutput.accept(ModItems.COOKED_ANKYLOSAURUS.get());
                        pOutput.accept(ModItems.ANKYLOSAURUS_SPAWN_EGG.get());

                    })
                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}