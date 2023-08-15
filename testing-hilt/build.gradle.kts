plugins {
  id("convention-android")
  id("convention-hilt")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.test.hilt"
}

dependencies {
  implementation(projects.androidCore)
  api(projects.testingCore)

  api(libs.androidx.appcompat)
  api(libs.androidx.lifecycle.runtime)

  /* Testing */
  api(libs.test.androidx.fragment)
  api(libs.test.androidx.hilt)
  api(libs.test.androidx.navigation)
  api(libs.test.androidx.runner)
}
