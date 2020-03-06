package de.firstmod.testmod.block;

import de.firstmod.testmod.init.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTest extends Block
{
    public BlockTest()
    {
        super(Material.ROCK);
        setCreativeTab(Tabs.tab);
    }
}
