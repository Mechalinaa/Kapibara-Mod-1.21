package net.mechalina.kapibaramod.util;

import net.mechalina.kapibaramod.KapibaraMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{

        public static final TagKey<Block> PLANKS = createTag("planks");
        public static final TagKey<Block> LOGS_THAT_BURN = createTag("logs_that_burn");
        public static final TagKey<Block> LOGS = createTag("logs");
        public static final TagKey<Block> ORANGEWOOD_LOGS = createTag("orangewood_logs");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(KapibaraMod.MOD_ID, name));
        }
    }
    public static class Items{

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(KapibaraMod.MOD_ID, name));
        }
    }
}
