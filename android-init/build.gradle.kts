plugins {
  id("convention-android")
  id("convention-hilt")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.init"
}

dependencies {
  api(projects.androidCore)
  api(projects.androidLogging)

  implementation(libs.inject)
  implementation(libs.timber.core)

  testImplementation(projects.testingCore)
}
