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
  api(libs.androidx.appcompat)
  api(libs.androidx.fragment.core)
  api(libs.material)
  api(projects.modules.android.core)
  implementation(libs.androidx.cardview)
  implementation(projects.modules.android.ui.appcompat)
  implementation(projects.modules.android.ui.core)
  implementation(projects.modules.kotlin.core)
}
