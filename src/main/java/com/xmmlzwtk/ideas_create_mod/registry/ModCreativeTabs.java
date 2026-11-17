package com.xmmlzwtk.ideas_create_mod.registry;

import com.simibubi.create.AllItems;
import com.xmmlzwtk.ideas_create_mod.IdeasCreateMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

/**
 * 创造模式物品栏标签页。
 */
public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IdeasCreateMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAIN = TABS.register("main",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + IdeasCreateMod.MOD_ID))
                    // 图标：Create 扳手
                    .icon(() -> AllItems.WRENCH.asStack())
                    .displayItems((parameters, output) -> {
                        // 把 Create 扳手放进标签页（保证标签页不为空，否则不会显示）
                        output.accept(AllItems.WRENCH.get());
                        // 本模组物品
                        output.accept(ModItems.COMPACTED_NETHERRACK.get());
                        output.accept(ModItems.CRUSHED_NETHERRACK.get());
                        output.accept(ModItems.CREATION_CORE.get());
                        output.accept(ModItems.KINETIC_MECHANISM.get());
                        output.accept(ModItems.INCOMPLETE_BLAZE_BURNER.get());
                        // TODO: 新增物品/方块后，把它们加进这里
                        // output.accept(ModItems.MY_ITEM.get());
                        // output.accept(ModBlocks.MY_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus modEventBus) {
        TABS.register(modEventBus);
    }
}
