@file:Suppress("UnstableApiUsage", "SuspiciousCollectionReassignment")

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("com.vanniktech.maven.publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.logging"
  compileSdk = BuildConstants.COMPILE_SDK

  androidDefaultConfig()
  androidCompileOptions()
  androidKotlinOptions()
  androidBuildFeatures()
  androidPackagingOptions()
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)

  api(projects.androidCore)

  implementation(libs.timber.core)
  implementation(libs.logback.android)
  implementation(libs.slf4j)

  testImplementation(projects.testingCore)
}
