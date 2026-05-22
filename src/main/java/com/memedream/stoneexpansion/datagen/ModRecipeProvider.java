package com.memedream.stoneexpansion.datagen;

import com.google.common.collect.ImmutableMap;
import com.memedream.stoneexpansion.ModBlocks;
import com.memedream.stoneexpansion.StoneExpansion;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModRecipeProvider extends RecipeProvider {

	private final List<Block> BASE_BLOCKS = List.of(
			Blocks.STONE,
			Blocks.SMOOTH_STONE,
			ModBlocks.MOSSY_STONE.get(),
			Blocks.GRANITE,
			Blocks.DIORITE,
			Blocks.ANDESITE,
			Blocks.DEEPSLATE,
			Blocks.BRICKS,
			Blocks.PACKED_MUD,
			Blocks.SANDSTONE,
			Blocks.RED_SANDSTONE,
			Blocks.NETHER_BRICKS,
			Blocks.RED_NETHER_BRICKS,
			Blocks.PRISMARINE,
			Blocks.BASALT,
			Blocks.BLACKSTONE,
			Blocks.END_STONE,
			Blocks.PURPUR_BLOCK,
			Blocks.QUARTZ_BLOCK
	);

	//TODO remove this and the call to it when smooth blocks are added
	private final List<String> EXCEPTIONS = List.of("smooth_smooth_stone");

	//sigh
	//expected name -> remapped name
	private final Map<String, String> WEIRD_REPLACEMENTS = ImmutableMap.<String, String>builder()
			.put("cobbled_stone", "cobblestone")
			.put("cobbled_mossy_stone", "mossy_cobblestone")
			.put("cobbled_prismarine", "prismarine")
			.put("cracked_blackstone_bricks", "cracked_polished_blackstone_bricks")
			.put("cobbled_brick", "cobbled_bricks")
			.put("cut_brick", "cut_bricks")
			.put("dark_brick", "dark_bricks")
			.put("cobbled_nether_brick", "cobbled_nether_bricks")
			.put("cut_nether_brick", "cut_nether_bricks")
			.put("dark_nether_brick", "dark_nether_bricks")
			.put("cobbled_red_nether_brick", "cobbled_red_nether_bricks")
			.put("cut_red_nether_brick", "cut_red_nether_bricks")
			.put("dark_red_nether_brick", "dark_red_nether_bricks")
			.put("blackstone_bricks", "polished_blackstone_bricks")
			.put("chiseled_deepslate_bricks", "chiseled_deepslate")
			.put("chiseled_sandstone_bricks", "chiseled_sandstone")
			.put("chiseled_red_sandstone_bricks", "chiseled_red_sandstone")
			.put("chiseled_blackstone_bricks", "chiseled_polished_blackstone")
			.put("chiseled_quartz_bricks", "chiseled_quartz_block")
			.build();

	enum Variants {
		COBBLED("cobbled_%s", null, true, false),
		SMOOTH("smooth_%s", null, true, false),
		POLISHED("polished_%s", "cobbled_%s", true, true),
		CHISELED("chiseled_%s_bricks", "%s_brick_slab", false, true),
		CUT("cut_%s", "polished_%s_slab", true, true),
		BRICKS("%s_bricks", null, true, true),
		CRACKED_BRICKS("cracked_%s_bricks", "%s_bricks", true, false),
		PILLAR("%s_pillar", null, false, true),
		TILES("%s_tiles", "%s_bricks", false, true),
		DARK("dark_%s", null, true, false);

		private final String id;
		@Nullable
		private final String inputVariant;
		private final boolean hasNonFullVariants;
		private final boolean stonecuttable;

		/// An enum to define a block variant.
		///
		/// `id`: an unformatted string that tells the naming convention of the block
		///
		/// `inputVariant`: an unformatted string that tells the naming convention of the block to use in the recipe
		///
		/// `hasNonFullVariants`: if the recipe generator should try to make stairs, slabs, and walls of the block.
		/// If the stair, slab, or wall block does not exist in any registry, it is skipped regardless.
		///
		/// `stonecuttable`: if a stonecutter recipe should be generated using the base block.
		/// Normally only false for blocks that have non-traditional crafting recipes.
		Variants(String id, @Nullable String inputVariant, boolean hasNonFullVariants, boolean stonecuttable) {
			this.id = id;
			this.inputVariant = inputVariant;
			this.hasNonFullVariants = hasNonFullVariants;
			this.stonecuttable = stonecuttable;
		}
	}

	public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries);
	}

	@Override
	protected void buildRecipes(RecipeOutput recipeOutput) {
		for (Block baseBlock : BASE_BLOCKS) {
			//remove last S from the name, if applicable
			//also removes the _block part of certain names, for things like purpur blocks
			String baseBlockName = baseBlock.builtInRegistryHolder().getKey().location().getPath().replaceFirst("s$|_block", "");
			//ughhhhhhhhhh
			baseBlockName = baseBlockName.replace("packed_mud", "mud");

			for (Variants variant : Variants.values()) {
				String formattedVariant = String.format(variant.id, baseBlockName);
				if (EXCEPTIONS.contains(formattedVariant)) continue;
				if (WEIRD_REPLACEMENTS.containsKey(formattedVariant))
					formattedVariant = WEIRD_REPLACEMENTS.get(formattedVariant);
				//ughhhhhhhhhh 2
				formattedVariant = formattedVariant.replace("brick_brick", "brick");
				Block variantBlock = searchForBlock(formattedVariant, true);

				//skip if both blocks are not ours, we will likely already have a recipe for these
				if (!this.areBothBlocksNotOurs(baseBlock, variantBlock)) {
					if (variant.inputVariant == null) {
						//uses the base block for the recipe
						this.makeBasicRecipeForType(variant, baseBlock, variantBlock, recipeOutput);
					} else {
						//otherwise parse and utilize the defined variant
						String inputVariant = String.format(variant.inputVariant, baseBlockName);
						if (EXCEPTIONS.contains(inputVariant)) continue;
						if (WEIRD_REPLACEMENTS.containsKey(inputVariant))
							inputVariant = WEIRD_REPLACEMENTS.get(inputVariant);
						//ughhhhhhhhhh 3
						inputVariant = inputVariant.replace("brick_brick", "brick");
						Block inputVariantBlock = searchForBlock(inputVariant, true);
						this.makeBasicRecipeForType(variant, inputVariantBlock, variantBlock, recipeOutput);
					}
					if (variant.stonecuttable) {
						SingleItemRecipeBuilder.stonecutting(Ingredient.of(baseBlock), RecipeCategory.BUILDING_BLOCKS, variantBlock)
								.unlockedBy("has_" + baseBlockName, has(baseBlock))
								.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(StoneExpansion.MOD_ID, "stonecutting/" + baseBlockName + "/" + formattedVariant));
					}
				}

				if (variant.hasNonFullVariants) {
					formattedVariant = formattedVariant.replaceFirst("s$|_block", "");
					this.checkForAndMakeRecipe(variantBlock, formattedVariant + "_stairs", recipeOutput, (base, res) -> this.makeStairRecipe(base, res, recipeOutput), 1);
					this.checkForAndMakeRecipe(variantBlock, formattedVariant + "_slab", recipeOutput, (base, res) -> this.makeSlabRecipe(base, res, recipeOutput), 2);
					this.checkForAndMakeRecipe(variantBlock, formattedVariant + "_wall", recipeOutput, (base, res) -> this.makeWallRecipe(base, res, recipeOutput), 1);
				}
			}
			if (baseBlock != Blocks.SMOOTH_STONE) {
				this.checkForAndMakeRecipe(baseBlock, baseBlockName + "_stairs", recipeOutput, (base, res) -> this.makeStairRecipe(base, res, recipeOutput), 1);
				this.checkForAndMakeRecipe(baseBlock, baseBlockName + "_slab", recipeOutput, (base, res) -> this.makeSlabRecipe(base, res, recipeOutput), 2);
				this.checkForAndMakeRecipe(baseBlock, baseBlockName + "_wall", recipeOutput, (base, res) -> this.makeWallRecipe(base, res, recipeOutput), 1);
			}
		}

		//extras
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.MOSSY_COBBLESTONE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE, 0.1F, 200)
				.unlockedBy("has_stone", has(Blocks.MOSSY_COBBLESTONE))
				.save(recipeOutput);
	}

	///Soft searches registries for given block variant, and generates a crafting and stonecutting recipe for it
	private void checkForAndMakeRecipe(Block baseBlock, String variant, RecipeOutput output, BiConsumer<Block, Block> recipe, int stonecutterCount) {
		String baseBlockName = baseBlock.builtInRegistryHolder().getKey().location().getPath();
		Block variantBlock = searchForBlock(variant, false);
		if (variantBlock != null && !this.areBothBlocksNotOurs(baseBlock, variantBlock)) {
			recipe.accept(baseBlock, variantBlock);
			SingleItemRecipeBuilder.stonecutting(Ingredient.of(baseBlock), RecipeCategory.BUILDING_BLOCKS, variantBlock, stonecutterCount)
					.unlockedBy("has_" + baseBlockName, has(baseBlock))
					.save(output, ResourceLocation.fromNamespaceAndPath(StoneExpansion.MOD_ID, "stonecutting/" + baseBlockName + "/" + variant));
		}
	}

	/// Searches ours and the vanilla namespace for the block in question.
	///
	/// If `strict` is set to true, the method will throw an exception, letting you know the block is missing.
	///
	/// Otherwise, the method returns null if it cant find the block.
	@Nullable
	private static Block searchForBlock(String name, boolean strict) {
		return searchForBlock(name, "minecraft", strict);
	}

	/// Searches ours and a given modid for the block in question.
	///
	/// If `strict` is set to true, the method will throw an exception, letting you know the block is missing.
	///
	/// Otherwise, the method returns null if it cant find the block.
	@Nullable
	private static Block searchForBlock(String name, String otherModID, boolean strict) {
		//special case: vanilla's "polished basalt" is technically a pillar block. Treat it as such I guess
		if (name.equals("basalt_pillar")) {
			return Blocks.POLISHED_BASALT;
		}

		Block modBlock = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(StoneExpansion.MOD_ID, name));
		if (modBlock != Blocks.AIR) {
			return modBlock;
		} else {
			Block baseBlock = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(otherModID, name));
			if (baseBlock == Blocks.AIR) {
				if (strict) {
					throw new IllegalArgumentException("Block " + name + " is not registered to defined registry namespaces `" + otherModID + "` or `" + StoneExpansion.MOD_ID + "`, datagen cannot continue.");
				}
				return null;
			}
			return baseBlock;
		}
	}

	//checks if both the base and variant blocks are not owned by this mod. Used to skip recipes if we dont add either.
	private boolean areBothBlocksNotOurs(Block base, Block variant) {
		return !BuiltInRegistries.BLOCK.getKey(base).getNamespace().equals(StoneExpansion.MOD_ID) && !BuiltInRegistries.BLOCK.getKey(variant).getNamespace().equals(StoneExpansion.MOD_ID);
	}

	/// Generates a recipe based on the variant enum provided.
	///
	/// Smooth and Cracked Brick blocks: basic smelting recipe.
	///
	/// Polished blocks: diamond shape of given input block. Yields 4 blocks.
	///
	/// Chiseled and Cut blocks: 1x2 of given input block. Yields 1 block.
	///
	/// Brick and Tile blocks: 2x2 of given input block. Yields 4 blocks.
	///
	/// Pillar blocks: 1x2 of given input block. Yields 2 blocks.
	///
	/// Dark blocks: ring of input blocks around black dye. Yields 8 blocks.
	private void makeBasicRecipeForType(Variants variant, ItemLike input, ItemLike output, RecipeOutput recipeOutput) {
		String inputKey = BuiltInRegistries.ITEM.getKey(input.asItem()).getPath();
		switch (variant) {
			case COBBLED -> SimpleCookingRecipeBuilder.smelting(Ingredient.of(output), RecipeCategory.BUILDING_BLOCKS, input, 0.1F, 200)
					.unlockedBy("has_" + inputKey, has(output))
					.save(recipeOutput, inputKey + "_from_cobbled");
			case SMOOTH, CRACKED_BRICKS ->
					SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, 0.1F, 200)
							.unlockedBy("has_" + inputKey, has(input))
							.save(recipeOutput);
			case POLISHED -> ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
					.pattern(" B ")
					.pattern("B B")
					.pattern(" B ")
					.define('B', input)
					.unlockedBy("has_" + inputKey, has(input))
					.save(recipeOutput);
			case CHISELED, CUT -> ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 1)
					.pattern("B")
					.pattern("B")
					.define('B', input)
					.unlockedBy("has_" + inputKey, has(input))
					.save(recipeOutput);
			case BRICKS, TILES -> ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
					.pattern("BB")
					.pattern("BB")
					.define('B', input)
					.unlockedBy("has_" + inputKey, has(input))
					.save(recipeOutput);
			case PILLAR -> ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 2)
					.pattern("B")
					.pattern("B")
					.define('B', input)
					.unlockedBy("has_" + inputKey, has(input))
					.save(recipeOutput);
			case DARK -> ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8)
					.pattern("BBB")
					.pattern("BDB")
					.pattern("BBB")
					.define('B', input)
					.define('D', Items.BLACK_DYE)
					.unlockedBy("has_" + inputKey, has(input))
					.save(recipeOutput);
		}
	}

	private void makeStairRecipe(ItemLike input, ItemLike output, RecipeOutput recipeOutput) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
				.pattern("B  ")
				.pattern("BB ")
				.pattern("BBB")
				.define('B', input)
				.unlockedBy("has_block", has(input))
				.save(recipeOutput);
	}

	private void makeSlabRecipe(ItemLike input, ItemLike output, RecipeOutput recipeOutput) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
				.pattern("BBB")
				.define('B', input)
				.unlockedBy("has_block", has(input))
				.save(recipeOutput);
	}

	private void makeWallRecipe(ItemLike input, ItemLike output, RecipeOutput recipeOutput) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
				.pattern("BBB")
				.pattern("BBB")
				.define('B', input)
				.unlockedBy("has_block", has(input))
				.save(recipeOutput);
	}
}
