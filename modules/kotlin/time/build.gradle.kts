plugins {
  id("module-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

dependencies {
  api(libs.kotlinx.datetime)
  implementation(projects.modules.kotlin.core)
  testImplementation(projects.modules.testing.core)
}
