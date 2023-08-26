@file:Suppress("UnstableApiUsage")

plugins {
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
  api(projects.androidInit)
  api(projects.androidPrefs)
  implementation(libs.androidx.preference)
  implementation(libs.inject)
}
