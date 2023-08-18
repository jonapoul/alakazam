@file:Suppress("UnstableApiUsage")

plugins {
  kotlin("android")
  id("convention-atak")
  id("convention-desugaring")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.plugin"
}

dependencies {
  implementation(projects.takCore)
  implementation(projects.takUi)
  implementation(libs.androidx.coreKtx)
  implementation(libs.timber.core)
}
