package net.mechalina.kapibaramod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mechalina.kapibaramod.KapibaraMod;
import net.mechalina.kapibaramod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ORANGE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KapibaraMod.MOD_ID, "orange_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ORANGE_FRUIT))
                    .displayName(Text.translatable("itemgroup.kapibaramod.orange_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ORANGE_FRUIT);
                    }).build());
    public static final ItemGroup ORANGEWOOD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KapibaraMod.MOD_ID, "orangewood_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ORANGEWOOD_WOOD))
                    .displayName(Text.translatable("itemgroup.kapibaramod.orangewood_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ORANGEWOOD_WOOD);
                        entries.add(ModBlocks.ORANGEWOOD_LOG);
                        entries.add(ModBlocks.ORANGEWOOD_PLANKS);
                        entries.add(ModBlocks.STRIPPED_ORANGEWOOD_LOG);
                        entries.add(ModBlocks.STRIPPED_ORANGEWOOD_WOOD);
                        entries.add(ModBlocks.ORANGEWOOD_LEAVES);
                    }).build());

    public static void registerItemGroups(){
        KapibaraMod.LOGGER.info("Registering Item Groups for "+KapibaraMod.MOD_ID);
    }
}
