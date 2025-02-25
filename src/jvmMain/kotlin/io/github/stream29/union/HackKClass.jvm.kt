package io.github.stream29.union

import kotlin.reflect.*

@Suppress("FunctionName")
internal actual fun HackKClass(serialName: String) = HackKClassJvm(serialName) as KClass<out Any>

internal class HackKClassJvm(serialName: String) : KClass<Any> {
    override val simpleName = serialName
    override val qualifiedName = serialName
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
    override val visibility: KVisibility? = null
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