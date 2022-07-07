package com.sharpice.sow.items;

import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.recipe.Ingredient;

import static com.sharpice.sow.Group.SOW_GROUP;

public class sword1_iron {
    public static final Axe_Stubby INSTANCE = new Axe_Stubby();
    public static final ToolItem SWORD1_IRON = new SwordItem(INSTANCE, 1, 1.8F, new Item.Settings().group(SOW_GROUP)); // 定义一个新的斧

    public int getDurability() { //耐久
        return 200;
    }

    public float getMiningSpeedMultiplier() { // 挖掘速度
        return 1.5f;
    }

    public float getAttackDamage() { // 攻击伤害
        return 2.0F;
    }

    public int getMiningLevel() { // 挖掘等级
        return 1;
    }

    public int getEnchantability() { // 附魔等级
        return 10;
    }

    public Ingredient getRepairIngredient() { // 修复材料
        return Ingredient.ofItems(Blocks.COBBLESTONE);
    }
}
