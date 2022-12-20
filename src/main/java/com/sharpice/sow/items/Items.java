package com.sharpice.sow.items;

import com.sharpice.sow.items.crown.Ender_Crown;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.sharpice.sow.Util.MODID;
import static com.sharpice.sow.items.Ender_Blade.ENDER_BLADE;
import static com.sharpice.sow.items.crown.Ender_Crown.ENDER_CROWN;

public class Items {
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "ender_blade"), ENDER_BLADE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ender_criwn"), ENDER_CROWN);
    }
}
