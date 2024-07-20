plugins {
  id("module-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

configurations.configureEach {
  exclude(group = "org.junit.jupiter")
}

dependencies {
  api(libs.kotlinx.coroutines.core)
  api(libs.kotlinx.datetime)
  api(libs.test.junit)
  api(libs.test.kotlin.common)
  api(libs.test.kotlin.coroutines)
  api(libs.test.kotlin.junit)
  api(libs.test.mockk.core)
  api(libs.test.turbine)
  api(projects.modules.kotlin.core)
}
