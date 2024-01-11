@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
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
  implementation(projects.modules.kotlin.core)
  implementation(projects.modules.android.core)
  api(projects.modules.android.ui.core)
  api(projects.modules.android.ui.appcompat)
  implementation(libs.material)
}
