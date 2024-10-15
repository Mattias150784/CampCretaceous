package net.mattias.campcretaceous.sounds;

import net.mattias.campcretaceous.CampCretaceous;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CampCretaceous.MOD_ID);

    public static final RegistryObject<SoundEvent> ANKYLOSAURUS_IDLE = registerSoundEvents("anklyosaurus_idle");
    public static final RegistryObject<SoundEvent> ANKYLOSAURUS_WALK = registerSoundEvents("anklyosaurus_walk");
    public static final RegistryObject<SoundEvent> ANKYLOSAURUS_HIT = registerSoundEvents("anklyosaurus_hit");
    public static final RegistryObject<SoundEvent> ANKYLOSAURUS_ATTACK = registerSoundEvents("anklyosaurus_attack");




    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(CampCretaceous.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}