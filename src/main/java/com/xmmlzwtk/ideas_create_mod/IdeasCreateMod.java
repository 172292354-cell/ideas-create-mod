package com.xmmlzwtk.ideas_create_mod;

import com.mojang.logging.LogUtils;
import com.xmmlzwtk.ideas_create_mod.registry.ModBlocks;
import com.xmmlzwtk.ideas_create_mod.registry.ModCreativeTabs;
import com.xmmlzwtk.ideas_create_mod.registry.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * 模组主类。
 * Create 附属开发框架：在这里初始化各个注册表与兼容层（JEI 等）。
 */
@Mod(IdeasCreateMod.MOD_ID)
public class IdeasCreateMod {

    public static final String MOD_ID = "ideas_create_mod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public IdeasCreateMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // 注册各类内容
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("[Ideas Create Mod] 框架初始化完成，Create 附属开发环境已就绪");
    }
}
