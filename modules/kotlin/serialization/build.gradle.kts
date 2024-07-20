plugins {
  id("module-kotlin")
  kotlin("plugin.serialization")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

dependencies {
  api(libs.kotlinx.serialization.core)
  testImplementation(libs.kotlinx.serialization.json)
  testImplementation(libs.test.junit)
  testImplementation(libs.test.kotlin.core)
}
