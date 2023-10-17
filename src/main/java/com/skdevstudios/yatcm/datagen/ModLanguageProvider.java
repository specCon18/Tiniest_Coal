package com.skdevstudios.yatcm.datagen;

import com.skdevstudios.yatcm.items.ModItems;
import com.skdevstudios.yatcm.util.ModConstants;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput output) {
        super(output, ModConstants.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.addItem(ModItems.TINY_COAL, "Tiny Coal");
        this.addItem(ModItems.TINY_CHARCOAL, "Tiny Charcoal");
        this.add("itemGroup.yatcm_tab", "Yet Another Tiny Coal Mod");
    }
    
}
