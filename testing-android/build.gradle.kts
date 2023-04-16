@file:Suppress("UnstableApiUsage", "SuspiciousCollectionReassignment")

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
  id("com.google.dagger.hilt.android")
  id("com.vanniktech.maven.publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.test.android"
  compileSdk = BuildConstants.COMPILE_SDK

  androidDefaultConfig()
  androidCompileOptions()
  androidKotlinOptions()
  androidBuildFeatures()
  androidPackagingOptions()

  defaultConfig {
    minSdk = 21 // restricted by mockk
  }
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)
  implementation(projects.androidCore)

  /* General runtime */
  implementation(libs.activity)
  implementation(libs.appcompat)
  implementation(libs.fragment.ktx)

  /* DI */
  implementation(libs.hilt.android)
  api(libs.hilt.test)
  kapt(libs.hilt.compiler)

  /* Testing */
  api(libs.androidx.arch.test)
  api(libs.androidx.junit.test)
  api(libs.core.test)
  api(libs.kaspresso)
  api(libs.mockk.android)
  api(libs.navigation.testing)

  debugImplementation(libs.fragment.test)
}
