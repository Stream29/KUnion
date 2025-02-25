import io.github.stream29.union.unionSerializerOf
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.elementNames
import kotlinx.serialization.json.Json
import kotlin.jvm.JvmInline
import kotlin.test.Test

val json = Json {
    prettyPrint = true
    isLenient = true
    ignoreUnknownKeys = true
}

@Serializable
@JvmInline
value class FakeUnion(val value: FakeAny)

@Serializable
sealed interface FakeAny

@Serializable
data class FakeType0(val value: String) : FakeAny

@Serializable
data class FakeType1(val value: Int) : FakeAny

class SerializeTest {
    @Test
    fun testSerialDescriptor() {
        val serializer = unionSerializerOf<FakeType0, FakeType1, Nothing, Nothing, Nothing,
                Nothing, Nothing, Nothing, Nothing, Nothing,
                Nothing, Nothing, Nothing, Nothing, Nothing,
                Nothing, Nothing, Nothing, Nothing, Nothing,
                Nothing, Nothing, Nothing>(
            FakeType0.serializer(),
            FakeType1.serializer()
        )
        println(serializer.descriptor)
        println(serializer.descriptor.getElementDescriptor(0))
//        println(serializer.descriptor.getElementDescriptor(0).getElementDescriptor(1).elementNames.toList())
        //language=JSON
        val jsonString = """
        {
          "type": "FakeType1",
          "value": 114514
        }
        """.trimIndent()
        println(json.decodeFromString(serializer, jsonString))
    }
}