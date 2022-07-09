package com.sharpice.sow.items;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.recipe.Ingredient;

import static com.sharpice.sow.Group.SOW_GROUP;
import static net.minecraft.item.Items.IRON_INGOT;

public class Zeru_SwordThin3iron {
    public static final Axe_Stubby INSTANCE = new Axe_Stubby();
    public static final ToolItem AERU_SWORDTHIN3IRON = new SwordItem(INSTANCE, 1, 1.8F, new Item.Settings().group(SOW_GROUP)); // 定义一个新的斧

    public int getDurability() { //耐久
        return 220;
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
        return Ingredient.ofItems(IRON_INGOT);
    }
}
