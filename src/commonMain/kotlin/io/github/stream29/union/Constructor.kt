@file:Suppress("FunctionName")
@file:OptIn(InternalUnionApi::class)

package io.github.stream29.union

/**
 * If you are completely sure that the value is of the expected type, you can use this function to create a union.
 * The [value] won't be checked for its type.
 */
@Suppress("NOTHING_TO_INLINE")
public inline fun
        <T0 : Any, T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any, T9 : Any, T10 : Any, T11 : Any, T12 : Any, T13 : Any, T14 : Any, T15 : Any, T16 : Any, T17 : Any, T18 : Any, T19 : Any, T20 : Any, T21 : Any, T22 : Any>
        UnsafeUnion(value: Any):
        Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> =
    Union(value)

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any> SafeUnion1(value: T0): Union1<T0> = UnsafeUnion(value)

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any> SafeUnion2(value: Any?): Union2<T0, T1> =
    when (value) {
        is T0, is T1 -> UnsafeUnion(value)
        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any> SafeUnion3(value: Any?): Union3<T0, T1, T2> =
    when (value) {
        is T0, is T1, is T2 -> UnsafeUnion(value)
        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any> SafeUnion4(value: Any?): Union4<T0, T1, T2, T3> =
    when (value) {
        is T0, is T1, is T2, is T3 -> UnsafeUnion(value)
        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any> SafeUnion5(
    value: Any?
): Union5<T0, T1, T2, T3, T4> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4 -> UnsafeUnion(value)
        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any> SafeUnion6(
    value: Any?
): Union6<T0, T1, T2, T3, T4, T5> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5 -> UnsafeUnion(value)
        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any> SafeUnion7(
    value: Any?
): Union7<T0, T1, T2, T3, T4, T5, T6> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6 -> UnsafeUnion(value)
        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any> SafeUnion8(
    value: Any?
): Union8<T0, T1, T2, T3, T4, T5, T6, T7> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7 -> UnsafeUnion(value)
        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any> SafeUnion9(
    value: Any?
): Union9<T0, T1, T2, T3, T4, T5, T6, T7, T8> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8 -> UnsafeUnion(value)
        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any> SafeUnion10(
    value: Any?
): Union10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9 -> UnsafeUnion(value)
        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any> SafeUnion11(
    value: Any?
): Union11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10 -> UnsafeUnion(value)
        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any> SafeUnion12(
    value: Any?
): Union12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11 -> UnsafeUnion(value)
        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any> SafeUnion13(
    value: Any?
): Union13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12 -> UnsafeUnion(
            value
        )

        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any> SafeUnion14(
    value: Any?
): Union14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13 -> UnsafeUnion(
            value
        )

        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any> SafeUnion15(
    value: Any?
): Union15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14 -> UnsafeUnion(
            value
        )

        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any> SafeUnion16(
    value: Any?
): Union16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15 -> UnsafeUnion(
            value
        )

        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any> SafeUnion17(
    value: Any?
): Union17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16 -> UnsafeUnion(
            value
        )

        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any, reified T17 : Any> SafeUnion18(
    value: Any?
): Union18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17 -> UnsafeUnion(
            value
        )

        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any, reified T17 : Any, reified T18 : Any> SafeUnion19(
    value: Any?
): Union19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18 -> UnsafeUnion(
            value
        )

        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any, reified T17 : Any, reified T18 : Any, reified T19 : Any> SafeUnion20(
    value: Any?
): Union20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18, is T19 -> UnsafeUnion(
            value
        )

        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any, reified T17 : Any, reified T18 : Any, reified T19 : Any, reified T20 : Any> SafeUnion21(
    value: Any?
): Union21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18, is T19, is T20 -> UnsafeUnion(
            value
        )

        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any, reified T17 : Any, reified T18 : Any, reified T19 : Any, reified T20 : Any, reified T21 : Any> SafeUnion22(
    value: Any?
): Union22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18, is T19, is T20, is T21 -> UnsafeUnion(
            value
        )

        else -> throwUnionException()
    }

/**
 * Check the type of the [value] and create a union.
 *
 * Please mention that this function only consider the class, not the type parameters.
 */
public inline fun <reified T0 : Any, reified T1 : Any, reified T2 : Any, reified T3 : Any, reified T4 : Any, reified T5 : Any, reified T6 : Any, reified T7 : Any, reified T8 : Any, reified T9 : Any, reified T10 : Any, reified T11 : Any, reified T12 : Any, reified T13 : Any, reified T14 : Any, reified T15 : Any, reified T16 : Any, reified T17 : Any, reified T18 : Any, reified T19 : Any, reified T20 : Any, reified T21 : Any, reified T22 : Any> SafeUnion23(
    value: Any?
): Union23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> =
    when (value) {
        is T0, is T1, is T2, is T3, is T4, is T5, is T6, is T7, is T8, is T9, is T10, is T11, is T12, is T13, is T14, is T15, is T16, is T17, is T18, is T19, is T20, is T21, is T22 -> UnsafeUnion(
            value
        )

        else -> throwUnionException()
    }