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
  api(libs.androidx.appcompat)
  api(libs.androidx.lifecycle.common)
  api(libs.kotlinx.coroutines.core)
  implementation(projects.modules.android.ui.core)
  implementation(projects.modules.kotlin.core)
  implementation(libs.androidx.fragment.ktx)
  implementation(libs.androidx.lifecycle.livedata.core)
  implementation(libs.androidx.recyclerview)
}
