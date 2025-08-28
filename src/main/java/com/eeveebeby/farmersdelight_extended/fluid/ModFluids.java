package com.eeveebeby.farmersdelight_extended.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import com.eeveebeby.farmersdelight_extended.FarmersDelight_Extended;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.resources.ResourceLocation;

public class ModFluids {

    // Grab the central Registrate instance from your main class
    private static final Registrate REGISTRATE = FarmersDelight_Extended.REGISTRATE;

    // Explorer's Tea – a virtual fluid
    public static final FluidEntry<BaseFlowingFluid.Flowing> EXPLORERS_TEA = REGISTRATE
            .fluid(
                    "explorers_tea_fluid",
                    ResourceLocation.fromNamespaceAndPath(FarmersDelight_Extended.MOD_ID, "fluid/explorers_tea_fluid_still"),
                    ResourceLocation.fromNamespaceAndPath(FarmersDelight_Extended.MOD_ID, "fluid/explorers_tea_fluid_flow")
            )
            .lang("Explorer's Tea")              // display name
            .noBlock()                           // no placeable fluid block
            .noBucket()                          // no bucket item
            .register();

    // Called from main class to force static init
    public static void register() {
        FarmersDelight_Extended.LOGGER.info("Registering fluids for {}", FarmersDelight_Extended.MOD_ID);
    }
}
