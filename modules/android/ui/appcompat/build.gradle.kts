@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.ui.appcompat"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  api(projects.modules.android.ui.core)
  api(libs.androidx.appcompat)
  api(libs.androidx.recyclerview)
}
