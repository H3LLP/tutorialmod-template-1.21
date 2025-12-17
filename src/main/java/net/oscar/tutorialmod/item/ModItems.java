package net.oscar.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.oscar.tutorialmod.Tutorialmod;

public class ModItems {

    public static final Item YEP_FROSTY = registerItem("yep_frosty", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Tutorialmod.MOD_ID, name),item);
    }


    public static void registerModItems() {
        Tutorialmod.LOGGER.info("Registering Mod Items for " + Tutorialmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(YEP_FROSTY);
        });


    }

}
