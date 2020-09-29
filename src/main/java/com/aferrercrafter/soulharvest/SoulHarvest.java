package com.aferrercrafter.soulharvest;

import com.aferrercrafter.soulharvest.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("soulharvest")
public class SoulHarvest
{

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "soulharvest";

    public SoulHarvest() {

        MinecraftForge.EVENT_BUS.register(this);

        ModItems.init();
    }

    public static final ItemGroup CREATIVE_TAB = new ItemGroup("soulharvesttab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.SOUL.get());
        }
    };
}
