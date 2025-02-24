package io.github.stream29.union

import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.serializer
import kotlin.jvm.JvmName
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@JvmName("unionSerializerOf0")
public inline fun <reified T0> unionSerializerOf():
        KSerializer<KUnion<T0, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>> =
    unionSerializerOf(listOf(typeOf<T0>()))

@JvmName("unionSerializerOf1")
public inline fun <reified T0, reified T1> unionSerializerOf():
        KSerializer<KUnion<T0, T1, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>> =
    unionSerializerOf(listOf(typeOf<T0>(), typeOf<T1>()))

@OptIn(InternalSerializationApi::class)
@Suppress("unchecked_cast")
public fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>
        unionSerializerOf(
    typeList: List<KType>
): KSerializer<KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> {
    return SealedClassSerializer(
        "io.github.stream29.union.Union",
        Any::class,
        typeList.map { it.classifier as KClass<out Any> }.toTypedArray(),
        typeList.map { serializer(it) as KSerializer<Any> }.toTypedArray()
    ) as KSerializer<KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>>
}