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
    minSdk = 21 // limited by testing-android
    targetSdk = BuildConstants.COMPILE_SDK
    versionCode = BuildConstants.LIB_VERSION_CODE
    versionName = BuildConstants.LIB_VERSION_NAME
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    testInstrumentationRunnerArguments["disableAnalytics"] = "true"
    multiDexEnabled = true
  }

  androidCompileOptions()
  androidKotlinOptions()

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
