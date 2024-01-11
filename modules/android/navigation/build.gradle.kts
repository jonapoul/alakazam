@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.navigation"
}

dependencies {
  implementation(libs.androidx.navigation.fragment)
  implementation(libs.androidx.navigation.ui)
}
