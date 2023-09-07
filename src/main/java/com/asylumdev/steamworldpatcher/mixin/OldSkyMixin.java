package com.asylumdev.steamworldpatcher.mixin;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zaexides.steamworld.world.dimension.BiomeProviderSkyOfOld;

@Mixin(value= BiomeProviderSkyOfOld.class)
public class OldSkyMixin extends BiomeProvider {
    
    /**
     * @author MCAdventureCity
     * @reason Injector wasn't working.
     */
    @Overwrite
    public Biome[] getBiomes(Biome[] oldBiomeList, int x, int z, int width, int depth) {
        return super.getBiomes(oldBiomeList, x, z, width, depth);
    }
}
