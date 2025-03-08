plugins {
  alias(libs.plugins.module.android)
  alias(libs.plugins.ksp)
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
  ksp(libs.dagger.compiler)
}
