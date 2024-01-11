plugins {
  id("convention-android")
  id("convention-hilt")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.init"
}

dependencies {
  api(projects.modules.android.core)
  api(projects.modules.android.logging)

  implementation(libs.inject)
  implementation(libs.timber)

  testImplementation(projects.modules.testing.core)
}
