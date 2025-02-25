package io.github.stream29.union

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.builtins.NothingSerializer
import kotlinx.serialization.internal.AbstractPolymorphicSerializer
import kotlin.reflect.KCallable
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KVisibility


@OptIn(ExperimentalSerializationApi::class, InternalSerializationApi::class)
@Suppress("unchecked_cast")
public fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>
        unionSerializerOf(
    vararg serializers: KSerializer<*>
): KSerializer<KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> {
    val validSerializers = serializers.filter { it != NothingSerializer() }
    val validSubClasses = validSerializers.map {
        object : KClass<Any> {
            override val simpleName = it.descriptor.serialName
            override val qualifiedName = it.descriptor.serialName
            override fun isInstance(value: Any?) = value?.let { it::class.qualifiedName == qualifiedName } != false
            override fun equals(other: Any?) = false
            override fun hashCode() = -1
            override val members = emptyList<KCallable<*>>()
            override val constructors = emptyList<KFunction<Any>>()
            override val nestedClasses = emptyList<KClass<Any>>()
            override val objectInstance = null
            override val typeParameters = emptyList<KTypeParameter>()
            override val supertypes = emptyList<KType>()
            override val sealedSubclasses = emptyList<KClass<Any>>()
            override val visibility:KVisibility? = null
            override val isFinal = false
            override val isOpen = false
            override val isAbstract = false
            override val isSealed = false
            override val isData = false
            override val isInner = false
            override val isCompanion = false
            override val isFun = false
            override val isValue = false
            override val annotations = emptyList<Annotation>()
        }
    }
    return SealedClassSerializer<Any>(
        serialName = "io.github.stream29.union.KUnion",
        baseClass = Any::class,
        subclasses = validSubClasses.toTypedArray(),
        subclassSerializers = validSerializers.toTypedArray() as Array<KSerializer<out Any>>,
    ) as KSerializer<KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>>
}

public class KUnionSerializer
<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(
    private val serializer0: KSerializer<T0>,
    private val serializer1: KSerializer<T1>,
    private val serializer2: KSerializer<T2>,
    private val serializer3: KSerializer<T3>,
    private val serializer4: KSerializer<T4>,
    private val serializer5: KSerializer<T5>,
    private val serializer6: KSerializer<T6>,
    private val serializer7: KSerializer<T7>,
    private val serializer8: KSerializer<T8>,
    private val serializer9: KSerializer<T9>,
    private val serializer10: KSerializer<T0>,
    private val serializer11: KSerializer<T1>,
    private val serializer12: KSerializer<T2>,
    private val serializer13: KSerializer<T3>,
    private val serializer14: KSerializer<T4>,
    private val serializer15: KSerializer<T5>,
    private val serializer16: KSerializer<T6>,
    private val serializer17: KSerializer<T7>,
    private val serializer18: KSerializer<T8>,
    private val serializer19: KSerializer<T9>,
    private val serializer20: KSerializer<T0>,
    private val serializer21: KSerializer<T1>,
    private val serializer22: KSerializer<T2>,
) : KSerializer<KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>>
    by unionSerializerOf(
    serializer0,
    serializer1,
    serializer2,
    serializer3,
    serializer4,
    serializer5,
    serializer6,
    serializer7,
    serializer8,
    serializer9,
    serializer10,
    serializer11,
    serializer12,
    serializer13,
    serializer14,
    serializer15,
    serializer16,
    serializer17,
    serializer18,
    serializer19,
    serializer20,
    serializer21,
    serializer22,
)