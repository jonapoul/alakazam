plugins {
  alias(libs.plugins.module.kotlin)
}

dependencies {
  api(libs.kotlinx.coroutines.core)
  api(libs.kotlinx.datetime)
  testImplementation(libs.test.junit)
  testImplementation(libs.test.kotlin.core)
  testImplementation(libs.test.kotlin.coroutines)
  testImplementation(libs.test.turbine)
  testImplementation(projects.modules.kotlin.core)
  testImplementation(projects.modules.testing.core)
}
