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
  implementation(projects.modules.kotlin.core)
  api(libs.kotlinx.coroutines.core)
  api(libs.test.junit)
  api(libs.test.kotlin.common)
  api(libs.test.kotlin.coroutines)
  api(libs.test.kotlin.junit)
  api(libs.test.mockk.core)
  api(libs.test.timber.junit)
  api(libs.test.turbine)
}
