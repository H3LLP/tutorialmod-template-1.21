package net.oscar.tutorialmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.oscar.tutorialmod.Tutorialmod;

public class ModBlocks {

    public static final Block YEP_FROSTY_BLOCK = registerBlock("yep_frosty_block",
            new Block(AbstractBlock.Settings.create().strength(1f)
                    .requiresTool().sounds(BlockSoundGroup.COPPER_BULB)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Tutorialmod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Tutorialmod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBLocks() {
        Tutorialmod.LOGGER.info("Registering Mod Blocks for " + Tutorialmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.YEP_FROSTY_BLOCK);
        });

    }

}
