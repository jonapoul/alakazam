@file:Suppress("UnstableApiUsage")

plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.android.theme"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  implementation(libs.androidx.appcompat)
  implementation(libs.androidx.core.core)
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.preference)
  implementation(projects.modules.kotlin.core)
}
