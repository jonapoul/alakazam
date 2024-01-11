plugins {
  kotlin("plugin.serialization")
  id("convention-android")
  id("convention-desugaring")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "dev.jonpoulton.alakazam.android.http"
}

dependencies {
  api(projects.modules.kotlin.core)
  api(projects.modules.kotlin.serialization)
  api(projects.modules.android.core)

  implementation(libs.kotlinx.datetime)
  implementation(libs.kotlinx.serialization.json)
  implementation(libs.okhttp.core)
  implementation(libs.okhttp.logging)
  implementation(libs.retrofit.core)
  implementation(libs.retrofit.serialization)
  implementation(libs.timber)

  testImplementation(projects.modules.testing.core)
}
