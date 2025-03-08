plugins {
  alias(libs.plugins.module.kotlin)
  alias(libs.plugins.kotlin.serialization)
}

dependencies {
  api(libs.kotlinx.serialization.core)
  testImplementation(libs.kotlinx.serialization.json)
  testImplementation(libs.test.junit)
  testImplementation(libs.test.kotlin.core)
}
