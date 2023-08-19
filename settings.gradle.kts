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
    maven { url = uri("${rootProject.projectDir}/maven") }
  }
}

includeBuild("build-logic")

include(":app-sample")

include(":kotlin-core")
include(":kotlin-json")
include(":kotlin-time")

include(":android-core")
include(":android-db")
include(":android-http")
include(":android-init")
include(":android-logging")
include(":android-prefs")
include(":android-theme")
include(":android-ui-core")
include(":android-ui-material")
include(":android-ui-viewbinding")

include(":di-hilt")
include(":di-koin")

/* Can't access SDK from CI! */
if (!providers.environmentVariable("CI").isPresent) {
  include(":tak-core")
  include(":tak-dagger")
  include(":tak-plugin")
  include(":tak-ui")
}

include(":testing-android")
include(":testing-core")
include(":testing-db")
include(":testing-hilt")

// https://docs.gradle.org/current/userguide/declaring_dependencies.html#sec:type-safe-project-accessors
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

// https://docs.gradle.org/current/userguide/configuration_cache.html#config_cache:stable
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
