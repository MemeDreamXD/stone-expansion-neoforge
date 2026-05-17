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
