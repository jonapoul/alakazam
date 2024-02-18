@file:Suppress("UnstableApiUsage")

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs += listOf(
      "-opt-in=androidx.compose.foundation.ExperimentalFoundationApi",
      "-opt-in=androidx.compose.material.ExperimentalMaterialApi",
    )
  }
}

android {
  namespace = "alakazam.android.ui.compose"

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.androidx.compose.compiler.get()
  }
}

dependencies {
  implementation(platform(libs.androidx.compose.bom))
  api(libs.androidx.compose.material.core)
  api(libs.androidx.compose.runtime)
  implementation(libs.androidx.compose.foundation.core)
  implementation(libs.androidx.compose.ui.core)
  implementation(libs.androidx.compose.ui.graphics)
  implementation(libs.androidx.compose.ui.preview)
  debugImplementation(libs.androidx.compose.ui.tooling)
}
