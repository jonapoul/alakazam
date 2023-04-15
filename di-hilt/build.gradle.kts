@file:Suppress("UnstableApiUsage", "SuspiciousCollectionReassignment")

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
  id("dagger.hilt.android.plugin")
  id("maven-publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.di"
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
      artifact = "di-hilt",
      artifactType = ArtifactType.Android,
    )
  }
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)

  api(projects.androidCore)
  api(projects.androidHttp)
  api(projects.androidInit)
  api(projects.androidPrefs)
  api(projects.androidUiCore)
  api(projects.kotlinCoroutines)

  implementation(libs.flowpreferences)
  implementation(libs.hilt.android)
  implementation(libs.preference)
  kapt(libs.hilt.compiler)

  testImplementation(projects.testingCore)
}
