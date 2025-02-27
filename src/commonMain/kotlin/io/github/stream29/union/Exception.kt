package io.github.stream29.union

@PublishedApi
@InternalUnionApi
internal fun throwUnionException(): Nothing = throw IllegalArgumentException("Union value is not of the expected types")