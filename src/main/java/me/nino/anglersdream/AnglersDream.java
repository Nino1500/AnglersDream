package me.nino.anglersdream;

import me.nino.anglersdream.components.AnglersDreamComponents;
import me.nino.anglersdream.fishing.DropBaitEventHandler;
import me.nino.anglersdream.fishing.FishEventHandler;
import me.nino.anglersdream.fishing.ToolTipEventHandler;
import me.nino.anglersdream.item.ModItems;
import me.nino.anglersdream.ui.ModTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;



@Mod("anglersdream")
public class AnglersDream {

    private static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, "anglersdream");

    public AnglersDream(IEventBus modEventBus, ModContainer modContainer) {

        ModItems.ITEMS.register(modEventBus);
        ModTabs.CREATIVE_TABS.register(modEventBus);

        ATTACHMENT_TYPES.register(modEventBus);

        NeoForge.EVENT_BUS.register(FishEventHandler.class);
        NeoForge.EVENT_BUS.register(ToolTipEventHandler.class);
        NeoForge.EVENT_BUS.register(DropBaitEventHandler.class);
        AnglersDreamComponents.DATA_COMPONENT_TYPE_DEFERRED.register(modEventBus);
        
    }



}
