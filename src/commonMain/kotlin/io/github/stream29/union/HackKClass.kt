package io.github.stream29.union

import kotlin.reflect.KClass

@Suppress("FunctionName")
internal expect fun HackKClass(serialName: String): KClass<out Any>