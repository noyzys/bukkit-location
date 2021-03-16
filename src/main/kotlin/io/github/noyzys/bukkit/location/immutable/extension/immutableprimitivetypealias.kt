package io.github.noyzys.bukkit.location.immutable.extension

import ImmutableDataLookable
import java.math.BigDecimal
import java.math.BigInteger

/**
 * @author: noyzys on 19:01, 16.03.2021
 **/
typealias ImmutableDataLookableByte = ImmutableDataLookable<Byte>
typealias ImmutableDataLookableShort = ImmutableDataLookable<Short>
typealias ImmutableDataLookableInt = ImmutableDataLookable<Int>
typealias ImmutableDataLookableLong = ImmutableDataLookable<Long>
typealias ImmutableDataLookableFloat = ImmutableDataLookable<Float>
typealias ImmutableDataLookableDouble = ImmutableDataLookable<Double>
typealias ImmutableDataLookableBigInteger = ImmutableDataLookable<BigInteger>
typealias ImmutableDataLookableBigDecial = ImmutableDataLookable<BigDecimal>
typealias ImmutableDataLookableNumber = ImmutableDataLookable<Number>

/* Unsigned types */
@ExperimentalUnsignedTypes
typealias ImmutableDataLookableUnisgnedByte = ImmutableDataLookable<UByte>
typealias ImmutableDataLookableUnisgnedShort = ImmutableDataLookable<Short>
typealias ImmutableDataLookableUnisgnedInt = ImmutableDataLookable<Int>
typealias ImmutableDataLookableUnisgnedLong = ImmutableDataLookable<Long>
