plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.android.logging"
}

dependencies {
  api(projects.modules.android.core)

  implementation(libs.timber)
  implementation(libs.logback.android)
  implementation(libs.slf4j)

  testImplementation(projects.modules.testing.core)
}
