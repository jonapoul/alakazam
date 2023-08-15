plugins {
  kotlin("jvm")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

dependencies {
  api(projects.testingCore)

  api(libs.test.mockk.core)
  api(libs.test.robolectric)
}
