@file:Suppress("UnstableApiUsage", "SuspiciousCollectionReassignment")

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlinx-serialization")
  id("maven-publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.http"
  compileSdk = BuildConstants.COMPILE_SDK

  androidDefaultConfig()
  androidCompileOptions()
  androidKotlinOptions()
  androidBuildFeatures()
}

afterEvaluate {
  publishing {
    addPublication(
      project = project,
      artifact = "android-http",
      artifactType = ArtifactType.Android,
    )
  }
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
