package me.nino.anglersdream.fishing;

import me.nino.anglersdream.components.AnglersDreamComponents;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ToolTipEventHandler {

    @SubscribeEvent
    public static void onToolTip(ItemTooltipEvent event){
        ItemStack itemStack = event.getItemStack();
        if (!itemStack.isEmpty() && itemStack.getItem() instanceof FishingRodItem){
            event.getToolTip().add(Component.literal("Press shift for fishing statistics").withStyle(ChatFormatting.YELLOW));
            if (Screen.hasShiftDown()){
                event.getToolTip().add(Component.literal("----------------").withStyle(ChatFormatting.GRAY));
                event.getToolTip().add(Component.literal("Fishing Statistics:").withStyle(ChatFormatting.AQUA));
                event.getToolTip().add(Component.literal("----------------").withStyle(ChatFormatting.GRAY));
                if (itemStack.has(AnglersDreamComponents.FISH_CAUGHT)) {
                    event.getToolTip().add(Component.literal("Fish: "+itemStack.get(AnglersDreamComponents.FISH_CAUGHT)).withStyle(ChatFormatting.GOLD));
                }
                if (itemStack.has(AnglersDreamComponents.TREASURE_CAUGHT)) {
                    event.getToolTip().add(Component.literal("Treasure: "+itemStack.get(AnglersDreamComponents.TREASURE_CAUGHT)).withStyle(ChatFormatting.GOLD));
                }
                if (itemStack.has(AnglersDreamComponents.JUNK_CAUGHT)) {
                    event.getToolTip().add(Component.literal("Junk: "+itemStack.get(AnglersDreamComponents.JUNK_CAUGHT)).withStyle(ChatFormatting.GOLD));
                }
                if (itemStack.has(AnglersDreamComponents.BAGS_CAUGHT)) {
                    event.getToolTip().add(Component.literal("Bags: "+itemStack.get(AnglersDreamComponents.BAGS_CAUGHT)).withStyle(ChatFormatting.GOLD));
                }
                if (itemStack.has(AnglersDreamComponents.LAST_TIME_FISHED)) {
                    int timestamp = itemStack.get(AnglersDreamComponents.LAST_TIME_FISHED);
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
