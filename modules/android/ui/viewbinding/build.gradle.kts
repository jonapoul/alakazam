@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.ui.viewbinding"

  buildFeatures {
    viewBinding = true
  }
}

dependencies {
  api(projects.modules.kotlin.core)
  api(projects.modules.android.ui.core)
  implementation(libs.androidx.appcompat)
  implementation(libs.androidx.fragmentKtx)
  implementation(libs.androidx.recyclerview)
}
