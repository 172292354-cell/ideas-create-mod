package com.xmmlzwtk.ideas_create_mod.registry;

import com.xmmlzwtk.ideas_create_mod.IdeasCreateMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;

/**
 * 物品注册表。
 *
 * 新增物品示例：
 * <pre>
 * public static final RegistryObject&lt;Item&gt; MY_ITEM =
 *         ITEMS.register("my_item", () -&gt; new Item(new Item.Properties()));
 * </pre>
 */
public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IdeasCreateMod.MOD_ID);

    /** 压实的下界岩：由下界岩被滚压机滚压得来。 */
    public static final RegistryObject<Item> COMPACTED_NETHERRACK =
            ITEMS.register("compacted_netherrack",
                    () -> new Item(new Item.Properties()));

    /** 粉碎的下界岩：由压实的下界岩被粉碎轮粉碎得来。 */
    public static final RegistryObject<Item> CRUSHED_NETHERRACK =
            ITEMS.register("crushed_netherrack",
                    () -> new Item(new Item.Properties()));

    /** 未完成的烈焰燃烧室：用于序列装配的中间物品。 */
    public static final RegistryObject<SequencedAssemblyItem> INCOMPLETE_BLAZE_BURNER =
             ITEMS.register("incomplete_blaze_burner",
                    () -> new SequencedAssemblyItem(new Item.Properties()));

    /** 不完整的创造核心：序列装配的中间物品。 */
    public static final RegistryObject<SequencedAssemblyItem> INCOMPLETE_CREATION_CORE =
            ITEMS.register("incomplete_creation_core",
                    () -> new SequencedAssemblyItem(new Item.Properties()));

    /** 创造核心：序列装配精密构件 + 7 种材料的产物（1% 成功率）。 */
    public static final RegistryObject<Item> CREATION_CORE =
            ITEMS.register("creation_core",
                    () -> new Item(new Item.Properties()));

    /** 不完整的动力构件：序列装配的中间物品。 */
    public static final RegistryObject<SequencedAssemblyItem> INCOMPLETE_KINETIC_MECHANISM =
            ITEMS.register("incomplete_kinetic_mechanism",
                    () -> new SequencedAssemblyItem(new Item.Properties()));

    /** 动力构件：序列装配精密构件 + 6 种材料的产物（1% 成功率）。 */
    public static final RegistryObject<Item> KINETIC_MECHANISM =
            ITEMS.register("kinetic_mechanism",
                    () -> new Item(new Item.Properties()));

    
    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
