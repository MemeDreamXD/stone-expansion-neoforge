package com.memedream.stoneexpansion;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(StoneExpansion.MOD_ID)
public class StoneExpansion
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "stoneexpansion";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    // The constructor for the mod class is the first code that is run when your mod is loaded.

    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public StoneExpansion(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);
        // Register Items / Blocks
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        // Add config option
        // modEventBus.addListener(this::addVanillaDatapack);


        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(net.neoforged.fml.config.ModConfig.Type.COMMON, ModConfig.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            // Smooth Stone
            event.accept(ModBlocks.SMOOTH_STONE_STAIRS);
            event.accept(ModBlocks.SMOOTH_STONE_WALL);
            event.accept(ModBlocks.COBBLED_SMOOTH_STONE);
            event.accept(ModBlocks.COBBLED_SMOOTH_STONE_STAIRS);
            event.accept(ModBlocks.COBBLED_SMOOTH_STONE_SLAB);
            event.accept(ModBlocks.COBBLED_SMOOTH_STONE_WALL);
//            event.accept(ModBlocks.SMOOTH_SMOOTH_STONE);
//            event.accept(ModBlocks.SMOOTH_SMOOTH_STONE_STAIRS);
//            event.accept(ModBlocks.SMOOTH_SMOOTH_STONE_SLAB);
            event.accept(ModBlocks.POLISHED_SMOOTH_STONE);
            event.accept(ModBlocks.POLISHED_SMOOTH_STONE_STAIRS);
            event.accept(ModBlocks.POLISHED_SMOOTH_STONE_SLAB);
            event.accept(ModBlocks.POLISHED_SMOOTH_STONE_WALL);
            event.accept(ModBlocks.CHISELED_SMOOTH_STONE_BRICKS);
            event.accept(ModBlocks.CUT_SMOOTH_STONE);
            event.accept(ModBlocks.CUT_SMOOTH_STONE_SLAB);
            event.accept(ModBlocks.SMOOTH_STONE_BRICKS);
            event.accept(ModBlocks.SMOOTH_STONE_BRICK_STAIRS);
            event.accept(ModBlocks.SMOOTH_STONE_BRICK_SLAB);
            event.accept(ModBlocks.SMOOTH_STONE_BRICK_WALL);
            event.accept(ModBlocks.CRACKED_SMOOTH_STONE_BRICKS);
            event.accept(ModBlocks.SMOOTH_STONE_PILLAR);
            event.accept(ModBlocks.SMOOTH_STONE_TILES);
            event.accept(ModBlocks.DARK_SMOOTH_STONE);
            event.accept(ModBlocks.DARK_SMOOTH_STONE_STAIRS);
            event.accept(ModBlocks.DARK_SMOOTH_STONE_SLAB);
            // Stone
            event.accept(ModBlocks.STONE_WALL);
            //event.accept(ModBlocks.SMOOTH_STONE);
            //event.accept(ModBlocks.SMOOTH_STONE_STAIRS);
            //event.accept(ModBlocks.SMOOTH_STONE_SLAB);
            event.accept(ModBlocks.POLISHED_STONE);
            event.accept(ModBlocks.POLISHED_STONE_STAIRS);
            event.accept(ModBlocks.POLISHED_STONE_SLAB);
            event.accept(ModBlocks.POLISHED_STONE_WALL);
            event.accept(ModBlocks.CUT_STONE);
            event.accept(ModBlocks.CUT_STONE_SLAB);
            event.accept(ModBlocks.STONE_PILLAR);
            event.accept(ModBlocks.STONE_TILES);
            event.accept(ModBlocks.DARK_STONE);
            event.accept(ModBlocks.DARK_STONE_STAIRS);
            event.accept(ModBlocks.DARK_STONE_SLAB);
            // Mossy Stone
            event.accept(ModBlocks.MOSSY_STONE);
            event.accept(ModBlocks.MOSSY_STONE_STAIRS);
            event.accept(ModBlocks.MOSSY_STONE_SLAB);
            event.accept(ModBlocks.MOSSY_STONE_WALL);
            event.accept(ModBlocks.SMOOTH_MOSSY_STONE);
            event.accept(ModBlocks.SMOOTH_MOSSY_STONE_STAIRS);
            event.accept(ModBlocks.SMOOTH_MOSSY_STONE_SLAB);
            event.accept(ModBlocks.POLISHED_MOSSY_STONE);
            event.accept(ModBlocks.POLISHED_MOSSY_STONE_STAIRS);
            event.accept(ModBlocks.POLISHED_MOSSY_STONE_SLAB);
            event.accept(ModBlocks.POLISHED_MOSSY_STONE_WALL);
            event.accept(ModBlocks.CHISELED_MOSSY_STONE_BRICKS);
            event.accept(ModBlocks.CUT_MOSSY_STONE);
            event.accept(ModBlocks.CUT_MOSSY_STONE_SLAB);
            event.accept(ModBlocks.CRACKED_MOSSY_STONE_BRICKS);
            event.accept(ModBlocks.MOSSY_STONE_PILLAR);
            event.accept(ModBlocks.MOSSY_STONE_TILES);
            event.accept(ModBlocks.DARK_MOSSY_STONE);
            event.accept(ModBlocks.DARK_MOSSY_STONE_STAIRS);
            event.accept(ModBlocks.DARK_MOSSY_STONE_SLAB);
            // Granite
            event.accept(ModBlocks.COBBLED_GRANITE);
            event.accept(ModBlocks.COBBLED_GRANITE_STAIRS);
            event.accept(ModBlocks.COBBLED_GRANITE_SLAB);
            event.accept(ModBlocks.COBBLED_GRANITE_WALL);
            event.accept(ModBlocks.POLISHED_GRANITE_WALL);
            event.accept(ModBlocks.SMOOTH_GRANITE);
            event.accept(ModBlocks.SMOOTH_GRANITE_STAIRS);
            event.accept(ModBlocks.SMOOTH_GRANITE_SLAB);
            event.accept(ModBlocks.CHISELED_GRANITE_BRICKS);
            event.accept(ModBlocks.CUT_GRANITE);
            event.accept(ModBlocks.CUT_GRANITE_SLAB);
            event.accept(ModBlocks.GRANITE_BRICKS);
            event.accept(ModBlocks.GRANITE_BRICK_STAIRS);
            event.accept(ModBlocks.GRANITE_BRICK_SLAB);
            event.accept(ModBlocks.GRANITE_BRICK_WALL);
            event.accept(ModBlocks.CRACKED_GRANITE_BRICKS);
            event.accept(ModBlocks.GRANITE_PILLAR);
            event.accept(ModBlocks.GRANITE_TILES);
            event.accept(ModBlocks.DARK_GRANITE);
            event.accept(ModBlocks.DARK_GRANITE_STAIRS);
            event.accept(ModBlocks.DARK_GRANITE_SLAB);
            // Diorite
            event.accept(ModBlocks.COBBLED_DIORITE);
            event.accept(ModBlocks.COBBLED_DIORITE_STAIRS);
            event.accept(ModBlocks.COBBLED_DIORITE_SLAB);
            event.accept(ModBlocks.COBBLED_DIORITE_WALL);
            event.accept(ModBlocks.POLISHED_DIORITE_WALL);
            event.accept(ModBlocks.SMOOTH_DIORITE);
            event.accept(ModBlocks.SMOOTH_DIORITE_STAIRS);
            event.accept(ModBlocks.SMOOTH_DIORITE_SLAB);
            event.accept(ModBlocks.CHISELED_DIORITE_BRICKS);
            event.accept(ModBlocks.CUT_DIORITE);
            event.accept(ModBlocks.CUT_DIORITE_SLAB);
            event.accept(ModBlocks.DIORITE_BRICKS);
            event.accept(ModBlocks.DIORITE_BRICK_STAIRS);
            event.accept(ModBlocks.DIORITE_BRICK_SLAB);
            event.accept(ModBlocks.DIORITE_BRICK_WALL);
            event.accept(ModBlocks.CRACKED_DIORITE_BRICKS);
            event.accept(ModBlocks.DIORITE_PILLAR);
            event.accept(ModBlocks.DIORITE_TILES);
            event.accept(ModBlocks.DARK_DIORITE);
            event.accept(ModBlocks.DARK_DIORITE_STAIRS);
            event.accept(ModBlocks.DARK_DIORITE_SLAB);
            // Andesite
            event.accept(ModBlocks.COBBLED_ANDESITE);
            event.accept(ModBlocks.COBBLED_ANDESITE_STAIRS);
            event.accept(ModBlocks.COBBLED_ANDESITE_SLAB);
            event.accept(ModBlocks.COBBLED_ANDESITE_WALL);
            event.accept(ModBlocks.POLISHED_ANDESITE_WALL);
            event.accept(ModBlocks.SMOOTH_ANDESITE);
            event.accept(ModBlocks.SMOOTH_ANDESITE_STAIRS);
            event.accept(ModBlocks.SMOOTH_ANDESITE_SLAB);
            event.accept(ModBlocks.CHISELED_ANDESITE_BRICKS);
            event.accept(ModBlocks.CUT_ANDESITE);
            event.accept(ModBlocks.CUT_ANDESITE_SLAB);
            event.accept(ModBlocks.ANDESITE_BRICKS);
            event.accept(ModBlocks.ANDESITE_BRICK_STAIRS);
            event.accept(ModBlocks.ANDESITE_BRICK_SLAB);
            event.accept(ModBlocks.ANDESITE_BRICK_WALL);
            event.accept(ModBlocks.CRACKED_ANDESITE_BRICKS);
            event.accept(ModBlocks.ANDESITE_PILLAR);
            event.accept(ModBlocks.ANDESITE_TILES);
            event.accept(ModBlocks.DARK_ANDESITE);
            event.accept(ModBlocks.DARK_ANDESITE_STAIRS);
            event.accept(ModBlocks.DARK_ANDESITE_SLAB);
            // Deepslate
            event.accept(ModBlocks.DEEPSLATE_STAIRS);
            event.accept(ModBlocks.DEEPSLATE_SLAB);
            event.accept(ModBlocks.DEEPSLATE_WALL);
            event.accept(ModBlocks.SMOOTH_DEEPSLATE);
            event.accept(ModBlocks.SMOOTH_DEEPSLATE_STAIRS);
            event.accept(ModBlocks.SMOOTH_DEEPSLATE_SLAB);
            event.accept(ModBlocks.CUT_DEEPSLATE);
            event.accept(ModBlocks.CUT_DEEPSLATE_SLAB);
            event.accept(ModBlocks.DEEPSLATE_PILLAR);
            event.accept(ModBlocks.DARK_DEEPSLATE);
            event.accept(ModBlocks.DARK_DEEPSLATE_STAIRS);
            event.accept(ModBlocks.DARK_DEEPSLATE_SLAB);
            // Bricks
            event.accept(ModBlocks.COBBLED_BRICKS);
            event.accept(ModBlocks.COBBLED_BRICK_STAIRS);
            event.accept(ModBlocks.COBBLED_BRICK_SLAB);
            event.accept(ModBlocks.COBBLED_BRICK_WALL);
            event.accept(ModBlocks.SMOOTH_BRICK);
            event.accept(ModBlocks.SMOOTH_BRICK_STAIRS);
            event.accept(ModBlocks.SMOOTH_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_BRICK);
            event.accept(ModBlocks.POLISHED_BRICK_STAIRS);
            event.accept(ModBlocks.POLISHED_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_BRICK_WALL);
            event.accept(ModBlocks.CHISELED_BRICKS);
            event.accept(ModBlocks.CUT_BRICKS);
            event.accept(ModBlocks.CUT_BRICK_SLAB);
            event.accept(ModBlocks.CRACKED_BRICKS);
            event.accept(ModBlocks.BRICK_PILLAR);
            event.accept(ModBlocks.BRICK_TILES);
            event.accept(ModBlocks.DARK_BRICKS);
            event.accept(ModBlocks.DARK_BRICK_STAIRS);
            event.accept(ModBlocks.DARK_BRICK_SLAB);
            // Mud
            event.accept(ModBlocks.COBBLED_MUD);
            event.accept(ModBlocks.COBBLED_MUD_STAIRS);
            event.accept(ModBlocks.COBBLED_MUD_SLAB);
            event.accept(ModBlocks.COBBLED_MUD_WALL);
            event.accept(ModBlocks.SMOOTH_MUD);
            event.accept(ModBlocks.SMOOTH_MUD_STAIRS);
            event.accept(ModBlocks.SMOOTH_MUD_SLAB);
            event.accept(ModBlocks.POLISHED_MUD);
            event.accept(ModBlocks.POLISHED_MUD_STAIRS);
            event.accept(ModBlocks.POLISHED_MUD_SLAB);
            event.accept(ModBlocks.POLISHED_MUD_WALL);
            event.accept(ModBlocks.CHISELED_MUD_BRICKS);
            event.accept(ModBlocks.CUT_MUD);
            event.accept(ModBlocks.CUT_MUD_SLAB);
            event.accept(ModBlocks.CRACKED_MUD_BRICKS);
            event.accept(ModBlocks.MUD_PILLAR);
            event.accept(ModBlocks.MUD_TILES);
            event.accept(ModBlocks.DARK_MUD);
            event.accept(ModBlocks.DARK_MUD_STAIRS);
            event.accept(ModBlocks.DARK_MUD_SLAB);
            // Sandstone
            event.accept(ModBlocks.COBBLED_SANDSTONE);
            event.accept(ModBlocks.COBBLED_SANDSTONE_STAIRS);
            event.accept(ModBlocks.COBBLED_SANDSTONE_SLAB);
            event.accept(ModBlocks.COBBLED_SANDSTONE_WALL);
            event.accept(ModBlocks.POLISHED_SANDSTONE);
            event.accept(ModBlocks.POLISHED_SANDSTONE_STAIRS);
            event.accept(ModBlocks.POLISHED_SANDSTONE_SLAB);
            event.accept(ModBlocks.POLISHED_SANDSTONE_WALL);
            event.accept(ModBlocks.SANDSTONE_BRICKS);
            event.accept(ModBlocks.SANDSTONE_BRICK_STAIRS);
            event.accept(ModBlocks.SANDSTONE_BRICK_SLAB);
            event.accept(ModBlocks.SANDSTONE_BRICK_WALL);
            event.accept(ModBlocks.CRACKED_SANDSTONE_BRICKS);
            event.accept(ModBlocks.SANDSTONE_PILLAR);
            event.accept(ModBlocks.SANDSTONE_TILES);
            event.accept(ModBlocks.DARK_SANDSTONE);
            event.accept(ModBlocks.DARK_SANDSTONE_STAIRS);
            event.accept(ModBlocks.DARK_SANDSTONE_SLAB);
            // Red Sandstone
            event.accept(ModBlocks.COBBLED_RED_SANDSTONE);
            event.accept(ModBlocks.COBBLED_RED_SANDSTONE_STAIRS);
            event.accept(ModBlocks.COBBLED_RED_SANDSTONE_SLAB);
            event.accept(ModBlocks.COBBLED_RED_SANDSTONE_WALL);
            event.accept(ModBlocks.POLISHED_RED_SANDSTONE);
            event.accept(ModBlocks.POLISHED_RED_SANDSTONE_STAIRS);
            event.accept(ModBlocks.POLISHED_RED_SANDSTONE_SLAB);
            event.accept(ModBlocks.POLISHED_RED_SANDSTONE_WALL);
            event.accept(ModBlocks.RED_SANDSTONE_BRICKS);
            event.accept(ModBlocks.RED_SANDSTONE_BRICK_STAIRS);
            event.accept(ModBlocks.RED_SANDSTONE_BRICK_SLAB);
            event.accept(ModBlocks.RED_SANDSTONE_BRICK_WALL);
            event.accept(ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);
            event.accept(ModBlocks.RED_SANDSTONE_PILLAR);
            event.accept(ModBlocks.RED_SANDSTONE_TILES);
            event.accept(ModBlocks.DARK_RED_SANDSTONE);
            event.accept(ModBlocks.DARK_RED_SANDSTONE_STAIRS);
            event.accept(ModBlocks.DARK_RED_SANDSTONE_SLAB);
            // Prismarine
            event.accept(ModBlocks.SMOOTH_PRISMARINE);
            event.accept(ModBlocks.SMOOTH_PRISMARINE_STAIRS);
            event.accept(ModBlocks.SMOOTH_PRISMARINE_SLAB);
            event.accept(ModBlocks.POLISHED_PRISMARINE);
            event.accept(ModBlocks.POLISHED_PRISMARINE_STAIRS);
            event.accept(ModBlocks.POLISHED_PRISMARINE_SLAB);
            event.accept(ModBlocks.POLISHED_PRISMARINE_WALL);
            event.accept(ModBlocks.CHISELED_PRISMARINE_BRICKS);
            event.accept(ModBlocks.CUT_PRISMARINE);
            event.accept(ModBlocks.CUT_PRISMARINE_SLAB);
            event.accept(ModBlocks.CRACKED_PRISMARINE_BRICKS);
            event.accept(ModBlocks.PRISMARINE_PILLAR);
            event.accept(ModBlocks.PRISMARINE_TILES);
            // Nether Brick
            event.accept(ModBlocks.COBBLED_NETHER_BRICKS);
            event.accept(ModBlocks.COBBLED_NETHER_BRICK_STAIRS);
            event.accept(ModBlocks.COBBLED_NETHER_BRICK_SLAB);
            event.accept(ModBlocks.COBBLED_NETHER_BRICK_WALL);
            event.accept(ModBlocks.SMOOTH_NETHER_BRICK);
            event.accept(ModBlocks.SMOOTH_NETHER_BRICK_STAIRS);
            event.accept(ModBlocks.SMOOTH_NETHER_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_NETHER_BRICK);
            event.accept(ModBlocks.POLISHED_NETHER_BRICK_STAIRS);
            event.accept(ModBlocks.POLISHED_NETHER_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_NETHER_BRICK_WALL);
            event.accept(ModBlocks.CUT_NETHER_BRICKS);
            event.accept(ModBlocks.CUT_NETHER_BRICK_SLAB);
            event.accept(ModBlocks.NETHER_BRICK_PILLAR);
            event.accept(ModBlocks.NETHER_BRICK_TILES);
            event.accept(ModBlocks.DARK_NETHER_BRICKS);
            event.accept(ModBlocks.DARK_NETHER_BRICK_STAIRS);
            event.accept(ModBlocks.DARK_NETHER_BRICK_SLAB);
            // Red Nether Brick
            event.accept(ModBlocks.COBBLED_RED_NETHER_BRICKS);
            event.accept(ModBlocks.COBBLED_RED_NETHER_BRICK_STAIRS);
            event.accept(ModBlocks.COBBLED_RED_NETHER_BRICK_SLAB);
            event.accept(ModBlocks.COBBLED_RED_NETHER_BRICK_WALL);
            event.accept(ModBlocks.SMOOTH_RED_NETHER_BRICK);
            event.accept(ModBlocks.SMOOTH_RED_NETHER_BRICK_STAIRS);
            event.accept(ModBlocks.SMOOTH_RED_NETHER_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_RED_NETHER_BRICK);
            event.accept(ModBlocks.POLISHED_RED_NETHER_BRICK_STAIRS);
            event.accept(ModBlocks.POLISHED_RED_NETHER_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_RED_NETHER_BRICK_WALL);
            event.accept(ModBlocks.CHISELED_RED_NETHER_BRICKS);
            event.accept(ModBlocks.CUT_RED_NETHER_BRICKS);
            event.accept(ModBlocks.CUT_RED_NETHER_BRICK_SLAB);
            event.accept(ModBlocks.CRACKED_RED_NETHER_BRICKS);
            event.accept(ModBlocks.RED_NETHER_BRICK_PILLAR);
            event.accept(ModBlocks.RED_NETHER_BRICK_TILES);
            event.accept(ModBlocks.DARK_RED_NETHER_BRICKS);
            event.accept(ModBlocks.DARK_RED_NETHER_BRICK_STAIRS);
            event.accept(ModBlocks.DARK_RED_NETHER_BRICK_SLAB);
            event.accept(ModBlocks.RED_NETHER_BRICK_FENCE);
            // Basalt
            event.accept(ModBlocks.BASALT_STAIRS);
            event.accept(ModBlocks.BASALT_SLAB);
            event.accept(ModBlocks.BASALT_WALL);
            event.accept(ModBlocks.COBBLED_BASALT);
            event.accept(ModBlocks.COBBLED_BASALT_STAIRS);
            event.accept(ModBlocks.COBBLED_BASALT_SLAB);
            event.accept(ModBlocks.COBBLED_BASALT_WALL);
            event.accept(ModBlocks.SMOOTH_BASALT_STAIRS);
            event.accept(ModBlocks.SMOOTH_BASALT_SLAB);
            event.accept(ModBlocks.POLISHED_BASALT);
            event.accept(ModBlocks.POLISHED_BASALT_STAIRS);
            event.accept(ModBlocks.POLISHED_BASALT_SLAB);
            event.accept(ModBlocks.POLISHED_BASALT_WALL);
            event.accept(ModBlocks.CHISELED_BASALT_BRICKS);
            event.accept(ModBlocks.CUT_BASALT);
            event.accept(ModBlocks.CUT_BASALT_SLAB);
            event.accept(ModBlocks.BASALT_BRICKS);
            event.accept(ModBlocks.BASALT_BRICK_STAIRS);
            event.accept(ModBlocks.BASALT_BRICK_SLAB);
            event.accept(ModBlocks.BASALT_BRICK_WALL);
            event.accept(ModBlocks.CRACKED_BASALT_BRICKS);
            event.accept(ModBlocks.BASALT_TILES);
            event.accept(ModBlocks.DARK_BASALT);
            event.accept(ModBlocks.DARK_BASALT_STAIRS);
            event.accept(ModBlocks.DARK_BASALT_SLAB);
            // Blackstone
            event.accept(ModBlocks.COBBLED_BLACKSTONE);
            event.accept(ModBlocks.COBBLED_BLACKSTONE_STAIRS);
            event.accept(ModBlocks.COBBLED_BLACKSTONE_SLAB);
            event.accept(ModBlocks.COBBLED_BLACKSTONE_WALL);
            event.accept(ModBlocks.SMOOTH_BLACKSTONE);
            event.accept(ModBlocks.SMOOTH_BLACKSTONE_STAIRS);
            event.accept(ModBlocks.SMOOTH_BLACKSTONE_SLAB);
            event.accept(ModBlocks.CUT_BLACKSTONE);
            event.accept(ModBlocks.CUT_BLACKSTONE_SLAB);
            event.accept(ModBlocks.BLACKSTONE_PILLAR);
            event.accept(ModBlocks.BLACKSTONE_TILES);
            event.accept(ModBlocks.DARK_BLACKSTONE);
            event.accept(ModBlocks.DARK_BLACKSTONE_STAIRS);
            event.accept(ModBlocks.DARK_BLACKSTONE_SLAB);
            // End Stone
            event.accept(ModBlocks.END_STONE_STAIRS);
            event.accept(ModBlocks.END_STONE_SLAB);
            event.accept(ModBlocks.END_STONE_WALL);
            event.accept(ModBlocks.COBBLED_END_STONE);
            event.accept(ModBlocks.COBBLED_END_STONE_STAIRS);
            event.accept(ModBlocks.COBBLED_END_STONE_SLAB);
            event.accept(ModBlocks.COBBLED_END_STONE_WALL);
            event.accept(ModBlocks.SMOOTH_END_STONE);
            event.accept(ModBlocks.SMOOTH_END_STONE_STAIRS);
            event.accept(ModBlocks.SMOOTH_END_STONE_SLAB);
            event.accept(ModBlocks.POLISHED_END_STONE);
            event.accept(ModBlocks.POLISHED_END_STONE_STAIRS);
            event.accept(ModBlocks.POLISHED_END_STONE_SLAB);
            event.accept(ModBlocks.POLISHED_END_STONE_WALL);
            event.accept(ModBlocks.CHISELED_END_STONE_BRICKS);
            event.accept(ModBlocks.CUT_END_STONE);
            event.accept(ModBlocks.CUT_END_STONE_SLAB);
            event.accept(ModBlocks.CRACKED_END_STONE_BRICKS);
            event.accept(ModBlocks.END_STONE_PILLAR);
            event.accept(ModBlocks.END_STONE_TILES);
            event.accept(ModBlocks.DARK_END_STONE);
            event.accept(ModBlocks.DARK_END_STONE_STAIRS);
            event.accept(ModBlocks.DARK_END_STONE_SLAB);
            //Purpur
            event.accept(ModBlocks.PURPUR_WALL);
            event.accept(ModBlocks.COBBLED_PURPUR);
            event.accept(ModBlocks.COBBLED_PURPUR_STAIRS);
            event.accept(ModBlocks.COBBLED_PURPUR_SLAB);
            event.accept(ModBlocks.COBBLED_PURPUR_WALL);
            event.accept(ModBlocks.SMOOTH_PURPUR);
            event.accept(ModBlocks.SMOOTH_PURPUR_STAIRS);
            event.accept(ModBlocks.SMOOTH_PURPUR_SLAB);
            event.accept(ModBlocks.POLISHED_PURPUR);
            event.accept(ModBlocks.POLISHED_PURPUR_STAIRS);
            event.accept(ModBlocks.POLISHED_PURPUR_SLAB);
            event.accept(ModBlocks.POLISHED_PURPUR_WALL);
            event.accept(ModBlocks.CHISELED_PURPUR_BRICKS);
            event.accept(ModBlocks.CUT_PURPUR);
            event.accept(ModBlocks.CUT_PURPUR_SLAB);
            event.accept(ModBlocks.PURPUR_BRICKS);
            event.accept(ModBlocks.PURPUR_BRICK_STAIRS);
            event.accept(ModBlocks.PURPUR_BRICK_SLAB);
            event.accept(ModBlocks.PURPUR_BRICK_WALL);
            event.accept(ModBlocks.CRACKED_PURPUR_BRICKS);
            event.accept(ModBlocks.PURPUR_TILES);
            event.accept(ModBlocks.DARK_PURPUR);
            event.accept(ModBlocks.DARK_PURPUR_STAIRS);
            event.accept(ModBlocks.DARK_PURPUR_SLAB);
            // Quartz
            event.accept(ModBlocks.COBBLED_QUARTZ);
            event.accept(ModBlocks.COBBLED_QUARTZ_STAIRS);
            event.accept(ModBlocks.COBBLED_QUARTZ_SLAB);
            event.accept(ModBlocks.COBBLED_QUARTZ_WALL);
            event.accept(ModBlocks.POLISHED_QUARTZ);
            event.accept(ModBlocks.POLISHED_QUARTZ_STAIRS);
            event.accept(ModBlocks.POLISHED_QUARTZ_SLAB);
            event.accept(ModBlocks.POLISHED_QUARTZ_WALL);
            event.accept(ModBlocks.CUT_QUARTZ);
            event.accept(ModBlocks.CUT_QUARTZ_SLAB);
            event.accept(ModBlocks.QUARTZ_BRICK_STAIRS);
            event.accept(ModBlocks.QUARTZ_BRICK_SLAB);
            event.accept(ModBlocks.QUARTZ_BRICK_WALL);
            event.accept(ModBlocks.CRACKED_QUARTZ_BRICKS);
            event.accept(ModBlocks.QUARTZ_TILES);
            event.accept(ModBlocks.DARK_QUARTZ);
            event.accept(ModBlocks.DARK_QUARTZ_STAIRS);
            event.accept(ModBlocks.DARK_QUARTZ_SLAB);
            // Dripstone
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
