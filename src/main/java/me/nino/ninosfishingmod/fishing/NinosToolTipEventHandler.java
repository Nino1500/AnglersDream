package me.nino.ninosfishingmod.fishing;

import me.nino.ninosfishingmod.components.NinosFishingModComponents;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NinosToolTipEventHandler {

    @SubscribeEvent
    public static void onToolTip(ItemTooltipEvent event){
        ItemStack itemStack = event.getItemStack();
        if (!itemStack.isEmpty() && itemStack.getItem() instanceof FishingRodItem){
            event.getToolTip().add(Component.literal("Press shift for fishing statistics").withStyle(ChatFormatting.YELLOW));
            if (Screen.hasShiftDown()){
                event.getToolTip().add(Component.literal("----------------").withStyle(ChatFormatting.GRAY));
                event.getToolTip().add(Component.literal("Fishing Statistics:").withStyle(ChatFormatting.AQUA));
                event.getToolTip().add(Component.literal("----------------").withStyle(ChatFormatting.GRAY));
                if (itemStack.has(NinosFishingModComponents.FISH_CAUGHT)) {
                    event.getToolTip().add(Component.literal("Fish: "+itemStack.get(NinosFishingModComponents.FISH_CAUGHT)).withStyle(ChatFormatting.GOLD));
                }
                if (itemStack.has(NinosFishingModComponents.TREASURE_CAUGHT)) {
                    event.getToolTip().add(Component.literal("Treasure: "+itemStack.get(NinosFishingModComponents.TREASURE_CAUGHT)).withStyle(ChatFormatting.GOLD));
                }
                if (itemStack.has(NinosFishingModComponents.JUNK_CAUGHT)) {
                    event.getToolTip().add(Component.literal("Junk: "+itemStack.get(NinosFishingModComponents.JUNK_CAUGHT)).withStyle(ChatFormatting.GOLD));
                }
                if (itemStack.has(NinosFishingModComponents.BAGS_CAUGHT)) {
                    event.getToolTip().add(Component.literal("Bags: "+itemStack.get(NinosFishingModComponents.BAGS_CAUGHT)).withStyle(ChatFormatting.GOLD));
                }
                if (itemStack.has(NinosFishingModComponents.LAST_TIME_FISHED)) {
                    int timestamp = itemStack.get(NinosFishingModComponents.LAST_TIME_FISHED);
                    long timestampMillis = (long) timestamp * 1000L;
                    Date date = new Date(timestampMillis);
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
                    String formattedDate = dateFormat.format(date);
                    event.getToolTip().add(Component.literal("Last time fished: " + formattedDate).withStyle(ChatFormatting.GOLD));
                }
            }
        }
    }

}
