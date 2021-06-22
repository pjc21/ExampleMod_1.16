package pjc21.mods.teststuffmod.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import pjc21.mods.teststuffmod.TestStuffMod;
import pjc21.mods.teststuffmod.blocks.HeavyBlock;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TestStuffMod.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestStuffMod.MODID);

    public static final RegistryObject<HeavyBlock> HEAVY_BLOCK = BLOCKS.register("heavy_block", HeavyBlock::new);
    public static final RegistryObject<Item> HEAVY_BLOCK_ITEM = ITEMS.register("heavy_block", () -> new BlockItem(HEAVY_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static void init(final IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
    }
}
