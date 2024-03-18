plugins {
  id("module-android")
  id("convention-desugaring")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "alakazam.android.core"
}

dependencies {
  api(projects.modules.kotlin.core)
  api(libs.kotlinx.coroutines.core)
  api(libs.kotlinx.datetime)
  implementation(libs.androidx.annotation)
  implementation(libs.androidx.core.ktx)
  implementation(libs.timber)
  testImplementation(libs.test.turbine)
  testImplementation(libs.test.junit)
  testImplementation(libs.test.kotlin.core)
  testImplementation(libs.test.kotlin.coroutines)
}
