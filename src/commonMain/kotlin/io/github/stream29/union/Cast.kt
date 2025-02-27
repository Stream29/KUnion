@file:Suppress("unchecked_cast")

package io.github.stream29.union

public inline fun <reified T> Union<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>.cast(): T =
    value as T

public inline fun <reified T> Union<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>.safeAs(): T? =
    value as? T