@file:OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class, ExperimentalKotlinGradlePluginApi::class)

import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JsModuleKind
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithTests
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType
import org.jetbrains.kotlin.konan.target.HostManager
import java.net.URI

plugins {
    kotlin("multiplatform") version "2.1.0"
    kotlin("plugin.serialization") version "2.1.0"
    id("com.vanniktech.maven.publish") version "0.29.0"
}

group = "io.github.stream29"
version = "0.0.1"

repositories {
    mavenCentral()
}

kotlin {
    explicitApi()
    jvm {
        withJava()
    }
    jvmToolchain(8)

    js {
        nodejs {
            testTask {
                useMocha {
                    timeout = "10s"
                }
            }
        }

        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            sourceMap = true
            moduleKind = JsModuleKind.MODULE_UMD
        }
    }

    wasmJs {
        nodejs()
    }
    wasmWasi {
        nodejs()
    }

    if (HostManager.hostIsMac) {
        // According to https://kotlinlang.org/docs/native-target-support.html
        // Tier 1
        macosX64()
        macosArm64()
        iosSimulatorArm64()
        iosX64()
        // Tier 2
        watchosSimulatorArm64()
        watchosX64()
        watchosArm32()
        watchosArm64()
        tvosSimulatorArm64()
        tvosX64()
        tvosArm64()
        iosArm64()
        // Tier 3
        watchosDeviceArm64()
    }

    // Tier 2
    linuxX64()
    linuxArm64()

    // Tier 3
    mingwX64()

    targets.withType<KotlinNativeTarget>().configureEach {
        binaries.test(listOf(NativeBuildType.RELEASE))
    }
    targets.withType<KotlinNativeTargetWithTests<*>>().configureEach {
        testRuns.create("releaseTest") {
            setExecutionSourceFrom(binaries.getTest(NativeBuildType.RELEASE))
        }
    }

    applyDefaultHierarchyTemplate {
        common {
            group("withoutJs") {
                withJvm()
                withNative()
                withWasmJs()
                withWasmWasi()
            }
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")
                api("org.jetbrains.kotlinx:kotlinx-serialization-core:1.8.0")
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")
                implementation("com.charleskorn.kaml:kaml:0.72.0")
            }
        }
    }
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
    coordinates((group as String), "kunion", version.toString())
    pom {
        name.set("KUnion")
        description.set("A kotlin union by Stream.")
        inceptionYear.set("2025")
        url.set("https://github.com/Stream29/KUnion")
        licenses {
            license {
                name.set("Apache License Version 2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0")
                distribution.set("https://www.apache.org/licenses/LICENSE-2.0")
            }
        }
        developers {
            developer {
                id.set("Stream29")
                name.set("Stream")
                url.set("https://github.com/Stream29/")
            }
        }
        scm {
            url.set("https://github.com/Stream29/KUnion")
            connection.set("scm:git:git://github.com/Stream29/KUnion.git")
            developerConnection.set("scm:git:ssh://git@github.com:Stream29/KUnion.git")
        }
    }
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = URI("https://maven.pkg.github.com/Stream29/KUnion")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}