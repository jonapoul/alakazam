@file:Suppress("UnstableApiUsage", "SuspiciousCollectionReassignment")

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
  id("com.vanniktech.maven.publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.test.db"
  compileSdk = BuildConstants.COMPILE_SDK

  androidDefaultConfig()
  androidCompileOptions()
  androidKotlinOptions()
  androidBuildFeatures()
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)
  implementation(projects.androidCore)

  implementation(libs.room.ktx)
  implementation(libs.room.runtime)
  api(libs.room.testing)
  kapt(libs.room.compiler)

  api(libs.core.test)
  api(libs.robolectric)
}
