package com.sharpice.sow;

import com.sharpice.sow.items.Items;
import net.fabricmc.api.ModInitializer;
public class Mod implements ModInitializer {
    @Override
    public void onInitialize() {
        Items.register(); //注册物品
    }
}
