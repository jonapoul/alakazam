@file:Suppress("UnstableApiUsage")

import org.gradle.accessors.dm.LibrariesForLibs

plugins {
  kotlin("android")
  id("com.android.library")
}

val libs = the<LibrariesForLibs>()

android {
  compileSdk = libs.versions.sdk.compile.get().toInt()

  defaultConfig {
    minSdk = libs.versions.sdk.min.get().toInt()
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    testInstrumentationRunnerArguments["disableAnalytics"] = "true"
    multiDexEnabled = true
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  lint {
    checkReleaseBuilds = false
    abortOnError = false
    quiet = true
  }

  buildFeatures {
    buildConfig = false
    resValues = false
    viewBinding = false
  }

  packaging {
    jniLibs {
      useLegacyPackaging = true
    }

    resources {
      pickFirsts.add("MANIFEST.MF")
      excludes.addAll(
        listOf(
          "META-INF/DEPENDENCIES",
          "META-INF/LICENSE",
          "META-INF/LICENSE.md",
          "META-INF/LICENSE.txt",
          "META-INF/license.txt",
          "META-INF/LICENSE-notice.md",
          "META-INF/NOTICE",
          "META-INF/NOTICE.txt",
          "META-INF/notice.txt",
          "META-INF/ASL2.0",
        )
      )
    }
  }

  testOptions {
    unitTests {
      isIncludeAndroidResources = true
    }
  }
}
