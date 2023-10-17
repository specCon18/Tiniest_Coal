package com.skdevstudios.yatcm.init;

import com.skdevstudios.yatcm.items.ModItems;
import com.skdevstudios.yatcm.util.ModConstants;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabInit {
        // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModConstants.MODID);

    // Creates a creative tab with the id "yatcm:yatcm_tab" for the tiny_coal and tiny_charcoal items, that is placed after the combat tab.
    public static final RegistryObject<CreativeModeTab> YATCM_TAB = CREATIVE_MODE_TABS.register("yatcm_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable("itemGroup.yatcm_tab"))
            .icon(() -> ModItems.TINY_COAL.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.TINY_COAL.get());
                output.accept(ModItems.TINY_CHARCOAL.get());
            })
            .build());
}
