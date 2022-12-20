package com.sharpice.sow;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static com.sharpice.sow.Util.MODID;
import static com.sharpice.sow.items.Ender_Blade.ENDER_BLADE;

public class Group {
    public static final ItemGroup SOW_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MODID, "sow_group"))
            .icon(() -> new ItemStack(ENDER_BLADE))
            .build();
}
