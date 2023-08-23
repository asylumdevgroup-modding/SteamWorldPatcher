package com.asylumdev.steamworldpatcher.mixin;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zaexides.steamworld.world.dimension.BiomeProviderSkyOfOld;

@Mixin(value= BiomeProviderSkyOfOld.class)
public class OldSkyMixin extends BiomeProvider {

    @Inject(method="getBiomes", at= @At("RETURN"), cancellable=true)
    private void patchGetBiomes(Biome[] oldBiomeList, int x, int z, int width, int depth, CallbackInfoReturnable<Biome[]> cir) {
        cir.setReturnValue(super.getBiomes(oldBiomeList,x,z,width,depth));
    }
}
