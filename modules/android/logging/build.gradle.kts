plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.logging"
}

dependencies {
  api(projects.modules.android.core)

  implementation(libs.timber)
  implementation(libs.logback.android)
  implementation(libs.slf4j)

  testImplementation(projects.modules.testing.core)
}
