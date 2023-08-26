plugins {
  id("convention-android")
  id("convention-hilt")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.di.hilt"
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

  testImplementation(projects.testingCore)
}
