package net.mechalina.kapibaramod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mechalina.kapibaramod.KapibaraMod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ORANGEWOOD_WOOD = registerBlock("orangewood_wood",
            new PillarBlock(
                    AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block ORANGEWOOD_LOG = registerBlock("orangewood_log",
            new PillarBlock(
                    AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_ORANGEWOOD_WOOD = registerBlock("stripped_orangewood_wood",
            new PillarBlock(
                    AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block STRIPPED_ORANGEWOOD_LOG = registerBlock("stripped_orangewood_log",
            new PillarBlock(
                    AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final Block ORANGEWOOD_PLANKS = registerBlock("orangewood_planks",
            new Block(
                    AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block ORANGEWOOD_LEAVES = registerBlock("orangewood_leaves",
            new LeavesBlock(
                    AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));

//    public static final Block ORANGEWOOD_SAPLING = registerBlock("orangewood_sapling",
//            new SaplingBlock(
//                    ,AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(KapibaraMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(KapibaraMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        KapibaraMod.LOGGER.info("Registering Mod Blocks for " + KapibaraMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.ORANGEWOOD_WOOD);
            entries.add(ModBlocks.ORANGEWOOD_PLANKS);
            entries.add(ModBlocks.ORANGEWOOD_LOG);
            entries.add(ModBlocks.STRIPPED_ORANGEWOOD_LOG);
            entries.add(ModBlocks.STRIPPED_ORANGEWOOD_WOOD);
        });
    }

}
