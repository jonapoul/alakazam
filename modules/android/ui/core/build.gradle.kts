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
  api(libs.kotlinx.coroutines.core)
  api(libs.androidx.activity.core)
  api(libs.androidx.lifecycle.viewmodel.core)
  api(libs.androidx.recyclerview)
  implementation(projects.modules.kotlin.core)
  implementation(projects.modules.android.core)
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.fragment.ktx)
  implementation(libs.androidx.lifecycle.common)
  implementation(libs.androidx.lifecycle.viewmodel.ktx)
}
