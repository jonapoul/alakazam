plugins {
  kotlin("jvm")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

dependencies {
  api(libs.kotlinx.datetime)
  implementation(projects.kotlinCore)
  testImplementation(projects.testingCore)
}
