package com.memedream.stoneexpansion;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(StoneExpansion.MOD_ID);

    // SMOOTH STONE
    public static final DeferredBlock<StairBlock> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<WallBlock> SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<Block> COBBLED_SMOOTH_STONE = registerBlock("cobbled_smooth_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<StairBlock> COBBLED_SMOOTH_STONE_STAIRS = registerBlock("cobbled_smooth_stone_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_SMOOTH_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<SlabBlock> COBBLED_SMOOTH_STONE_SLAB = registerBlock("cobbled_smooth_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<WallBlock> COBBLED_SMOOTH_STONE_WALL = registerBlock("cobbled_smooth_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
//    public static final DeferredBlock<Block> SMOOTH_SMOOTH_STONE = registerBlock("smooth_smooth_stone",
//            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
//    public static final DeferredBlock<StairBlock> SMOOTH_SMOOTH_STONE_STAIRS = registerBlock("smooth_smooth_stone_stairs",
//            () -> new StairBlock(ModBlocks.SMOOTH_SMOOTH_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
//    public static final DeferredBlock<SlabBlock> SMOOTH_SMOOTH_STONE_SLAB = registerBlock("smooth_smooth_stone_slab",
//            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<Block> POLISHED_SMOOTH_STONE = registerBlock("polished_smooth_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<StairBlock> POLISHED_SMOOTH_STONE_STAIRS = registerBlock("polished_smooth_stone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_SMOOTH_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<SlabBlock> POLISHED_SMOOTH_STONE_SLAB = registerBlock("polished_smooth_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<WallBlock> POLISHED_SMOOTH_STONE_WALL = registerBlock("polished_smooth_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<Block> CHISELED_SMOOTH_STONE_BRICKS = registerBlock("chiseled_smooth_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<Block> CUT_SMOOTH_STONE = registerBlock("cut_smooth_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<SlabBlock> CUT_SMOOTH_STONE_SLAB = registerBlock("cut_smooth_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<Block> SMOOTH_STONE_BRICKS = registerBlock("smooth_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<StairBlock> SMOOTH_STONE_BRICK_STAIRS = registerBlock("smooth_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<SlabBlock> SMOOTH_STONE_BRICK_SLAB = registerBlock("smooth_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<WallBlock> SMOOTH_STONE_BRICK_WALL = registerBlock("smooth_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<Block> CRACKED_SMOOTH_STONE_BRICKS = registerBlock("cracked_smooth_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<RotatedPillarBlock> SMOOTH_STONE_PILLAR = registerBlock("smooth_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<Block> SMOOTH_STONE_TILES = registerBlock("smooth_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<Block> DARK_SMOOTH_STONE = registerBlock("dark_smooth_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<StairBlock> DARK_SMOOTH_STONE_STAIRS = registerBlock("dark_smooth_stone_stairs",
            () -> new StairBlock(ModBlocks.DARK_SMOOTH_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<SlabBlock> DARK_SMOOTH_STONE_SLAB = registerBlock("dark_smooth_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    // Stone
    public static final DeferredBlock<WallBlock> STONE_WALL = registerBlock("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    // public static final DeferredBlock<Block> SMOOTH_STONE = registerBlock("smooth_stone",
    //         () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    // public static final DeferredBlock<StairBlock> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
    //         () -> new StairBlock(ModBlocks.SMOOTH_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    // public static final DeferredBlock<SlabBlock> SMOOTH_STONE_SLAB = registerBlock("smooth_stone_slab",
    //         () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> POLISHED_STONE = registerBlock("polished_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> CUT_STONE = registerBlock("cut_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> CUT_STONE_SLAB = registerBlock("cut_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<RotatedPillarBlock> STONE_PILLAR = registerBlock("stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> STONE_TILES = registerBlock("stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> DARK_STONE = registerBlock("dark_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> DARK_STONE_STAIRS = registerBlock("dark_stone_stairs",
            () -> new StairBlock(ModBlocks.DARK_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> DARK_STONE_SLAB = registerBlock("dark_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    // Mossy Stone
    public static final DeferredBlock<Block> MOSSY_STONE = registerBlock("mossy_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> MOSSY_STONE_STAIRS = registerBlock("mossy_stone_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> MOSSY_STONE_SLAB = registerBlock("mossy_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> MOSSY_STONE_WALL = registerBlock("mossy_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> SMOOTH_MOSSY_STONE = registerBlock("smooth_mossy_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> SMOOTH_MOSSY_STONE_STAIRS = registerBlock("smooth_mossy_stone_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_MOSSY_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> SMOOTH_MOSSY_STONE_SLAB = registerBlock("smooth_mossy_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> POLISHED_MOSSY_STONE = registerBlock("polished_mossy_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> POLISHED_MOSSY_STONE_STAIRS = registerBlock("polished_mossy_stone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_MOSSY_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> POLISHED_MOSSY_STONE_SLAB = registerBlock("polished_mossy_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> POLISHED_MOSSY_STONE_WALL = registerBlock("polished_mossy_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> CHISELED_MOSSY_STONE_BRICKS = registerBlock("chiseled_mossy_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> CUT_MOSSY_STONE = registerBlock("cut_mossy_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> CUT_MOSSY_STONE_SLAB = registerBlock("cut_mossy_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> CRACKED_MOSSY_STONE_BRICKS = registerBlock("cracked_mossy_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<RotatedPillarBlock> MOSSY_STONE_PILLAR = registerBlock("mossy_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> DARK_MOSSY_STONE = registerBlock("dark_mossy_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> DARK_MOSSY_STONE_STAIRS = registerBlock("dark_mossy_stone_stairs",
            () -> new StairBlock(ModBlocks.DARK_MOSSY_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> DARK_MOSSY_STONE_SLAB = registerBlock("dark_mossy_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    // Granite
    public static final DeferredBlock<Block> COBBLED_GRANITE = registerBlock("cobbled_granite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<StairBlock> COBBLED_GRANITE_STAIRS = registerBlock("cobbled_granite_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_GRANITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<SlabBlock> COBBLED_GRANITE_SLAB = registerBlock("cobbled_granite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<WallBlock> COBBLED_GRANITE_WALL = registerBlock("cobbled_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<Block> SMOOTH_GRANITE = registerBlock("smooth_granite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<StairBlock> SMOOTH_GRANITE_STAIRS = registerBlock("smooth_granite_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_GRANITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<SlabBlock> SMOOTH_GRANITE_SLAB = registerBlock("smooth_granite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<WallBlock> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<Block> CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<Block> CUT_GRANITE = registerBlock("cut_granite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<SlabBlock> CUT_GRANITE_SLAB = registerBlock("cut_granite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<StairBlock> GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            () -> new StairBlock(ModBlocks.GRANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<SlabBlock> GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<WallBlock> GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<RotatedPillarBlock> GRANITE_PILLAR = registerBlock("granite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<Block> GRANITE_TILES = registerBlock("granite_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<Block> DARK_GRANITE = registerBlock("dark_granite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<StairBlock> DARK_GRANITE_STAIRS = registerBlock("dark_granite_stairs",
            () -> new StairBlock(ModBlocks.DARK_GRANITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<SlabBlock> DARK_GRANITE_SLAB = registerBlock("dark_granite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    // Diorite
    public static final DeferredBlock<Block> COBBLED_DIORITE = registerBlock("cobbled_diorite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<StairBlock> COBBLED_DIORITE_STAIRS = registerBlock("cobbled_diorite_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_DIORITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<SlabBlock> COBBLED_DIORITE_SLAB = registerBlock("cobbled_diorite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<WallBlock> COBBLED_DIORITE_WALL = registerBlock("cobbled_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<Block> SMOOTH_DIORITE = registerBlock("smooth_diorite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<StairBlock> SMOOTH_DIORITE_STAIRS = registerBlock("smooth_diorite_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_DIORITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<SlabBlock> SMOOTH_DIORITE_SLAB = registerBlock("smooth_diorite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<WallBlock> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<Block> CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<Block> CUT_DIORITE = registerBlock("cut_diorite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<SlabBlock> CUT_DIORITE_SLAB = registerBlock("cut_diorite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<Block> DIORITE_BRICKS = registerBlock("diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<StairBlock> DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            () -> new StairBlock(ModBlocks.DIORITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<SlabBlock> DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<WallBlock> DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<RotatedPillarBlock> DIORITE_PILLAR = registerBlock("diorite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<Block> DIORITE_TILES = registerBlock("diorite_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<Block> DARK_DIORITE = registerBlock("dark_diorite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<StairBlock> DARK_DIORITE_STAIRS = registerBlock("dark_diorite_stairs",
            () -> new StairBlock(ModBlocks.DARK_DIORITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    public static final DeferredBlock<SlabBlock> DARK_DIORITE_SLAB = registerBlock("dark_diorite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));
    // Andesite
    public static final DeferredBlock<Block> COBBLED_ANDESITE = registerBlock("cobbled_andesite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<StairBlock> COBBLED_ANDESITE_STAIRS = registerBlock("cobbled_andesite_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_ANDESITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<SlabBlock> COBBLED_ANDESITE_SLAB = registerBlock("cobbled_andesite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<WallBlock> COBBLED_ANDESITE_WALL = registerBlock("cobbled_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<Block> SMOOTH_ANDESITE = registerBlock("smooth_andesite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<StairBlock> SMOOTH_ANDESITE_STAIRS = registerBlock("smooth_andesite_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_ANDESITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<SlabBlock> SMOOTH_ANDESITE_SLAB = registerBlock("smooth_andesite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<WallBlock> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<Block> CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<Block> CUT_ANDESITE = registerBlock("cut_andesite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<SlabBlock> CUT_ANDESITE_SLAB = registerBlock("cut_andesite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<StairBlock> ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            () -> new StairBlock(ModBlocks.ANDESITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<SlabBlock> ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<WallBlock> ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<RotatedPillarBlock> ANDESITE_PILLAR = registerBlock("andesite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<Block> ANDESITE_TILES = registerBlock("andesite_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<Block> DARK_ANDESITE = registerBlock("dark_andesite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<StairBlock> DARK_ANDESITE_STAIRS = registerBlock("dark_andesite_stairs",
            () -> new StairBlock(ModBlocks.DARK_ANDESITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    public static final DeferredBlock<SlabBlock> DARK_ANDESITE_SLAB = registerBlock("dark_andesite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)));
    // Deepslate
    public static final DeferredBlock<StairBlock> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final DeferredBlock<SlabBlock> DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final DeferredBlock<WallBlock> DEEPSLATE_WALL = registerBlock("deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final DeferredBlock<Block> SMOOTH_DEEPSLATE = registerBlock("smooth_deepslate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final DeferredBlock<StairBlock> SMOOTH_DEEPSLATE_STAIRS = registerBlock("smooth_deepslate_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_DEEPSLATE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final DeferredBlock<SlabBlock> SMOOTH_DEEPSLATE_SLAB = registerBlock("smooth_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final DeferredBlock<Block> CUT_DEEPSLATE = registerBlock("cut_deepslate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final DeferredBlock<SlabBlock> CUT_DEEPSLATE_SLAB = registerBlock("cut_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final DeferredBlock<RotatedPillarBlock> DEEPSLATE_PILLAR = registerBlock("deepslate_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final DeferredBlock<Block> DARK_DEEPSLATE = registerBlock("dark_deepslate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final DeferredBlock<StairBlock> DARK_DEEPSLATE_STAIRS = registerBlock("dark_deepslate_stairs",
            () -> new StairBlock(ModBlocks.DARK_DEEPSLATE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    public static final DeferredBlock<SlabBlock> DARK_DEEPSLATE_SLAB = registerBlock("dark_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));
    // Bricks
    public static final DeferredBlock<Block> COBBLED_BRICKS = registerBlock("cobbled_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<StairBlock> COBBLED_BRICK_STAIRS = registerBlock("cobbled_brick_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<SlabBlock> COBBLED_BRICK_SLAB = registerBlock("cobbled_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<WallBlock> COBBLED_BRICK_WALL = registerBlock("cobbled_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<Block> SMOOTH_BRICK = registerBlock("smooth_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<StairBlock> SMOOTH_BRICK_STAIRS = registerBlock("smooth_brick_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<SlabBlock> SMOOTH_BRICK_SLAB = registerBlock("smooth_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<Block> POLISHED_BRICK = registerBlock("polished_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<StairBlock> POLISHED_BRICK_STAIRS = registerBlock("polished_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<SlabBlock> POLISHED_BRICK_SLAB = registerBlock("polished_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<WallBlock> POLISHED_BRICK_WALL = registerBlock("polished_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<Block> CHISELED_BRICKS = registerBlock("chiseled_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<Block> CUT_BRICKS = registerBlock("cut_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<SlabBlock> CUT_BRICK_SLAB = registerBlock("cut_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<Block> CRACKED_BRICKS = registerBlock("cracked_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<RotatedPillarBlock> BRICK_PILLAR = registerBlock("brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<Block> BRICK_TILES = registerBlock("brick_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<Block> DARK_BRICKS = registerBlock("dark_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<StairBlock> DARK_BRICK_STAIRS = registerBlock("dark_brick_stairs",
            () -> new StairBlock(ModBlocks.DARK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<SlabBlock> DARK_BRICK_SLAB = registerBlock("dark_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    // Packed Mud
    public static final DeferredBlock<StairBlock> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            () -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<SlabBlock> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<WallBlock> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<Block> COBBLED_MUD = registerBlock("cobbled_mud",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<StairBlock> COBBLED_MUD_STAIRS = registerBlock("cobbled_mud_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_MUD.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<SlabBlock> COBBLED_MUD_SLAB = registerBlock("cobbled_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<WallBlock> COBBLED_MUD_WALL = registerBlock("cobbled_mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<Block> SMOOTH_MUD = registerBlock("smooth_mud",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<StairBlock> SMOOTH_MUD_STAIRS = registerBlock("smooth_mud_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_MUD.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<SlabBlock> SMOOTH_MUD_SLAB = registerBlock("smooth_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<Block> POLISHED_MUD = registerBlock("polished_mud",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<StairBlock> POLISHED_MUD_STAIRS = registerBlock("polished_mud_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_MUD.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<SlabBlock> POLISHED_MUD_SLAB = registerBlock("polished_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<WallBlock> POLISHED_MUD_WALL = registerBlock("polished_mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<Block> CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<Block> CUT_MUD = registerBlock("cut_mud",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<SlabBlock> CUT_MUD_SLAB = registerBlock("cut_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<Block> CRACKED_MUD_BRICKS = registerBlock("cracked_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<RotatedPillarBlock> MUD_PILLAR = registerBlock("mud_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<Block> MUD_TILES = registerBlock("mud_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<Block> DARK_MUD = registerBlock("dark_mud",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<StairBlock> DARK_MUD_STAIRS = registerBlock("dark_mud_stairs",
            () -> new StairBlock(ModBlocks.DARK_MUD.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<SlabBlock> DARK_MUD_SLAB = registerBlock("dark_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    // Sandstone
    public static final DeferredBlock<Block> COBBLED_SANDSTONE = registerBlock("cobbled_sandstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<StairBlock> COBBLED_SANDSTONE_STAIRS = registerBlock("cobbled_sandstone_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<SlabBlock> COBBLED_SANDSTONE_SLAB = registerBlock("cobbled_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<WallBlock> COBBLED_SANDSTONE_WALL = registerBlock("cobbled_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<Block> POLISHED_SANDSTONE = registerBlock("polished_sandstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<StairBlock> POLISHED_SANDSTONE_STAIRS = registerBlock("polished_sandstone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<SlabBlock> POLISHED_SANDSTONE_SLAB = registerBlock("polished_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<WallBlock> POLISHED_SANDSTONE_WALL = registerBlock("polished_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<StairBlock> SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            () -> new StairBlock(ModBlocks.SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<SlabBlock> SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<WallBlock> SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<Block> CRACKED_SANDSTONE_BRICKS = registerBlock("cracked_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<RotatedPillarBlock> SANDSTONE_PILLAR = registerBlock("sandstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<Block> SANDSTONE_TILES = registerBlock("sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<Block> DARK_SANDSTONE = registerBlock("dark_sandstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<StairBlock> DARK_SANDSTONE_STAIRS = registerBlock("dark_sandstone_stairs",
            () -> new StairBlock(ModBlocks.DARK_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<SlabBlock> DARK_SANDSTONE_SLAB = registerBlock("dark_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    // Red Sandstone
    public static final DeferredBlock<Block> COBBLED_RED_SANDSTONE = registerBlock("cobbled_red_sandstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<StairBlock> COBBLED_RED_SANDSTONE_STAIRS = registerBlock("cobbled_red_sandstone_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_RED_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<SlabBlock> COBBLED_RED_SANDSTONE_SLAB = registerBlock("cobbled_red_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<WallBlock> COBBLED_RED_SANDSTONE_WALL = registerBlock("cobbled_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<Block> POLISHED_RED_SANDSTONE = registerBlock("polished_red_sandstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<StairBlock> POLISHED_RED_SANDSTONE_STAIRS = registerBlock("polished_red_sandstone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_RED_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<SlabBlock> POLISHED_RED_SANDSTONE_SLAB = registerBlock("polished_red_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<WallBlock> POLISHED_RED_SANDSTONE_WALL = registerBlock("polished_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<Block> RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<StairBlock> RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            () -> new StairBlock(ModBlocks.RED_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<SlabBlock> RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<WallBlock> RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<Block> CRACKED_RED_SANDSTONE_BRICKS = registerBlock("cracked_red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<RotatedPillarBlock> RED_SANDSTONE_PILLAR = registerBlock("red_sandstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<Block> RED_SANDSTONE_TILES = registerBlock("red_sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<Block> DARK_RED_SANDSTONE = registerBlock("dark_red_sandstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<StairBlock> DARK_RED_SANDSTONE_STAIRS = registerBlock("dark_red_sandstone_stairs",
            () -> new StairBlock(ModBlocks.DARK_RED_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<SlabBlock> DARK_RED_SANDSTONE_SLAB = registerBlock("dark_red_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    // Prismarine
    public static final DeferredBlock<Block> SMOOTH_PRISMARINE = registerBlock("smooth_prismarine",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    public static final DeferredBlock<StairBlock> SMOOTH_PRISMARINE_STAIRS = registerBlock("smooth_prismarine_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_PRISMARINE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    public static final DeferredBlock<SlabBlock> SMOOTH_PRISMARINE_SLAB = registerBlock("smooth_prismarine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    public static final DeferredBlock<Block> POLISHED_PRISMARINE = registerBlock("polished_prismarine",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    public static final DeferredBlock<StairBlock> POLISHED_PRISMARINE_STAIRS = registerBlock("polished_prismarine_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_PRISMARINE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    public static final DeferredBlock<SlabBlock> POLISHED_PRISMARINE_SLAB = registerBlock("polished_prismarine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    public static final DeferredBlock<WallBlock> POLISHED_PRISMARINE_WALL = registerBlock("polished_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    public static final DeferredBlock<Block> CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    public static final DeferredBlock<Block> CUT_PRISMARINE = registerBlock("cut_prismarine",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    public static final DeferredBlock<SlabBlock> CUT_PRISMARINE_SLAB = registerBlock("cut_prismarine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    public static final DeferredBlock<Block> CRACKED_PRISMARINE_BRICKS = registerBlock("cracked_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    public static final DeferredBlock<RotatedPillarBlock> PRISMARINE_PILLAR = registerBlock("prismarine_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    public static final DeferredBlock<Block> PRISMARINE_TILES = registerBlock("prismarine_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)));
    // Nether Brick
    public static final DeferredBlock<Block> COBBLED_NETHER_BRICKS = registerBlock("cobbled_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<StairBlock> COBBLED_NETHER_BRICK_STAIRS = registerBlock("cobbled_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_NETHER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<SlabBlock> COBBLED_NETHER_BRICK_SLAB = registerBlock("cobbled_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<WallBlock> COBBLED_NETHER_BRICK_WALL = registerBlock("cobbled_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<Block> SMOOTH_NETHER_BRICK = registerBlock("smooth_nether_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<StairBlock> SMOOTH_NETHER_BRICK_STAIRS = registerBlock("smooth_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_NETHER_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<SlabBlock> SMOOTH_NETHER_BRICK_SLAB = registerBlock("smooth_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<Block> POLISHED_NETHER_BRICK = registerBlock("polished_nether_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<StairBlock> POLISHED_NETHER_BRICK_STAIRS = registerBlock("polished_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_NETHER_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<SlabBlock> POLISHED_NETHER_BRICK_SLAB = registerBlock("polished_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<WallBlock> POLISHED_NETHER_BRICK_WALL = registerBlock("polished_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<Block> CUT_NETHER_BRICKS = registerBlock("cut_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<SlabBlock> CUT_NETHER_BRICK_SLAB = registerBlock("cut_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<RotatedPillarBlock> NETHER_BRICK_PILLAR = registerBlock("nether_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<Block> NETHER_BRICK_TILES = registerBlock("nether_brick_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<Block> DARK_NETHER_BRICKS = registerBlock("dark_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<StairBlock> DARK_NETHER_BRICK_STAIRS = registerBlock("dark_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.DARK_NETHER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    public static final DeferredBlock<SlabBlock> DARK_NETHER_BRICK_SLAB = registerBlock("dark_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));
    // Red Nether Brick
    public static final DeferredBlock<Block> COBBLED_RED_NETHER_BRICKS = registerBlock("cobbled_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<StairBlock> COBBLED_RED_NETHER_BRICK_STAIRS = registerBlock("cobbled_red_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_NETHER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<SlabBlock> COBBLED_RED_NETHER_BRICK_SLAB = registerBlock("cobbled_red_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<WallBlock> COBBLED_RED_NETHER_BRICK_WALL = registerBlock("cobbled_red_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<Block> SMOOTH_RED_NETHER_BRICK = registerBlock("smooth_red_nether_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<StairBlock> SMOOTH_RED_NETHER_BRICK_STAIRS = registerBlock("smooth_red_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_RED_NETHER_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<SlabBlock> SMOOTH_RED_NETHER_BRICK_SLAB = registerBlock("smooth_red_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<Block> POLISHED_RED_NETHER_BRICK = registerBlock("polished_red_nether_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<StairBlock> POLISHED_RED_NETHER_BRICK_STAIRS = registerBlock("polished_red_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_RED_NETHER_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<SlabBlock> POLISHED_RED_NETHER_BRICK_SLAB = registerBlock("polished_red_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<WallBlock> POLISHED_RED_NETHER_BRICK_WALL = registerBlock("polished_red_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<Block> CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<Block> CUT_RED_NETHER_BRICKS = registerBlock("cut_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<SlabBlock> CUT_RED_NETHER_BRICK_SLAB = registerBlock("cut_red_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<Block> CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<RotatedPillarBlock> RED_NETHER_BRICK_PILLAR = registerBlock("red_nether_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<Block> RED_NETHER_BRICK_TILES = registerBlock("red_nether_brick_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<Block> DARK_RED_NETHER_BRICKS = registerBlock("dark_red_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<StairBlock> DARK_RED_NETHER_BRICK_STAIRS = registerBlock("dark_red_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.DARK_RED_NETHER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<SlabBlock> DARK_RED_NETHER_BRICK_SLAB = registerBlock("dark_red_nether_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    public static final DeferredBlock<FenceBlock> RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)));
    // Basalt
     public static final DeferredBlock<StairBlock> BASALT_STAIRS = registerBlock("basalt_stairs",
             () -> new StairBlock(Blocks.BASALT.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
     public static final DeferredBlock<SlabBlock> BASALT_SLAB = registerBlock("basalt_slab",
             () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
     public static final DeferredBlock<WallBlock> BASALT_WALL = registerBlock("basalt_wall",
             () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<Block> COBBLED_BASALT = registerBlock("cobbled_basalt",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<StairBlock> COBBLED_BASALT_STAIRS = registerBlock("cobbled_basalt_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_BASALT.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<SlabBlock> COBBLED_BASALT_SLAB = registerBlock("cobbled_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<WallBlock> COBBLED_BASALT_WALL = registerBlock("cobbled_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<StairBlock> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<SlabBlock> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<Block> POLISHED_BASALT = registerBlock("polished_basalt",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<StairBlock> POLISHED_BASALT_STAIRS = registerBlock("polished_basalt_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_BASALT.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<SlabBlock> POLISHED_BASALT_SLAB = registerBlock("polished_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<WallBlock> POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<RotatedPillarBlock> CHISELED_BASALT_BRICKS = registerBlock("chiseled_basalt_bricks",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<Block> CUT_BASALT = registerBlock("cut_basalt",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<SlabBlock> CUT_BASALT_SLAB = registerBlock("cut_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<Block> BASALT_BRICKS = registerBlock("basalt_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<StairBlock> BASALT_BRICK_STAIRS = registerBlock("basalt_brick_stairs",
            () -> new StairBlock(ModBlocks.BASALT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<SlabBlock> BASALT_BRICK_SLAB = registerBlock("basalt_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<WallBlock> BASALT_BRICK_WALL = registerBlock("basalt_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<Block> CRACKED_BASALT_BRICKS = registerBlock("cracked_basalt_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<Block> BASALT_TILES = registerBlock("basalt_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<Block> DARK_BASALT = registerBlock("dark_basalt",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<StairBlock> DARK_BASALT_STAIRS = registerBlock("dark_basalt_stairs",
            () -> new StairBlock(ModBlocks.DARK_BASALT.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    public static final DeferredBlock<SlabBlock> DARK_BASALT_SLAB = registerBlock("dark_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    // Blackstone
    public static final DeferredBlock<Block> COBBLED_BLACKSTONE = registerBlock("cobbled_blackstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<StairBlock> COBBLED_BLACKSTONE_STAIRS = registerBlock("cobbled_blackstone_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_BLACKSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> COBBLED_BLACKSTONE_SLAB = registerBlock("cobbled_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<WallBlock> COBBLED_BLACKSTONE_WALL = registerBlock("cobbled_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<Block> SMOOTH_BLACKSTONE = registerBlock("smooth_blackstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<StairBlock> SMOOTH_BLACKSTONE_STAIRS = registerBlock("smooth_blackstone_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_BLACKSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> SMOOTH_BLACKSTONE_SLAB = registerBlock("smooth_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<Block> CUT_BLACKSTONE = registerBlock("cut_blackstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> CUT_BLACKSTONE_SLAB = registerBlock("cut_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<RotatedPillarBlock> BLACKSTONE_PILLAR = registerBlock("blackstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<Block> BLACKSTONE_TILES = registerBlock("blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<Block> DARK_BLACKSTONE = registerBlock("dark_blackstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<StairBlock> DARK_BLACKSTONE_STAIRS = registerBlock("dark_blackstone_stairs",
            () -> new StairBlock(ModBlocks.DARK_BLACKSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> DARK_BLACKSTONE_SLAB = registerBlock("dark_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    // End Stone
    public static final DeferredBlock<StairBlock> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            () -> new StairBlock(Blocks.END_STONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<SlabBlock> END_STONE_SLAB = registerBlock("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<WallBlock> END_STONE_WALL = registerBlock("end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> COBBLED_END_STONE = registerBlock("cobbled_end_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<StairBlock> COBBLED_END_STONE_STAIRS = registerBlock("cobbled_end_stone_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<SlabBlock> COBBLED_END_STONE_SLAB = registerBlock("cobbled_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<WallBlock> COBBLED_END_STONE_WALL = registerBlock("cobbled_end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> SMOOTH_END_STONE = registerBlock("smooth_end_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<StairBlock> SMOOTH_END_STONE_STAIRS = registerBlock("smooth_end_stone_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<SlabBlock> SMOOTH_END_STONE_SLAB = registerBlock("smooth_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> POLISHED_END_STONE = registerBlock("polished_end_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<StairBlock> POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<SlabBlock> POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<WallBlock> POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> CUT_END_STONE = registerBlock("cut_end_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<SlabBlock> CUT_END_STONE_SLAB = registerBlock("cut_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    public static final DeferredBlock<RotatedPillarBlock> END_STONE_PILLAR = registerBlock("end_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> END_STONE_TILES = registerBlock("end_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> DARK_END_STONE = registerBlock("dark_end_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<StairBlock> DARK_END_STONE_STAIRS = registerBlock("dark_end_stone_stairs",
            () -> new StairBlock(ModBlocks.DARK_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<SlabBlock> DARK_END_STONE_SLAB = registerBlock("dark_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    // Purpur
    public static final DeferredBlock<WallBlock> PURPUR_WALL = registerBlock("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> COBBLED_PURPUR = registerBlock("cobbled_purpur",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<StairBlock> COBBLED_PURPUR_STAIRS = registerBlock("cobbled_purpur_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_PURPUR.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<SlabBlock> COBBLED_PURPUR_SLAB = registerBlock("cobbled_purpur_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<WallBlock> COBBLED_PURPUR_WALL = registerBlock("cobbled_purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> SMOOTH_PURPUR = registerBlock("smooth_purpur",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<StairBlock> SMOOTH_PURPUR_STAIRS = registerBlock("smooth_purpur_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_PURPUR.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<SlabBlock> SMOOTH_PURPUR_SLAB = registerBlock("smooth_purpur_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> POLISHED_PURPUR = registerBlock("polished_purpur",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<StairBlock> POLISHED_PURPUR_STAIRS = registerBlock("polished_purpur_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_PURPUR.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<SlabBlock> POLISHED_PURPUR_SLAB = registerBlock("polished_purpur_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<WallBlock> POLISHED_PURPUR_WALL = registerBlock("polished_purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> CHISELED_PURPUR_BRICKS = registerBlock("chiseled_purpur_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> CUT_PURPUR = registerBlock("cut_purpur",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<SlabBlock> CUT_PURPUR_SLAB = registerBlock("cut_purpur_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> PURPUR_BRICKS = registerBlock("purpur_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<StairBlock> PURPUR_BRICK_STAIRS = registerBlock("purpur_brick_stairs",
            () -> new StairBlock(ModBlocks.PURPUR_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<SlabBlock> PURPUR_BRICK_SLAB = registerBlock("purpur_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<WallBlock> PURPUR_BRICK_WALL = registerBlock("purpur_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> CRACKED_PURPUR_BRICKS = registerBlock("cracked_purpur_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> PURPUR_TILES = registerBlock("purpur_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> DARK_PURPUR = registerBlock("dark_purpur",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<StairBlock> DARK_PURPUR_STAIRS = registerBlock("dark_purpur_stairs",
            () -> new StairBlock(ModBlocks.DARK_PURPUR.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<SlabBlock> DARK_PURPUR_SLAB = registerBlock("dark_purpur_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    // Quartz
    public static final DeferredBlock<Block> COBBLED_QUARTZ = registerBlock("cobbled_quartz",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<StairBlock> COBBLED_QUARTZ_STAIRS = registerBlock("cobbled_quartz_stairs",
            () -> new StairBlock(ModBlocks.COBBLED_QUARTZ.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<SlabBlock> COBBLED_QUARTZ_SLAB = registerBlock("cobbled_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<WallBlock> COBBLED_QUARTZ_WALL = registerBlock("cobbled_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<Block> POLISHED_QUARTZ = registerBlock("polished_quartz",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<StairBlock> POLISHED_QUARTZ_STAIRS = registerBlock("polished_quartz_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_QUARTZ.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<SlabBlock> POLISHED_QUARTZ_SLAB = registerBlock("polished_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<WallBlock> POLISHED_QUARTZ_WALL = registerBlock("polished_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<Block> CUT_QUARTZ = registerBlock("cut_quartz",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<SlabBlock> CUT_QUARTZ_SLAB = registerBlock("cut_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<StairBlock> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<SlabBlock> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<WallBlock> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<Block> CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<Block> QUARTZ_TILES = registerBlock("quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<Block> DARK_QUARTZ = registerBlock("dark_quartz",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<StairBlock> DARK_QUARTZ_STAIRS = registerBlock("dark_quartz_stairs",
            () -> new StairBlock(ModBlocks.DARK_QUARTZ.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<SlabBlock> DARK_QUARTZ_SLAB = registerBlock("dark_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    //Dripstone
    //TODO: Dripstone Build Set

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        regiserBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void regiserBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
