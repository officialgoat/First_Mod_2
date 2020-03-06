package de.firstmod.testmod.init;

import de.firstmod.testmod.Constants;
import de.firstmod.testmod.block.BlockTest;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;


public class FirstBlocks
{
    public static final BlockTest firstblock = new BlockTest();

    public static void init()
    {
        setName(firstblock, "firstblock");
    }

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(firstblock);
    }

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new ItemBlock(firstblock).setRegistryName(firstblock.getRegistryName()));
    }

    public static void setName(Block block, String name)
    {
        block.setRegistryName(new ResourceLocation(Constants.MODID, name));
        block.setUnlocalizedName(name);
    }
}
