@file:Suppress("UnstableApiUsage", "DSL_SCOPE_VIOLATION")

plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.compose.components"
}

dependencies {
  api(projects.modules.tak.compose.core)
  implementation(libs.androidx.compose.material.icons)
  implementation(libs.androidx.compose.ui.util)
  implementation(libs.kotlinx.immutable)

  // only used for previews
  compileOnly(projects.modules.android.ui.compose)
  compileOnly(projects.modules.kotlin.core)
  compileOnly(projects.modules.tak.compose.icons)
  compileOnly(projects.modules.tak.compose.preview)
}
