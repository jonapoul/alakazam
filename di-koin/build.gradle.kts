plugins {
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.di.koin"
}

dependencies {
  implementation(projects.androidCore)
  implementation(projects.androidHttp)
  implementation(projects.androidInit)
  implementation(projects.androidPrefs)
  implementation(projects.androidUiCore)
  implementation(projects.kotlinCore)
  implementation(projects.kotlinTime)

  implementation(libs.androidx.preference)
  implementation(libs.flowpreferences)
  implementation(libs.koin.core)
  implementation(libs.koin.android)

  testImplementation(projects.testingCore)
}
