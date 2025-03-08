plugins {
  alias(libs.plugins.module.android)
  alias(libs.plugins.androidx.hilt)
  alias(libs.plugins.ksp)
}

android {
  namespace = "alakazam.di.hilt"
}

dependencies {
  api(libs.androidx.hilt.android)
  api(libs.dagger.core)
  api(libs.javax.inject)
  api(libs.kotlinx.coroutines.core)
  api(libs.kotlinx.datetime)
  api(projects.modules.android.core)
  api(projects.modules.android.http)
  api(projects.modules.kotlin.core)
  implementation(libs.androidx.hilt.core)
  implementation(libs.androidx.preference)
  ksp(libs.androidx.hilt.compiler)
}
