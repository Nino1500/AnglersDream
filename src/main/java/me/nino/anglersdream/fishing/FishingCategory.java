package me.nino.anglersdream.fishing;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.Set;

public class FishingCategory {

    private static final Set<Item> FISH_ITEMS = Set.of(
            Items.COD,
            Items.SALMON,
            Items.PUFFERFISH,
            Items.TROPICAL_FISH
    );

    private static final Set<Item> TREASURE_ITEMS = Set.of(
            Items.BOW,
            Items.ENCHANTED_BOOK,
            Items.NAME_TAG,
            Items.SADDLE,
            Items.NAUTILUS_SHELL
    );

    private static final Set<Item> JUNK_ITEMS = Set.of(
            Items.LEATHER_BOOTS,
            Items.LEATHER,
            Items.FISHING_ROD,
            Items.BONE,
            Items.POTION,
            Items.STRING,
            Items.BOWL,
            Items.STICK,
            Items.ROTTEN_FLESH,
            Items.LILY_PAD,
            Items.INK_SAC,
            Items.BAMBOO,
            Items.TRIPWIRE_HOOK,
            Items.GLASS_BOTTLE
    );

    public static String getItemCategory(ItemStack itemStack) {
        Item item = itemStack.getItem();
        boolean isEnchanted = itemStack.isEnchanted();

        if (isEnchanted && item.equals(Items.FISHING_ROD)) {
            return "treasure";
        } else if (TREASURE_ITEMS.contains(item)) {
            return "treasure";
        } else if (JUNK_ITEMS.contains(item)) {
            return "junk";
        } else if (FISH_ITEMS.contains(item)) {
            return "fish";
        } else {
            return "Unknown";
        }
    }
}