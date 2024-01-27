@file:Suppress("UnstableApiUsage")

plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.theme"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  api(projects.modules.android.init)
  api(projects.modules.android.prefs)
  implementation(libs.androidx.preference)
  implementation(libs.inject)
}
