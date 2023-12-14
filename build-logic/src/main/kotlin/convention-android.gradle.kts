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
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }

  kotlinOptions {
    jvmTarget = "11"
  }

  lint {
    checkReleaseBuilds = false
    abortOnError = false
    quiet = true
  }

  buildFeatures {
    aidl = false
    buildConfig = false
    compose = false
    prefab = false
    renderScript = false
    resValues = false
    shaders = false
    viewBinding = false
  }

  packagingOptions {
    jniLibs {
      useLegacyPackaging = true
    }

    resources {
      pickFirsts.add("MANIFEST.MF")
      excludes.addAll(
        listOf(
          "META-INF/DEPENDENCIES",
          "META-INF/LICENSE*",
          "META-INF/NOTICE*",
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
