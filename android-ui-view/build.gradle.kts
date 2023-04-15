@file:Suppress("UnstableApiUsage", "SuspiciousCollectionReassignment")

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("maven-publish")
}

android {
  namespace = "dev.jonpoulton.alakazam.ui.view"
  compileSdk = BuildConstants.COMPILE_SDK

  androidDefaultConfig()
  androidCompileOptions()
  androidKotlinOptions()
  androidBuildFeatures()

  buildFeatures {
    viewBinding = true
  }
}

afterEvaluate {
  publishing {
    addPublication(
      project = project,
      artifact = "android-ui-view",
      artifactType = ArtifactType.Android,
    )
  }
}

dependencies {
  coreLibraryDesugaring(libs.desugaring)

  api(projects.androidUiCore)

  implementation(libs.activity)
  implementation(libs.appcompat)
  implementation(libs.fragment.ktx)
  implementation(libs.lifecycle.runtime)
  implementation(libs.material)
  implementation(libs.navigation.fragment)
  implementation(libs.navigation.ui)
  implementation(libs.preference)
  implementation(libs.recyclerview)
  implementation(libs.timber.core)

  testImplementation(projects.testingCore)
}
