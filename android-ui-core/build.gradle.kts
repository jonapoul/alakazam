@file:Suppress("UnstableApiUsage", "SuspiciousCollectionReassignment")

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("maven-publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.ui.core"
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
      artifact = "android-ui-core",
      artifactType = ArtifactType.Android,
    )
  }
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)

  api(projects.androidCore)
  api(projects.androidLogging)
  api(projects.kotlinCoroutines)

  implementation(libs.activity)
  implementation(libs.appcompat)
  implementation(libs.lifecycle.runtime)
  implementation(libs.navigation.fragment)
  implementation(libs.navigation.ui)
  implementation(libs.preference)

  testImplementation(projects.testingCore)
}
