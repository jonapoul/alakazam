@file:Suppress("UnstableApiUsage")

plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.android.ui.core"

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
