package me.nino.anglersdream.fishing;

import me.nino.anglersdream.item.ModItems;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.level.BlockEvent;

import static me.nino.anglersdream.utility.Chances.chance;

public class DropBaitEventHandler {

    @SubscribeEvent
    public static void onGrassBreak(BlockEvent.BreakEvent event){

        Player player = event.getPlayer();
        Block block = event.getState().getBlock();

        if (block.asItem() == Items.TALL_GRASS || block.asItem() == Items.SHORT_GRASS){
            if (chance(6)){
                ItemEntity itemEntity = new ItemEntity(player.level(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ModItems.WORM.get()));
                event.getLevel().addFreshEntity(itemEntity);
            }else if (chance(3)){
                ItemEntity itemEntity = new ItemEntity(player.level(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ModItems.GRASSHOPPER.get()));
                event.getLevel().addFreshEntity(itemEntity);
            }
        }
    }

}
