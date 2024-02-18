@file:Suppress("UnstableApiUsage")

plugins {
  id("module-android")
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
