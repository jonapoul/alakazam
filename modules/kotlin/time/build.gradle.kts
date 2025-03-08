plugins {
  alias(libs.plugins.module.kotlin)
}

dependencies {
  api(libs.kotlinx.datetime)
  testImplementation(libs.test.junit)
  testImplementation(libs.test.kotlin.core)
}
