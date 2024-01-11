plugins {
  kotlin("android")
  kotlin("kapt")
  id("convention-android")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.alakazam.tak.dagger"
}

dependencies {
  compileOnly(projects.androidCore)
  compileOnly(projects.kotlinCore)
  compileOnly(projects.kotlinTime)
  compileOnly(projects.takCore)
  api(projects.takPlugin)

  compileOnly(libs.flowpreferences)
  implementation(libs.dagger.core)
  kapt(libs.dagger.compiler)

  testImplementation(projects.testingCore)
}
