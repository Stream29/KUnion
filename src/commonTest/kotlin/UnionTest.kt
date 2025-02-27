import io.github.stream29.union.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.serializer
import kotlin.jvm.JvmInline
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

val json = Json {
    prettyPrint = true
    isLenient = true
    ignoreUnknownKeys = true
}

@Serializable
@JvmInline
@SerialName("MyValueClass")
value class ValueClass(val value: String)

@Serializable
@SerialName("MyDataClass")
data class DataClass(val value: Int)

@Serializable
data class GenericClass<T>(val value: T)

fun serializeAndDeserialize(value: Any) {
    val serializer = serializer<TestType>()
    val jsonString = json.encodeToString(serializer, SafeUnion6(value))
    println(jsonString)
    val deserialized = json.decodeFromString(serializer, jsonString)
    println(deserialized)
    assertEquals(value, deserialized.value)
}

typealias TestType = Union6<
        ValueClass,
        DataClass,
        GenericClass<String>,
        List<String>,
        Map<String, String>,
        Int
        >

class UnionTest {
    @Test
    fun castAndSafeCast() {
        val union: TestType = SafeUnion6(ValueClass("Hello"))
        assertEquals(ValueClass("Hello"), union.cast())
        assertFails { union.cast<String>() }
        assertEquals(ValueClass("Hello"), union.safeAs<ValueClass>())
        assertEquals(null, union.safeAs<Int>())
    }

    @Test
    fun consume() {
        val union: TestType = SafeUnion6(listOf("Hello"))
        var tag = -1
        union.consume0 { tag = 0 }
            .consume1 { tag = 1 }
            .consume2 { tag = 2 }
            .consume3 { tag = 3 }
            .consume4 { tag = 4 }
            .consume5 { tag = 5 }
        assertEquals(3, tag)
    }

    @Test
    fun serializeAndDeserialize() {
        serializeAndDeserialize(ValueClass("Hello"))
        serializeAndDeserialize(DataClass(42))
        serializeAndDeserialize(42)
        serializeAndDeserialize(listOf("Hello"))
        serializeAndDeserialize(mapOf("Hello" to "World"))
        serializeAndDeserialize(GenericClass("World"))
    }
}