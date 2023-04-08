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
  implementation(libs.plugin.detekt)
  implementation(libs.plugin.doctor)
  implementation(libs.plugin.dokka)
  implementation(libs.plugin.kotlin.gradle)
  implementation(libs.plugin.kover)
  implementation(libs.plugin.ktlint)
  implementation(libs.plugin.spotless)
  implementation(libs.plugin.versions)
}
