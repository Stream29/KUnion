import io.github.stream29.union.Union
import io.github.stream29.union.unionSerializerOf
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.serializersModuleOf
import kotlin.test.Test

val json = Json {
    prettyPrint = true
    isLenient = true
    ignoreUnknownKeys = true
    serializersModule = serializersModuleOf(unionSerializerOf<String,Int>())
}

class SerializeTest {
    @Test
    fun testSerialDescriptor() {
        println(unionSerializerOf<String, Int>().descriptor)
        println(unionSerializerOf<String, Int>().descriptor.getElementDescriptor(0))
        println(unionSerializerOf<String, Int>().descriptor.getElementDescriptor(1))
        println(json.encodeToString(Union<String, Int>("Hello")))
    }
}