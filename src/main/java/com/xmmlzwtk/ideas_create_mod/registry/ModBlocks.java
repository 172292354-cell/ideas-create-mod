package com.xmmlzwtk.ideas_create_mod.registry;

import com.xmmlzwtk.ideas_create_mod.IdeasCreateMod;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * 方块注册表。
 *
 * 新增方块示例：
 * <pre>
 * public static final RegistryObject&lt;Block&gt; MY_BLOCK =
 *         BLOCKS.register("my_block",
 *                 () -&gt; new Block(BlockBehaviour.Properties.of().strength(1.5F)));
 * </pre>
 * 别忘了同时在 {@link ModItems} 里把它注册成 BlockItem，否则不能当物品拿。
 */
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, IdeasCreateMod.MOD_ID);

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
