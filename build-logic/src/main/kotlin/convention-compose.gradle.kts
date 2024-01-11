@file:Suppress("UnstableApiUsage")

import com.android.build.api.dsl.CommonExtension
import org.gradle.accessors.dm.LibrariesForLibs

plugins {
  id("convention-android")
}

val libs = the<LibrariesForLibs>()

extensions.getByType(CommonExtension::class).apply {
  defaultConfig {
    minSdk = 23
  }

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.androidx.compose.compiler.get()
  }
}

val implementation by configurations
val debugImplementation by configurations

dependencies {
  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.compose.foundation.core)
  implementation(libs.androidx.compose.material.core)
  implementation(libs.androidx.compose.ui.core)
  implementation(libs.androidx.compose.ui.preview)
  debugImplementation(libs.androidx.compose.ui.tooling)
}
