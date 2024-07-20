plugins {
  id("module-android")
  id("convention-publish")
  id("convention-style")
  kotlin("kapt")
}

android {
  namespace = "alakazam.di.dagger"
}

dependencies {
  api(libs.dagger.core)
  api(libs.javax.inject)
  api(libs.kotlinx.coroutines.core)
  api(libs.kotlinx.datetime)
  api(projects.modules.kotlin.core)
  kapt(libs.dagger.compiler)
}
