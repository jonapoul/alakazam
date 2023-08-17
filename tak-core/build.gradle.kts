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
  namespace = "dev.jonpoulton.alakazam.tak.core"

  buildFeatures {
    resValues = true
    viewBinding = true
  }
}

dependencies {
  implementation(projects.androidCore)
  implementation(projects.androidUiCore)
  implementation(projects.androidUiViewbinding)
  implementation(projects.kotlinCore)
  implementation(projects.kotlinTime)
  implementation(libs.androidx.coreKtx)
}
