@file:Suppress("UnstableApiUsage")

plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.android.navigation"
}

dependencies {
  api(libs.androidx.appcompat)
  api(libs.androidx.fragment.core)
  api(libs.androidx.navigation.common)
  api(libs.androidx.navigation.runtime)
  implementation(libs.androidx.navigation.fragment.ktx)
}
