@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  id("convention-android")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.compose.viewmodel"
}

dependencies {
  api(projects.modules.tak.compose.core)
  api(libs.androidx.lifecycle.viewmodelCompose)
}
