package com.sharpice.sow.blocks;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.sharpice.sow.Util.MODID;
import static com.sharpice.sow.blocks.Aggressium.AGGRESSIUM;

public class Blocks {
    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(MODID, "aggressium"), AGGRESSIUM);
    }
}
