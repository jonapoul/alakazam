@file:Suppress("UnstableApiUsage")

plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.android.ui.material"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  api(projects.modules.android.core)
  api(libs.androidx.appcompat)
  api(libs.androidx.fragment.core)
  api(libs.material)
  implementation(projects.modules.android.ui.appcompat)
  implementation(projects.modules.android.ui.core)
  implementation(projects.modules.kotlin.core)
  implementation(libs.androidx.cardview)
}
