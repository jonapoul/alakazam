plugins {
  alias(libs.plugins.agp) apply false
  alias(libs.plugins.androidCacheFix) apply false
  alias(libs.plugins.compose) apply false
  alias(libs.plugins.dependencyGuardTak) apply false
  alias(libs.plugins.detekt) apply false
  alias(libs.plugins.dokka) apply false
  alias(libs.plugins.kotlin.compose) apply false
  alias(libs.plugins.kotlin.multiplatform) apply false
  alias(libs.plugins.kotlin.serialization) apply false
  alias(libs.plugins.kotlinx.abi) apply false
  alias(libs.plugins.licensee) apply false
  alias(libs.plugins.publish) apply false

  alias(libs.plugins.dependencyAnalysis)
  alias(libs.plugins.dependencyGuard)
  alias(libs.plugins.publishReport)
  id("alakazam.convention.detekt")
}

dependencyGuard {
  configuration("classpath")
}

tasks.detektCheck {
  dependsOn(gradle.includedBuild("build-logic").task(":detektCheck"))
}
