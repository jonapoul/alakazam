plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.test.android"
}

configurations.configureEach {
  exclude(group = "org.junit.jupiter")
}

dependencies {
  implementation(projects.modules.android.core)
  api(projects.modules.testing.core)

  // General runtime
  api(libs.timber)

  // Testing
  api(libs.test.androidx.arch)
  api(libs.test.androidx.coreKtx)
  api(libs.test.androidx.fragment)
  api(libs.test.androidx.junit)
  api(libs.test.androidx.navigation)
  api(libs.test.androidx.rules)
  api(libs.test.androidx.runner)
  api(libs.test.mockk.android)
}
