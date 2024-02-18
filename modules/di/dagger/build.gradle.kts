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
  api(projects.modules.kotlin.core)
  api(libs.dagger.core)
  api(libs.javax.inject)
  api(libs.kotlinx.coroutines.core)
  api(libs.kotlinx.datetime)
  kapt(libs.dagger.compiler)
}
