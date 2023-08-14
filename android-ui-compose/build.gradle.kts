plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.ui.compose"

  buildFeatures {
    compose = true
    resValues = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
  }
}

dependencies {
  api(projects.androidUiCore)

  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.compose.activity)
  implementation(libs.androidx.compose.animation)
  implementation(libs.androidx.compose.foundation.core)
  implementation(libs.androidx.compose.foundation.layout)
  implementation(libs.androidx.compose.material.core)
  implementation(libs.androidx.compose.material.icons)
  implementation(libs.androidx.compose.navigation.core)
  implementation(libs.androidx.compose.navigation.hilt)
  implementation(libs.androidx.compose.tooling.preview)
  implementation(libs.androidx.compose.ui.core)
  implementation(libs.androidx.compose.ui.fonts)
  implementation(libs.androidx.compose.ui.tooling)
  implementation(libs.androidx.compose.ui.util)

  testImplementation(projects.testingCore)
}
