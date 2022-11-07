package com.github.thedeathlycow.moregeodes.forge.block

import com.github.thedeathlycow.moregeodes.forge.MoreGeodesForge
import com.github.thedeathlycow.moregeodes.forge.sound.CrystalBlockSoundGroup
import com.github.thedeathlycow.moregeodes.forge.sound.MoreGeodesSoundTypes
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.SoundType
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.Material
import net.minecraft.world.level.material.MaterialColor
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import thedarkcolour.kotlinforforge.forge.registerObject

object MoreGeodesBlocks {

    val REGISTRY: DeferredRegister<Block> = DeferredRegister.create(
        ForgeRegistries.BLOCKS,
        MoreGeodesForge.MODID
    )

    val EMERALD_CRYSTAL_BLOCK by REGISTRY.registerObject("emerald_crystal_block") {
        CrystalBlock(
            CrystalBlockSoundGroup.EMERALD,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.EMERALD)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.EMERALD_CRYSTAL_BLOCK)
                .requiresCorrectToolForDrops()
        )
    }

    val EMERALD_CLUSTER by REGISTRY.registerObject("emerald_cluster") {
        CrystalClusterBlock(
            CrystalBlockSoundGroup.EMERALD,
            7.0, 3.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.EMERALD)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.EMERALD_CLUSTER)
                .requiresCorrectToolForDrops()
                .lightLevel { 5 }
                .noOcclusion()
        )
    }

    val LARGE_EMERALD_BUD by REGISTRY.registerObject("large_emerald_bud") {
        CrystalClusterBlock(
            CrystalBlockSoundGroup.EMERALD,
            5.0, 3.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.EMERALD)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.LARGE_EMERALD_BUD)
                .requiresCorrectToolForDrops()
                .lightLevel { 4 }
                .noOcclusion()
        )
    }

    val MEDIUM_EMERALD_BUD by REGISTRY.registerObject("medium_emerald_bud") {
        CrystalClusterBlock(
            CrystalBlockSoundGroup.EMERALD,
            4.0, 3.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.EMERALD)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.MEDIUM_EMERALD_BUD)
                .requiresCorrectToolForDrops()
                .lightLevel { 2 }
                .noOcclusion()
        )
    }

    val SMALL_EMERALD_BUD by REGISTRY.registerObject("small_emerald_bud") {
        CrystalClusterBlock(
            CrystalBlockSoundGroup.EMERALD,
            3.0, 4.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.EMERALD)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.SMALL_EMERALD_BUD)
                .requiresCorrectToolForDrops()
                .lightLevel { 1 }
                .noOcclusion()
        )
    }

    val QUARTZ_CRYSTAL_BLOCK by REGISTRY.registerObject("quartz_crystal_block") {
        CrystalBlock(
            CrystalBlockSoundGroup.QUARTZ,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.QUARTZ)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.QUARTZ_CRYSTAL_BLOCK)
                .requiresCorrectToolForDrops()
        )
    }

    val QUARTZ_CLUSTER by REGISTRY.registerObject("quartz_cluster") {
        QuartzClusterBlock(
            15, 1,
            CrystalBlockSoundGroup.QUARTZ,
            7.0, 3.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.QUARTZ)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.QUARTZ_CLUSTER)
                .requiresCorrectToolForDrops()
                .lightLevel { 5 }
                .noOcclusion()
        )
    }

    val LARGE_QUARTZ_BUD by REGISTRY.registerObject("large_quartz_bud") {
        QuartzClusterBlock(
            15, 5,
            CrystalBlockSoundGroup.QUARTZ,
            5.0, 3.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.QUARTZ)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.LARGE_QUARTZ_BUD)
                .requiresCorrectToolForDrops()
                .lightLevel { 4 }
                .noOcclusion()
        )
    }

    val MEDIUM_QUARTZ_BUD by REGISTRY.registerObject("medium_quartz_bud") {
        QuartzClusterBlock(
            15, 10,
            CrystalBlockSoundGroup.QUARTZ,
            4.0, 3.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.QUARTZ)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.MEDIUM_QUARTZ_BUD)
                .requiresCorrectToolForDrops()
                .lightLevel { 2 }
                .noOcclusion()
        )
    }

    val SMALL_QUARTZ_BUD by REGISTRY.registerObject("small_quartz_bud") {
        QuartzClusterBlock(
            15, 20,
            CrystalBlockSoundGroup.QUARTZ,
            3.0, 4.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.QUARTZ)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.SMALL_QUARTZ_BUD)
                .requiresCorrectToolForDrops()
                .lightLevel { 1 }
                .noOcclusion()
        )
    }

    val DIAMOND_CRYSTAL_BLOCK by REGISTRY.registerObject("diamond_crystal_block") {
        CrystalBlock(
            CrystalBlockSoundGroup.DIAMOND,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.DIAMOND)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.DIAMOND_CRYSTAL_BLOCK)
                .requiresCorrectToolForDrops()
        )
    }

    val DIAMOND_CLUSTER by REGISTRY.registerObject("diamond_cluster") {
        CrystalClusterBlock(
            CrystalBlockSoundGroup.DIAMOND,
            7.0, 3.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.DIAMOND)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.DIAMOND_CLUSTER)
                .requiresCorrectToolForDrops()
                .lightLevel { 5 }
                .noOcclusion()
        )
    }

    val ECHO_BLOCK by REGISTRY.registerObject("echo_block") {
        CrystalBlock(
            CrystalBlockSoundGroup.ECHO,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLACK)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.ECHO_BLOCK)
                .requiresCorrectToolForDrops()
        )
    }

    val ECHO_CLUSTER by REGISTRY.registerObject("echo_cluster") {
        CrystalClusterBlock(
            CrystalBlockSoundGroup.ECHO,
            7.0, 3.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLACK)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.ECHO_CLUSTER)
                .requiresCorrectToolForDrops()
                .lightLevel { 5 }
                .noOcclusion()
        )
    }

    val LARGE_ECHO_BUD by REGISTRY.registerObject("large_echo_bud") {
        CrystalClusterBlock(
            CrystalBlockSoundGroup.ECHO,
            5.0, 3.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLACK)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.LARGE_ECHO_BUD)
                .requiresCorrectToolForDrops()
                .lightLevel { 4 }
                .noOcclusion()
        )
    }

    val MEDIUM_ECHO_BUD by REGISTRY.registerObject("medium_echo_bud") {
        CrystalClusterBlock(
            CrystalBlockSoundGroup.ECHO,
            4.0, 3.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLACK)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.MEDIUM_ECHO_BUD)
                .requiresCorrectToolForDrops()
                .lightLevel { 2 }
                .noOcclusion()
        )
    }

    val SMALL_ECHO_BUD by REGISTRY.registerObject("small_echo_bud") {
        CrystalClusterBlock(
            CrystalBlockSoundGroup.ECHO,
            3.0, 4.0,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLACK)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.SMALL_ECHO_BUD)
                .requiresCorrectToolForDrops()
                .lightLevel { 1 }
                .noOcclusion()
        )
    }

    ////// Budding Blocks //////

    val BUDDING_EMERALD by REGISTRY.registerObject("budding_emerald") {
        BuddingCrystalBlock(
            listOf(SMALL_EMERALD_BUD, MEDIUM_EMERALD_BUD, LARGE_EMERALD_BUD, EMERALD_CLUSTER),
            CrystalBlockSoundGroup.ECHO,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.EMERALD)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.EMERALD_CRYSTAL_BLOCK)
                .requiresCorrectToolForDrops()
                .randomTicks()
        )
    }

    val BUDDING_QUARTZ by REGISTRY.registerObject("budding_quartz") {
        BuddingCrystalBlock(
            listOf(SMALL_QUARTZ_BUD, MEDIUM_QUARTZ_BUD, LARGE_QUARTZ_BUD, QUARTZ_CLUSTER),
            CrystalBlockSoundGroup.QUARTZ,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.QUARTZ)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.QUARTZ_CRYSTAL_BLOCK)
                .requiresCorrectToolForDrops()
                .randomTicks()
        )
    }

    val BUDDING_ECHO_BLOCK by REGISTRY.registerObject("budding_echo_block") {
        BuddingCrystalBlock(
            listOf(SMALL_ECHO_BUD, MEDIUM_ECHO_BUD, LARGE_ECHO_BUD, ECHO_CLUSTER),
            CrystalBlockSoundGroup.ECHO,
            BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLACK)
                .strength(1.5f)
                .sound(MoreGeodesSoundTypes.ECHO_BLOCK)
                .requiresCorrectToolForDrops()
                .randomTicks()
        )
    }

    ////// Echo Locator Blocks //////

    val EMERALD_CRYSTAL_ECHO_LOCATOR by REGISTRY.registerObject("emerald_crystal_echo_locator") {
        EchoLocatorBlock(
            EchoLocatorType.EMERALD,
            BlockBehaviour.Properties.of(MoreGeodesBlockMaterials.ECHO_LOCATOR)
                .noOcclusion()
                .sound(MoreGeodesSoundTypes.ECHO_LOCATOR)
                .strength(1.5f, 6.0f)
                .requiresCorrectToolForDrops()
        )
    }

    val QUARTZ_CRYSTAL_ECHO_LOCATOR by REGISTRY.registerObject("quartz_crystal_echo_locator") {
        EchoLocatorBlock(
            EchoLocatorType.QUARTZ,
            BlockBehaviour.Properties.of(MoreGeodesBlockMaterials.ECHO_LOCATOR)
                .noOcclusion()
                .sound(MoreGeodesSoundTypes.ECHO_LOCATOR)
                .strength(1.5f, 6.0f)
                .requiresCorrectToolForDrops()
        )
    }

    val DIAMOND_CRYSTAL_ECHO_LOCATOR by REGISTRY.registerObject("diamond_crystal_echo_locator") {
        EchoLocatorBlock(
            EchoLocatorType.DIAMOND,
            BlockBehaviour.Properties.of(MoreGeodesBlockMaterials.ECHO_LOCATOR)
                .noOcclusion()
                .sound(MoreGeodesSoundTypes.ECHO_LOCATOR)
                .strength(1.5f, 6.0f)
                .requiresCorrectToolForDrops()
        )
    }

    val AMETHYST_CRYSTAL_ECHO_LOCATOR by REGISTRY.registerObject("amethyst_crystal_echo_locator") {
        EchoLocatorBlock(
            EchoLocatorType.AMETHYST,
            BlockBehaviour.Properties.of(MoreGeodesBlockMaterials.ECHO_LOCATOR)
                .noOcclusion()
                .sound(MoreGeodesSoundTypes.ECHO_LOCATOR)
                .strength(1.5f, 6.0f)
                .requiresCorrectToolForDrops()
        )
    }

    val ECHO_CRYSTAL_ECHO_LOCATOR by REGISTRY.registerObject("echo_crystal_echo_locator") {
        EchoLocatorBlock(
            EchoLocatorType.ECHO,
            BlockBehaviour.Properties.of(MoreGeodesBlockMaterials.ECHO_LOCATOR)
                .noOcclusion()
                .sound(MoreGeodesSoundTypes.ECHO_LOCATOR)
                .strength(1.5f, 6.0f)
                .requiresCorrectToolForDrops()
        )
    }
}