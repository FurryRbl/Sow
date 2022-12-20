package com.sharpice.sow.items;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static com.sharpice.sow.Group.SOW_GROUP;
import static net.minecraft.item.Items.IRON_INGOT;

public class Ender_Blade implements ToolMaterial {

    public static final Ender_Blade INSTANCE = new Ender_Blade();
    public static final ToolItem ENDER_BLADE = new SwordItem(INSTANCE, 2, 0.5F, new Item.Settings().group(SOW_GROUP));

    public int getDurability() { //耐久
        return 512;
    }

    public float getMiningSpeedMultiplier() { // 挖掘速度
        return 1.5f;
    }

    public float getAttackDamage() { // 攻击伤害
        return 5.0F;
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
