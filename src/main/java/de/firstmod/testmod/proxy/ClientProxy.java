package de.firstmod.testmod.proxy;

import de.firstmod.testmod.init.FirstModels;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        MinecraftForge.EVENT_BUS.register(FirstModels.class);
    }

    public void init(FMLPreInitializationEvent event)
    {
        super.init(event);
    }

    public void postInit(FMLPreInitializationEvent event)
    {
        super.postInit(event);
    }
}
