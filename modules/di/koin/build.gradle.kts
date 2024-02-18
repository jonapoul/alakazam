plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.di.koin"
}

dependencies {
  implementation(projects.modules.android.core)
  implementation(projects.modules.android.http)
  implementation(projects.modules.kotlin.core)
  implementation(libs.flowpreferences)
  implementation(libs.koin.core)
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.kotlinx.datetime)
}
