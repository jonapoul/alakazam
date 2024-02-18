plugins {
  id("module-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

dependencies {
  testImplementation(projects.modules.testing.core)
}
