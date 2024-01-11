plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.prefs"
}

dependencies {
  api(projects.androidCore)

  implementation(libs.androidx.preference)
  implementation(libs.flowpreferences)
  implementation(libs.timber)

  testImplementation(projects.testingCore)
  testImplementation(libs.test.androidx.coreKtx)
  testImplementation(libs.test.robolectric)
}
