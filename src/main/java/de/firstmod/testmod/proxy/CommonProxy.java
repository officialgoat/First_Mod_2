package de.firstmod.testmod.proxy;

import de.firstmod.testmod.init.FirstBlocks;
import de.firstmod.testmod.init.FirstSmelting;
import de.firstmod.testmod.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemInit.init();
        FirstBlocks.init();

        MinecraftForge.EVENT_BUS.register(ItemInit.class);
        MinecraftForge.EVENT_BUS.register(FirstBlocks.class);
    }

    public void init(FMLPreInitializationEvent event)
    {
        FirstSmelting.init();
    }

    public void postInit(FMLPreInitializationEvent event)
    {
    }
}
