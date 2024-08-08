package me.nino.anglersdream.item.custom.baits;

import me.nino.anglersdream.item.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class BaitItem extends Item {

    public BaitItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext tooltipContext, List<Component> components, TooltipFlag flag) {
        if (stack.getItem() == ModItems.WORM.get()){
            components.add(Component.literal("Bait power: 25%").withStyle(ChatFormatting.AQUA));
            components.add(Component.literal("Shift for more Information").withStyle(ChatFormatting.YELLOW));
            if (Screen.hasShiftDown()){
                components.add(Component.literal("Increases chance to catch crates").withStyle(ChatFormatting.GRAY));
                components.add(Component.literal("20% Chance to be consumed").withStyle(ChatFormatting.GRAY));
            }
        }
        if (stack.getItem() == ModItems.GRASSHOPPER.get()){
            components.add(Component.literal("Bait power: 35%").withStyle(ChatFormatting.AQUA));
            components.add(Component.literal("Shift for more Information").withStyle(ChatFormatting.YELLOW));
            if (Screen.hasShiftDown()){
                components.add(Component.literal("Increases chance to catch crates").withStyle(ChatFormatting.GRAY));
                components.add(Component.literal("15% Chance to be consumed").withStyle(ChatFormatting.GRAY));
            }
        }
        if (stack.getItem() == ModItems.GOLDEN_WORM.get()){
            components.add(Component.literal("Bait power: 50%").withStyle(ChatFormatting.AQUA));
            components.add(Component.literal("Shift for more Information").withStyle(ChatFormatting.YELLOW));
            if (Screen.hasShiftDown()){
                components.add(Component.literal("Increases chance to catch crates").withStyle(ChatFormatting.GRAY));
                components.add(Component.literal("20% Chance to be consumed").withStyle(ChatFormatting.GRAY));
            }
        }
        if (stack.getItem() == ModItems.GOLDEN_GRASSHOPPER.get()){
            components.add(Component.literal("Bait power: 100%").withStyle(ChatFormatting.AQUA));
            components.add(Component.literal("Shift for more Information").withStyle(ChatFormatting.YELLOW));
            if (Screen.hasShiftDown()){
                components.add(Component.literal("Increases chance to catch crates").withStyle(ChatFormatting.GRAY));
                components.add(Component.literal("10% Chance to be consumed").withStyle(ChatFormatting.GRAY));
            }
        }
        super.appendHoverText(stack, tooltipContext, components, flag);
    }

}
