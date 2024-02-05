@file:Suppress("UnstableApiUsage")

plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
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
