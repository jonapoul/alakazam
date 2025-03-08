plugins {
  alias(libs.plugins.module.android)
}

android {
  namespace = "alakazam.di.koin"
}

dependencies {
  implementation(libs.koin.core)
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.kotlinx.datetime)
  implementation(projects.modules.android.core)
  implementation(projects.modules.android.http)
  implementation(projects.modules.kotlin.core)
}
