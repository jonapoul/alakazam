plugins {
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal()
  mavenCentral()
  google()
}

dependencies {
  implementation(libs.plugin.agp)
  implementation(libs.plugin.kotlin.gradle)
}
