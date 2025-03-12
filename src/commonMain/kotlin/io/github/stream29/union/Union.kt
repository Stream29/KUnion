package io.github.stream29.union

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

/**
 * A union type that can hold one of 23 possible types at most.
 * When a type parameter is set to [Nothing], it should be passed.
 *
 * The type information only exists at compile time, and is erased to [Any] at runtime.
 *
 * You can use the Kotlin's RTTI features to check the type of the value at runtime.
 *
 * @property value The value of the union
 */
@Suppress("unused")
@Serializable(UnionSerializer::class)
@JvmInline
public value class Union
<T0 : Any, T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any, T9 : Any, T10 : Any, T11 : Any, T12 : Any, T13 : Any, T14 : Any, T15 : Any, T16 : Any, T17 : Any, T18 : Any, T19 : Any, T20 : Any, T21 : Any, T22 : Any>
@PublishedApi
@InternalUnionApi
internal constructor(
    public val value: Any
)

/**
 * A [Union] that holds in [T].
 */
public typealias UnionIn<T> = Union<in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T, in T>

/**
 * A [Union] that holds out [T].
 */
public typealias UnionOut<T> = Union<out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T, out T>

/**
 * A [Union] that can hold 1 type of instance.
 */
public typealias Union1<T0> = Union<T0, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 2 types of instances.
 */
public typealias Union2<T0, T1> = Union<T0, T1, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 3 types of instances.
 */
public typealias Union3<T0, T1, T2> = Union<T0, T1, T2, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 4 types of instances.
 */
public typealias Union4<T0, T1, T2, T3> = Union<T0, T1, T2, T3, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 5 types of instances.
 */
public typealias Union5<T0, T1, T2, T3, T4> = Union<T0, T1, T2, T3, T4, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 6 types of instances.
 */
public typealias Union6<T0, T1, T2, T3, T4, T5> = Union<T0, T1, T2, T3, T4, T5, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 7 types of instances.
 */
public typealias Union7<T0, T1, T2, T3, T4, T5, T6> = Union<T0, T1, T2, T3, T4, T5, T6, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 8 types of instances.
 */
public typealias Union8<T0, T1, T2, T3, T4, T5, T6, T7> = Union<T0, T1, T2, T3, T4, T5, T6, T7, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 9 types of instances.
 */
public typealias Union9<T0, T1, T2, T3, T4, T5, T6, T7, T8> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 10 types of instances.
 */
public typealias Union10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 11 types of instances.
 */
public typealias Union11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 12 types of instances.
 */
public typealias Union12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 13 types of instances.
 */
public typealias Union13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 14 types of instances.
 */
public typealias Union14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 15 types of instances.
 */
public typealias Union15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 16 types of instances.
 */
public typealias Union16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 17 types of instances.
 */
public typealias Union17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 18 types of instances.
 */
public typealias Union18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, Nothing, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 19 types of instances.
 */
public typealias Union19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, Nothing, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 20 types of instances.
 */
public typealias Union20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, Nothing, Nothing, Nothing>

/**
 * A [Union] that can hold 21 types of instances.
 */
public typealias Union21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, Nothing, Nothing>

/**
 * A [Union] that can hold 22 types of instances.
 */
public typealias Union22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, Nothing>

/**
 * A [Union] that can hold 23 types of instances.
 */
public typealias Union23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> = Union<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>