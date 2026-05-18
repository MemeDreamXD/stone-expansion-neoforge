package com.memedream.stoneexpansion.datagen;

import com.memedream.stoneexpansion.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //Smooth Stone cooking
        smeltingRecipe(ModBlocks.CRACKED_SMOOTH_STONE_BRICKS, ModBlocks.SMOOTH_STONE_BRICKS, 0.1F, 1).save(recipeOutput);
        //Mossy Stone cooking
        smeltingRecipe(ModBlocks.MOSSY_STONE, Blocks.MOSSY_COBBLESTONE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_MOSSY_STONE, ModBlocks.MOSSY_STONE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS, 0.1F, 1).save(recipeOutput);
        //Granite Cooking
        smeltingRecipe(Blocks.GRANITE, ModBlocks.COBBLED_GRANITE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_GRANITE, Blocks.GRANITE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS, 0.1F, 1).save(recipeOutput);
        //Diorite Cooking
        smeltingRecipe(Blocks.DIORITE, ModBlocks.COBBLED_DIORITE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_DIORITE, Blocks.DIORITE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS, 0.1F, 1).save(recipeOutput);
        //Andesite Cooking
        smeltingRecipe(Blocks.ANDESITE, ModBlocks.COBBLED_ANDESITE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_ANDESITE, Blocks.ANDESITE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS, 0.1F, 1).save(recipeOutput);
        //Deepslate Cooking
        smeltingRecipe(ModBlocks.SMOOTH_DEEPSLATE, Blocks.DEEPSLATE, 0.1F, 1).save(recipeOutput);
        //Brick Cooking
        smeltingRecipe(ModBlocks.SMOOTH_BRICK, ModBlocks.COBBLED_BRICKS, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_BRICKS, Blocks.BRICKS, 0.1F, 1).save(recipeOutput);
        //Mud Cooking
        smeltingRecipe(Blocks.PACKED_MUD, ModBlocks.COBBLED_MUD, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_MUD, Blocks.PACKED_MUD, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_MUD_BRICKS, Blocks.MUD_BRICKS, 0.1F, 1).save(recipeOutput);
        //Sandstone Cooking
        smeltingRecipe(Blocks.SANDSTONE, ModBlocks.COBBLED_SANDSTONE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_SANDSTONE_BRICKS, ModBlocks.SANDSTONE_BRICKS, 0.1F, 1).save(recipeOutput);
        //Red Sandstone Cooking
        smeltingRecipe(Blocks.RED_SANDSTONE, ModBlocks.COBBLED_RED_SANDSTONE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_RED_SANDSTONE_BRICKS, ModBlocks.RED_SANDSTONE_BRICKS, 0.1F, 1).save(recipeOutput);
        //Prismarine Cooking
        smeltingRecipe(ModBlocks.SMOOTH_PRISMARINE, Blocks.PRISMARINE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS, 0.1F, 1).save(recipeOutput);
        //Nether Brick Cooking
        smeltingRecipe(ModBlocks.SMOOTH_NETHER_BRICK, ModBlocks.COBBLED_NETHER_BRICKS, 0.1F, 1).save(recipeOutput);
        //Red Nether Brick Cooking
        smeltingRecipe(ModBlocks.SMOOTH_RED_NETHER_BRICK, ModBlocks.COBBLED_RED_NETHER_BRICKS, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, 0.1F, 1).save(recipeOutput);
        //Basalt Cooking
        smeltingRecipe(Blocks.BASALT, ModBlocks.COBBLED_BASALT, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_BASALT_BRICKS, ModBlocks.BASALT_BRICKS, 0.1F, 1).save(recipeOutput);
        //Blackstone Cooking
        smeltingRecipe(Blocks.BLACKSTONE, ModBlocks.COBBLED_BLACKSTONE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_BLACKSTONE, Blocks.BLACKSTONE, 0.1F, 1).save(recipeOutput);
        //End Stone Cooking
        smeltingRecipe(Blocks.END_STONE, ModBlocks.COBBLED_END_STONE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_END_STONE, Blocks.END_STONE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_END_STONE_BRICKS, Blocks.END_STONE_BRICKS, 0.1F, 1).save(recipeOutput);
        //Purpur Cooking
        smeltingRecipe(Blocks.PURPUR_BLOCK, ModBlocks.COBBLED_PURPUR, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_PURPUR, Blocks.PURPUR_BLOCK, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_PURPUR_BRICKS, ModBlocks.PURPUR_BRICKS, 0.1F, 1).save(recipeOutput);
        //Quartz Cooking
        smeltingRecipe(Blocks.QUARTZ_BLOCK, ModBlocks.COBBLED_QUARTZ, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICKS, 0.1F, 1).save(recipeOutput);
        //Brick Blocks
        makeBricksVanilla(ModBlocks.SMOOTH_STONE_BRICKS, Blocks.SMOOTH_STONE).save(recipeOutput);
        makeBricksExtra(Blocks.MOSSY_STONE_BRICKS, ModBlocks.MOSSY_STONE).save(recipeOutput);
        makeBricksVanilla(ModBlocks.GRANITE_BRICKS, Blocks.GRANITE).save(recipeOutput);
        makeBricksVanilla(ModBlocks.DIORITE_BRICKS, Blocks.DIORITE).save(recipeOutput);
        makeBricksVanilla(ModBlocks.ANDESITE_BRICKS, Blocks.ANDESITE).save(recipeOutput);
        makeBricksVanilla(ModBlocks.SANDSTONE_BRICKS, Blocks.SANDSTONE).save(recipeOutput);
        makeBricksVanilla(ModBlocks.RED_SANDSTONE_BRICKS, Blocks.RED_SANDSTONE).save(recipeOutput);
        makeBricksVanilla(ModBlocks.BASALT_BRICKS, Blocks.BASALT).save(recipeOutput);
        makeBricksVanilla(ModBlocks.PURPUR_BRICKS, Blocks.PURPUR_BLOCK).save(recipeOutput);
        makeBricksVanilla(ModBlocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK).save(recipeOutput);
        //Polished Blocks
        makePolishedVanilla(ModBlocks.POLISHED_SMOOTH_STONE, Blocks.SMOOTH_STONE).save(recipeOutput);
        makePolishedVanilla(ModBlocks.POLISHED_STONE, Blocks.STONE).save(recipeOutput);
        makePolishedModded(ModBlocks.POLISHED_MOSSY_STONE, ModBlocks.MOSSY_STONE).save(recipeOutput);
        makePolishedVanilla(ModBlocks.POLISHED_BRICK, Blocks.BRICKS).save(recipeOutput);
        makePolishedVanilla(ModBlocks.POLISHED_MUD, Blocks.PACKED_MUD).save(recipeOutput);
        makePolishedVanilla(ModBlocks.POLISHED_SANDSTONE, Blocks.SANDSTONE).save(recipeOutput);
        makePolishedVanilla(ModBlocks.POLISHED_RED_SANDSTONE, Blocks.RED_SANDSTONE).save(recipeOutput);
        makePolishedVanilla(ModBlocks.POLISHED_PRISMARINE, Blocks.PRISMARINE).save(recipeOutput);
        makePolishedVanilla(ModBlocks.POLISHED_NETHER_BRICK, Blocks.NETHER_BRICKS).save(recipeOutput);
        makePolishedVanilla(ModBlocks.POLISHED_RED_NETHER_BRICK, Blocks.RED_NETHER_BRICKS).save(recipeOutput);
        makePolishedVanilla(ModBlocks.POLISHED_END_STONE, Blocks.END_STONE).save(recipeOutput);
        makePolishedVanilla(ModBlocks.POLISHED_PURPUR, Blocks.PURPUR_BLOCK).save(recipeOutput);
        makePolishedVanilla(ModBlocks.POLISHED_QUARTZ, Blocks.QUARTZ_BLOCK).save(recipeOutput);
        //Cut Blocks
        makeCutModded(ModBlocks.CUT_SMOOTH_STONE, ModBlocks.POLISHED_SMOOTH_STONE_SLAB).save(recipeOutput);
        makeCutModded(ModBlocks.CUT_STONE, ModBlocks.POLISHED_STONE_SLAB).save(recipeOutput);
        makeCutModded(ModBlocks.CUT_MOSSY_STONE, ModBlocks.POLISHED_MOSSY_STONE_SLAB).save(recipeOutput);
        makeCutVanilla(ModBlocks.CUT_GRANITE, Blocks.POLISHED_GRANITE_SLAB).save(recipeOutput);
        makeCutVanilla(ModBlocks.CUT_DIORITE, Blocks.POLISHED_DIORITE_SLAB).save(recipeOutput);
        makeCutVanilla(ModBlocks.CUT_ANDESITE, Blocks.POLISHED_ANDESITE_SLAB).save(recipeOutput);
        makeCutVanilla(ModBlocks.CUT_DEEPSLATE, Blocks.POLISHED_DEEPSLATE_SLAB).save(recipeOutput);
        makeCutModded(ModBlocks.CUT_BRICKS, ModBlocks.POLISHED_BRICK_SLAB).save(recipeOutput);
            //TODO: Make packed mud build set
            //makeCutModded(ModBlocks.CUT_MUD, ModBlocks.PACKED_MUD_SLAB).save(recipeOutput);
        makeCutModded(ModBlocks.CUT_PRISMARINE, ModBlocks.POLISHED_PRISMARINE_SLAB).save(recipeOutput);
        makeCutModded(ModBlocks.CUT_NETHER_BRICKS, ModBlocks.POLISHED_NETHER_BRICK_SLAB).save(recipeOutput);
        makeCutModded(ModBlocks.CUT_RED_NETHER_BRICKS, ModBlocks.POLISHED_RED_NETHER_BRICK_SLAB).save(recipeOutput);
        makeCutModded(ModBlocks.CUT_BASALT, ModBlocks.POLISHED_BASALT_SLAB).save(recipeOutput);
        makeCutVanilla(ModBlocks.CUT_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_SLAB).save(recipeOutput);
        makeCutModded(ModBlocks.CUT_END_STONE, ModBlocks.POLISHED_END_STONE_SLAB).save(recipeOutput);
        makeCutModded(ModBlocks.CUT_PURPUR, ModBlocks.POLISHED_PURPUR_SLAB).save(recipeOutput);
        makeCutModded(ModBlocks.CUT_QUARTZ, ModBlocks.POLISHED_QUARTZ_SLAB).save(recipeOutput);
        //Chiseled Blocks
        makeChiseledModded(ModBlocks.CHISELED_SMOOTH_STONE_BRICKS, ModBlocks.SMOOTH_STONE_BRICK_SLAB).save(recipeOutput);
        makeChiseledModded(ModBlocks.CHISELED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICK_SLAB).save(recipeOutput);
        makeChiseledModded(ModBlocks.CHISELED_DIORITE_BRICKS, ModBlocks.DIORITE_BRICK_SLAB).save(recipeOutput);
        makeChiseledModded(ModBlocks.CHISELED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICK_SLAB).save(recipeOutput);
        makeChiseledVanilla(ModBlocks.CHISELED_BRICKS, Blocks.BRICK_SLAB).save(recipeOutput);
        makeChiseledVanilla(ModBlocks.CHISELED_MUD_BRICKS, Blocks.MUD_BRICK_SLAB).save(recipeOutput);
        makeChiseledVanilla(ModBlocks.CHISELED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_SLAB).save(recipeOutput);
        makeChiseledVanilla(ModBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_SLAB).save(recipeOutput);
        makeChiseledModded(ModBlocks.CHISELED_BASALT_BRICKS, ModBlocks.BASALT_BRICK_SLAB).save(recipeOutput);
        makeChiseledVanilla(ModBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE_BRICK_SLAB).save(recipeOutput);
        makeChiseledModded(ModBlocks.CHISELED_PURPUR_BRICKS, ModBlocks.PURPUR_BRICK_SLAB).save(recipeOutput);
        //Pillar Blocks
        makePillarVanilla(ModBlocks.SMOOTH_STONE_PILLAR, Blocks.SMOOTH_STONE).save(recipeOutput);
        makePillarVanilla(ModBlocks.STONE_PILLAR, Blocks.STONE).save(recipeOutput);
        makePillarModded(ModBlocks.MOSSY_STONE_PILLAR, ModBlocks.MOSSY_STONE).save(recipeOutput);
        makePillarVanilla(ModBlocks.GRANITE_PILLAR, Blocks.GRANITE).save(recipeOutput);
        makePillarVanilla(ModBlocks.DIORITE_PILLAR, Blocks.DIORITE).save(recipeOutput);
        makePillarVanilla(ModBlocks.ANDESITE_PILLAR, Blocks.ANDESITE).save(recipeOutput);
        makePillarVanilla(ModBlocks.DEEPSLATE_PILLAR, Blocks.DEEPSLATE).save(recipeOutput);
        makePillarVanilla(ModBlocks.MUD_PILLAR, Blocks.PACKED_MUD).save(recipeOutput);
        makePillarVanilla(ModBlocks.SANDSTONE_PILLAR, Blocks.SANDSTONE).save(recipeOutput);
        makePillarVanilla(ModBlocks.RED_SANDSTONE_PILLAR, Blocks.RED_SANDSTONE).save(recipeOutput);
        makePillarVanilla(ModBlocks.PRISMARINE_PILLAR, Blocks.PRISMARINE).save(recipeOutput);
        makePillarVanilla(ModBlocks.NETHER_BRICK_PILLAR, Blocks.NETHER_BRICKS).save(recipeOutput);
        makePillarVanilla(ModBlocks.RED_NETHER_BRICK_PILLAR, Blocks.RED_NETHER_BRICKS).save(recipeOutput);
        makePillarVanilla(ModBlocks.BLACKSTONE_PILLAR, Blocks.BLACKSTONE).save(recipeOutput);
        makePillarVanilla(ModBlocks.END_STONE_PILLAR, Blocks.END_STONE).save(recipeOutput);
        //Tile Blocks
        makeTilesModded(ModBlocks.SMOOTH_STONE_TILES, ModBlocks.SMOOTH_STONE_BRICKS).save(recipeOutput);
        makeTilesVanilla(ModBlocks.STONE_TILES, Blocks.STONE_BRICKS).save(recipeOutput);
        makeTilesVanilla(ModBlocks.MOSSY_STONE_TILES, Blocks.MOSSY_STONE_BRICKS).save(recipeOutput);
        makeTilesModded(ModBlocks.GRANITE_TILES, ModBlocks.GRANITE_BRICKS).save(recipeOutput);
        makeTilesModded(ModBlocks.DIORITE_TILES, ModBlocks.DIORITE_BRICKS).save(recipeOutput);
        makeTilesModded(ModBlocks.ANDESITE_TILES, ModBlocks.ANDESITE_BRICKS).save(recipeOutput);
        makeTilesVanilla(ModBlocks.BRICK_TILES, Blocks.BRICKS).save(recipeOutput);
        makeTilesVanilla(ModBlocks.MUD_TILES, Blocks.MUD_BRICKS).save(recipeOutput);
        makeTilesModded(ModBlocks.SANDSTONE_TILES, ModBlocks.SANDSTONE_BRICKS).save(recipeOutput);
        makeTilesModded(ModBlocks.RED_SANDSTONE_TILES, ModBlocks.RED_SANDSTONE_BRICKS).save(recipeOutput);
        makeTilesVanilla(ModBlocks.PRISMARINE_TILES, Blocks.PRISMARINE_BRICKS).save(recipeOutput);
        makeTilesVanilla(ModBlocks.NETHER_BRICK_TILES, Blocks.NETHER_BRICKS).save(recipeOutput);
        makeTilesVanilla(ModBlocks.RED_NETHER_BRICK_TILES, Blocks.RED_NETHER_BRICKS).save(recipeOutput);
        makeTilesModded(ModBlocks.BASALT_TILES, ModBlocks.BASALT_BRICKS).save(recipeOutput);
        makeTilesVanilla(ModBlocks.BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS).save(recipeOutput);
        makeTilesVanilla(ModBlocks.END_STONE_TILES, Blocks.END_STONE_BRICKS).save(recipeOutput);
        makeTilesModded(ModBlocks.PURPUR_TILES, ModBlocks.PURPUR_BRICKS).save(recipeOutput);
        makeTilesModded(ModBlocks.QUARTZ_TILES, ModBlocks.QUARTZ_BRICKS).save(recipeOutput);
        //Dark Blocks
        makeDarkVanilla(ModBlocks.DARK_SMOOTH_STONE, Blocks.SMOOTH_STONE).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_STONE, Blocks.STONE).save(recipeOutput);
        makeDarkModded(ModBlocks.DARK_MOSSY_STONE, ModBlocks.MOSSY_STONE).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_GRANITE, Blocks.GRANITE).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_DIORITE, Blocks.DIORITE).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_ANDESITE, Blocks.ANDESITE).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_DEEPSLATE, Blocks.DEEPSLATE).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_BRICKS, Blocks.BRICKS).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_MUD, Blocks.PACKED_MUD).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_SANDSTONE, Blocks.SANDSTONE).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_RED_SANDSTONE, Blocks.RED_SANDSTONE).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_NETHER_BRICKS, Blocks.NETHER_BRICKS).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_BASALT, Blocks.BASALT).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_BLACKSTONE, Blocks.BLACKSTONE).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_END_STONE, Blocks.END_STONE).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_PURPUR, Blocks.PURPUR_BLOCK).save(recipeOutput);
        makeDarkVanilla(ModBlocks.DARK_QUARTZ, Blocks.QUARTZ_BLOCK).save(recipeOutput);
        //Stairs
        makeStairsVanilla(ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_SMOOTH_STONE_STAIRS, ModBlocks.COBBLED_SMOOTH_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_SMOOTH_STONE_STAIRS, ModBlocks.POLISHED_SMOOTH_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_STONE_BRICK_STAIRS, ModBlocks.SMOOTH_STONE_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_SMOOTH_STONE_STAIRS, ModBlocks.DARK_SMOOTH_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_STONE_STAIRS, ModBlocks.POLISHED_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_STONE_STAIRS, ModBlocks.DARK_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.MOSSY_STONE_STAIRS, ModBlocks.MOSSY_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_MOSSY_STONE_STAIRS, ModBlocks.SMOOTH_MOSSY_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_MOSSY_STONE_STAIRS, ModBlocks.POLISHED_MOSSY_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_MOSSY_STONE_STAIRS, ModBlocks.DARK_MOSSY_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_GRANITE_STAIRS, ModBlocks.COBBLED_GRANITE).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_GRANITE_STAIRS, ModBlocks.SMOOTH_GRANITE).save(recipeOutput);
        makeStairsModded(ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_GRANITE_STAIRS, ModBlocks.DARK_GRANITE).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_DIORITE_STAIRS, ModBlocks.COBBLED_DIORITE).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_DIORITE_STAIRS, ModBlocks.SMOOTH_DIORITE).save(recipeOutput);
        makeStairsModded(ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_DIORITE_STAIRS, ModBlocks.DARK_DIORITE).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_ANDESITE_STAIRS, ModBlocks.COBBLED_ANDESITE).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_ANDESITE_STAIRS, ModBlocks.SMOOTH_ANDESITE).save(recipeOutput);
        makeStairsModded(ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_ANDESITE_STAIRS, ModBlocks.DARK_ANDESITE).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_BRICK_STAIRS, ModBlocks.COBBLED_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_BRICK_STAIRS, ModBlocks.SMOOTH_BRICK).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_BRICK_STAIRS, ModBlocks.POLISHED_BRICK).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_BRICK_STAIRS, ModBlocks.DARK_BRICKS).save(recipeOutput);
            //TODO: Make packed mud build set
            //makeStairsVanilla(ModBlocks.MUD_STAIRS, Blocks.PACKED_MUD).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_MUD_STAIRS, ModBlocks.COBBLED_MUD).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_MUD_STAIRS, ModBlocks.SMOOTH_MUD).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_MUD_STAIRS, ModBlocks.POLISHED_MUD).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_MUD_STAIRS, ModBlocks.DARK_MUD).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_SANDSTONE_STAIRS, ModBlocks.COBBLED_SANDSTONE).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_SANDSTONE_STAIRS, ModBlocks.POLISHED_SANDSTONE).save(recipeOutput);
        makeStairsModded(ModBlocks.SANDSTONE_BRICK_STAIRS, ModBlocks.SANDSTONE_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_SANDSTONE_STAIRS, ModBlocks.DARK_SANDSTONE).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_RED_SANDSTONE_STAIRS, ModBlocks.COBBLED_RED_SANDSTONE).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_RED_SANDSTONE_STAIRS, ModBlocks.POLISHED_RED_SANDSTONE).save(recipeOutput);
        makeStairsModded(ModBlocks.RED_SANDSTONE_BRICK_STAIRS, ModBlocks.RED_SANDSTONE_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_RED_SANDSTONE_STAIRS, ModBlocks.DARK_RED_SANDSTONE).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_PRISMARINE_STAIRS, ModBlocks.SMOOTH_PRISMARINE).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_PRISMARINE_STAIRS, ModBlocks.POLISHED_PRISMARINE).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_NETHER_BRICK_STAIRS, ModBlocks.COBBLED_NETHER_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_NETHER_BRICK_STAIRS, ModBlocks.SMOOTH_NETHER_BRICK).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_NETHER_BRICK_STAIRS, ModBlocks.POLISHED_NETHER_BRICK).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_NETHER_BRICK_STAIRS, ModBlocks.DARK_NETHER_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_RED_NETHER_BRICK_STAIRS, ModBlocks.COBBLED_RED_NETHER_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_RED_NETHER_BRICK_STAIRS, ModBlocks.SMOOTH_RED_NETHER_BRICK).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_RED_NETHER_BRICK_STAIRS, ModBlocks.POLISHED_RED_NETHER_BRICK).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_RED_NETHER_BRICK_STAIRS, ModBlocks.DARK_RED_NETHER_BRICKS).save(recipeOutput);
        makeStairsVanilla(ModBlocks.BASALT_STAIRS, Blocks.BASALT).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_BASALT_STAIRS, ModBlocks.COBBLED_BASALT).save(recipeOutput);
        makeStairsVanilla(ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_BASALT_STAIRS, ModBlocks.POLISHED_BASALT).save(recipeOutput);
        makeStairsModded(ModBlocks.BASALT_BRICK_STAIRS, ModBlocks.BASALT_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_BASALT_STAIRS, ModBlocks.DARK_BASALT).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_BLACKSTONE_STAIRS, ModBlocks.COBBLED_BLACKSTONE).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_BLACKSTONE_STAIRS, ModBlocks.SMOOTH_BLACKSTONE).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_BLACKSTONE_STAIRS, ModBlocks.DARK_BLACKSTONE).save(recipeOutput);
        makeStairsVanilla(ModBlocks.END_STONE_STAIRS, Blocks.END_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_END_STONE_STAIRS, ModBlocks.COBBLED_END_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_END_STONE_STAIRS, ModBlocks.SMOOTH_END_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.POLISHED_END_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_END_STONE_STAIRS, ModBlocks.DARK_END_STONE).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_PURPUR_STAIRS, ModBlocks.COBBLED_PURPUR).save(recipeOutput);
        makeStairsModded(ModBlocks.SMOOTH_PURPUR_STAIRS, ModBlocks.SMOOTH_PURPUR).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_PURPUR_STAIRS, ModBlocks.POLISHED_PURPUR).save(recipeOutput);
        makeStairsModded(ModBlocks.PURPUR_BRICK_STAIRS, ModBlocks.PURPUR_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_PURPUR_STAIRS, ModBlocks.DARK_PURPUR).save(recipeOutput);
        makeStairsModded(ModBlocks.COBBLED_QUARTZ_STAIRS, ModBlocks.COBBLED_QUARTZ).save(recipeOutput);
        makeStairsModded(ModBlocks.POLISHED_QUARTZ_STAIRS, ModBlocks.POLISHED_QUARTZ).save(recipeOutput);
        makeStairsModded(ModBlocks.QUARTZ_BRICK_STAIRS, ModBlocks.QUARTZ_BRICKS).save(recipeOutput);
        makeStairsModded(ModBlocks.DARK_QUARTZ_STAIRS, ModBlocks.DARK_QUARTZ).save(recipeOutput);
        //Slab
        makeSlabModded(ModBlocks.COBBLED_SMOOTH_STONE_SLAB, ModBlocks.COBBLED_SMOOTH_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_SMOOTH_STONE_SLAB, ModBlocks.POLISHED_SMOOTH_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_SMOOTH_STONE_SLAB, ModBlocks.CUT_SMOOTH_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_STONE_BRICK_SLAB, ModBlocks.SMOOTH_STONE_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_SMOOTH_STONE_SLAB, ModBlocks.DARK_SMOOTH_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_STONE_SLAB, ModBlocks.POLISHED_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_STONE_SLAB, ModBlocks.CUT_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_STONE_SLAB, ModBlocks.DARK_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.MOSSY_STONE_SLAB, ModBlocks.MOSSY_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_MOSSY_STONE_SLAB, ModBlocks.SMOOTH_MOSSY_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_MOSSY_STONE_SLAB, ModBlocks.POLISHED_MOSSY_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_MOSSY_STONE_SLAB, ModBlocks.CUT_MOSSY_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_GRANITE_SLAB, ModBlocks.COBBLED_GRANITE).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_GRANITE_SLAB, ModBlocks.SMOOTH_GRANITE).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_GRANITE_SLAB, ModBlocks.CUT_GRANITE).save(recipeOutput);
        makeSlabModded(ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_GRANITE_SLAB, ModBlocks.DARK_GRANITE).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_DIORITE_SLAB, ModBlocks.COBBLED_DIORITE).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_DIORITE_SLAB, ModBlocks.SMOOTH_DIORITE).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_DIORITE_SLAB, ModBlocks.CUT_DIORITE).save(recipeOutput);
        makeSlabModded(ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_DIORITE_SLAB, ModBlocks.DARK_DIORITE).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_ANDESITE_SLAB, ModBlocks.COBBLED_ANDESITE).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_ANDESITE_SLAB, ModBlocks.SMOOTH_ANDESITE).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_ANDESITE_SLAB, ModBlocks.CUT_ANDESITE).save(recipeOutput);
        makeSlabModded(ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_ANDESITE_SLAB, ModBlocks.DARK_ANDESITE).save(recipeOutput);
        makeSlabVanilla(ModBlocks.DEEPSLATE_SLAB, Blocks.DEEPSLATE).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_DEEPSLATE_SLAB, ModBlocks.SMOOTH_DEEPSLATE).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_DEEPSLATE_SLAB, ModBlocks.CUT_DEEPSLATE).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_DEEPSLATE_SLAB, ModBlocks.DARK_DEEPSLATE).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_BRICK_SLAB, ModBlocks.COBBLED_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_BRICK_SLAB, ModBlocks.SMOOTH_BRICK).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_BRICK_SLAB, ModBlocks.POLISHED_BRICK).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_BRICK_SLAB, ModBlocks.CUT_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_BRICK_SLAB, ModBlocks.DARK_BRICKS).save(recipeOutput);
            //TODO: Make packed mud build set
            //makeSlabVanilla(ModBlocks.MUD_SLAB, Blocks.PACKED_MUD).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_MUD_SLAB, ModBlocks.COBBLED_MUD).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_MUD_SLAB, ModBlocks.SMOOTH_MUD).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_MUD_SLAB, ModBlocks.POLISHED_MUD).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_MUD_SLAB, ModBlocks.CUT_MUD).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_MUD_SLAB, ModBlocks.DARK_MUD).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_SANDSTONE_SLAB, ModBlocks.COBBLED_SANDSTONE).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_SANDSTONE_SLAB, ModBlocks.POLISHED_SANDSTONE).save(recipeOutput);
        makeSlabModded(ModBlocks.SANDSTONE_BRICK_SLAB, ModBlocks.SANDSTONE_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_SANDSTONE_SLAB, ModBlocks.DARK_SANDSTONE).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_RED_SANDSTONE_SLAB, ModBlocks.COBBLED_RED_SANDSTONE).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_RED_SANDSTONE_SLAB, ModBlocks.POLISHED_RED_SANDSTONE).save(recipeOutput);
        makeSlabModded(ModBlocks.RED_SANDSTONE_BRICK_SLAB, ModBlocks.RED_SANDSTONE_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_RED_SANDSTONE_SLAB, ModBlocks.DARK_RED_SANDSTONE).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_PRISMARINE_SLAB, ModBlocks.SMOOTH_PRISMARINE).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_PRISMARINE_SLAB, ModBlocks.POLISHED_PRISMARINE).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_PRISMARINE_SLAB, ModBlocks.CUT_PRISMARINE).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_NETHER_BRICK_SLAB, ModBlocks.COBBLED_NETHER_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_NETHER_BRICK_SLAB, ModBlocks.SMOOTH_NETHER_BRICK).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_NETHER_BRICK_SLAB, ModBlocks.POLISHED_NETHER_BRICK).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_NETHER_BRICK_SLAB, ModBlocks.CUT_NETHER_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_NETHER_BRICK_SLAB, ModBlocks.DARK_NETHER_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_RED_NETHER_BRICK_SLAB, ModBlocks.COBBLED_RED_NETHER_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_RED_NETHER_BRICK_SLAB, ModBlocks.SMOOTH_RED_NETHER_BRICK).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_RED_NETHER_BRICK_SLAB, ModBlocks.POLISHED_RED_NETHER_BRICK).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_RED_NETHER_BRICK_SLAB, ModBlocks.CUT_RED_NETHER_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_RED_NETHER_BRICK_SLAB, ModBlocks.DARK_RED_NETHER_BRICKS).save(recipeOutput);
        makeSlabVanilla(ModBlocks.BASALT_SLAB, Blocks.BASALT).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_BASALT_SLAB, ModBlocks.COBBLED_BASALT).save(recipeOutput);
        makeSlabVanilla(ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_BASALT_SLAB, ModBlocks.POLISHED_BASALT).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_BASALT_SLAB, ModBlocks.CUT_BASALT).save(recipeOutput);
        makeSlabModded(ModBlocks.BASALT_BRICK_SLAB, ModBlocks.BASALT_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_BASALT_SLAB, ModBlocks.DARK_BASALT).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_BLACKSTONE_SLAB, ModBlocks.COBBLED_BLACKSTONE).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_BLACKSTONE_SLAB, ModBlocks.SMOOTH_BLACKSTONE).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_BLACKSTONE_SLAB, ModBlocks.CUT_BLACKSTONE).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_BLACKSTONE_SLAB, ModBlocks.DARK_BLACKSTONE).save(recipeOutput);
        makeSlabVanilla(ModBlocks.END_STONE_SLAB, Blocks.END_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_END_STONE_SLAB, ModBlocks.COBBLED_END_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_END_STONE_SLAB, ModBlocks.SMOOTH_END_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_END_STONE_SLAB, ModBlocks.CUT_END_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_END_STONE_SLAB, ModBlocks.DARK_END_STONE).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_PURPUR_SLAB, ModBlocks.COBBLED_PURPUR).save(recipeOutput);
        makeSlabModded(ModBlocks.SMOOTH_PURPUR_SLAB, ModBlocks.SMOOTH_PURPUR).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_PURPUR_SLAB, ModBlocks.POLISHED_PURPUR).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_PURPUR_SLAB, ModBlocks.CUT_PURPUR).save(recipeOutput);
        makeSlabModded(ModBlocks.PURPUR_BRICK_SLAB, ModBlocks.PURPUR_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_PURPUR_SLAB, ModBlocks.DARK_PURPUR).save(recipeOutput);
        makeSlabModded(ModBlocks.COBBLED_QUARTZ_SLAB, ModBlocks.COBBLED_QUARTZ).save(recipeOutput);
        makeSlabModded(ModBlocks.POLISHED_QUARTZ_SLAB, ModBlocks.POLISHED_QUARTZ).save(recipeOutput);
        makeSlabModded(ModBlocks.CUT_QUARTZ_SLAB, ModBlocks.CUT_QUARTZ).save(recipeOutput);
        makeSlabModded(ModBlocks.QUARTZ_BRICK_SLAB, ModBlocks.QUARTZ_BRICKS).save(recipeOutput);
        makeSlabModded(ModBlocks.DARK_QUARTZ_SLAB, ModBlocks.DARK_QUARTZ).save(recipeOutput);
        //Walls
        makeWallVanilla(ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_SMOOTH_STONE_WALL, ModBlocks.COBBLED_SMOOTH_STONE).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_SMOOTH_STONE_WALL, ModBlocks.POLISHED_SMOOTH_STONE).save(recipeOutput);
        makeWallModded(ModBlocks.SMOOTH_STONE_BRICK_WALL, ModBlocks.SMOOTH_STONE_BRICKS).save(recipeOutput);
        makeWallVanilla(ModBlocks.STONE_WALL, Blocks.STONE).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_STONE_WALL, ModBlocks.POLISHED_STONE).save(recipeOutput);
        makeWallModded(ModBlocks.MOSSY_STONE_WALL, ModBlocks.MOSSY_STONE).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_MOSSY_STONE_WALL, ModBlocks.POLISHED_MOSSY_STONE).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_GRANITE_WALL, ModBlocks.COBBLED_GRANITE).save(recipeOutput);
        makeWallVanilla(ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE).save(recipeOutput);
        makeWallModded(ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_DIORITE_WALL, ModBlocks.COBBLED_DIORITE).save(recipeOutput);
        makeWallVanilla(ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE).save(recipeOutput);
        makeWallModded(ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_ANDESITE_WALL, ModBlocks.COBBLED_ANDESITE).save(recipeOutput);
        makeWallVanilla(ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE).save(recipeOutput);
        makeWallModded(ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS).save(recipeOutput);
        makeWallVanilla(ModBlocks.DEEPSLATE_WALL, Blocks.DEEPSLATE).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_BRICK_WALL, ModBlocks.COBBLED_BRICKS).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_BRICK_WALL, ModBlocks.POLISHED_BRICK).save(recipeOutput);
            //TODO: Make packed mud build set
            //makeWallVanilla(ModBlocks.MUD_WALL, Blocks.PACKED_MUD).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_MUD_WALL, ModBlocks.COBBLED_MUD).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_MUD_WALL, ModBlocks.POLISHED_MUD).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_SANDSTONE_WALL, ModBlocks.COBBLED_SANDSTONE).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_SANDSTONE_WALL, ModBlocks.POLISHED_SANDSTONE).save(recipeOutput);
        makeWallModded(ModBlocks.SANDSTONE_BRICK_WALL, ModBlocks.SANDSTONE_BRICKS).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_RED_SANDSTONE_WALL, ModBlocks.COBBLED_RED_SANDSTONE).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_RED_SANDSTONE_WALL, ModBlocks.POLISHED_RED_SANDSTONE).save(recipeOutput);
        makeWallModded(ModBlocks.RED_SANDSTONE_BRICK_WALL, ModBlocks.RED_SANDSTONE_BRICKS).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_PRISMARINE_WALL, ModBlocks.POLISHED_PRISMARINE).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_NETHER_BRICK_WALL, ModBlocks.COBBLED_NETHER_BRICKS).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_NETHER_BRICK_WALL, ModBlocks.POLISHED_NETHER_BRICK).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_RED_NETHER_BRICK_WALL, ModBlocks.COBBLED_RED_NETHER_BRICKS).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_RED_NETHER_BRICK_WALL, ModBlocks.POLISHED_RED_NETHER_BRICK).save(recipeOutput);
        makeWallVanilla(ModBlocks.BASALT_WALL, Blocks.BASALT).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_BASALT_WALL, ModBlocks.COBBLED_BASALT).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_BASALT_WALL, ModBlocks.POLISHED_BASALT).save(recipeOutput);
        makeWallModded(ModBlocks.BASALT_BRICK_WALL, ModBlocks.BASALT_BRICKS).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_BLACKSTONE_WALL, ModBlocks.COBBLED_BLACKSTONE).save(recipeOutput);
        makeWallVanilla(ModBlocks.END_STONE_WALL, Blocks.END_STONE).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_END_STONE_WALL, ModBlocks.COBBLED_END_STONE).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE).save(recipeOutput);
        makeWallVanilla(ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_PURPUR_WALL, ModBlocks.COBBLED_PURPUR).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_PURPUR_WALL, ModBlocks.POLISHED_PURPUR).save(recipeOutput);
        makeWallModded(ModBlocks.PURPUR_BRICK_WALL, ModBlocks.PURPUR_BRICKS).save(recipeOutput);
        makeWallModded(ModBlocks.COBBLED_QUARTZ_WALL, ModBlocks.COBBLED_QUARTZ).save(recipeOutput);
        makeWallModded(ModBlocks.POLISHED_QUARTZ_WALL, ModBlocks.POLISHED_QUARTZ).save(recipeOutput);
        makeWallModded(ModBlocks.QUARTZ_BRICK_WALL, ModBlocks.QUARTZ_BRICKS).save(recipeOutput);

    }
    public ShapedRecipeBuilder makeStairsModded(Supplier<? extends Block> bricksOut, DeferredBlock<Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makeStairsVanilla(Supplier<? extends Block> bricksOut, Block blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', blockIn)
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn).getPath(), has(blockIn));
    }
    public ShapedRecipeBuilder makeWallModded(Supplier<? extends Block> bricksOut, DeferredBlock<Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makeWallVanilla(Supplier<? extends Block> bricksOut, Block blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', blockIn)
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn).getPath(), has(blockIn));
    }
    public ShapedRecipeBuilder makeSlabModded(Supplier<? extends Block> bricksOut, DeferredBlock<Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern("BB ")
                .define('B', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makeSlabVanilla(Supplier<? extends Block> bricksOut, Block blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern("BB ")
                .define('B', blockIn)
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn).getPath(), has(blockIn));
    }
    public ShapedRecipeBuilder makePolishedModded(Supplier<? extends Block> bricksOut, DeferredBlock<Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern(" B ")
                .pattern("B B")
                .pattern(" B ")
                .define('B', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makePolishedVanilla(Supplier<? extends Block> bricksOut, Block blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern(" B ")
                .pattern("B B")
                .pattern(" B ")
                .define('B', blockIn)
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn).getPath(), has(blockIn));
    }
    public ShapedRecipeBuilder makeChiseledModded(Supplier<? extends Block> bricksOut, Supplier<? extends Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 1)
                .pattern("B")
                .pattern("B")
                .define('B', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makeChiseledVanilla(Supplier<? extends Block> bricksOut, Block blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 1)
                .pattern("S")
                .pattern("S")
                .define('S', blockIn)
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn).getPath(), has(blockIn));
    }
    public ShapedRecipeBuilder makeCutModded(Supplier<? extends Block> bricksOut, Supplier<? extends Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 1)
                .pattern("S")
                .pattern("S")
                .define('S', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makeCutVanilla(Supplier<? extends Block> bricksOut, Block blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 1)
                .pattern("S")
                .pattern("S")
                .define('S', blockIn)
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn).getPath(), has(blockIn));
    }
    public ShapedRecipeBuilder makeBricksModded(Supplier<? extends Block> bricksOut, Supplier<? extends Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makeBricksVanilla(Supplier<? extends Block> bricksOut, Block blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', blockIn)
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn).getPath(), has(blockIn));
    }
    public ShapedRecipeBuilder makeBricksExtra(Block bricksOut, Supplier<? extends Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut, 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makePillarModded(Supplier<? extends Block> bricksOut, Supplier<? extends Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 2)
                .pattern("B")
                .pattern("B")
                .define('B', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makePillarVanilla(Supplier<? extends Block> bricksOut, Block blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 2)
                .pattern("B")
                .pattern("B")
                .define('B', blockIn)
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn).getPath(), has(blockIn));
    }
    public ShapedRecipeBuilder makeTilesModded(Supplier<? extends Block> bricksOut, Supplier<? extends Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makeTilesVanilla(Supplier<? extends Block> bricksOut, Block blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', blockIn)
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn).getPath(), has(blockIn));
    }
    public ShapedRecipeBuilder makeDarkModded(Supplier<? extends Block> bricksOut, Supplier<? extends Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 8)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .define('B', blockIn.get())
                .define('D', Items.BLACK_DYE)
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makeDarkVanilla(Supplier<? extends Block> bricksOut, Block blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 8)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .define('B', blockIn)
                .define('D', Items.BLACK_DYE)
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn).getPath(), has(blockIn));
    }

    public SimpleCookingRecipeBuilder smeltingRecipe(ItemLike result, ItemLike ingredient, float exp, int count) {
        return SimpleCookingRecipeBuilder.smelting(Ingredient.of(new ItemStack(ingredient, count)), RecipeCategory.MISC, result, exp, 200)
                .unlockedBy("has_" + BuiltInRegistries.ITEM.getKey(ingredient.asItem()), has(ingredient));
    }

}
