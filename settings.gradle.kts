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
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    mavenLocal()
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
    maven("https://jitpack.io")
    mavenLocal()
  }
}

includeBuild("build-logic")

include(":modules:kotlin:core")
include(":modules:kotlin:compose-annotations")
include(":modules:kotlin:logging")
include(":modules:kotlin:serialization")
include(":modules:kotlin:time")

include(":modules:android:core")
include(":modules:android:http")
include(":modules:android:navigation")
include(":modules:android:theme")
include(":modules:android:ui:appcompat")
include(":modules:android:ui:compose")
include(":modules:android:ui:core")
include(":modules:android:ui:material")
include(":modules:android:ui:viewbinding")

include(":modules:db:room")
include(":modules:db:sqldelight")
include(":modules:db:sqldelight:test")

include(":modules:di:dagger")
include(":modules:di:hilt")
include(":modules:di:koin")

include(":modules:testing:android")
include(":modules:testing:core")
include(":modules:testing:hilt")
include(":modules:testing:logging")
include(":modules:testing:room")
include(":modules:testing:sqldelight")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
