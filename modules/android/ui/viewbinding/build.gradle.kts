@file:Suppress("UnstableApiUsage")

plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.android.ui.viewbinding"

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
