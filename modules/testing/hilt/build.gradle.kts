plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-hilt")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.test.hilt"
}

dependencies {
  implementation(projects.modules.android.core)
  api(projects.modules.testing.core)

  api(libs.androidx.appcompat)
  api(libs.androidx.lifecycle.runtimeKtx)

  // Testing
  api(libs.test.androidx.fragment)
  api(libs.test.androidx.hilt)
  api(libs.test.androidx.navigation)
  api(libs.test.androidx.runner)
}
