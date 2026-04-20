package net.baijj.inkwhite.block;

import net.baijj.inkwhite.Flybrid;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RUBY_BLOCK=regitserBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static  Block regitserBlock(String name,Block block){
        registerModBlocks(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(Flybrid.MOD_ID,name),block);
    }


    private static Item regitsterBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(Flybrid.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        Flybrid.LOGGER.info("Registering ModBlocks for"+Flybrid.MOD_ID);
    }
}
