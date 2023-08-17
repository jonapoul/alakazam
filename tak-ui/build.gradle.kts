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
  namespace = "dev.jonpoulton.alakazam.tak.ui"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  implementation(projects.takCore)
  implementation(libs.androidx.coreKtx)
  implementation(libs.androidx.recyclerview)
  implementation(libs.timber.core)
}
