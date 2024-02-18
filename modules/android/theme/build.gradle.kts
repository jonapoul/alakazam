@file:Suppress("UnstableApiUsage")

plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.android.theme"

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
