@file:Suppress("UnstableApiUsage")

rootProject.name = "alakazam"

pluginManagement {
  includeBuild("build-logic")
  repositories {
    google {
      mavenContent {
        includeGroupByRegex(".*android.*")
        includeGroupByRegex(".*google.*")
      }
    }
    mavenCentral()
    gradlePluginPortal()
  }
}

dependencyResolutionManagement {
  repositories {
    google {
      mavenContent {
        includeGroupByRegex(".*android.*")
        includeGroupByRegex(".*google.*")
      }
    }
    mavenCentral()
  }
}

plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
  id("com.gradle.develocity") version "4.3.1"
}

develocity {
  buildScan.publishing.onlyIf { false }
}

include(
  ":alakazam-android",
  ":alakazam-compose",
  ":alakazam-kotlin",
  ":alakazam-testing",
)

enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
