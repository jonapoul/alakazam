plugins {
  kotlin("jvm")
  kotlin("plugin.serialization")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

dependencies {
  api(projects.modules.kotlin.core)
  api(libs.kotlinx.serialization.core)
  testImplementation(projects.modules.testing.core)
  testImplementation(libs.kotlinx.serialization.json)
}
