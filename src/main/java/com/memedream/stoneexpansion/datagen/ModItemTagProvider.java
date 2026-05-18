package com.memedream.stoneexpansion.datagen;

import com.memedream.stoneexpansion.ModBlocks;
import com.memedream.stoneexpansion.StoneExpansion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, StoneExpansion.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .remove(Blocks.BLACKSTONE.asItem())
                .add(ModBlocks.COBBLED_SMOOTH_STONE.asItem())
                .add(Blocks.MOSSY_COBBLESTONE.asItem())
                .add(ModBlocks.COBBLED_GRANITE.asItem())
                .add(ModBlocks.COBBLED_DIORITE.asItem())
                .add(ModBlocks.COBBLED_ANDESITE.asItem())
                .add(ModBlocks.COBBLED_BRICKS.asItem())
                .add(ModBlocks.COBBLED_MUD.asItem())
                .add(ModBlocks.COBBLED_SANDSTONE.asItem())
                .add(ModBlocks.COBBLED_RED_SANDSTONE.asItem())
                .add(Blocks.PRISMARINE.asItem())
                .add(ModBlocks.COBBLED_NETHER_BRICKS.asItem())
                .add(ModBlocks.COBBLED_RED_NETHER_BRICKS.asItem())
                .add(ModBlocks.COBBLED_BASALT.asItem())
                .add(ModBlocks.COBBLED_BLACKSTONE.asItem())
                .add(ModBlocks.COBBLED_END_STONE.asItem())
                .add(ModBlocks.COBBLED_PURPUR.asItem())
                .add(ModBlocks.COBBLED_QUARTZ.asItem());
        tag(ItemTags.STONE_TOOL_MATERIALS)
                .remove(Blocks.BLACKSTONE.asItem())
                .add(ModBlocks.COBBLED_SMOOTH_STONE.asItem())
                .add(Blocks.MOSSY_COBBLESTONE.asItem())
                .add(ModBlocks.COBBLED_GRANITE.asItem())
                .add(ModBlocks.COBBLED_DIORITE.asItem())
                .add(ModBlocks.COBBLED_ANDESITE.asItem())
                .add(ModBlocks.COBBLED_BRICKS.asItem())
                .add(ModBlocks.COBBLED_MUD.asItem())
                .add(ModBlocks.COBBLED_SANDSTONE.asItem())
                .add(ModBlocks.COBBLED_RED_SANDSTONE.asItem())
                .add(Blocks.PRISMARINE.asItem())
                .add(ModBlocks.COBBLED_NETHER_BRICKS.asItem())
                .add(ModBlocks.COBBLED_RED_NETHER_BRICKS.asItem())
                .add(ModBlocks.COBBLED_BASALT.asItem())
                .add(ModBlocks.COBBLED_BLACKSTONE.asItem())
                .add(ModBlocks.COBBLED_END_STONE.asItem())
                .add(ModBlocks.COBBLED_PURPUR.asItem())
                .add(ModBlocks.COBBLED_QUARTZ.asItem());
    }
}
