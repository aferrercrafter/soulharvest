package com.aferrercrafter.soulharvest;

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
    }
}
