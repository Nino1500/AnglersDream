package me.nino.ninosfishingmod.components;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.util.ExtraCodecs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.annotation.Nonnull;
import java.util.function.UnaryOperator;

public class NinosFishingModComponents {

    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPE_DEFERRED =
            DeferredRegister.create(Registries.DATA_COMPONENT_TYPE, "ninosfishingmod");

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> FISH_CAUGHT =
            register("fish_caught", data -> data.persistent(ExtraCodecs.POSITIVE_INT).networkSynchronized(ByteBufCodecs.INT));
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> TREASURE_CAUGHT =
            register("treasure_caught", data -> data.persistent(ExtraCodecs.POSITIVE_INT).networkSynchronized(ByteBufCodecs.INT));
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> BAGS_CAUGHT =
            register("bags_caught", data -> data.persistent(ExtraCodecs.POSITIVE_INT).networkSynchronized(ByteBufCodecs.INT));
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> JUNK_CAUGHT =
            register("junk_caught", data -> data.persistent(ExtraCodecs.POSITIVE_INT).networkSynchronized(ByteBufCodecs.INT));
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> LAST_TIME_FISHED =
            register("last_time_fished", data -> data.persistent(ExtraCodecs.POSITIVE_INT).networkSynchronized(ByteBufCodecs.INT));

    public static <T> DeferredHolder<DataComponentType<?>, DataComponentType<T>> register(@Nonnull String name, UnaryOperator<DataComponentType.Builder<T>> builder) {
        return DATA_COMPONENT_TYPE_DEFERRED.register(name, () -> builder.apply(DataComponentType.builder()).build());
    }

}
