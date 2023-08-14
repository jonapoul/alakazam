plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.ui.core"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  api(projects.androidCore)
  api(projects.androidLogging)
  api(projects.kotlinCore)

  implementation(libs.androidx.activity)
  implementation(libs.androidx.appcompat)
  implementation(libs.androidx.lifecycle.runtime)
  implementation(libs.androidx.navigation.fragment)
  implementation(libs.androidx.navigation.ui)
  implementation(libs.androidx.preference)

  testImplementation(projects.testingCore)
}
