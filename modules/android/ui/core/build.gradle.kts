@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.ui.core"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  implementation(projects.modules.kotlin.core)
  implementation(projects.modules.android.core)
  implementation(libs.androidx.coreKtx)
  implementation(libs.androidx.fragmentKtx)
  implementation(libs.androidx.recyclerview)
}