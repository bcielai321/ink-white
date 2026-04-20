package net.baijj.inkwhite.item;

import net.baijj.inkwhite.Flybrid;
import net.baijj.inkwhite.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Flybrid.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() ->new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModBlocks.RUBY_BLOCK);
                    }).build());

    public static void registerItemGroups(){
        Flybrid.LOGGER.info("Registing Item Groups for" + Flybrid.MOD_ID);
    }
}
