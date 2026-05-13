package com.memedream.stoneexpansion;

import net.minecraft.world.item.CreativeModeTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
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

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            // Smooth Stone
            event.accept(ModBlocks.SMOOTHSTONE_STAIRS);
            event.accept(ModBlocks.SMOOTHSTONE_WALL);
            event.accept(ModBlocks.COBBLED_SMOOTHSTONE);
            event.accept(ModBlocks.COBBLED_SMOOTHSTONE_STAIRS);
            event.accept(ModBlocks.COBBLED_SMOOTHSTONE_SLAB);
            event.accept(ModBlocks.COBBLED_SMOOTHSTONE_WALL);
            event.accept(ModBlocks.SMOOTH_SMOOTHSTONE);
            event.accept(ModBlocks.SMOOTH_SMOOTHSTONE_STAIRS);
            event.accept(ModBlocks.SMOOTH_SMOOTHSTONE_SLAB);
            event.accept(ModBlocks.POLISHED_SMOOTHSTONE);
            event.accept(ModBlocks.POLISHED_SMOOTHSTONE_STAIRS);
            event.accept(ModBlocks.POLISHED_SMOOTHSTONE_SLAB);
            event.accept(ModBlocks.POLISHED_SMOOTHSTONE_WALL);
            event.accept(ModBlocks.CHISELED_SMOOTHSTONE_BRICKS);
            event.accept(ModBlocks.CUT_SMOOTHSTONE);
            event.accept(ModBlocks.CUT_SMOOTHSTONE_SLAB);
            event.accept(ModBlocks.SMOOTHSTONE_BRICKS);
            event.accept(ModBlocks.SMOOTHSTONE_BRICK_STAIRS);
            event.accept(ModBlocks.SMOOTHSTONE_BRICK_SLAB);
            event.accept(ModBlocks.SMOOTHSTONE_BRICK_WALL);
            event.accept(ModBlocks.CRACKED_SMOOTHSTONE_BRICKS);
            event.accept(ModBlocks.SMOOTHSTONE_PILLAR);
            event.accept(ModBlocks.SMOOTHSTONE_TILES);
            event.accept(ModBlocks.DARK_SMOOTHSTONE);
            event.accept(ModBlocks.DARK_SMOOTHSTONE_STAIRS);
            event.accept(ModBlocks.DARK_SMOOTHSTONE_SLAB);
            // Stone
            event.accept(ModBlocks.STONE_WALL);
            event.accept(ModBlocks.SMOOTH_STONE);
            event.accept(ModBlocks.SMOOTH_STONE_STAIRS);
            event.accept(ModBlocks.SMOOTH_STONE_SLAB);
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

            event.accept(ModBlocks.POLISHED_ANDESITE_WALL);
            event.accept(ModBlocks.POLISHED_DIORITE_WALL);
            event.accept(ModBlocks.POLISHED_BASALT_STAIRS);
            event.accept(ModBlocks.POLISHED_BASALT_SLAB);
            event.accept(ModBlocks.POLISHED_BASALT_WALL);

            event.accept(ModBlocks.COBBLED_ANDESITE);
            event.accept(ModBlocks.COBBLED_ANDESITE_STAIRS);
            event.accept(ModBlocks.COBBLED_ANDESITE_SLAB);
            event.accept(ModBlocks.COBBLED_ANDESITE_WALL);
            event.accept(ModBlocks.SMOOTH_ANDESITE);
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
        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
