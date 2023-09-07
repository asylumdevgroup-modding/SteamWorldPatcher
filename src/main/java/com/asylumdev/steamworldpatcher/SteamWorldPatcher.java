package com.asylumdev.steamworldpatcher;

import net.minecraftforge.fml.common.Mod;

@Mod(modid="steamworldpatcher", name="SteamWorldPatcher",version="1.1",dependencies = SteamWorldPatcher.DEPENDENCIES)
public class SteamWorldPatcher {
    public static final String DEPENDENCIES = "required-after:mixinbooter@[8.0,);required-after:steamworld;";

}
