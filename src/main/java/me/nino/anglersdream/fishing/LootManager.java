package me.nino.anglersdream.fishing;

import me.nino.anglersdream.item.ModItems;
import net.minecraft.world.item.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LootManager {

    public static ItemStack getRandomLootBox() {
        Map<ItemStack, Integer> itemWeights = new HashMap<>();
        itemWeights.put(ModItems.LEATHER_BAG.toStack(), 40);
        itemWeights.put(ModItems.IRON_BAG.toStack(), 25);
        itemWeights.put(ModItems.GOLDEN_BAG.toStack(), 15);
        itemWeights.put(ModItems.DIAMOND_BAG.toStack(), 10);
        itemWeights.put(ModItems.EMERALD_BAG.toStack(), 6);
        itemWeights.put(ModItems.SEA_BAG.toStack(), 4);

        int totalWeight = 0;
        for (int weight : itemWeights.values()) {
            totalWeight += weight;
        }

        int randomIndex = new Random().nextInt(totalWeight);
        int currentWeight = 0;

        for (Map.Entry<ItemStack, Integer> entry : itemWeights.entrySet()) {
            currentWeight += entry.getValue();
            if (randomIndex < currentWeight) {
                return entry.getKey();
            }
        }

        return ModItems.LEATHER_BAG.toStack(); // Default fallback
    }

}
