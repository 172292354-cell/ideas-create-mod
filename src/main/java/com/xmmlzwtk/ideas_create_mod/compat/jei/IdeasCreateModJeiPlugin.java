package com.xmmlzwtk.ideas_create_mod.compat.jei;

import com.xmmlzwtk.ideas_create_mod.IdeasCreateMod;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;

/**
 * JEI 集成插件。
 * JEI 会通过 @JeiPlugin 注解自动发现并加载本类，无需其他注册。
 *
 * 开发流程提示：
 * 1. 先在 Create 中找到你要接管的机器/配方类型；
 * 2. 编写自己的 IRecipeCategory + IRecipeType（继承 Create 的风格或自定义 GUI）；
 * 3. 在 registerCategories / registerRecipes / registerRecipeCatalysts 中注册。
 */
@JeiPlugin
public class IdeasCreateModJeiPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(IdeasCreateMod.MOD_ID, "jei_plugin");
    }

    // 示例（后续开发时取消注释并按需修改）：
    //
    // @Override
    // public void registerCategories(IRecipeCategoryRegistration registration) {
    //     registration.addRecipeCategories(new MyMachineCategory(registration.getJeiHelpers().getGuiHelper()));
    // }
    //
    // @Override
    // public void registerRecipes(IRecipeRegistration registration) {
    //     registration.addRecipes(MyRecipeCategory.RECIPE_TYPE, MyRecipes.getAll());
    // }
    //
    // @Override
    // public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
    //     registration.addRecipeCatalyst(new ItemStack(Items.DIAMOND), MyRecipeCategory.RECIPE_TYPE);
    // }
}
