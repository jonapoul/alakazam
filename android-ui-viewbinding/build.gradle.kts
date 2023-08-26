@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-kotlin")
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
  implementation(projects.androidUiCore)
  implementation(libs.androidx.appcompat)
  implementation(libs.androidx.fragmentKtx)
  implementation(libs.androidx.recyclerview)
}
