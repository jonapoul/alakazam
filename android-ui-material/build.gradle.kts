@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.ui.material"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  implementation(projects.kotlinCore)
  implementation(projects.androidCore)
  implementation(projects.androidUiCore)
  implementation(libs.material)
}
