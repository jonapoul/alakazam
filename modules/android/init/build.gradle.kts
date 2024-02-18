plugins {
  id("module-android")
  id("convention-hilt")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "alakazam.android.init"
}

dependencies {
  api(projects.modules.android.core)
  api(projects.modules.android.logging)

  implementation(libs.inject)
  implementation(libs.timber)

  testImplementation(projects.modules.testing.core)
}
