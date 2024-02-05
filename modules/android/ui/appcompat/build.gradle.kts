@file:Suppress("UnstableApiUsage")

plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.android.ui.appcompat"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  api(projects.modules.android.ui.core)
  api(libs.androidx.appcompat)
  api(libs.androidx.recyclerview)
}
