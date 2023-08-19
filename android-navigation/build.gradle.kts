@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.navigation"
}

dependencies {
  implementation(libs.androidx.navigation.fragment)
  implementation(libs.androidx.navigation.ui)
}
