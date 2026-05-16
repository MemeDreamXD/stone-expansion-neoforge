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
        // Granite Cooking
        smeltingRecipe(Blocks.GRANITE, ModBlocks.COBBLED_GRANITE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_GRANITE, Blocks.GRANITE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICKS, 0.1F, 1).save(recipeOutput);
        // Diorite Cooking
        smeltingRecipe(Blocks.DIORITE, ModBlocks.COBBLED_DIORITE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_DIORITE, Blocks.DIORITE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_DIORITE_BRICKS, ModBlocks.DIORITE_BRICKS, 0.1F, 1).save(recipeOutput);
        // Andesite Cooking
        smeltingRecipe(Blocks.ANDESITE, ModBlocks.COBBLED_ANDESITE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_ANDESITE, Blocks.ANDESITE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS, 0.1F, 1).save(recipeOutput);
        // Deepslate Cooking
        smeltingRecipe(ModBlocks.SMOOTH_DEEPSLATE, Blocks.DEEPSLATE, 0.1F, 1).save(recipeOutput);
        // Brick Cooking
        smeltingRecipe(ModBlocks.SMOOTH_BRICK, ModBlocks.COBBLED_BRICKS, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_BRICKS, Blocks.BRICKS, 0.1F, 1).save(recipeOutput);
        // Mud Cooking
        smeltingRecipe(Blocks.PACKED_MUD, ModBlocks.COBBLED_MUD, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_MUD, Blocks.PACKED_MUD, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_MUD_BRICKS, Blocks.MUD_BRICKS, 0.1F, 1).save(recipeOutput);
        // Sandstone Cooking
        smeltingRecipe(Blocks.SANDSTONE, ModBlocks.COBBLED_SANDSTONE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_SANDSTONE_BRICKS, ModBlocks.SANDSTONE_BRICKS, 0.1F, 1).save(recipeOutput);
        // Red Sandstone Cooking
        smeltingRecipe(Blocks.RED_SANDSTONE, ModBlocks.COBBLED_RED_SANDSTONE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_RED_SANDSTONE_BRICKS, ModBlocks.RED_SANDSTONE_BRICKS, 0.1F, 1).save(recipeOutput);
        // Prismarine Cooking
        smeltingRecipe(ModBlocks.SMOOTH_PRISMARINE, Blocks.PRISMARINE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS, 0.1F, 1).save(recipeOutput);
        // Nether Brick Cooking
        smeltingRecipe(ModBlocks.SMOOTH_NETHER_BRICK, ModBlocks.COBBLED_NETHER_BRICKS, 0.1F, 1).save(recipeOutput);
        // Red Nether Brick Cooking
        smeltingRecipe(ModBlocks.SMOOTH_RED_NETHER_BRICK, ModBlocks.COBBLED_RED_NETHER_BRICKS, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, 0.1F, 1).save(recipeOutput);
        // Basalt Cooking
        smeltingRecipe(Blocks.BASALT, ModBlocks.COBBLED_BASALT, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_BASALT_BRICKS, ModBlocks.BASALT_BRICKS, 0.1F, 1).save(recipeOutput);
        // Blackstone Cooking
        smeltingRecipe(Blocks.BLACKSTONE, ModBlocks.COBBLED_BLACKSTONE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_BLACKSTONE, Blocks.BLACKSTONE, 0.1F, 1).save(recipeOutput);
        // End Stone Cooking
        smeltingRecipe(Blocks.END_STONE, ModBlocks.COBBLED_END_STONE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_END_STONE, Blocks.END_STONE, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_END_STONE_BRICKS, Blocks.END_STONE_BRICKS, 0.1F, 1).save(recipeOutput);
        // Purpur Cooking
        smeltingRecipe(Blocks.PURPUR_BLOCK, ModBlocks.COBBLED_PURPUR, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.SMOOTH_PURPUR, Blocks.PURPUR_BLOCK, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_PURPUR_BRICKS, ModBlocks.PURPUR_BRICKS, 0.1F, 1).save(recipeOutput);
        // Quartz Cooking
        smeltingRecipe(Blocks.QUARTZ_BLOCK, ModBlocks.COBBLED_QUARTZ, 0.1F, 1).save(recipeOutput);
        smeltingRecipe(ModBlocks.CRACKED_QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICKS, 0.1F, 1).save(recipeOutput);

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
        //Chiseled Blocks
        makeChiseledModded(ModBlocks.CHISELED_SMOOTH_STONE_BRICKS, ModBlocks.SMOOTH_STONE_BRICK_SLAB).save(recipeOutput);
        makeChiseledModded(ModBlocks.CHISELED_GRANITE_BRICKS, ModBlocks.GRANITE_BRICK_SLAB).save(recipeOutput);
        makeChiseledModded(ModBlocks.CHISELED_DIORITE_BRICKS, ModBlocks.ANDESITE_BRICK_SLAB).save(recipeOutput);
        makeChiseledVanilla(ModBlocks.CHISELED_BRICKS, Blocks.BRICK_SLAB).save(recipeOutput);
        makeChiseledVanilla(ModBlocks.CHISELED_MUD_BRICKS, Blocks.MUD_BRICK_SLAB).save(recipeOutput);
        makeChiseledVanilla(ModBlocks.CHISELED_PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_SLAB).save(recipeOutput);
        makeChiseledVanilla(ModBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_SLAB).save(recipeOutput);
        makeChiseledModded(ModBlocks.CHISELED_BASALT_BRICKS, ModBlocks.BASALT_BRICK_SLAB).save(recipeOutput);
        makeChiseledVanilla(ModBlocks.CHISELED_END_STONE_BRICKS, Blocks.END_STONE_BRICK_SLAB).save(recipeOutput);
        makeChiseledModded(ModBlocks.CHISELED_PURPUR_BRICKS, ModBlocks.PURPUR_BRICK_SLAB).save(recipeOutput);




    }
    public ShapedRecipeBuilder makePolishedVanilla(Supplier<? extends Block> bricksOut, Block blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern(" B ")
                .pattern("B B")
                .pattern(" B ")
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
    public ShapedRecipeBuilder makeCut(Supplier<? extends Block> bricksOut, Supplier<? extends Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 1)
                .pattern("S")
                .pattern("S")
                .define('S', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makeBricks(Supplier<? extends Block> bricksOut, Supplier<? extends Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makePillar(Supplier<? extends Block> bricksOut, Supplier<? extends Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 1)
                .pattern("B")
                .pattern("B")
                .define('B', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makeTiles(Supplier<? extends Block> bricksOut, Supplier<? extends Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', blockIn.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }
    public ShapedRecipeBuilder makeDark(Supplier<? extends Block> bricksOut, Supplier<? extends Block> blockIn) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksOut.get(), 8)
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .define('B', blockIn.get())
                .define('D', Items.BLACK_DYE)
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(blockIn.get()).getPath(), has(blockIn.get()));
    }

    public SimpleCookingRecipeBuilder smeltingRecipe(ItemLike result, ItemLike ingredient, float exp, int count) {
        return SimpleCookingRecipeBuilder.smelting(Ingredient.of(new ItemStack(ingredient, count)), RecipeCategory.MISC, result, exp, 200)
                .unlockedBy("has_" + BuiltInRegistries.ITEM.getKey(ingredient.asItem()), has(ingredient));
    }

}
