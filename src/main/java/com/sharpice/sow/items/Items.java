package com.sharpice.sow.items;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.sharpice.sow.Group.SOW_GROUP;
import static com.sharpice.sow.Util.MODID;
import static com.sharpice.sow.blocks.Aggressium.AGGRESSIUM;
import static com.sharpice.sow.items.Axe_Stubby.AXE_STUBBY;

public class Items {
    public static void register()
    {
        Registry.register(Registry.ITEM, new Identifier(MODID, "axe_stubby"), AXE_STUBBY); //注册Axe_Stubby

        Registry.register(Registry.ITEM, new Identifier(MODID, "aggressium"), new BlockItem(AGGRESSIUM, new Item.Settings().maxCount(1).group(SOW_GROUP))); //为Aggressium注册物品
    }
}
