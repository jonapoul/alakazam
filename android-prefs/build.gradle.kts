@file:Suppress("UnstableApiUsage", "SuspiciousCollectionReassignment")

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("com.vanniktech.maven.publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.prefs"
  compileSdk = BuildConstants.COMPILE_SDK

  androidDefaultConfig()
  androidCompileOptions()
  androidKotlinOptions()
  androidBuildFeatures()
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)

  api(projects.androidCore)
  api(projects.androidLogging)

  implementation(libs.preference)
  implementation(libs.flowpreferences)
  implementation(libs.timber.core)

  testImplementation(projects.testingCore)
}
