package me.nino.anglersdream.item.custom.bags.items;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

import java.util.ArrayList;

public class GenerateRandomBook {

    public static ArrayList<ItemStack> generateEnchantedLoot(Level level) {
        ArrayList<ItemStack> loot = new ArrayList<>();
        loot.add(createEnchantedBook(Enchantments.MENDING, 1, level));
        loot.add(createEnchantedBook(Enchantments.LOOTING, 1, level));
        loot.add(createEnchantedBook(Enchantments.LOOTING, 2, level));
        loot.add(createEnchantedBook(Enchantments.LOOTING, 3, level));
        loot.add(createEnchantedBook(Enchantments.AQUA_AFFINITY, 1, level));
        loot.add(createEnchantedBook(Enchantments.BANE_OF_ARTHROPODS, 1, level));
        loot.add(createEnchantedBook(Enchantments.BANE_OF_ARTHROPODS, 2, level));
        loot.add(createEnchantedBook(Enchantments.BANE_OF_ARTHROPODS, 3, level));
        loot.add(createEnchantedBook(Enchantments.BANE_OF_ARTHROPODS, 4, level));
        loot.add(createEnchantedBook(Enchantments.BLAST_PROTECTION, 1, level));
        loot.add(createEnchantedBook(Enchantments.BLAST_PROTECTION, 2, level));
        loot.add(createEnchantedBook(Enchantments.BLAST_PROTECTION, 3, level));
        loot.add(createEnchantedBook(Enchantments.BLAST_PROTECTION, 4, level));
        loot.add(createEnchantedBook(Enchantments.BREACH, 1, level));
        loot.add(createEnchantedBook(Enchantments.BREACH, 2, level));
        loot.add(createEnchantedBook(Enchantments.BREACH, 3, level));
        loot.add(createEnchantedBook(Enchantments.BREACH, 4, level));
        loot.add(createEnchantedBook(Enchantments.CHANNELING, 1, level));
        loot.add(createEnchantedBook(Enchantments.DEPTH_STRIDER, 1, level));
        loot.add(createEnchantedBook(Enchantments.DEPTH_STRIDER, 2, level));
        loot.add(createEnchantedBook(Enchantments.DEPTH_STRIDER, 3, level));
        loot.add(createEnchantedBook(Enchantments.EFFICIENCY, 1, level));
        loot.add(createEnchantedBook(Enchantments.EFFICIENCY, 2, level));
        loot.add(createEnchantedBook(Enchantments.EFFICIENCY, 3, level));
        loot.add(createEnchantedBook(Enchantments.EFFICIENCY, 4, level));
        loot.add(createEnchantedBook(Enchantments.FEATHER_FALLING, 1, level));
        loot.add(createEnchantedBook(Enchantments.FEATHER_FALLING, 2, level));
        loot.add(createEnchantedBook(Enchantments.FEATHER_FALLING, 3, level));
        loot.add(createEnchantedBook(Enchantments.FEATHER_FALLING, 4, level));
        loot.add(createEnchantedBook(Enchantments.FIRE_ASPECT, 1, level));
        loot.add(createEnchantedBook(Enchantments.FIRE_ASPECT, 2, level));
        loot.add(createEnchantedBook(Enchantments.FIRE_PROTECTION, 1, level));
        loot.add(createEnchantedBook(Enchantments.FIRE_PROTECTION, 2, level));
        loot.add(createEnchantedBook(Enchantments.FIRE_PROTECTION, 3, level));
        loot.add(createEnchantedBook(Enchantments.FIRE_PROTECTION, 4, level));
        loot.add(createEnchantedBook(Enchantments.FLAME, 1, level));
        loot.add(createEnchantedBook(Enchantments.FORTUNE, 1, level));
        loot.add(createEnchantedBook(Enchantments.FORTUNE, 2, level));
        loot.add(createEnchantedBook(Enchantments.FORTUNE, 3, level));
        loot.add(createEnchantedBook(Enchantments.FROST_WALKER, 1, level));
        loot.add(createEnchantedBook(Enchantments.IMPALING, 1, level));
        loot.add(createEnchantedBook(Enchantments.IMPALING, 2, level));
        loot.add(createEnchantedBook(Enchantments.IMPALING, 3, level));
        loot.add(createEnchantedBook(Enchantments.IMPALING, 4, level));
        loot.add(createEnchantedBook(Enchantments.INFINITY, 1, level));
        loot.add(createEnchantedBook(Enchantments.KNOCKBACK, 1, level));
        loot.add(createEnchantedBook(Enchantments.KNOCKBACK, 2, level));
        loot.add(createEnchantedBook(Enchantments.LOYALTY, 1, level));
        loot.add(createEnchantedBook(Enchantments.LOYALTY, 2, level));
        loot.add(createEnchantedBook(Enchantments.LOYALTY, 3, level));
        loot.add(createEnchantedBook(Enchantments.LUCK_OF_THE_SEA, 1, level));
        loot.add(createEnchantedBook(Enchantments.LUCK_OF_THE_SEA, 2, level));
        loot.add(createEnchantedBook(Enchantments.LUCK_OF_THE_SEA, 3, level));
        loot.add(createEnchantedBook(Enchantments.LURE, 1, level));
        loot.add(createEnchantedBook(Enchantments.LURE, 2, level));
        loot.add(createEnchantedBook(Enchantments.LURE, 3, level));
        loot.add(createEnchantedBook(Enchantments.MULTISHOT, 1, level));
        loot.add(createEnchantedBook(Enchantments.PIERCING, 1, level));
        loot.add(createEnchantedBook(Enchantments.PIERCING, 2, level));
        loot.add(createEnchantedBook(Enchantments.PIERCING, 3, level));
        loot.add(createEnchantedBook(Enchantments.PIERCING, 4, level));
        loot.add(createEnchantedBook(Enchantments.POWER, 1, level));
        loot.add(createEnchantedBook(Enchantments.POWER, 2, level));
        loot.add(createEnchantedBook(Enchantments.POWER, 3, level));
        loot.add(createEnchantedBook(Enchantments.POWER, 4, level));
        loot.add(createEnchantedBook(Enchantments.PROJECTILE_PROTECTION, 1, level));
        loot.add(createEnchantedBook(Enchantments.PROJECTILE_PROTECTION, 2, level));
        loot.add(createEnchantedBook(Enchantments.PROJECTILE_PROTECTION, 3, level));
        loot.add(createEnchantedBook(Enchantments.PROJECTILE_PROTECTION, 4, level));
        loot.add(createEnchantedBook(Enchantments.PROTECTION, 1, level));
        loot.add(createEnchantedBook(Enchantments.PROTECTION, 2, level));
        loot.add(createEnchantedBook(Enchantments.PROTECTION, 3, level));
        loot.add(createEnchantedBook(Enchantments.PROTECTION, 4, level));
        loot.add(createEnchantedBook(Enchantments.PUNCH, 1, level));
        loot.add(createEnchantedBook(Enchantments.PUNCH, 2, level));
        loot.add(createEnchantedBook(Enchantments.QUICK_CHARGE, 1, level));
        loot.add(createEnchantedBook(Enchantments.QUICK_CHARGE, 2, level));
        loot.add(createEnchantedBook(Enchantments.QUICK_CHARGE, 3, level));
        loot.add(createEnchantedBook(Enchantments.RESPIRATION, 1, level));
        loot.add(createEnchantedBook(Enchantments.RESPIRATION, 2, level));
        loot.add(createEnchantedBook(Enchantments.RESPIRATION, 3, level));
        loot.add(createEnchantedBook(Enchantments.RIPTIDE, 1, level));
        loot.add(createEnchantedBook(Enchantments.RIPTIDE, 2, level));
        loot.add(createEnchantedBook(Enchantments.RIPTIDE, 3, level));
        loot.add(createEnchantedBook(Enchantments.SHARPNESS, 1, level));
        loot.add(createEnchantedBook(Enchantments.SHARPNESS, 2, level));
        loot.add(createEnchantedBook(Enchantments.SHARPNESS, 3, level));
        loot.add(createEnchantedBook(Enchantments.SHARPNESS, 4, level));
        loot.add(createEnchantedBook(Enchantments.SILK_TOUCH, 1, level));
        loot.add(createEnchantedBook(Enchantments.SMITE, 1, level));
        loot.add(createEnchantedBook(Enchantments.SMITE, 2, level));
        loot.add(createEnchantedBook(Enchantments.SMITE, 3, level));
        loot.add(createEnchantedBook(Enchantments.SMITE, 4, level));
        loot.add(createEnchantedBook(Enchantments.SOUL_SPEED, 1, level));
        loot.add(createEnchantedBook(Enchantments.SOUL_SPEED, 2, level));
        loot.add(createEnchantedBook(Enchantments.SOUL_SPEED, 3, level));
        loot.add(createEnchantedBook(Enchantments.SWEEPING_EDGE, 1, level));
        loot.add(createEnchantedBook(Enchantments.SWEEPING_EDGE, 2, level));
        loot.add(createEnchantedBook(Enchantments.SWEEPING_EDGE, 3, level));
        loot.add(createEnchantedBook(Enchantments.SWIFT_SNEAK, 1, level));
        loot.add(createEnchantedBook(Enchantments.SWIFT_SNEAK, 2, level));
        loot.add(createEnchantedBook(Enchantments.SWIFT_SNEAK, 3, level));
        loot.add(createEnchantedBook(Enchantments.UNBREAKING, 1, level));
        loot.add(createEnchantedBook(Enchantments.UNBREAKING, 2, level));
        loot.add(createEnchantedBook(Enchantments.UNBREAKING, 3, level));
        loot.add(createEnchantedBook(Enchantments.WIND_BURST, 1, level));
        loot.add(createEnchantedBook(Enchantments.WIND_BURST, 2, level));
        loot.add(createEnchantedBook(Enchantments.WIND_BURST, 3, level));
        return loot;
    }

    public static ItemStack createEnchantedBook(ResourceKey<Enchantment> enchantmentRL, int en_level, Level level) {
        ItemStack enchantedBook = new ItemStack(Items.ENCHANTED_BOOK);
        Holder<Enchantment> enchantmentHolder = getEnchantmentHolder(enchantmentRL, level);
        enchantedBook.enchant(enchantmentHolder, en_level);
        return enchantedBook;
    }

    public static Holder<Enchantment> getEnchantmentHolder(ResourceLocation enchantmentRL, Level level) {
        return level.registryAccess().registry(Registries.ENCHANTMENT).get().getHolder(enchantmentRL).orElse(null);
    }

    public static Holder<Enchantment> getEnchantmentHolder(ResourceKey<Enchantment> enchantmentRL, Level level) {
        return level.registryAccess().registry(Registries.ENCHANTMENT).get().getHolder(enchantmentRL).orElse(null);
    }
}
