@file:Suppress("UnstableApiUsage", "SuspiciousCollectionReassignment")

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlinx-serialization")
  id("com.vanniktech.maven.publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.http"
  compileSdk = BuildConstants.COMPILE_SDK

  androidDefaultConfig()
  androidCompileOptions()
  androidKotlinOptions()
  androidBuildFeatures()
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)

  api(projects.kotlinCore)
  api(projects.kotlinJson)
  api(projects.androidCore)

  implementation(libs.kotlinx.serialization.json)
  implementation(libs.okhttp.core)
  implementation(libs.okhttp.logging)
  implementation(libs.retrofit.core)
  implementation(libs.retrofit.serialization)
  implementation(libs.timber.core)

  testImplementation(projects.testingCore)
}
