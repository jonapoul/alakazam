@file:Suppress("UnstableApiUsage", "DSL_SCOPE_VIOLATION")

plugins {
  id("convention-android")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.compose.core"
}

dependencies {
  api(projects.modules.android.ui.compose)
  api(projects.modules.tak.core)
  implementation(projects.modules.tak.res)
  implementation(libs.androidx.compose.ui.fonts)
}
