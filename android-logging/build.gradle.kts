plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.logging"
}

dependencies {
  api(projects.androidCore)

  implementation(libs.timber.core)
  implementation(libs.logback.android)
  implementation(libs.slf4j)

  testImplementation(projects.testingCore)
}
