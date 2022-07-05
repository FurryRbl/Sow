package com.sharpice.sow.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class Aggressium {
    public static final Block AGGRESSIUM = new Block(FabricBlockSettings.of(Material.METAL).hardness(10.0f).requiresTool()); //定义Aggressium方块

}
