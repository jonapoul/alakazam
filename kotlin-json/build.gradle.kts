plugins {
  kotlin("jvm")
  kotlin("plugin.serialization")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

dependencies {
  implementation(projects.kotlinCore)
  implementation(libs.kotlinx.serialization.json)
  testImplementation(projects.testingCore)
}
