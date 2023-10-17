package com.skdevstudios.yatcm.items;

import com.skdevstudios.yatcm.util.ModConstants;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModConstants.MODID);
        
        public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new FuelItem(new Item.Properties().stacksTo(64), 200));
        public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal", () -> new FuelItem(new Item.Properties().stacksTo(64), 200));

}
