@file:Suppress("UnstableApiUsage", "SuspiciousCollectionReassignment")

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("maven-publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.core"
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
      artifact = "android-core",
      artifactType = ArtifactType.Android,
    )
  }
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)
  api(projects.kotlinCore)

  implementation(libs.core.ktx)
  implementation(libs.kotlinx.coroutines.android)

  testImplementation(projects.testingCore)
}
