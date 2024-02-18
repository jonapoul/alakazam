plugins {
  id("module-android")
  kotlin("plugin.serialization")
  id("convention-desugaring")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "alakazam.android.http"
}

dependencies {
  api(projects.modules.android.core)
  api(libs.kotlinx.serialization.core)
  api(libs.okhttp.core)
  api(libs.retrofit.core)

  implementation(projects.modules.kotlin.core)
  implementation(libs.kotlinx.serialization.json)
  implementation(libs.okhttp.logging)
  implementation(libs.retrofit.serialization)
  implementation(libs.timber)
}
