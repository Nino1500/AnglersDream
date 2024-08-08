package me.nino.anglersdream.item;

import me.nino.anglersdream.item.custom.bags.*;
import me.nino.anglersdream.item.custom.baits.BaitItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("anglersdream");
    // bait
    public static final DeferredItem<Item> WORM = ITEMS.register("worm", () -> new BaitItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> GRASSHOPPER = ITEMS.register("grasshopper", () -> new BaitItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> GOLDEN_WORM = ITEMS.register("golden_worm", () -> new BaitItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> GOLDEN_GRASSHOPPER = ITEMS.register("golden_grasshopper", () -> new BaitItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    // CRATES
    public static final DeferredItem<Item> LEATHER_BAG = ITEMS.register("leather_bag", () -> new LeatherBagItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> IRON_BAG = ITEMS.register("iron_bag", () -> new IronBagItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> GOLDEN_BAG = ITEMS.register("golden_bag", () -> new GoldenBagItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> DIAMOND_BAG = ITEMS.register("diamond_bag", () -> new DiamondBagItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> EMERALD_BAG = ITEMS.register("emerald_bag", () -> new EmeraldBagItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> SEA_BAG = ITEMS.register("sea_bag", () -> new SeaBagItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    // GUI / TOKEN
    public static final DeferredItem<Item> FISHING_TALISMAN = ITEMS.register("fishing_talisman", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC)));

}
