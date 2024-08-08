package me.nino.anglersdream.ui;

import me.nino.anglersdream.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "anglersdream");

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ANGLERSDREAMTABS =
            CREATIVE_TABS.register("anglersdream", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.anglersdream"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ModItems.FISHING_TALISMAN.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.WORM.get());
                        output.accept(ModItems.GOLDEN_WORM.get());
                        output.accept(ModItems.GRASSHOPPER);
                        output.accept(ModItems.GOLDEN_GRASSHOPPER.get());
                        output.accept(ModItems.LEATHER_BAG);
                        output.accept(ModItems.IRON_BAG);
                        output.accept(ModItems.GOLDEN_BAG);
                        output.accept(ModItems.DIAMOND_BAG);
                        output.accept(ModItems.EMERALD_BAG);
                        output.accept(ModItems.SEA_BAG);

                    }).build());


}
