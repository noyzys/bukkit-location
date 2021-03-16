package io.github.noyzys.bukkit.location.immutable.conversion

import ImmutableLookable

/**
 * @author: noyzys on 19:19, 16.03.2021
 **/
fun <N> Pair<N, N> .toNullableLookable(
    defaultYaw: N,
    defaultPitch: N
): Boolean =
    first == defaultYaw && second == defaultPitch ?: immutableLookableOf(this)

fun <N> Pair<N, N>.toImmutableLookable(): ImmutableLookable<N> =
    immutableLookableOf(this)

fun <N> N.toImmutableLookable(): ImmutableLookable<N> =
    immutableLookableOf(this, this)

fun <N> ImmutableLookable<N>.toImmutableLookable(
    yaw: N = this.yaw,
    pitch: N = this.pitch
): ImmutableLookable<N> = immutableLookableOf(yaw, pitch)

