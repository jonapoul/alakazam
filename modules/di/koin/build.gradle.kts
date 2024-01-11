plugins {
  id("convention-android")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.di.koin"
}

dependencies {
  implementation(projects.modules.android.core)
  implementation(projects.modules.android.http)
  implementation(projects.modules.android.init)
  implementation(projects.modules.android.prefs)
  implementation(projects.modules.android.ui.core)
  implementation(projects.modules.kotlin.core)
  implementation(projects.modules.kotlin.time)

  implementation(libs.androidx.preference)
  implementation(libs.flowpreferences)
  implementation(libs.koin.core)
  implementation(libs.koin.android)

  testImplementation(projects.modules.testing.core)
}
