package com.sharpice.sow.items;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.sharpice.sow.Util.MODID;
import static com.sharpice.sow.items.Axe_Stubby.AXE_STUBBY;
import static com.sharpice.sow.items.Dagger_Diamond.DAGGER_DIAMOND;
import static com.sharpice.sow.items.Dagger_Stone.DOGGER_STONE;
import static com.sharpice.sow.items.Sword2_Iron.SWORD2_IRON;
import static com.sharpice.sow.items.sword1_iron.SWORD1_IRON;

public class Items {
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "axe_stubby"), AXE_STUBBY);
        Registry.register(Registry.ITEM, new Identifier(MODID, "dagger_stone"), DOGGER_STONE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "dagger_diamond"), DAGGER_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(MODID, "sword1_iron"), SWORD1_IRON);
        Registry.register(Registry.ITEM, new Identifier(MODID, "sword2_iron"), SWORD2_IRON);
    }
}
