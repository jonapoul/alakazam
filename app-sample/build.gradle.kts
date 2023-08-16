@file:Suppress("UnstableApiUsage")

plugins {
  kotlin("android")
  id("com.android.application")
  id("convention-kotlin")
  id("convention-style")
  id("androidx.navigation.safeargs.kotlin")
}

android {
  namespace = "dev.jonpoulton.alakazam.sample"
  compileSdk = libs.versions.sdk.compile.get().toInt()

  defaultConfig {
    applicationId = "dev.jonpoulton.alakazam.sample"
    minSdk = libs.versions.sdk.min.get().toInt()
    targetSdk = libs.versions.sdk.target.get().toInt()
    versionCode = (System.currentTimeMillis() / 1000L).toInt()
    versionName = rootProject.properties["VERSION_NAME"] as? String ?: error("Required version name")
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    testInstrumentationRunnerArguments["disableAnalytics"] = "true"
    multiDexEnabled = true
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
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
        ),
      )
    }
  }

  testOptions {
    unitTests {
      isIncludeAndroidResources = true
    }
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = true
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  buildFeatures {
    viewBinding = true
  }
}

dependencies {
  implementation(projects.androidPrefs)
  implementation(projects.androidUiCore)
  implementation(projects.androidUiViewbinding)

  implementation(libs.androidx.appcompat)
  implementation(libs.androidx.navigation.fragment)
  implementation(libs.androidx.navigation.ui)
  implementation(libs.androidx.preference)
}
