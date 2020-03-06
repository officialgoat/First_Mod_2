package de.firstmod.testmod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class FirstCreativeTab extends CreativeTabs
{
       public FirstCreativeTab()
       {
           super("firsttab");
       }

       public ItemStack getTabIconItem()
       {
           return new ItemStack(Blocks.ANVIL);
       }
}
