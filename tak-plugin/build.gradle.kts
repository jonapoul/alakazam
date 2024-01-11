plugins {
  kotlin("android")
  id("convention-android")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.plugin"
}

dependencies {
  api(projects.takCore)
  implementation(libs.timber)
}
