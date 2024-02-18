@file:Suppress("UnstableApiUsage")

rootProject.name = "alakazam"

pluginManagement {
  repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    google()
    maven { url = uri("https://jitpack.io") }
    mavenLocal()
  }
}

includeBuild("build-logic")

include(":modules:kotlin:core")
include(":modules:kotlin:compose-annotations")
include(":modules:kotlin:serialization")
include(":modules:kotlin:time")

include(":modules:android:core")
include(":modules:android:db")
include(":modules:android:http")
include(":modules:android:logging")
include(":modules:android:navigation")
include(":modules:android:prefs:core")
include(":modules:android:prefs:ui")
include(":modules:android:theme")
include(":modules:android:ui:appcompat")
include(":modules:android:ui:compose")
include(":modules:android:ui:core")
include(":modules:android:ui:material")
include(":modules:android:ui:viewbinding")

include(":modules:di:dagger")
include(":modules:di:hilt")
include(":modules:di:koin")

include(":modules:testing:android")
include(":modules:testing:core")
include(":modules:testing:db")
include(":modules:testing:hilt")

// https://docs.gradle.org/current/userguide/declaring_dependencies.html#sec:type-safe-project-accessors
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

// https://docs.gradle.org/current/userguide/configuration_cache.html#config_cache:stable
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
