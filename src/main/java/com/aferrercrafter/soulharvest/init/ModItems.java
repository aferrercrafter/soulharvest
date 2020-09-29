package com.aferrercrafter.soulharvest.init;

import com.aferrercrafter.soulharvest.SoulHarvest;
import com.aferrercrafter.soulharvest.item.ItemBase;
import com.aferrercrafter.soulharvest.lib.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SoulHarvest.MOD_ID);


    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // ITEMS
    public static final RegistryObject<Item> SOUL = ITEMS.register("soul", ItemBase::new);

    // TOOLS
    public static final RegistryObject<SwordItem> SOUL_SWORD = ITEMS.register("soul_sword", () -> new SwordItem(ModItemTier.SOUL, 2, -2.4f, new Item.Properties().group(SoulHarvest.CREATIVE_TAB)));

}
