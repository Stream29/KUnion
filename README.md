# KUnion

A Kotlin Multiplatform library that provides a type-safe union type implementation with serialization support.

## Features

- Type-safe union types for Kotlin Multiplatform
- Support for up to 23 different types in a single union
- Serialization support via kotlinx.serialization
- Pattern matching-like behavior with `consume` functions
- Safe and unsafe union creation
- Cross-platform support (JVM, JS, Native, Wasm)

## Installation

### Gradle (Kotlin DSL)

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.stream29:kunion:0.0.3")
}
```

### Gradle (Groovy)

```groovy
repositories {
    mavenCentral()
}

dependencies {
    implementation 'io.github.stream29:kunion:0.0.3'
}
```

### Maven

```xml
<dependency>
    <groupId>io.github.stream29</groupId>
    <artifactId>kunion</artifactId>
    <version>0.0.3</version>
</dependency>
```

## Usage

### Creating a Union

You can create a union using the `SafeUnion` or `UnsafeUnion` functions:

```kotlin
// Safe union creation (checks that the value is of one of the expected types)
val stringOrInt: Union2<String, Int> = SafeUnion2<String, Int>("Hello")
val intOrString: Union2<Int, String> = SafeUnion2<Int, String>(42)

// Unsafe union creation (no type checking)
val unsafeUnion: Union2<String, Int> = UnsafeUnion("Hello")
```

### Consuming a Union

You can consume a union using the `consume` functions:

```kotlin
val union: Union2<String, Int> = SafeUnion2<String, Int>("Hello")

// Pattern matching-like behavior
union
    .consume0 { str -> println("String: $str") }
    .consume1 { int -> println("Int: $int") }
```

### Serialization

KUnion supports serialization via kotlinx.serialization:

```kotlin
val union: Union2<String, Int> = SafeUnion2<String, Int>("Hello")
val json = Json.encodeToString(union) // Serializes to JSON
val deserialized = Json.decodeFromString<Union2<String, Int>>(json) // Deserializes from JSON
```

## Examples

### Basic Example

```kotlin
fun processValue(value: Union2<String, Int>) {
    value
        .consume0 { str -> println("Processing string: $str") }
        .consume1 { int -> println("Processing int: $int") }
}

fun main() {
    val stringValue = SafeUnion2<String, Int>("Hello, World!")
    val intValue = SafeUnion2<String, Int>(42)

    processValue(stringValue) // Prints: Processing string: Hello, World!
    processValue(intValue)    // Prints: Processing int: 42
}
```

### Complex Example with Multiple Types

```kotlin
sealed class Result
data class Success(val data: String) : Result()
data class Error(val message: String) : Result()
data class Loading(val progress: Int) : Result()

fun handleResult(result: Union3<Success, Error, Loading>) {
    result
        .consume0 { success -> println("Success: ${success.data}") }
        .consume1 { error -> println("Error: ${error.message}") }
        .consume2 { loading -> println("Loading: ${loading.progress}%") }
}

fun main() {
    val success = SafeUnion3<Success, Error, Loading>(Success("Data loaded"))
    val error = SafeUnion3<Success, Error, Loading>(Error("Failed to load data"))
    val loading = SafeUnion3<Success, Error, Loading>(Loading(75))

    handleResult(success) // Prints: Success: Data loaded
    handleResult(error)   // Prints: Error: Failed to load data
    handleResult(loading) // Prints: Loading: 75%
}
```

## License

KUnion is licensed under the Apache License Version 2.0. See the [LICENSE](https://www.apache.org/licenses/LICENSE-2.0) file for details.

## Links

- [GitHub Repository](https://github.com/Stream29/KUnion)
- [Maven Central](https://central.sonatype.com/artifact/io.github.stream29/kunion)
