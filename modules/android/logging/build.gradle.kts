plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.android.logging"
}

dependencies {
  api(libs.timber)
  api(projects.modules.android.core)
  implementation(libs.logback.android)
  implementation(libs.slf4j)
}
