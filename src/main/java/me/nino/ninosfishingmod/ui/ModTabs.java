package me.nino.ninosfishingmod.ui;

import me.nino.ninosfishingmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "ninosfishingmod");

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NINOSFISHINGTABS =
            CREATIVE_TABS.register("ninosfishingmod", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.ninosfishingmod"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(Items.FISHING_ROD::getDefaultInstance)
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
