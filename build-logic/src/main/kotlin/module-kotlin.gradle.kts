plugins {
  kotlin("jvm")
  id("convention-kotlin")
  id("com.dropbox.dependency-guard")
}

dependencyGuard {
  configuration("runtimeClasspath")
}
