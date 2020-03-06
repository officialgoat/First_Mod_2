package de.firstmod.testmod.init;

import de.firstmod.testmod.Constants;
import de.firstmod.testmod.item.FirstItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemInit
{
    public static final FirstItem firstItem = new FirstItem();

    public static void init()
    {
        setName(firstItem, "firstitem");
    }

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(firstItem);
    }

    public static void setName(Item item, String name)
    {
        item.setRegistryName(new ResourceLocation(Constants.MODID, name));
        item.setUnlocalizedName(name);
    }

}
