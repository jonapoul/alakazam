plugins {
  id("module-android")
  id("convention-hilt")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "alakazam.di.hilt"
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

  testImplementation(projects.modules.testing.core)
}
