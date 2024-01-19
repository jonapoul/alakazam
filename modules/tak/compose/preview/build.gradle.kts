@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.compose.preview"

  buildFeatures {
    androidResources = true
    resValues = true
  }
}

dependencies {
  api(projects.modules.android.ui.compose)
  implementation(projects.modules.tak.compose.core)
}
