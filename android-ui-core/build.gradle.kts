@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.ui.core"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  implementation(projects.kotlinCore)
  implementation(projects.androidCore)
  implementation(libs.androidx.coreKtx)
  implementation(libs.androidx.fragmentKtx)
  implementation(libs.androidx.recyclerview)
}
