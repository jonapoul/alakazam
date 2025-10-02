plugins {
  alias(libs.plugins.agp) apply false
  alias(libs.plugins.androidCacheFix) apply false
  alias(libs.plugins.androidx.hilt) apply false
  alias(libs.plugins.androidx.navigation) apply false
  alias(libs.plugins.compose) apply false
  alias(libs.plugins.detekt) apply false
  alias(libs.plugins.dokka) apply false
  alias(libs.plugins.kotlin.android) apply false
  alias(libs.plugins.kotlin.compose) apply false
  alias(libs.plugins.kotlin.multiplatform) apply false
  alias(libs.plugins.kotlin.serialization) apply false
  alias(libs.plugins.ksp) apply false
  alias(libs.plugins.licensee) apply false
  alias(libs.plugins.powerAssert) apply false
  alias(libs.plugins.publish) apply false
  alias(libs.plugins.spotless) apply false
  alias(libs.plugins.sqldelight) apply false

  alias(libs.plugins.doctor)
  alias(libs.plugins.publishReport)
  alias(libs.plugins.kover)
}

doctor {
  javaHome {
    ensureJavaHomeMatches = false
    ensureJavaHomeIsSet = true
    failOnError = true
  }
}
