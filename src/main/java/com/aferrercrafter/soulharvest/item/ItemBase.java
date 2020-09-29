package com.aferrercrafter.soulharvest.item;

import com.aferrercrafter.soulharvest.SoulHarvest;
import net.minecraft.item.Item;

public class ItemBase extends Item{
    public ItemBase(){
        super(new Item.Properties().group(SoulHarvest.CREATIVE_TAB));
    }
}
