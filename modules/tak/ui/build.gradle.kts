plugins {
  kotlin("android")
  id("convention-android")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.ui"
}

dependencies {
  api(projects.modules.tak.core)
  testImplementation(projects.modules.testing.core)
}
