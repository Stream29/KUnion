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