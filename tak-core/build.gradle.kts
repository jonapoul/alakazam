plugins {
  kotlin("android")
  id("convention-android")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.core"
}

dependencies {
  implementation(projects.androidCore)
  implementation(projects.kotlinCore)
  testImplementation(projects.testingCore)
}
