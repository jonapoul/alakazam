plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
  id("com.google.dagger.hilt.android")
  kotlin("kapt")
}

android {
  namespace = "alakazam.di.hilt"
}

dependencies {
  api(projects.modules.android.core)
  api(projects.modules.android.http)
  api(projects.modules.kotlin.core)
  api(libs.androidx.hilt.android)
  api(libs.dagger.core)
  api(libs.flowpreferences)
  api(libs.javax.inject)
  api(libs.kotlinx.coroutines.core)
  api(libs.kotlinx.datetime)
  implementation(libs.androidx.preference)
  implementation(libs.androidx.hilt.core)
  kapt(libs.androidx.hilt.compiler)
}
