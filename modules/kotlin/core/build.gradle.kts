plugins {
  id("module-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
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
