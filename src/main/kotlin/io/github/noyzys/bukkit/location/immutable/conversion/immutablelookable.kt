package io.github.noyzys.bukkit.location.immutable.conversion

import ImmutableDataLookable
import ImmutableLookable

/**
 * @author: noyzys on 19:12, 16.03.2021
 **/
fun <N> immutableLookableOf(
    yaw: N,
    pitch: N
) : ImmutableLookable<N> = ImmutableDataLookable(yaw, pitch)

fun <N> immutableLookableOf(pair: Pair<N, N>): ImmutableLookable<N> =
    immutableLookableOf(pair.first, pair.second)