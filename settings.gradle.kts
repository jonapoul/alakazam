@file:Suppress("UnstableApiUsage")

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
  }
}

includeBuild("build-logic")

include(":kotlin-core")
include(":kotlin-json")
include(":kotlin-time")

include(":android-core")
include(":android-db")
include(":android-http")
include(":android-init")
include(":android-logging")
include(":android-navigation")
include(":android-prefs")
include(":android-theme")
include(":android-ui-appcompat")
include(":android-ui-core")
include(":android-ui-material")
include(":android-ui-viewbinding")

include(":di-hilt")
include(":di-koin")

include(":testing-android")
include(":testing-core")
include(":testing-db")
include(":testing-hilt")

// https://docs.gradle.org/current/userguide/declaring_dependencies.html#sec:type-safe-project-accessors
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

// https://docs.gradle.org/current/userguide/configuration_cache.html#config_cache:stable
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
