import org.gradle.kotlin.dsl.kotlin

plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("com.dropbox.dependency-guard")
}

dependencyGuard {
  configuration("releaseRuntimeClasspath")
}
