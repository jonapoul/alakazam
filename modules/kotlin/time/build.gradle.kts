plugins {
  id("module-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

dependencies {
  api(libs.kotlinx.datetime)
  testImplementation(libs.test.junit)
  testImplementation(libs.test.kotlin.core)
}
