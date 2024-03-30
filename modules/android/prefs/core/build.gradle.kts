plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "alakazam.android.prefs.core"
}

dependencies {
  api(libs.flowpreferences)
  implementation(libs.androidx.preference)

  testImplementation(projects.modules.testing.core)
  testImplementation(libs.kotlinx.coroutines.core)
  testImplementation(libs.test.androidx.core.ktx)
  testImplementation(libs.test.junit)
  testImplementation(libs.test.kotlin.core)
  testImplementation(libs.test.kotlin.coroutines)
  testImplementation(libs.test.robolectric)
  testImplementation(libs.test.turbine)
}