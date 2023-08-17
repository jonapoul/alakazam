plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.test.android"
}

dependencies {
  implementation(projects.androidCore)
  api(projects.testingCore)

  /* General runtime */
  api(libs.timber.core)

  /* Testing */
  api(libs.test.androidx.arch)
  api(libs.test.androidx.coreKtx)
  api(libs.test.androidx.fragment)
  api(libs.test.androidx.junit)
  api(libs.test.androidx.navigation)
  api(libs.test.androidx.rules)
  api(libs.test.androidx.runner)
  api(libs.test.mockk.android)
}
