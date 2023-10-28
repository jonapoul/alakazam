plugins {
  kotlin("jvm")
  kotlin("plugin.serialization")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

dependencies {
  api(projects.kotlinCore)
  api(libs.kotlinx.serialization.core)
  testImplementation(projects.testingCore)
}
