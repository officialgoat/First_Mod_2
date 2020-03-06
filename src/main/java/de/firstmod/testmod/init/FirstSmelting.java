package de.firstmod.testmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstSmelting
{
    public static void init()
    {
        GameRegistry.addSmelting(Blocks.BOOKSHELF, new ItemStack(ItemInit.firstItem, 4), 2F);
        GameRegistry.addSmelting(Blocks.BEDROCK, new ItemStack(Items.APPLE, 4), 3F);
        GameRegistry.addSmelting(ItemInit.firstItem, new ItemStack(Items.APPLE, 4), 4F);

        //This doesn't seem to work
        GameRegistry.addSmelting(FirstBlocks.firstblock, new ItemStack(Items.APPLE, 4), 4F);
    }
}
