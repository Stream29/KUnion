package io.github.stream29.union

import io.github.stream29.union.kotlin.reflect.qualifiedNameOrNull
import kotlinx.serialization.*
import kotlinx.serialization.builtins.NothingSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialKind
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.descriptors.buildSerialDescriptor
import kotlinx.serialization.encoding.*
import kotlin.reflect.KClass

@Suppress("unchecked_cast")
@OptIn(InternalSerializationApi::class, ExperimentalSerializationApi::class)
public class KUnionSerializer
<T0 : Any, T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any, T9 : Any, T10 : Any, T11 : Any, T12 : Any, T13 : Any, T14 : Any, T15 : Any, T16 : Any, T17 : Any, T18 : Any, T19 : Any, T20 : Any, T21 : Any, T22 : Any>(
    serializer0: KSerializer<T0>,
    serializer1: KSerializer<T1>,
    serializer2: KSerializer<T2>,
    serializer3: KSerializer<T3>,
    serializer4: KSerializer<T4>,
    serializer5: KSerializer<T5>,
    serializer6: KSerializer<T6>,
    serializer7: KSerializer<T7>,
    serializer8: KSerializer<T8>,
    serializer9: KSerializer<T9>,
    serializer10: KSerializer<T0>,
    serializer11: KSerializer<T1>,
    serializer12: KSerializer<T2>,
    serializer13: KSerializer<T3>,
    serializer14: KSerializer<T4>,
    serializer15: KSerializer<T5>,
    serializer16: KSerializer<T6>,
    serializer17: KSerializer<T7>,
    serializer18: KSerializer<T8>,
    serializer19: KSerializer<T9>,
    serializer20: KSerializer<T0>,
    serializer21: KSerializer<T1>,
    serializer22: KSerializer<T2>,
) : KSerializer<KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> {
    private val validSerializers = sequenceOf(
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
        serializer22
    ).filterNot { it == NothingSerializer() }.toList()

    override val descriptor: SerialDescriptor =
        buildClassSerialDescriptor(
            serialName = "KUnion",
        ) {
            element("type", String.serializer().descriptor)
            element(
                "value",
                buildSerialDescriptor("io.github.stream29.Union${validSerializers.size}", SerialKind.CONTEXTUAL) {
                    validSerializers.forEach { serializer ->
                        element(serializer.descriptor.serialName, serializer.descriptor)
                    }
                }
            )
        }

    override fun serialize(
        encoder: Encoder,
        value: KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>
    ) {
        val unionValue = value.value
        val kClass = unionValue::class
        var valueSerializer = kClass.tryToGetSerializer()
        val serialName = valueSerializer.descriptor.serialName
        encoder.encodeStructure(descriptor) {
            encodeStringElement(descriptor, 0, serialName)
            println("serialName: $serialName")
            println("descriptor: ${valueSerializer.descriptor::class}")
            println("unionValue: $unionValue")
            encodeSerializableElement(descriptor, 1, valueSerializer as KSerializer<Any>, unionValue)
        }
    }


    override fun deserialize(decoder: Decoder): KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> =
        decoder.decodeStructure(descriptor) {
            KUnion<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(
                if (decodeSequentially()) decodeInOrder() else decodeByIndex()
            )
        }

    private fun KClass<*>.tryToGetSerializer(): KSerializer<*> {
        // happy path: same class and no type parameters
        // This method causes error on Kotlin/Native, Kotlin/Js, and Kotlin/Wasm
//        serializerOrNull()?.let { return it }
        // try to match by name
        validSerializers.firstOrNull { (qualifiedNameOrNull ?: "") == it.descriptor.serialName }
            ?.let { return it }
        // try to match by known classes, for platform-mapped classes and to cover the situations that KClass.qualifiedName doesn't work
        kClassToSerialName[this]?.let { serialName ->
            validSerializers.firstOrNull { it.descriptor.serialName == serialName }?.let { return it }
        }
        qualifiedNameOrNull?.let {
            jClassNameToSerialName[it]?.let { serialName ->
                validSerializers.firstOrNull { it.descriptor.serialName == serialName }?.let { return it }
            }
        }
        // try to match by type parameters
        val acc = mutableListOf<KSerializer<*>>()
        repeat(24) {
            try {
                val nothingSerializer = serializer(this, acc, false)
                val serialName = nothingSerializer.descriptor.serialName
                return validSerializers.firstOrNull { it.descriptor.serialName == serialName }
                    ?: throw IllegalArgumentException("$serialName is not in the union of ${validSerializers.map { it.descriptor.serialName }}")
            } catch (_: SerializationException) {
                acc.add(NothingSerializer())
            }
        }

        throw SerializationException("Cannot find serializer for ${qualifiedNameOrNull ?: simpleName ?: this}")
    }

    private fun CompositeDecoder.decodeByIndex(): Any {
        var serialName: String? = null
        var value: Any? = null
        while (true) {
            when (val index = decodeElementIndex(descriptor)) {
                CompositeDecoder.DECODE_DONE -> break
                0 -> serialName = decodeStringElement(descriptor, index)
                1 -> {
                    serialName = requireNotNull(serialName) { "Cannot read union value before its type token" }
                    val serializer = validSerializers.first { it.descriptor.serialName == serialName }
                    value = decodeSerializableElement(descriptor, index, serializer)
                }

                else -> throw SerializationException(
                    "Invalid index in polymorphic deserialization of ${serialName ?: "unknown class"}\n Expected 0, 1 or DECODE_DONE(-1), but found $index"
                )
            }
        }
        requireNotNull(value) { "No valid union value found until the end of the structure" }
        return value
    }

    private fun CompositeDecoder.decodeInOrder(): Any {
        val serialName = decodeStringElement(descriptor, 0)
        val serializer = validSerializers.first { it.descriptor.serialName == serialName }
        return decodeSerializableElement(descriptor, 1, serializer as KSerializer<Any>)
    }
}

private fun <K, V> MutableMap<K, V>.putMulti(keys: List<K>, value: V) {
    keys.forEach { put(it, value) }
}

private val kClassToSerialName = buildMap {
    put(Triple::class, "kotlin.Triple")
    put(Pair::class, "kotlin.Pair")
    put(Map.Entry::class, "kotlin.collections.Map.Entry")
    put(Array::class, "kotlin.Array")
    putMulti(
        listOf(Collection::class, List::class, MutableList::class, ArrayList::class),
        "kotlin.collections.ArrayList"
    )
    putMulti(listOf(HashSet::class), "kotlin.collections.HashSet")
    putMulti(listOf(Set::class, MutableSet::class, LinkedHashSet::class), "kotlin.collections.LinkedHashSet")
    putMulti(listOf(HashMap::class), "kotlin.collections.HashMap")
    putMulti(listOf(Map::class, MutableMap::class, LinkedHashMap::class), "kotlin.collections.LinkedHashMap")
}

private val jClassNameToSerialName = mapOf(
    "java.util.Arrays.ArrayList" to "kotlin.collections.ArrayList",
    "java.util.HashSet" to "kotlin.collections.HashSet",
    "java.util.LinkedHashSet" to "kotlin.collections.LinkedHashSet",
    "java.util.HashMap" to "kotlin.collections.HashMap",
    "java.util.LinkedHashMap" to "kotlin.collections.LinkedHashMap",
    "java.util.Collections.SingletonList" to "kotlin.collections.ArrayList",
    "java.util.Collections.SingletonSet" to "kotlin.collections.HashSet",
    "java.util.Collections.SingletonMap" to "kotlin.collections.HashMap"
)