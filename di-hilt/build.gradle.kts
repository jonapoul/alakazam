plugins {
  id("convention-android")
  id("convention-hilt")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.di"
}

dependencies {
  api(projects.androidCore)
  api(projects.androidHttp)
  api(projects.androidInit)
  api(projects.androidPrefs)
  api(projects.androidUiCore)
  api(projects.kotlinCore)

  implementation(libs.androidx.preference)
  implementation(libs.flowpreferences)

  testImplementation(projects.testingCore)
}
