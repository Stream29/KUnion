package io.github.stream29.union

/**
 * Convention for casting the value of union to a specific type.
 */
public inline fun <reified T> Union<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>.cast(): T =
    value as T

/**
 * Convention for casting the value of union to a specific type.
 */
public inline fun <reified T> Union<*, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *, *>.safeAs(): T? =
    value as? T