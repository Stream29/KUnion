import io.github.stream29.union.SafeUnion6
import io.github.stream29.union.Union6
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.serializer
import kotlin.jvm.JvmInline
import kotlin.test.Test
import kotlin.test.assertEquals

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

typealias TestType = Union6<
        ValueClass,
        DataClass,
        GenericClass<String>,
        List<String>,
        HashMap<String, String>,
        Int
        >

fun testWith(value: Any) {
    val serializer = serializer<TestType>()
    val jsonString = json.encodeToString(serializer, SafeUnion6(value))
    println(jsonString)
    val deserialized = json.decodeFromString(serializer, jsonString)
    println(deserialized)
    assertEquals(value, deserialized.value)
}

class SerializeTest {
    @Test
    fun testSerialDescriptor() {
        testWith(ValueClass("Hello"))
        testWith(DataClass(42))
        testWith(42)
        testWith(listOf("Hello"))
        testWith(mapOf("Hello" to "World"))
        testWith(GenericClass("World"))
    }
}