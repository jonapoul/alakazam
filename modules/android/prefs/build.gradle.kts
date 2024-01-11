plugins {
  id("convention-android")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.prefs"
}

dependencies {
  api(projects.modules.android.core)

  implementation(libs.androidx.preference)
  implementation(libs.flowpreferences)
  implementation(libs.timber)

  testImplementation(projects.modules.testing.core)
  testImplementation(libs.test.androidx.coreKtx)
  testImplementation(libs.test.robolectric)
}
