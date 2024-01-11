@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.ui.compose"

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.androidx.compose.compiler.get()
  }
}

dependencies {
  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.compose.ui.core)
  implementation(libs.androidx.compose.animation)
  implementation(libs.androidx.compose.foundation.core)
  implementation(libs.androidx.compose.foundation.layout)
  implementation(libs.androidx.compose.material.core)
  implementation(libs.androidx.compose.material.icons)
  implementation(libs.androidx.compose.ui.fonts)
  implementation(libs.androidx.compose.ui.preview)
  implementation(libs.androidx.compose.ui.util)
  debugImplementation(libs.androidx.compose.ui.tooling)

  api(libs.androidx.coreKtx)
}
