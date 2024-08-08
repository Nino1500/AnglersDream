package me.nino.ninosfishingmod.fishing;

import me.nino.ninosfishingmod.components.NinosFishingModComponents;
import me.nino.ninosfishingmod.item.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.ItemFishedEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.*;

import static me.nino.ninosfishingmod.fishing.LootManager.getRandomLootBox;

public class NinosFishEventHandler {

    @SubscribeEvent
    public static void onFish(ItemFishedEvent event) {
        if (event.getEntity() instanceof Player player && player.getMainHandItem().getItem() instanceof FishingRodItem) {
            ItemStack stack = player.getMainHandItem();
            int extraChance = calculateExtraChanceAndConsumeItems(player);
            stack.set(NinosFishingModComponents.LAST_TIME_FISHED, (int) (new Date().getTime() / 1000L));

            double baseChance = 5.0;
            if (extraChance > 0) {
                baseChance *= (extraChance / 100.0 + 1);
            }

            if (chance(baseChance)) {
                player.sendSystemMessage(Component.literal("You caught a Crate!").withStyle(ChatFormatting.AQUA));
                ItemEntity item = new ItemEntity(player.level(), player.getX(), player.getY(), player.getZ(), getRandomLootBox());
                player.level().addFreshEntity(item);
                updateCaughtCount(stack, NinosFishingModComponents.BAGS_CAUGHT);
            }

            processDrops(event.getDrops(), stack);
        }
    }


    private static void updateCaughtCount(ItemStack stack, DataComponentType<Integer> component) {
        if (stack.has(component)) {
            int caught = stack.get(component);
            caught += 1;
            stack.set(component, caught);
        } else {
            stack.set(component, 1);
        }
    }


    private static boolean chance(double percent){
        Random random = new Random();
        return random.nextDouble() < percent / 100;
    }

    private static int calculateExtraChanceAndConsumeItems(Player player) {
        int extraChance = 0;

        Map<ItemStack, Integer[]> itemsToCheck = new HashMap<>();
        itemsToCheck.put(ModItems.WORM.toStack(), new Integer[]{25, 20});
        itemsToCheck.put(ModItems.GRASSHOPPER.toStack(), new Integer[]{35, 15});
        itemsToCheck.put(ModItems.GOLDEN_WORM.toStack(), new Integer[]{50, 20});
        itemsToCheck.put(ModItems.GOLDEN_GRASSHOPPER.toStack(), new Integer[]{100, 10});

        for (Map.Entry<ItemStack, Integer[]> entry : itemsToCheck.entrySet()) {
            if (player.getInventory().contains(entry.getKey())) {
                extraChance = entry.getValue()[0];
                if (chance(entry.getValue()[1])) {
                    player.getInventory().getItem(player.getInventory().findSlotMatchingItem(entry.getKey())).shrink(1);
                }
            }
        }

        return extraChance;
    }

    private static void processDrops(List<ItemStack> drops, ItemStack stack) {
        for (ItemStack drop : drops) {
            String type = FishingCategory.getItemCategory(drop);
            switch (type.toLowerCase()) {
                case "junk":
                    updateCaughtCount(stack, NinosFishingModComponents.JUNK_CAUGHT);
                    break;
                case "fish":
                    updateCaughtCount(stack, NinosFishingModComponents.FISH_CAUGHT);
                    break;
                case "treasure":
                    updateCaughtCount(stack, NinosFishingModComponents.TREASURE_CAUGHT);
                    break;
            }
        }
    }

    private static void updateCaughtCount(ItemStack stack, DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> component) {
        int caught = stack.has(component) ? stack.get(component) + 1 : 1;
        stack.set(component, caught);
    }



}
