package de.firstmod.testmod;

import de.firstmod.testmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MODID, name = Constants.NAME, version = Constants.VERSION)
public class TestMod
{
    @Mod.Instance
    private static TestMod instance;

    public static TestMod getInstance()
    {
        return instance;
    }

    @SidedProxy(serverSide = "de.firstmod.testmod.proxy.CommonProxy", clientSide = "de.firstmod.testmod.proxy.ClientProxy")
    private static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        proxy.init(event);
    }
    @EventHandler
    public void postInit(FMLPreInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
