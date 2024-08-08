package me.nino.ninosfishingmod;

import me.nino.ninosfishingmod.components.NinosFishingModComponents;
import me.nino.ninosfishingmod.fishing.NinosDropBaitEventHandler;
import me.nino.ninosfishingmod.fishing.NinosFishEventHandler;
import me.nino.ninosfishingmod.fishing.NinosToolTipEventHandler;
import me.nino.ninosfishingmod.item.ModItems;
import me.nino.ninosfishingmod.ui.ModTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;


@Mod("ninosfishingmod")
public class NinosFishingMod {

    private static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, "ninosfishingmod");

    public NinosFishingMod(IEventBus modEventBus, ModContainer modContainer) {

        ModItems.ITEMS.register(modEventBus);
        ModTabs.CREATIVE_TABS.register(modEventBus);

        ATTACHMENT_TYPES.register(modEventBus);

        NeoForge.EVENT_BUS.register(NinosFishEventHandler.class);
        NeoForge.EVENT_BUS.register(NinosToolTipEventHandler.class);
        NeoForge.EVENT_BUS.register(NinosDropBaitEventHandler.class);
        NinosFishingModComponents.DATA_COMPONENT_TYPE_DEFERRED.register(modEventBus);
        
    }



}
