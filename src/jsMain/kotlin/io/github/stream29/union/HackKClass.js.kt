package io.github.stream29.union

import kotlin.reflect.KClass

@Suppress("FunctionName")
internal actual fun HackKClass(serialName: String) = HackKClassJvm(serialName) as KClass<out Any>

internal class HackKClassJvm(serialName: String) : KClass<Any> {
    override val simpleName = serialName
    override val qualifiedName = serialName
    override fun isInstance(value: Any?) = value?.let { it::class.simpleName == qualifiedName } != false
    override fun equals(other: Any?) = false
    override fun hashCode() = -1
}