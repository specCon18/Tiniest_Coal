package com.skdevstudios.yatcm.datagen;

// import org.checkerframework.framework.qual.Unused;
// import org.openjdk.nashorn.internal.ir.annotations.Ignore;

import com.skdevstudios.yatcm.items.ModItems;
import com.skdevstudios.yatcm.util.ModConstants;

// import io.netty.util.SuppressForbidden;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider{

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ModConstants.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.TINY_COAL);
        simpleItem(ModItems.TINY_CHARCOAL);
    }
    
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ModConstants.MODID,"item/" + item.getId().getPath()));
    }
    
    // private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
    //     return withExistingParent(item.getId().getPath(),
    //             new ResourceLocation("item/handheld")).texture("layer0",
    //             new ResourceLocation(ModConstants.MODID,"item/" + item.getId().getPath()));
    // }
}
