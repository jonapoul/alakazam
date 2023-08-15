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
  namespace = "dev.jonpoulton.alakazam.core"
}

dependencies {
  api(projects.kotlinCore)
  implementation(libs.androidx.core.ktx)
  implementation(libs.kotlinx.coroutines.android)
  testImplementation(projects.testingCore)
}
