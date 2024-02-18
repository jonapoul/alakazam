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
  implementation(libs.androidx.navigation.fragment)
  implementation(libs.androidx.navigation.ui)
}
