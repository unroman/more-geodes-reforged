package com.github.thedeathlycow.moregeodes.forge.block.entity

import com.github.thedeathlycow.moregeodes.forge.MoreGeodesForge
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.entity.BlockEntityType
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import thedarkcolour.kotlinforforge.forge.registerObject

object MoreGeodesBlockEntityTypes {

    val REGISTRY: DeferredRegister<BlockEntityType<*>> = DeferredRegister.create(
        ForgeRegistries.BLOCK_ENTITY_TYPES,
        MoreGeodesForge.MODID
    )

    val ECHO_LOCATOR: BlockEntityType<*> by REGISTRY.registerObject("echo_locator") {
        BlockEntityType.Builder.of(
            ::EchoLocatorBlockEntity
        ).build(null)
    }
}