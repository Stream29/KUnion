package io.github.stream29.union

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable(KUnionSerializer::class)
@JvmInline
public value class KUnion
<T0 : Any, T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any, T9 : Any, T10 : Any, T11 : Any, T12 : Any, T13 : Any, T14 : Any, T15 : Any, T16 : Any, T17 : Any, T18 : Any, T19 : Any, T20 : Any, T21 : Any, T22 : Any>
@PublishedApi internal constructor(
    public val value: Any
)

public typealias Union1<T0> = KUnion<T0, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union2<T0, T1> = KUnion<T0, T1, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union3<T0, T1, T2> = KUnion<T0, T1, T2, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union4<T0, T1, T2, T3> = KUnion<T0, T1, T2, T3, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union5<T0, T1, T2, T3, T4> = KUnion<T0, T1, T2, T3, T4, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union6<T0, T1, T2, T3, T4, T5> = KUnion<T0, T1, T2, T3, T4, T5, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union7<T0, T1, T2, T3, T4, T5, T6> = KUnion<T0, T1, T2, T3, T4, T5, T6, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union8<T0, T1, T2, T3, T4, T5, T6, T7> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union9<T0, T1, T2, T3, T4, T5, T6, T7, T8> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, Nothing, Nothing, Nothing, Nothing, Nothing>
public typealias Union19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, Nothing, Nothing, Nothing, Nothing>
public typealias Union20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, Nothing, Nothing, Nothing>
public typealias Union21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, Nothing, Nothing>
public typealias Union22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, Nothing>
public typealias Union23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> = KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>