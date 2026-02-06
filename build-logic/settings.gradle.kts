@file:Suppress("UnstableApiUsage")

rootProject.name = "build-logic"

apply(from = "../gradle/repositories.gradle.kts")

dependencyResolutionManagement {
  versionCatalogs {
    create("libs") {
      from(files("../gradle/libs.versions.toml"))
    }
  }
}

// https://docs.gradle.org/current/userguide/configuration_cache.html#config_cache:stable
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
