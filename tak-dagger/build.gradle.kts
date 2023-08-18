@file:Suppress("UnstableApiUsage")

plugins {
  kotlin("android")
  kotlin("kapt")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.dagger"
}

dependencies {
  implementation(projects.androidCore)
  implementation(projects.kotlinCore)
  implementation(projects.kotlinTime)
  implementation(projects.takCore)
  implementation(projects.takUi)

  implementation(libs.androidx.fragmentKtx)
  implementation(libs.dagger.core)
  kapt(libs.dagger.compiler)
  implementation(libs.flowpreferences)
}
