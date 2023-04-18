@file:Suppress("UnstableApiUsage")

plugins {
  id("com.android.application")
  id("kotlin-android")
  id("androidx.navigation.safeargs.kotlin")
}

android {
  namespace = "dev.jonpoulton.alakazam.sample"
  compileSdk = BuildConstants.COMPILE_SDK

  defaultConfig {
    applicationId = "dev.jonpoulton.alakazam.sample"
    targetSdk = BuildConstants.COMPILE_SDK
    versionCode = 1
    versionName = "1.0.0"
  }

  androidDefaultConfig()
  androidCompileOptions()
  androidKotlinOptions()
  androidPackagingOptions()
  androidTestOptions()

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
  coreLibraryDesugaring(libs.desugaring)

  implementation(projects.androidPrefs)
  implementation(projects.androidUiCore)
  implementation(projects.androidUiView)

  implementation(libs.appcompat)
  implementation(libs.navigation.fragment)
  implementation(libs.navigation.ui)
  implementation(libs.preference)

  testImplementation(projects.testingUnit)
  androidTestImplementation(projects.testingAndroid)
}
