@file:Suppress("UnstableApiUsage", "SuspiciousCollectionReassignment")

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
  id("maven-publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.db"
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
      artifact = "android-db",
      artifactType = ArtifactType.Android,
    )
  }
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)

  api(projects.androidCore)

  implementation(libs.room.ktx)
  implementation(libs.room.runtime)
  kapt(libs.room.compiler)

  testImplementation(projects.testingCore)
}
