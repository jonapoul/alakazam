@file:Suppress("UnstableApiUsage", "DSL_SCOPE_VIOLATION")

plugins {
  id("convention-android")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.compose.core"

  buildFeatures {
    androidResources = true
    resValues = true
  }
}

dependencies {
  api(projects.modules.tak.core)
  compileOnly(libs.atak.sdk)
  implementation(libs.androidx.compose.ui.fonts)
}