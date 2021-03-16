package io.github.noyzys.bukkit.location.immutable.serialization

import ImmutableLookable
import io.github.noyzys.bukkit.location.immutable.extension.ImmutableDataLookableDouble
import io.github.noyzys.bukkit.location.immutable.extension.ImmutableDataLookableInt

/**
 * @author: noyzys on 19:28, 16.03.2021
 **/
fun ImmutableDataLookableInt.toMap(
    defaultYaw: Int = 0,
    defaultPitch: Int = 0
): Map<String, Any?> = toMapTo(defaultYaw, defaultPitch, mutableMapOf())

fun ImmutableDataLookableDouble.toMap(
    defaultYaw: Double = 0.0,
    defaultPitch: Double = 0.0
): Map<String, Any?> = toMapTo(defaultYaw, defaultPitch, mutableMapOf())

fun <N, D : MutableMap<String, Any?>> ImmutableLookable<N>.toMapTo(
    defaultYaw: N,
    defaultPitch: N,
    destination: D
): D {
    if (yaw != defaultYaw) {
        destination["yaw"] = yaw
    }

    if (pitch != defaultPitch) {
        destination["pitch"] = pitch
    }

    return destination
}
