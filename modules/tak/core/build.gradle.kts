plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.core"
}

dependencies {
  implementation(projects.modules.android.core)
  implementation(projects.modules.kotlin.core)
  testImplementation(projects.modules.testing.core)
}
