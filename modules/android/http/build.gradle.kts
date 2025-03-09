plugins {
  alias(libs.plugins.module.android)
  alias(libs.plugins.kotlin.serialization)
}

android {
  namespace = "alakazam.android.http"
}

dependencies {
  api(libs.kotlinx.serialization.core)
  api(libs.okhttp.core)
  api(libs.okhttp.logging)
  api(libs.retrofit.core)
  api(projects.modules.android.core)
  api(projects.modules.kotlin.core)
  implementation(libs.kotlinx.serialization.json)
  implementation(libs.retrofit.serialization)
}
