package net.oscar.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.oscar.tutorialmod.Tutorialmod;
import net.oscar.tutorialmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup THE_SPECIAL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Tutorialmod.MOD_ID, "the_special_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.YEP_FROSTY))
                    .displayName(Text.translatable("itemgroup.tutorialmod.the_special_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.YEP_FROSTY);
                    }).build());


    public static final ItemGroup THE_SPECIAL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Tutorialmod.MOD_ID, "the_special_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.YEP_FROSTY_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.the_special_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.YEP_FROSTY_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        Tutorialmod.LOGGER.info("Registering Item Groups for " + Tutorialmod.MOD_ID);
    }

}
