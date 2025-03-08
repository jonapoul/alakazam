plugins {
  alias(libs.plugins.module.android)
}

android {
  namespace = "alakazam.android.core"
}

dependencies {
  api(libs.kotlinx.coroutines.core)
  api(libs.kotlinx.datetime)
  api(libs.timber)
  api(projects.modules.kotlin.core)
  implementation(libs.androidx.annotation)
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.lifecycle.common)
  implementation(libs.androidx.lifecycle.runtime)
  testImplementation(libs.test.junit)
  testImplementation(libs.test.kotlin.core)
  testImplementation(libs.test.kotlin.coroutines)
  testImplementation(libs.test.turbine)
}
