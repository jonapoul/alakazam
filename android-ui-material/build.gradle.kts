@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.ui.material"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  implementation(projects.kotlinCore)
  implementation(projects.androidCore)
  api(projects.androidUiCore)
  api(projects.androidUiAppcompat)
  implementation(libs.material)
}
