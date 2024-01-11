plugins {
  kotlin("android")
  id("convention-android")
  id("convention-desugaring")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.core"
}

dependencies {
  implementation(projects.kotlinCore)
  implementation(libs.androidx.coreKtx)
  implementation(libs.kotlinx.coroutines.android)
  implementation(libs.kotlinx.datetime)
  implementation(libs.timber)
  testImplementation(projects.testingCore)
}
