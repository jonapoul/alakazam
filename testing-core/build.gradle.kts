plugins {
  kotlin("jvm")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

dependencies {
  implementation(projects.kotlinCore)

  api(libs.test.junit)
  api(libs.test.kotlin.common)
  api(libs.test.kotlin.coroutines)
  api(libs.test.kotlin.junit)
  api(libs.test.timber.junit)
  api(libs.test.turbine)
}
