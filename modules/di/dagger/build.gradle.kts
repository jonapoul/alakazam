plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  kotlin("kapt")
}

android {
  namespace = "dev.jonpoulton.alakazam.di.dagger"
}

dependencies {
  api(libs.dagger.core)
  kapt(libs.dagger.compiler)
  api(projects.modules.kotlin.core)
  api(projects.modules.kotlin.time)
}
