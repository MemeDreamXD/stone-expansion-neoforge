package com.memedream.stoneexpansion;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StoneExpansion.MOD_ID);

    public static final DeferredItem<BlockItem> SMOOTH_STONE_STAIRS = ITEMS.registerSimpleBlockItem(ModBlocks.SMOOTH_STONE_STAIRS);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}