package io.github.stream29.union.kotlin.reflect

import kotlin.reflect.KClass

internal actual val KClass<*>.qualifiedNameOrNull: String?
    get() = null