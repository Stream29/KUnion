@file:Suppress("FunctionName")

package io.github.stream29.union

import kotlin.jvm.JvmName

@JvmName("Union1")
public inline fun <reified T0 : Any> Union(value: T0): Union1<T0> = Union1(value)

@JvmName("Union2")
public inline fun <reified T0 : Any, reified T1 : Any> Union(value: Any?): Union2<T0, T1> =
    when (value) {
        is T0, is T1 -> Union2(value)
        else -> throwUnionException()
    }

@JvmName("Union3")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any> Union(value: Any?): Union3<T0, T1, T2> =
    when (value) {
        is T0, is T1, is T2 -> Union3(value)
        else -> throwUnionException()
    }

@JvmName("Union4")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any> Union(value: Any?): Union4<T0, T1, T2, T3> =
    when (value) {
        is T0, is T1, is T2, is T3 -> Union4(value)
        else -> throwUnionException()
    }

@JvmName("Union5")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any> Union(value: Any?): Union5<T0, T1, T2, T3, T4> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4 -> Union5(value)
        else -> throwUnionException()
    }

@JvmName("Union6")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any> Union(
    value: Any?
): Union6<T0, T1, T2, T3, T4, T5> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5 -> Union6(value)
        else -> throwUnionException()
    }

@JvmName("Union7")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any> Union(
    value: Any?
): Union7<T0, T1, T2, T3, T4, T5, T6> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6 -> Union7(value)
        else -> throwUnionException()
    }

@JvmName("Union8")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any> Union(
    value: Any?
): Union8<T0, T1, T2, T3, T4, T5, T6, T7> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7 -> Union8(value)
        else -> throwUnionException()
    }

@JvmName("Union9")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any> Union(
    value: Any?
): Union9<T0, T1, T2, T3, T4, T5, T6, T7, T8> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8 -> Union9(value)
        else -> throwUnionException()
    }

@JvmName("Union10")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any> Union(
    value: Any?
): Union10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9 -> Union10(value)
        else -> throwUnionException()
    }

@JvmName("Union11")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any> Union(
    value: Any?
): Union11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10 -> Union11(value)
        else -> throwUnionException()
    }

@JvmName("Union12")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any> Union(
    value: Any?
): Union12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11 -> Union12(value)
        else -> throwUnionException()
    }

@JvmName("Union13")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any> Union(
    value: Any?
): Union13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12 -> Union13(value)
        else -> throwUnionException()
    }

@JvmName("Union14")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any> Union(
    value: Any?
): Union14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13 -> Union14(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union15")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any> Union(
    value: Any?
): Union15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14 -> Union15(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union16")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any> Union(
    value: Any?
): Union16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15 -> Union16(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union17")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any> Union(
    value: Any?
): Union17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16 -> Union17(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union18")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any, reified T17 : Any> Union(
    value: Any?
): Union18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17 -> Union18(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union19")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any, reified T17 : Any, reified T18 : Any> Union(
    value: Any?
): Union19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18 -> Union19(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union20")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any, reified T17 : Any, reified T18 : Any, reified T19 : Any> Union(
    value: Any?
): Union20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18, is T19 -> Union20(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union21")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any, reified T17 : Any, reified T18 : Any, reified T19 : Any, reified T20 : Any> Union(
    value: Any?
): Union21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18, is T19, is T20 -> Union21(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union22")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any, reified T17 : Any, reified T18 : Any, reified T19 : Any, reified T20 : Any, reified T21 : Any> Union(
    value: Any?
): Union22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18, is T19, is T20, is T21 -> Union22(
            value
        )

        else -> throwUnionException()
    }

@JvmName("Union23")
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any, reified T17 : Any, reified T18 : Any, reified T19 : Any, reified T20 : Any, reified T21 : Any, reified T22 : Any> Union(
    value: Any?
): Union23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18, is T19, is T20, is T21, is T22 -> Union23(
            value
        )

        else -> throwUnionException()
    }