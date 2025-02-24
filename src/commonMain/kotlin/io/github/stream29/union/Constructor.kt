@file:Suppress("FunctionName")

package io.github.stream29.union

import kotlin.jvm.JvmName

@JvmName("Union0")
public inline fun <reified T0> Union(value: T0):
        KUnion<T0, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    KUnion(value)

@JvmName("Union1")
public inline fun <reified T0, reified T1> Union(value: Any?):
        KUnion<T0, T1, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1 -> KUnion(value)
        else -> throwUnionException()
    }

@JvmName("Union2")
public inline fun <reified T0, reified T1, reified T2> Union(value: Any?):
        KUnion<T0, T1, T2, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2 -> KUnion(value)
        else -> throwUnionException()
    }

@JvmName("Union3")
public inline fun <reified T0, reified T1, reified T2, reified T3> Union(value: Any?):
        KUnion<T0, T1, T2, T3, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3 -> KUnion(value)
        else -> throwUnionException()
    }

@JvmName("Union4")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4> Union(value: Any?):
        KUnion<T0, T1, T2, T3, T4, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4 -> KUnion(value)
        else -> throwUnionException()
    }

@JvmName("Union5")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5> Union(value: Any?):
        KUnion<T0, T1, T2, T3, T4, T5, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5 -> KUnion(value)
        else -> throwUnionException()
    }

@JvmName("Union6")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6> Union(value: Any?):
        KUnion<T0, T1, T2, T3, T4, T5, T6, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6 -> KUnion(value)
        else -> throwUnionException()
    }

@JvmName("Union7")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7 -> KUnion(value)
        else -> throwUnionException()
    }

@JvmName("Union8")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8 -> KUnion(value)
        else -> throwUnionException()
    }

@JvmName("Union9")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9 -> KUnion(value)
        else -> throwUnionException()
    }

@JvmName("Union10")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10 -> KUnion(value)
        else -> throwUnionException()
    }

@JvmName("Union11")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11 -> KUnion(value)
        else -> throwUnionException()
    }

@JvmName("Union12")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12 -> KUnion(value)
        else -> throwUnionException()
    }

@JvmName("Union13")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13 -> KUnion(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union14")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14 -> KUnion(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union15")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15 -> KUnion(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union16")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16 -> KUnion(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union17")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, Nothing, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17 -> KUnion(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union18")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, Nothing, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18 -> KUnion(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union19")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, Nothing, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18, is T19 -> KUnion(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union20")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, Nothing, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18, is T19, is T20 -> KUnion(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union21")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, Nothing> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18, is T19, is T20, is T21 -> KUnion(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union22")
public inline fun <reified T0, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22> Union(
    value: Any?
): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18, is T19, is T20, is T21, is T22 -> KUnion(
            value
        )

        else -> throwUnionException()
    }