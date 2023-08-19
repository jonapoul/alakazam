@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.ui.appcompat"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  api(projects.androidUiCore)
  api(libs.androidx.appcompat)
  api(libs.androidx.recyclerview)
}
