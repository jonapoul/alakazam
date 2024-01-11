@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  id("convention-android")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.compose.plugin"
}

dependencies {
  api(projects.modules.tak.compose.core)
  api(projects.modules.tak.compose.components)
  api(projects.modules.tak.compose.viewmodel)
  api(projects.modules.tak.plugin)
  compileOnly(libs.atak.sdk)
  api(libs.androidx.lifecycle.viewmodelCompose)
}
