@file:Suppress("UnstableApiUsage", "SuspiciousCollectionReassignment")

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("com.vanniktech.maven.publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.init"
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

  implementation(libs.hilt.android)
  implementation(libs.timber.core)

  testImplementation(projects.testingCore)
}
