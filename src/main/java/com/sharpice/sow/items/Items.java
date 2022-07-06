package com.sharpice.sow.items;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.sharpice.sow.Util.MODID;
import static com.sharpice.sow.items.Axe_Stubby.AXE_STUBBY;

public class Items {
    public static void register()
    {
        Registry.register(Registry.ITEM, new Identifier(MODID, "axe_stubby"), AXE_STUBBY); //注册Axe_Stubby
    }
}
