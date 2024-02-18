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
  implementation(projects.modules.kotlin.core)
  implementation(libs.androidx.annotation)
  implementation(libs.androidx.coreKtx)
  implementation(libs.kotlinx.coroutines.android)
  implementation(libs.kotlinx.datetime)
  implementation(libs.timber)
  testImplementation(projects.modules.testing.core)
}
