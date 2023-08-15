plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.theme"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  api(projects.androidInit)
  api(projects.androidPrefs)
  implementation(libs.androidx.preference)
  implementation(libs.inject)

  testImplementation(projects.testingCore)
}
