package net.oscar.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.oscar.tutorialmod.Tutorialmod;
import net.oscar.tutorialmod.item.custom.ChiselItem;

public class ModItems {

    public static final Item YEP_FROSTY = registerItem("yep_frosty", new Item(new Item.Settings()));
    public static final Item YEP_FROSTY_CHISEL = registerItem("yep_frosty_chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Tutorialmod.MOD_ID, name),item);
    }


    public static void registerModItems() {
        Tutorialmod.LOGGER.info("Registering Mod Items for " + Tutorialmod.MOD_ID);




    }

}
