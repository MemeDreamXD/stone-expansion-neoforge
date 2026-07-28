package com.memedream.stoneexpansion;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(StoneExpansion.MOD_ID);

    // SMOOTH STONE

    public static final DeferredBlock<StairBlock> SMOOTH_STONE_STAIRS = BLOCKS.register("smooth_stone_stairs",
            (id) -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> SMOOTH_STONE_WALL = BLOCKS.register("smooth_stone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> COBBLED_SMOOTH_STONE = BLOCKS.register("cobbled_smooth_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_SMOOTH_STONE_STAIRS = BLOCKS.register("cobbled_smooth_stone_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_SMOOTH_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_SMOOTH_STONE_SLAB = BLOCKS.register("cobbled_smooth_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_SMOOTH_STONE_WALL = BLOCKS.register("cobbled_smooth_stone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_SMOOTH_STONE = BLOCKS.register("polished_smooth_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_SMOOTH_STONE_STAIRS = BLOCKS.register("polished_smooth_stone_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_SMOOTH_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_SMOOTH_STONE_SLAB = BLOCKS.register("polished_smooth_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_SMOOTH_STONE_WALL = BLOCKS.register("polished_smooth_stone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CHISELED_SMOOTH_STONE_BRICKS = BLOCKS.register("chiseled_smooth_stone_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_SMOOTH_STONE = BLOCKS.register("cut_smooth_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_SMOOTH_STONE_SLAB = BLOCKS.register("cut_smooth_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_STONE_BRICKS = BLOCKS.register("smooth_stone_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_STONE_BRICK_STAIRS = BLOCKS.register("smooth_stone_brick_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_STONE_BRICK_SLAB = BLOCKS.register("smooth_stone_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> SMOOTH_STONE_BRICK_WALL = BLOCKS.register("smooth_stone_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_SMOOTH_STONE_BRICKS = BLOCKS.register("cracked_smooth_stone_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> SMOOTH_STONE_PILLAR = BLOCKS.register("smooth_stone_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_STONE_TILES = BLOCKS.register("smooth_stone_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_SMOOTH_STONE = BLOCKS.register("dark_smooth_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_SMOOTH_STONE_STAIRS = BLOCKS.register("dark_smooth_stone_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_SMOOTH_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_SMOOTH_STONE_SLAB = BLOCKS.register("dark_smooth_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Stone
    public static final DeferredBlock<WallBlock> STONE_WALL = BLOCKS.register("stone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    
    public static final DeferredBlock<Block> POLISHED_STONE = BLOCKS.register("polished_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_STONE_STAIRS = BLOCKS.register("polished_stone_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_STONE_SLAB = BLOCKS.register("polished_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_STONE_WALL = BLOCKS.register("polished_stone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_STONE = BLOCKS.register("cut_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_STONE_SLAB = BLOCKS.register("cut_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> STONE_PILLAR = BLOCKS.register("stone_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> STONE_TILES = BLOCKS.register("stone_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_STONE = BLOCKS.register("dark_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_STONE_STAIRS = BLOCKS.register("dark_stone_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_STONE_SLAB = BLOCKS.register("dark_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Mossy Stone
    public static final DeferredBlock<Block> MOSSY_STONE = BLOCKS.register("mossy_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> MOSSY_STONE_STAIRS = BLOCKS.register("mossy_stone_stairs",
            (id) -> new StairBlock(ModBlocks.MOSSY_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> MOSSY_STONE_SLAB = BLOCKS.register("mossy_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> MOSSY_STONE_WALL = BLOCKS.register("mossy_stone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_MOSSY_STONE = BLOCKS.register("smooth_mossy_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_MOSSY_STONE_STAIRS = BLOCKS.register("smooth_mossy_stone_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_MOSSY_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_MOSSY_STONE_SLAB = BLOCKS.register("smooth_mossy_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_MOSSY_STONE = BLOCKS.register("polished_mossy_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_MOSSY_STONE_STAIRS = BLOCKS.register("polished_mossy_stone_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_MOSSY_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_MOSSY_STONE_SLAB = BLOCKS.register("polished_mossy_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_MOSSY_STONE_WALL = BLOCKS.register("polished_mossy_stone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CHISELED_MOSSY_STONE_BRICKS = BLOCKS.register("chiseled_mossy_stone_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_MOSSY_STONE = BLOCKS.register("cut_mossy_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_MOSSY_STONE_SLAB = BLOCKS.register("cut_mossy_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_MOSSY_STONE_BRICKS = BLOCKS.register("cracked_mossy_stone_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> MOSSY_STONE_PILLAR = BLOCKS.register("mossy_stone_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> MOSSY_STONE_TILES = BLOCKS.register("mossy_stone_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_MOSSY_STONE = BLOCKS.register("dark_mossy_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_MOSSY_STONE_STAIRS = BLOCKS.register("dark_mossy_stone_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_MOSSY_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_MOSSY_STONE_SLAB = BLOCKS.register("dark_mossy_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Granite
    public static final DeferredBlock<Block> COBBLED_GRANITE = BLOCKS.register("cobbled_granite",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_GRANITE_STAIRS = BLOCKS.register("cobbled_granite_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_GRANITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_GRANITE_SLAB = BLOCKS.register("cobbled_granite_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_GRANITE_WALL = BLOCKS.register("cobbled_granite_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_GRANITE = BLOCKS.register("smooth_granite",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_GRANITE_STAIRS = BLOCKS.register("smooth_granite_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_GRANITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_GRANITE_SLAB = BLOCKS.register("smooth_granite_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_GRANITE_WALL = BLOCKS.register("polished_granite_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CHISELED_GRANITE_BRICKS = BLOCKS.register("chiseled_granite_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_GRANITE = BLOCKS.register("cut_granite",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_GRANITE_SLAB = BLOCKS.register("cut_granite_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> GRANITE_BRICKS = BLOCKS.register("granite_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> GRANITE_BRICK_STAIRS = BLOCKS.register("granite_brick_stairs",
            (id) -> new StairBlock(ModBlocks.GRANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> GRANITE_BRICK_SLAB = BLOCKS.register("granite_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> GRANITE_BRICK_WALL = BLOCKS.register("granite_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_GRANITE_BRICKS = BLOCKS.register("cracked_granite_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> GRANITE_PILLAR = BLOCKS.register("granite_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> GRANITE_TILES = BLOCKS.register("granite_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_GRANITE = BLOCKS.register("dark_granite",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_GRANITE_STAIRS = BLOCKS.register("dark_granite_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_GRANITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_GRANITE_SLAB = BLOCKS.register("dark_granite_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Diorite
    public static final DeferredBlock<Block> COBBLED_DIORITE = BLOCKS.register("cobbled_diorite",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_DIORITE_STAIRS = BLOCKS.register("cobbled_diorite_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_DIORITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_DIORITE_SLAB = BLOCKS.register("cobbled_diorite_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_DIORITE_WALL = BLOCKS.register("cobbled_diorite_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_DIORITE = BLOCKS.register("smooth_diorite",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_DIORITE_STAIRS = BLOCKS.register("smooth_diorite_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_DIORITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_DIORITE_SLAB = BLOCKS.register("smooth_diorite_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_DIORITE_WALL = BLOCKS.register("polished_diorite_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CHISELED_DIORITE_BRICKS = BLOCKS.register("chiseled_diorite_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_DIORITE = BLOCKS.register("cut_diorite",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_DIORITE_SLAB = BLOCKS.register("cut_diorite_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DIORITE_BRICKS = BLOCKS.register("diorite_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DIORITE_BRICK_STAIRS = BLOCKS.register("diorite_brick_stairs",
            (id) -> new StairBlock(ModBlocks.DIORITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DIORITE_BRICK_SLAB = BLOCKS.register("diorite_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> DIORITE_BRICK_WALL = BLOCKS.register("diorite_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_DIORITE_BRICKS = BLOCKS.register("cracked_diorite_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> DIORITE_PILLAR = BLOCKS.register("diorite_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DIORITE_TILES = BLOCKS.register("diorite_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_DIORITE = BLOCKS.register("dark_diorite",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_DIORITE_STAIRS = BLOCKS.register("dark_diorite_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_DIORITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_DIORITE_SLAB = BLOCKS.register("dark_diorite_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Andesite
    public static final DeferredBlock<Block> COBBLED_ANDESITE = BLOCKS.register("cobbled_andesite",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_ANDESITE_STAIRS = BLOCKS.register("cobbled_andesite_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_ANDESITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_ANDESITE_SLAB = BLOCKS.register("cobbled_andesite_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_ANDESITE_WALL = BLOCKS.register("cobbled_andesite_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_ANDESITE = BLOCKS.register("smooth_andesite",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_ANDESITE_STAIRS = BLOCKS.register("smooth_andesite_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_ANDESITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_ANDESITE_SLAB = BLOCKS.register("smooth_andesite_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_ANDESITE_WALL = BLOCKS.register("polished_andesite_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CHISELED_ANDESITE_BRICKS = BLOCKS.register("chiseled_andesite_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_ANDESITE = BLOCKS.register("cut_andesite",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_ANDESITE_SLAB = BLOCKS.register("cut_andesite_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> ANDESITE_BRICKS = BLOCKS.register("andesite_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> ANDESITE_BRICK_STAIRS = BLOCKS.register("andesite_brick_stairs",
            (id) -> new StairBlock(ModBlocks.ANDESITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> ANDESITE_BRICK_SLAB = BLOCKS.register("andesite_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> ANDESITE_BRICK_WALL = BLOCKS.register("andesite_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_ANDESITE_BRICKS = BLOCKS.register("cracked_andesite_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> ANDESITE_PILLAR = BLOCKS.register("andesite_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> ANDESITE_TILES = BLOCKS.register("andesite_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_ANDESITE = BLOCKS.register("dark_andesite",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_ANDESITE_STAIRS = BLOCKS.register("dark_andesite_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_ANDESITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_ANDESITE_SLAB = BLOCKS.register("dark_andesite_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Deepslate
    public static final DeferredBlock<StairBlock> DEEPSLATE_STAIRS = BLOCKS.register("deepslate_stairs",
            (id) -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DEEPSLATE_SLAB = BLOCKS.register("deepslate_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> DEEPSLATE_WALL = BLOCKS.register("deepslate_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_DEEPSLATE = BLOCKS.register("smooth_deepslate",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_DEEPSLATE_STAIRS = BLOCKS.register("smooth_deepslate_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_DEEPSLATE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_DEEPSLATE_SLAB = BLOCKS.register("smooth_deepslate_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_DEEPSLATE = BLOCKS.register("cut_deepslate",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_DEEPSLATE_SLAB = BLOCKS.register("cut_deepslate_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> DEEPSLATE_PILLAR = BLOCKS.register("deepslate_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_DEEPSLATE = BLOCKS.register("dark_deepslate",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_DEEPSLATE_STAIRS = BLOCKS.register("dark_deepslate_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_DEEPSLATE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_DEEPSLATE_SLAB = BLOCKS.register("dark_deepslate_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Bricks
    public static final DeferredBlock<Block> COBBLED_BRICKS = BLOCKS.register("cobbled_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_BRICK_STAIRS = BLOCKS.register("cobbled_brick_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_BRICK_SLAB = BLOCKS.register("cobbled_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_BRICK_WALL = BLOCKS.register("cobbled_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_BRICK = BLOCKS.register("smooth_brick",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_BRICK_STAIRS = BLOCKS.register("smooth_brick_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_BRICK_SLAB = BLOCKS.register("smooth_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_BRICK = BLOCKS.register("polished_brick",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_BRICK_STAIRS = BLOCKS.register("polished_brick_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_BRICK_SLAB = BLOCKS.register("polished_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_BRICK_WALL = BLOCKS.register("polished_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CHISELED_BRICKS = BLOCKS.register("chiseled_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_BRICKS = BLOCKS.register("cut_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_BRICK_SLAB = BLOCKS.register("cut_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_BRICKS = BLOCKS.register("cracked_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> BRICK_PILLAR = BLOCKS.register("brick_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> BRICK_TILES = BLOCKS.register("brick_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_BRICKS = BLOCKS.register("dark_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_BRICK_STAIRS = BLOCKS.register("dark_brick_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_BRICK_SLAB = BLOCKS.register("dark_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Packed Mud
    public static final DeferredBlock<StairBlock> PACKED_MUD_STAIRS = BLOCKS.register("packed_mud_stairs",
            (id) -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> PACKED_MUD_SLAB = BLOCKS.register("packed_mud_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> PACKED_MUD_WALL = BLOCKS.register("packed_mud_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> COBBLED_MUD = BLOCKS.register("cobbled_mud",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_MUD_STAIRS = BLOCKS.register("cobbled_mud_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_MUD.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_MUD_SLAB = BLOCKS.register("cobbled_mud_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_MUD_WALL = BLOCKS.register("cobbled_mud_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_MUD = BLOCKS.register("smooth_mud",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_MUD_STAIRS = BLOCKS.register("smooth_mud_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_MUD.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_MUD_SLAB = BLOCKS.register("smooth_mud_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_MUD = BLOCKS.register("polished_mud",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_MUD_STAIRS = BLOCKS.register("polished_mud_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_MUD.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_MUD_SLAB = BLOCKS.register("polished_mud_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_MUD_WALL = BLOCKS.register("polished_mud_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CHISELED_MUD_BRICKS = BLOCKS.register("chiseled_mud_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_MUD = BLOCKS.register("cut_mud",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_MUD_SLAB = BLOCKS.register("cut_mud_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_MUD_BRICKS = BLOCKS.register("cracked_mud_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> MUD_PILLAR = BLOCKS.register("mud_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> MUD_TILES = BLOCKS.register("mud_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_MUD = BLOCKS.register("dark_mud",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_MUD_STAIRS = BLOCKS.register("dark_mud_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_MUD.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_MUD_SLAB = BLOCKS.register("dark_mud_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Sandstone
    public static final DeferredBlock<Block> COBBLED_SANDSTONE = BLOCKS.register("cobbled_sandstone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_SANDSTONE_STAIRS = BLOCKS.register("cobbled_sandstone_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_SANDSTONE_SLAB = BLOCKS.register("cobbled_sandstone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_SANDSTONE_WALL = BLOCKS.register("cobbled_sandstone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_SANDSTONE = BLOCKS.register("polished_sandstone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_SANDSTONE_STAIRS = BLOCKS.register("polished_sandstone_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_SANDSTONE_SLAB = BLOCKS.register("polished_sandstone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_SANDSTONE_WALL = BLOCKS.register("polished_sandstone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SANDSTONE_BRICKS = BLOCKS.register("sandstone_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SANDSTONE_BRICK_STAIRS = BLOCKS.register("sandstone_brick_stairs",
            (id) -> new StairBlock(ModBlocks.SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SANDSTONE_BRICK_SLAB = BLOCKS.register("sandstone_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> SANDSTONE_BRICK_WALL = BLOCKS.register("sandstone_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_SANDSTONE_BRICKS = BLOCKS.register("cracked_sandstone_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> SANDSTONE_PILLAR = BLOCKS.register("sandstone_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SANDSTONE_TILES = BLOCKS.register("sandstone_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_SANDSTONE = BLOCKS.register("dark_sandstone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_SANDSTONE_STAIRS = BLOCKS.register("dark_sandstone_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_SANDSTONE_SLAB = BLOCKS.register("dark_sandstone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Red Sandstone
    public static final DeferredBlock<Block> COBBLED_RED_SANDSTONE = BLOCKS.register("cobbled_red_sandstone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_RED_SANDSTONE_STAIRS = BLOCKS.register("cobbled_red_sandstone_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_RED_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_RED_SANDSTONE_SLAB = BLOCKS.register("cobbled_red_sandstone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_RED_SANDSTONE_WALL = BLOCKS.register("cobbled_red_sandstone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_RED_SANDSTONE = BLOCKS.register("polished_red_sandstone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_RED_SANDSTONE_STAIRS = BLOCKS.register("polished_red_sandstone_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_RED_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_RED_SANDSTONE_SLAB = BLOCKS.register("polished_red_sandstone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_RED_SANDSTONE_WALL = BLOCKS.register("polished_red_sandstone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> RED_SANDSTONE_BRICKS = BLOCKS.register("red_sandstone_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> RED_SANDSTONE_BRICK_STAIRS = BLOCKS.register("red_sandstone_brick_stairs",
            (id) -> new StairBlock(ModBlocks.RED_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> RED_SANDSTONE_BRICK_SLAB = BLOCKS.register("red_sandstone_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> RED_SANDSTONE_BRICK_WALL = BLOCKS.register("red_sandstone_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_RED_SANDSTONE_BRICKS = BLOCKS.register("cracked_red_sandstone_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> RED_SANDSTONE_PILLAR = BLOCKS.register("red_sandstone_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> RED_SANDSTONE_TILES = BLOCKS.register("red_sandstone_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_RED_SANDSTONE = BLOCKS.register("dark_red_sandstone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_RED_SANDSTONE_STAIRS = BLOCKS.register("dark_red_sandstone_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_RED_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_RED_SANDSTONE_SLAB = BLOCKS.register("dark_red_sandstone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Prismarine
    public static final DeferredBlock<Block> SMOOTH_PRISMARINE = BLOCKS.register("smooth_prismarine",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_PRISMARINE_STAIRS = BLOCKS.register("smooth_prismarine_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_PRISMARINE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_PRISMARINE_SLAB = BLOCKS.register("smooth_prismarine_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_PRISMARINE = BLOCKS.register("polished_prismarine",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_PRISMARINE_STAIRS = BLOCKS.register("polished_prismarine_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_PRISMARINE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_PRISMARINE_SLAB = BLOCKS.register("polished_prismarine_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_PRISMARINE_WALL = BLOCKS.register("polished_prismarine_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CHISELED_PRISMARINE_BRICKS = BLOCKS.register("chiseled_prismarine_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_PRISMARINE = BLOCKS.register("cut_prismarine",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_PRISMARINE_SLAB = BLOCKS.register("cut_prismarine_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_PRISMARINE_BRICKS = BLOCKS.register("cracked_prismarine_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> PRISMARINE_PILLAR = BLOCKS.register("prismarine_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> PRISMARINE_TILES = BLOCKS.register("prismarine_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Nether Brick
    public static final DeferredBlock<Block> COBBLED_NETHER_BRICKS = BLOCKS.register("cobbled_nether_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_NETHER_BRICK_STAIRS = BLOCKS.register("cobbled_nether_brick_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_NETHER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_NETHER_BRICK_SLAB = BLOCKS.register("cobbled_nether_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_NETHER_BRICK_WALL = BLOCKS.register("cobbled_nether_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_NETHER_BRICK = BLOCKS.register("smooth_nether_brick",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_NETHER_BRICK_STAIRS = BLOCKS.register("smooth_nether_brick_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_NETHER_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_NETHER_BRICK_SLAB = BLOCKS.register("smooth_nether_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_NETHER_BRICK = BLOCKS.register("polished_nether_brick",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_NETHER_BRICK_STAIRS = BLOCKS.register("polished_nether_brick_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_NETHER_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_NETHER_BRICK_SLAB = BLOCKS.register("polished_nether_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_NETHER_BRICK_WALL = BLOCKS.register("polished_nether_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_NETHER_BRICKS = BLOCKS.register("cut_nether_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_NETHER_BRICK_SLAB = BLOCKS.register("cut_nether_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> NETHER_BRICK_PILLAR = BLOCKS.register("nether_brick_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> NETHER_BRICK_TILES = BLOCKS.register("nether_brick_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_NETHER_BRICKS = BLOCKS.register("dark_nether_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_NETHER_BRICK_STAIRS = BLOCKS.register("dark_nether_brick_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_NETHER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_NETHER_BRICK_SLAB = BLOCKS.register("dark_nether_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Red Nether Brick
    public static final DeferredBlock<Block> COBBLED_RED_NETHER_BRICKS = BLOCKS.register("cobbled_red_nether_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_RED_NETHER_BRICK_STAIRS = BLOCKS.register("cobbled_red_nether_brick_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_NETHER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_RED_NETHER_BRICK_SLAB = BLOCKS.register("cobbled_red_nether_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_RED_NETHER_BRICK_WALL = BLOCKS.register("cobbled_red_nether_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_RED_NETHER_BRICK = BLOCKS.register("smooth_red_nether_brick",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_RED_NETHER_BRICK_STAIRS = BLOCKS.register("smooth_red_nether_brick_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_RED_NETHER_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_RED_NETHER_BRICK_SLAB = BLOCKS.register("smooth_red_nether_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_RED_NETHER_BRICK = BLOCKS.register("polished_red_nether_brick",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_RED_NETHER_BRICK_STAIRS = BLOCKS.register("polished_red_nether_brick_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_RED_NETHER_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_RED_NETHER_BRICK_SLAB = BLOCKS.register("polished_red_nether_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_RED_NETHER_BRICK_WALL = BLOCKS.register("polished_red_nether_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CHISELED_RED_NETHER_BRICKS = BLOCKS.register("chiseled_red_nether_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_RED_NETHER_BRICKS = BLOCKS.register("cut_red_nether_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_RED_NETHER_BRICK_SLAB = BLOCKS.register("cut_red_nether_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_RED_NETHER_BRICKS = BLOCKS.register("cracked_red_nether_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> RED_NETHER_BRICK_PILLAR = BLOCKS.register("red_nether_brick_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> RED_NETHER_BRICK_TILES = BLOCKS.register("red_nether_brick_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_RED_NETHER_BRICKS = BLOCKS.register("dark_red_nether_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_RED_NETHER_BRICK_STAIRS = BLOCKS.register("dark_red_nether_brick_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_RED_NETHER_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_RED_NETHER_BRICK_SLAB = BLOCKS.register("dark_red_nether_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<FenceBlock> RED_NETHER_BRICK_FENCE = BLOCKS.register("red_nether_brick_fence",
            (id) -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Basalt
    public static final DeferredBlock<StairBlock> BASALT_STAIRS = BLOCKS.register("basalt_stairs",
            (id) -> new StairBlock(Blocks.BASALT.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> BASALT_SLAB = BLOCKS.register("basalt_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> BASALT_WALL = BLOCKS.register("basalt_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> COBBLED_BASALT = BLOCKS.register("cobbled_basalt",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_BASALT_STAIRS = BLOCKS.register("cobbled_basalt_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_BASALT.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_BASALT_SLAB = BLOCKS.register("cobbled_basalt_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_BASALT_WALL = BLOCKS.register("cobbled_basalt_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_BASALT_STAIRS = BLOCKS.register("smooth_basalt_stairs",
            (id) -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_BASALT_SLAB = BLOCKS.register("smooth_basalt_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_BASALT = BLOCKS.register("polished_basalt",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_BASALT_STAIRS = BLOCKS.register("polished_basalt_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_BASALT.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_BASALT_SLAB = BLOCKS.register("polished_basalt_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_BASALT_WALL = BLOCKS.register("polished_basalt_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> CHISELED_BASALT_BRICKS = BLOCKS.register("chiseled_basalt_bricks",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_BASALT = BLOCKS.register("cut_basalt",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_BASALT_SLAB = BLOCKS.register("cut_basalt_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> BASALT_BRICKS = BLOCKS.register("basalt_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> BASALT_BRICK_STAIRS = BLOCKS.register("basalt_brick_stairs",
            (id) -> new StairBlock(ModBlocks.BASALT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> BASALT_BRICK_SLAB = BLOCKS.register("basalt_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> BASALT_BRICK_WALL = BLOCKS.register("basalt_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_BASALT_BRICKS = BLOCKS.register("cracked_basalt_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> BASALT_TILES = BLOCKS.register("basalt_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_BASALT = BLOCKS.register("dark_basalt",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_BASALT_STAIRS = BLOCKS.register("dark_basalt_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_BASALT.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_BASALT_SLAB = BLOCKS.register("dark_basalt_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Blackstone
    public static final DeferredBlock<Block> COBBLED_BLACKSTONE = BLOCKS.register("cobbled_blackstone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_BLACKSTONE_STAIRS = BLOCKS.register("cobbled_blackstone_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_BLACKSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_BLACKSTONE_SLAB = BLOCKS.register("cobbled_blackstone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_BLACKSTONE_WALL = BLOCKS.register("cobbled_blackstone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_BLACKSTONE = BLOCKS.register("smooth_blackstone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_BLACKSTONE_STAIRS = BLOCKS.register("smooth_blackstone_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_BLACKSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_BLACKSTONE_SLAB = BLOCKS.register("smooth_blackstone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_BLACKSTONE = BLOCKS.register("cut_blackstone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_BLACKSTONE_SLAB = BLOCKS.register("cut_blackstone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> BLACKSTONE_PILLAR = BLOCKS.register("blackstone_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> BLACKSTONE_TILES = BLOCKS.register("blackstone_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_BLACKSTONE = BLOCKS.register("dark_blackstone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_BLACKSTONE_STAIRS = BLOCKS.register("dark_blackstone_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_BLACKSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_BLACKSTONE_SLAB = BLOCKS.register("dark_blackstone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    // End Stone
    public static final DeferredBlock<StairBlock> END_STONE_STAIRS = BLOCKS.register("end_stone_stairs",
            (id) -> new StairBlock(Blocks.END_STONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> END_STONE_SLAB = BLOCKS.register("end_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> END_STONE_WALL = BLOCKS.register("end_stone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> COBBLED_END_STONE = BLOCKS.register("cobbled_end_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_END_STONE_STAIRS = BLOCKS.register("cobbled_end_stone_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_END_STONE_SLAB = BLOCKS.register("cobbled_end_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_END_STONE_WALL = BLOCKS.register("cobbled_end_stone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_END_STONE = BLOCKS.register("smooth_end_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_END_STONE_STAIRS = BLOCKS.register("smooth_end_stone_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_END_STONE_SLAB = BLOCKS.register("smooth_end_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_END_STONE = BLOCKS.register("polished_end_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_END_STONE_STAIRS = BLOCKS.register("polished_end_stone_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_END_STONE_SLAB = BLOCKS.register("polished_end_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_END_STONE_WALL = BLOCKS.register("polished_end_stone_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CHISELED_END_STONE_BRICKS = BLOCKS.register("chiseled_end_stone_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_END_STONE = BLOCKS.register("cut_end_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_END_STONE_SLAB = BLOCKS.register("cut_end_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_END_STONE_BRICKS = BLOCKS.register("cracked_end_stone_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<RotatedPillarBlock> END_STONE_PILLAR = BLOCKS.register("end_stone_pillar",
            (id) -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> END_STONE_TILES = BLOCKS.register("end_stone_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_END_STONE = BLOCKS.register("dark_end_stone",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_END_STONE_STAIRS = BLOCKS.register("dark_end_stone_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_END_STONE_SLAB = BLOCKS.register("dark_end_stone_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Purpur
    public static final DeferredBlock<WallBlock> PURPUR_WALL = BLOCKS.register("purpur_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> COBBLED_PURPUR = BLOCKS.register("cobbled_purpur",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_PURPUR_STAIRS = BLOCKS.register("cobbled_purpur_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_PURPUR.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_PURPUR_SLAB = BLOCKS.register("cobbled_purpur_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_PURPUR_WALL = BLOCKS.register("cobbled_purpur_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> SMOOTH_PURPUR = BLOCKS.register("smooth_purpur",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> SMOOTH_PURPUR_STAIRS = BLOCKS.register("smooth_purpur_stairs",
            (id) -> new StairBlock(ModBlocks.SMOOTH_PURPUR.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> SMOOTH_PURPUR_SLAB = BLOCKS.register("smooth_purpur_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_PURPUR = BLOCKS.register("polished_purpur",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_PURPUR_STAIRS = BLOCKS.register("polished_purpur_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_PURPUR.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_PURPUR_SLAB = BLOCKS.register("polished_purpur_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_PURPUR_WALL = BLOCKS.register("polished_purpur_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CHISELED_PURPUR_BRICKS = BLOCKS.register("chiseled_purpur_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_PURPUR = BLOCKS.register("cut_purpur",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_PURPUR_SLAB = BLOCKS.register("cut_purpur_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> PURPUR_BRICKS = BLOCKS.register("purpur_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> PURPUR_BRICK_STAIRS = BLOCKS.register("purpur_brick_stairs",
            (id) -> new StairBlock(ModBlocks.PURPUR_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> PURPUR_BRICK_SLAB = BLOCKS.register("purpur_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> PURPUR_BRICK_WALL = BLOCKS.register("purpur_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_PURPUR_BRICKS = BLOCKS.register("cracked_purpur_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> PURPUR_TILES = BLOCKS.register("purpur_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_PURPUR = BLOCKS.register("dark_purpur",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_PURPUR_STAIRS = BLOCKS.register("dark_purpur_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_PURPUR.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_PURPUR_SLAB = BLOCKS.register("dark_purpur_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    // Quartz
    public static final DeferredBlock<Block> COBBLED_QUARTZ = BLOCKS.register("cobbled_quartz",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> COBBLED_QUARTZ_STAIRS = BLOCKS.register("cobbled_quartz_stairs",
            (id) -> new StairBlock(ModBlocks.COBBLED_QUARTZ.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> COBBLED_QUARTZ_SLAB = BLOCKS.register("cobbled_quartz_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> COBBLED_QUARTZ_WALL = BLOCKS.register("cobbled_quartz_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> POLISHED_QUARTZ = BLOCKS.register("polished_quartz",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> POLISHED_QUARTZ_STAIRS = BLOCKS.register("polished_quartz_stairs",
            (id) -> new StairBlock(ModBlocks.POLISHED_QUARTZ.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> POLISHED_QUARTZ_SLAB = BLOCKS.register("polished_quartz_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> POLISHED_QUARTZ_WALL = BLOCKS.register("polished_quartz_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CUT_QUARTZ = BLOCKS.register("cut_quartz",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> CUT_QUARTZ_SLAB = BLOCKS.register("cut_quartz_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> QUARTZ_BRICK_STAIRS = BLOCKS.register("quartz_brick_stairs",
            (id) -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> QUARTZ_BRICK_SLAB = BLOCKS.register("quartz_brick_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<WallBlock> QUARTZ_BRICK_WALL = BLOCKS.register("quartz_brick_wall",
            (id) -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> CRACKED_QUARTZ_BRICKS = BLOCKS.register("cracked_quartz_bricks",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> QUARTZ_TILES = BLOCKS.register("quartz_tiles",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<Block> DARK_QUARTZ = BLOCKS.register("dark_quartz",
            (id) -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<StairBlock> DARK_QUARTZ_STAIRS = BLOCKS.register("dark_quartz_stairs",
            (id) -> new StairBlock(ModBlocks.DARK_QUARTZ.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    public static final DeferredBlock<SlabBlock> DARK_QUARTZ_SLAB = BLOCKS.register("dark_quartz_slab",
            (id) -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(ResourceKey.create(Registries.BLOCK, id))));
    //Dripstone
    //TODO: Dripstone Build Set

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
