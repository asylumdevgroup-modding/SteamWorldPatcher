package com.asylumdev.steamworldpatcher.core;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.List;

public class SWPMixinLoader implements ILateMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        return ImmutableList.of("mixins.mods.steamworld.json");
    }
}
