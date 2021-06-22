package pjc21.mods.teststuffmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pjc21.mods.teststuffmod.init.ModBlocks;

@Mod(TestStuffMod.MODID)
public class TestStuffMod
{
    public static final String MODID = "teststuffmod";
    private static final Logger LOGGER = LogManager.getLogger();

    public TestStuffMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus(), forgeEventBus = MinecraftForge.EVENT_BUS;
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::setup);
        ModBlocks.init(modEventBus);
    }

    private void setup(final FMLCommonSetupEvent event) { }
}
