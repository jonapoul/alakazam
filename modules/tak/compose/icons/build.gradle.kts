@file:Suppress("UnstableApiUsage", "DSL_SCOPE_VIOLATION")

plugins {
  id("convention-android")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.compose.icons"

  buildFeatures {
    resValues = true
    androidResources = true
  }
}

dependencies {
  api(projects.modules.tak.compose.core)

  // For previews
  compileOnly(projects.modules.tak.compose.preview)
  compileOnly(libs.androidx.compose.material.core)
  compileOnly(libs.androidx.compose.ui.preview)
  compileOnly(libs.androidx.compose.ui.tooling)
}
